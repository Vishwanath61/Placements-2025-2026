/******************************************************************************

Sorting with Distance Constraints:
Sort an array and count the number of passes required, ensuring no element moves more than two positions.
Input: 5 1 2 3 4
Output: -1

*******************************************************************************/

public class Main
{
    public static int[] cloneArray(int[] arr, int n) {
        int[] a = new int[n];
        for(int i = 0; i < n; i++) {
            a[i] = arr[i];
        }
        return a;
    }
    public static void mergeSort(int[] arr, int low, int high) {
        if(low >= high) return;
        int mid = low + (high - low) / 2;
        mergeSort(arr, low, mid);
        mergeSort(arr, mid + 1, high);
        merge(arr, low, mid, high);
    }
    public static void merge(int[] arr, int low, int mid, int high) { 
        int n1 = mid - low + 1;
        int n2 = high - mid;
        int[] left = new int[n1];
        int[] right = new int[n2];
        for(int i = 0; i < n1; i++) {
            left[i] = arr[low + i];
        }
        for(int i = 0; i < n2; i++) {
            right[i] = arr[mid + i + 1];
        }
        int i = 0, j = 0, k = low;
        while(i < n1 && j < n2) {
            if(left[i] <= right[j]) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
            }
        }
        while(i < n1)   arr[k++] = left[i++];
        while(j < n2)   arr[k++] = right[j++];
    }
    public static int findIndex(int[] inp, int arr, int n) {
        for(int i = 0; i < n; i++) {
            if(inp[i] == arr)   return i;
        }
        return -1;
    }
    public static int distanceSorting(int[] input) {
        int n = input.length;
        int[] arr = cloneArray(input, n);
        mergeSort(arr, 0, n - 1);
        for(int i = 0; i < n; i++) {
            if(Math.abs(i - findIndex(input, arr[i], n)) > 2)   return -1;
        }
        int count = 0;
        for(int i = 0; i < n; i++) {
            for(int j = Math.max(0, i - 2); j < i; j++) {
                if(input[j] > input[i])    count++;
            }
        }
        return count;
    }
	public static void main(String[] args) {
	    int[] input = {20, 10, 50, 30, 40};
		System.out.println(distanceSorting(input));
	}
}
