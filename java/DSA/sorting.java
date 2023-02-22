package DSA;

import java.util.*;
public class sorting {
    public static void bubble_sort(int nums[]){
        for(int i=0; i<nums.length-1;i++){
            int swap = 0;
            for(int j=0; j<nums.length-1-i; j++){
                if(nums[j]>nums[j+1]){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                    swap++;
                }
            }
            if(swap==0){
                System.out.println("array is sorted");
                break;
            }
        }
    }
    public static void selection_sort(int nums[]){
        for(int i=0; i<nums.length-1;i++){
            int min = i;
            for(int j=i+1; j<nums.length; j++){
                if(nums[min]>nums[j]){
                    min = j;
                }
            }
            int temp = nums[min];
            nums[min] = nums[i];
            nums[i] = temp;
        }
    }
    public static void printarr(int nums[]){
        for(int i=0; i<nums.length; i++){
            System.out.print(nums[i]+" ");
        }
    }
    public static void insertion_sort(int nums[]){
        for(int i=1; i<nums.length;i++){
            int curr = nums[i];
            int j = i-1;
            while(j>=0 && nums[j]>curr){
                nums[j+1] = nums[j];
                j--;
            }
            nums[j+1] = curr;
        }
    }
    public static void counting_sort(int nums[]){
        int max = Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++){
            max = Math.max(max, nums[i]);
        }
        int count[] =  new int[max+1];
        for(int i=0; i<nums.length; i++){
            count[nums[i]]++;
        }
        int j = 0;
        for(int i=0; i<count.length; i++){
            while(count[i]>0){
                nums[j] = i;
                j++;
                count[i]--;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nums[] = {3,2,1,0,2,4,9};
        counting_sort(nums);
        //insertion_sort(nums);
        //selection_sort(nums);
        //bubble_sort(nums);
        printarr(nums);   
    }
}
