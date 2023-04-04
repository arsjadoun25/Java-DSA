package DSA;

public class sorting2 {
    public static void bubble_sort(int arr[], int n){
        for(int i=0; i<n-1; i++){
            for(int j=0; j<n-1-i; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void selection_sort(int arr[], int n){
        for(int i=0; i<n; i++){
            int min = i;
            for(int j=i; j<n; j++){
                if(arr[min]>arr[j]){
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }
    public static void insertion_sort(int arr[], int n){
        for(int i=1; i<n; i++){
            int curr = arr[i];
            int j = i-1;
            while(j>=0 && arr[j]>curr){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = curr;
        }
    }
    public static void counting_sort(int arr[], int n){
        int max = Integer.MIN_VALUE;
        for(int i=0; i<n ;i++){
            max = Math.max(max, arr[i]);
        }
        int count[] = new int[max+1];
        for(int i=0; i<n; i++){
            count[arr[i]]++;
        }
        int j = 0;
        for(int i=0; i<count.length; i++){
            while(count[i]>0){
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }
    public static void print_arr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {3,6,2,1,8,7,4,5,3,1};
        int n = arr.length;
        counting_sort(arr, n);
        //insertion_sort(arr, n);
        //selection_sort(arr, n);
        //bubble_sort(arr,n);
        print_arr(arr);
    }
}
