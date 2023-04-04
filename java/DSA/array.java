package DSA;

import java.util.*;
public class array {
    public static int lin_search(int numbers[], int key){
        for(int i=1; i<numbers.length; i++){
            if(numbers[i]==key){
                return(i);
            }
        }
        return(-1);
    } 
    public static int largest(int numbers[]){
        int large = numbers[1];
        for(int i=1; i<numbers.length; i++){
            if(numbers[i]>large){
                large = numbers[i];
            }
        }
        return(large);
    }
    public static int bin_search(int numbers[], int key){
        int start = 0, end = numbers.length-1;
        while(start<=end){
            int mid = (start + end)/2;
            if(key==numbers[mid]){
                return mid;
            }
            if(key>numbers[mid]){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return -1;
    }
    public static void rev_array(int numbers[]){
        int first=0 , last=numbers.length-1;
        while(first<last){
            int temp = numbers[first];
            numbers[first] = numbers[last];
            numbers[last] = temp;
            first++;
            last--;
        }
    }
    public static void pair(int numbers[]){
        int count = 0;
        for(int i=0; i<numbers.length; i++){
            for(int j=i+1; j<numbers.length; j++){
                System.out.print("("+numbers[i]+","+numbers[j]+")");
                count++;
            }
            System.out.println();    
        }
        System.out.println("Total pairs: "+ count);
    }
    public static void subarray(int numbers[]){
        int ts = 0;
        int max_sum = Integer.MIN_VALUE;
        int min_sum = Integer.MAX_VALUE;
        for(int i=0; i<numbers.length; i++){
            for(int j=i; j<numbers.length; j++){
                int sum = 0;
                for(int k=i; k<=j; k++){
                    System.out.print(numbers[k] + " ");
                    sum += numbers[k];
                    if(min_sum>sum){
                        min_sum = sum;
                    }
                    if(sum>max_sum){
                        max_sum = sum;
                    }
                }
                ts++;
                System.out.println("Sum of subarray: "+sum);
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total subarray: "+ ts);
        System.out.println("maximum subarray sum is: "+max_sum);
        System.out.println("minimum subarray sum is: "+min_sum);
    }
    public static void prefix_sum(int numbers[]){                               
        int prefix[] = new int[numbers.length];
        prefix[0] = numbers[0];
        for(int i=1; i<prefix.length; i++){
            prefix[i] = prefix[i-1] + numbers[i];
        }
        int max_sum = Integer.MIN_VALUE;
        int min_sum = Integer.MAX_VALUE;
        for(int i=0; i<numbers.length; i++){
            for(int j=i; j<numbers.length; j++){
                int sum = i == 0 ? prefix[j] : prefix[j]-prefix[i-1];
                if(min_sum>sum){
                    min_sum = sum;
                }
                if(sum>max_sum){
                    max_sum = sum;
                }
            }
        }
        System.out.println("maximum subarray sum is: "+max_sum);
        System.out.println("minimum subarray sum is: "+min_sum);
    }
    public static void kadane(int numbers[]){
        int ms = Integer.MIN_VALUE;
        int cs = 0;
        for(int i=0; i<numbers.length; i++){
            cs += numbers[i];
            if(cs<0){
                cs=0;
            } 
            ms = Math.max(cs, ms);
        }
        System.out.println("maximum sum is: "+ ms);
    }
    public static int trap_rain(int numbers[], int width){
        int leftmax[] = new int[numbers.length];
        leftmax[0] = numbers[0];
        for(int i=1; i<numbers.length; i++){
            leftmax[i] = Math.max(leftmax[i-1], numbers[i]);
        }
        int rightmax[] = new int[numbers.length];
        rightmax[numbers.length-1] = numbers[numbers.length-1];
        for(int i=numbers.length-2; i>=0; i--){
            rightmax[i] = Math.max(rightmax[i+1], numbers[i]);
        }
        int tr = 0;
        for(int i=0; i<numbers.length; i++){
            int waterlevel = Math.min(leftmax[i], rightmax[i]);
            tr += (waterlevel-numbers[i])*width;
        }
        return tr;
    }
    public static int stocks(int numbers[]){
        int maxprofit = 0;
        int buy = numbers[0];
        for(int i=1; i<numbers.length; i++){
            buy = Math.min(numbers[i-1],buy);
            if(numbers[i]>buy){
                int profit = numbers[i] - buy;
                maxprofit = Math.max(maxprofit, profit);            
            }    
        }
        return maxprofit;
        /*int maxprofit = 0;                                       #ALTERNATIVE
        int buy = Integer.MAX_VALUE;
        for(int i=1; i<numbers.length; i++){
            if(numbers[i]>buy){
                int profit = numbers[i] - buy;
                maxprofit = Math.max(maxprofit, profit);            
            }
            else{
                buy = numbers[i];
            }    
        }
        return maxprofit;*/
    }
    public static boolean dupli_check(int numbers[]){                                //#4      
        for(int i=0; i<numbers.length-1; i++){
            for(int j=i+1; j<numbers.length; j++){
                if(numbers[i]==numbers[j]){
                    return true;
                }
            }
        }
        return false;
    }
    public static int target_index(int numbers[], int target){                        //#6               
        int min = min_index(numbers);
        if(numbers[min]<=target && target<=numbers[numbers.length-1]){
            return search(numbers, min, numbers.length-1, target);
        }
        else{
            return search(numbers, 0, min, target);
        } 
    }
    public static int search(int numbers[], int left, int right, int target){
        while(left<=right){
            int mid = left + (right - left)/2;
            if(numbers[mid]==target){
                return mid;
            }
            else if(numbers[mid]<target){
                left = mid + 1;
            }
            else{
                right = mid - 1;
            }
        }
        return -1;
    }
    public static int min_index(int numbers[]){
        int left = 0;
        int right = numbers.length-1;
        while(left<right){
            int mid = left + (right - left)/2;
            if(mid>0 && numbers[mid]<numbers[mid-1]){
                return mid;
            }
            else if(numbers[mid]>=numbers[left] && numbers[mid]>numbers[right]){
                left = mid + 1;
            }
            else{
                right = mid - 1;
            }
        }
        return left;
    }
    public static int stocks2(int numbers[]){
        int max_pr = 0;
        int buy = Integer.MAX_VALUE;
        for(int i=0; i<numbers.length; i++){
            if(numbers[i]>buy){
                int pr = numbers[i] - buy;
                max_pr = Math.max(max_pr, pr);
            }
            else{
                buy = numbers[i];
            }
        }
        if(max_pr>0){
            return max_pr;
        }
        else{
            return 0;
        }    
    }
    public static int trap_rain2(int numbers[], int width){
        int n = numbers.length;
        int leftmax[] = new int[n];
        leftmax[0] = numbers[0];
        for(int i=1; i<n; i++){
            leftmax[i] = Math.max(leftmax[i-1], numbers[i]);
        }
        int rightmax[] = new int[n];
        rightmax[n-1] = numbers[n-1];
        for(int i=n-2; i>=0; i--){
            rightmax[i] = Math.max(rightmax[i+1], numbers[i]);
        }
        int trapwater = 0;
        for(int i=0; i<n; i++){
            int waterlevel = Math.min(leftmax[i], rightmax[i]);
            trapwater += (waterlevel - numbers[i])*width;           
        }
        return trapwater;
    }                             
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numbers[] = {7,8,0,1,3,5};
        //System.out.println("Enter target: ");
        int target = sc.nextInt();
        System.out.println(target_index(numbers, target));
        //System.out.println("Duplicate array: "+dupli_check(numbers));
        //System.out.println(stocks(numbers));
        //System.out.println("Maximum profit: "+stocks2(numbers));
        //System.out.println(trap_rain(numbers, 1));
        //System.out.println(trap_rain2(numbers, 1));
        //kadane(numbers);
        //prefix_sum(numbers);
        //subarray(numbers);
        //pair(numbers);
        //rev_array(numbers);
        //for(int i=0; i<numbers.length; i++)
        //    System.out.print(numbers[i]+" ");
        //int key = sc.nextInt();
        //int index = lin_search(numbers, key);
        //if(index==-1){
        //    System.out.println("key not found");
        //}
        //else{
        //    System.out.println("key is at index: "+index);
        //}
        //int large = largest(numbers);
        //System.out.println("largest number in array is: "+large);
        //System.out.println("key is at index: " + bin_search(numbers, key));
    }
}
