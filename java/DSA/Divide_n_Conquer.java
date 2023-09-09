package DSA;

import java.util.*;

public class Divide_n_Conquer {
    public static void printarr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void MergeSort(int arr[], int si, int ei){
        if(si>=ei){
            return;
        }
        int mid = si+(ei-si)/2;
        MergeSort(arr, si, mid);
        MergeSort(arr, mid+1, ei);
        Merge(arr, si, mid, ei);
    }
    public static void Merge(int arr[], int si, int mid, int ei){
        int temp[] = new int[ei-si+1];
        int i = si;
        int j = mid+1;
        int k = 0;
        while(i <=mid && j<=ei){
            if(arr[i]<arr[j]){
                temp[k] = arr[i];
                i++; k++;
            } else{
                temp[k] = arr[j];
                j++; k++;
            }
        }
        while(i<=mid){
            temp[k++] = arr[i++];
        }
        while(j<=ei){
            temp[k++] = arr[j++];
        }
        for(k=0, i=si; k<temp.length; k++,i++){
            arr[i] = temp[k];
        }
    }
    public static void QuickSort(int arr[] ,int si, int ei){
        if(si >=ei){
            return;
        }
        int pidx = partition(arr, si, ei);
        QuickSort(arr, si, pidx-1);
        QuickSort(arr, pidx+1, ei);
    }
    public static int partition(int arr[], int si, int ei){
        int pivot = arr[ei];
        int i = si-1;
        for(int j=si; j<ei; j++){
            if(arr[j]<=pivot){
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        int temp = pivot;
        arr[ei] = arr[i];
        arr[i] = temp;
        return i;
    }
    public static int Search(int arr[], int tar, int si, int ei){
        if(si>ei){
            return -1;
        }
        int mid = si+(ei-si)/2;
        if(arr[mid]==tar){
            return mid;
        }
        if(arr[si]<=arr[mid]){
            if(tar>=arr[si] && tar<=arr[mid]){
                return Search(arr, tar, si, mid-1);
            }else{
                return Search(arr, tar, mid+1, ei);
            }
        } else{
            if(tar<=arr[ei] && tar>=arr[mid]){
                return Search(arr, tar, mid+1, ei);
            }else{
                return Search(arr, tar, si, mid-1);
            }
        }
    }


    /*Practice Ques 1
      Apply Merge sort to sort an array of Strings. (Assume that all the characters in all the Strings
      are in lowercase). (EASY)
      Sample Input 1: arr = { "sun", "earth", "mars", "mercury"}
      Sample Output 1: arr = { "earth", "mars", "mercury","sun"}
    */
    public static String[] Ques1(String arr[], int lo, int hi){
        if(lo==hi){
            String A[] = {arr[lo]};
            return A;
        }
        int mid = lo + (hi-lo)/2;
        String arr1[] = Ques1(arr, lo, mid);
        String arr2[] = Ques1(arr, mid+1, hi);
        String arr3[] = MergeQues1(arr1, arr2);
        return arr3;
    }
    public static String[] MergeQues1(String arr1[], String arr2[]){
        int m = arr1.length;
        int n = arr2.length;
        String arr3[] = new String[m+n];
        int idx = 0;
        int i = 0;
        int j = 0;
        while(i<m && j<n){
            if(isAlphaSmaller(arr1[i], arr2[j])){
                arr3[idx] = arr1[i];
                i++;
                idx++;
            }else{
                arr3[idx] = arr2[j];
                j++;
                idx++;
            }
        }
        while(i<m){
            arr3[idx] = arr1[i];
            i++;
            idx++;
        }
        while(j<n){
            arr3[idx] = arr2[j];
            j++;
            idx++;
        }
        return arr3;
    }
    static boolean isAlphaSmaller(String str1, String str2){
        if(str1.compareTo(str2)<0){
            return true;
        }else{
            return false;
        }
    }
    /*Practice Ques 2
      Given an array nums of size n, returnthe majority element. (MEDIUM)
      The majority element is the element that appears more than ⌊n/2⌋ times. You may assume that the 
      majority element always exists in the array. 
      Sample Input 1: nums = [3,2,3]
      Sample Output 1: 3
      Sample Input 2: nums = [2,2,1,1,1,2,2]
      Sample Output 2: 2
      Constraints(extra Conditions):
      ●n == nums.length
      ●1 <= n <= 5 * 104
      ●-109 <= nums[i] <= 109     
    */
    public static int Majority(int nums[]){
        int majorcount = nums.length/2;
        for(int i=0; i<nums.length; i++){
            int count = 0;
            for(int j=0; j<nums.length; j++){
                if(nums[j] == nums[i]){
                    count++;
                }
            }
            if(count>majorcount){
                return nums[i];
            }
        }
        return -1;
    }
    /*Practice Ques 3
      Given an array of integers. Find the Inversion Count in the array. (HARD)
      InversionCount: For an array, inversion count indicates how far(orclose) the array is from being 
      sorted. If the array is already sorted then the inversion count is 0. If an array is sorted in the
      reverse order then the inversion count is the maximum. Formally, two elements a[i] and a[j] form an 
      inversion if a[i] > a[j] and i < j. 
      Sample Input 1: N = 5, arr[ ] = {2, 4, 1, 3, 5}
      Sample Output 1: 3, because it has 3 inversions -(2, 1), (4, 1), (4, 3)
    */
    public static int getInvCount(int arr[]){
        int n = arr.length;
        int invCount = 0;
        for(int i=0; i<n-1; i++){
            for(int j=i+1; j<n; j++){
                if(arr[i] >arr[j]){
                    invCount++;
                }
            }
        }
        return invCount;
    }
    public static void main(String[] args) {
        // int arr[] = {4, 5, 6, 7, 0, 1, 2};
        // MergeSort(arr, 0, arr.length-1);
        // // QuickSort(arr, 0, arr.length-1);
        // // int tidx = Search(arr, 0, 0, arr.length-1);
        // System.out.println(tidx);
        // String arr[] = { "sun", "earth", "mars", "mercury"};
        // String A[] = Ques1(arr, 0, arr.length-1);
        // for(int i=0; i<A.length; i++){
        //     System.out.print(A[i]+" ");
        // }
        // int arr1[] = {3,2,3};
        // int arr2[] = {2, 2, 1, 1, 1, 2, 2};
        // System.out.println(Majority(arr1));
        // System.out.println(Majority(arr2));
        int arr[] = {2, 4, 1, 3, 5};
        System.out.println(getInvCount(arr));
        // printarr(arr);
    }
}
