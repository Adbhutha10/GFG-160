class Solution {
    // Function to rotate an array by d elements in counter-clockwise direction.
    static void rotateArr(int arr[], int d) {
        // add your code here
        int n=arr.length;
        int a[] = new int[n];
        int j=0;
        if(d<=n) {
            for(int i=d; i<n; i++) {
                a[j] = arr[i];
                j++;
            }
            for(int i=0; i<d;i++) {
                a[j] = arr[i];
                j++;
            }
        }
        else {
            d = d%n;
            for(int i=d; i<n; i++) {
                a[j] = arr[i];
                j++;
            }
            for(int i=0; i<d;i++) {
                a[j] = arr[i];
                j++;
            }
        }
        for(int i=0; i<n; i++) {
            arr[i] = a[i];
        }
    }
}
