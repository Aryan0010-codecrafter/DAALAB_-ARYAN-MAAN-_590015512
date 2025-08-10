public class BinarySearchCases {
    public statIc int binarySearch(int[] arr, int target) {
        int left=0, right = arr.length - 1;
       int steps=0;

        while (left <= right) {</mark>
            steps++;
            int mid = left + (right - left) / 2;

            if (arr[mid] ==target) {
                System.out.println("Steps taken: " + steps);
                return mid;
            } else if (arr[mid] < target) {</mark>
                left = mid +1;
            } else {
                right = mid -1;
            }
        }

        system.out.println("Steps taken: " + steps);
        return -1;
    }

    public static void runTest(String label, int[] arr, int target) {
        System.out.println("=== " + label + " ===");
        System.out.print("Array: ");
        for (int num : arr) System.out.print(num + " ");
        System.out.println("\nTarget: " + target);

        int result = binarySearch(arr, target);
        if (result != -1)
            System.out.println("Result: Found at index " + result);
        else
            System.out.println("Result: Not found");
        System.out.println();
    }

    public static void main(String[] args) {
       
        runTest("Best Case 1", new int[]{1, 3, 5, 7, 9}, 5);
        runTest("Best Case 2", new int[]{10, 20, 30, 40, 50}, 30);
        runTest("Best Case 3", new int[]{100, 200, 300, 400, 500}, 300);
        runTest("Best Case 4", new int[]{-10, -5, 0, 5, 10}, 0);
        runTest("Best case 5", new int[]{2, 4, 6, 8, 10}, 6);

    
        runTest("Average Case 1", new int[]{1, 3, 5, 7, 9}, 7);
        runTest("Average Case 2", new int[]{10, 20, 30, 40, 50}, 40);
        runTest("Average Case 3", new int[]{100, 200, 300, 400, 500}, 200);
        runTest("Average Case 4", new int[]{-10, -5, 0, 5, 10}, -5);
        runTest("Average Case 5", new int[]{2, 4, 6, 8, 10}, 8);

     
        runTest("Worst Case 1 - Not Found", new int[]{1, 3, 5, 7, 9}, 2);
        runTest("Worst Case 2 - First Element", new int[]{10, 20, 30, 40, 50}, 10);
        runTest("Worst Case 3 - Last Element", new int[]{100, 200, 300, 400, 500}, 500);
        runTest("Worst Case 4 - Not Found", new int[]{-10, -5, 0, 5, 10}, 11);
        runTest("Worst Case 5 - Not Found", new int[]{2, 4, 6, 8, 10}, 1);
    }
}