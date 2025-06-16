/******************************************************************************

Alternate Sorting
input = {1, 12, 3, 24, 9, 6}
output = {24, 1, 12, 3, 9, 6}

*******************************************************************************/

public class Main
{
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for(int i = 0; i < n - 1; i++) {
            for(int j = i + 1; j < n; j++) {
                if(arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    public static void mergeSort(int[] arr, int left, int right) {
        if(left >= right)   return;
        int mid = left + ((right - left) / 2);
        mergeSort(arr, left, mid);
        mergeSort(arr, mid + 1, right);
        merge(arr, left, mid, right);
    }
    public static void merge(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1, n2 = right - mid;
        int[] leftarray = new int[n1];
        for(int  i = 0; i < n1; i++) {
            leftarray[i] = arr[left + i];
        }
        int[] rightarray = new int[n2];
        for(int  i = 0; i < n2; i++) {
            rightarray[i] = arr[mid + i + 1];
        }
        int i = 0, j = 0, k = left;
        while(i < n1 && j < n2) {
            if(leftarray[i] <= rightarray[j]) {
                arr[k++] = leftarray[i++];
            } else {
                arr[k++] = rightarray[j++];
            }
        }
        while(i < n1)   arr[k++] = leftarray[i++];
        while(j < n2)   arr[k++] = rightarray[j++];
    }
    public static void printArray(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static int[] alternateSort(int[] arr) {
        int n = arr.length, i = 0, start = 0, end = n -1;
        int[] res = new int[n];
        while(start < end) {
            res[i++] = arr[end--];
            res[i++] = arr[start++];
        }
        return res;
    }
	public static void main(String[] args) {
		int[] input = {1, 12, 3, 24, 9, 6};
		int n = 6;
		printArray(input);
		mergeSort(input, 0, n - 1);
		printArray(input);
		int[] result = alternateSort(input);
		printArray(result);
	}
}
