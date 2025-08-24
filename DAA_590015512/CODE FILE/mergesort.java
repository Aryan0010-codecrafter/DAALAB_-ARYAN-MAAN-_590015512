public class MergeSortTest {

    
    public static void merge(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        
        int[] L = new int[n1];
        int[] R = new int[n2];

        
        for (int i = 0; i < n1; ++i)
            L[i] = arr[left + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[mid + 1 + j];

        
        int i = 0, j = 0;
        int k = left;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }


    public static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

   
    public static void main(String[] args) {
        int[][] testCases = {
            {12, 11, 13, 5, 6, 7},       
            {1, 2, 3, 4, 5, 6},          
            {6, 5, 4, 3, 2, 1},          
            {10, 10, 10, 10},            
            {5},                        
            {},                         
            {8, -3, 7, -1, 2, 0},        
            {100, 50, 200, 150, 25},     
            {3, 3, 2, 1, 2, 1},          
            {9, 1, 8, 2, 7, 3, 6, 4, 5}  
        };

        for (int i = 0; i < testCases.length; i++) {
            System.out.println("Test Case " + (i + 1) + ":");
            int[] arr = testCases[i];
            System.out.print("Original: ");
            printArray(arr);

            mergeSort(arr, 0, arr.length - 1);

            System.out.print("Sorted:   ");
            printArray(arr);
            System.out.println("----------------------");
        }
    }
}
