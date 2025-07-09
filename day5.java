class Solution {
    void nextPermutation(int[] arr) {
        
        int n=arr.length;
        int pivot=-1;
        for(int i=n-2; i>=0; i--) {
            if(arr[i]<arr[i+1]) {
                pivot = i;
                break;
            }
        }
        if(pivot==-1) {
            reverse(arr,0,n-1);
            return ;
        }
        int temp;
        for(int i=n-1; i>pivot; i--) {
            if(arr[i]>arr[pivot]) {
                temp=arr[i];
                arr[i]=arr[pivot];
                arr[pivot]=temp;
                break;
            }
        }
        reverse(arr, pivot+1, n-1);
    }
    void reverse(int arr[], int start, int end) {
        while(start<end) {
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
}
