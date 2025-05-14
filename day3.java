class Solution {
    public void reverseArray(int arr[]) {
        // code here
        int n=arr.length;
        int arr1[]=new int[n];
        int j=0;
        for(int i=n-1; i>=0; i--) {
            arr1[j] = arr[i];
            j++;
        }
        for(int i=0; i<n; i++) {
            arr[i]=arr1[i];
        }
    }
}
