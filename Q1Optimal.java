public class q1optimal {
    public static void main(String[] args) {
        int start = 1;
        int end = 7;
        int[] arr = {1, 6, 5, 3, 4, 2, 7};

        int middle = (start + end) / 2;
        int index = 0;

        // Traverse the array to rearrange elements in place
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= middle) {
                // Swap elements to the front of the array
                int temp = arr[index];
                arr[index] = arr[i];
                arr[i] = temp;
                index++;
            }
        }

        // The first half is now arranged; elements > middle will be after the index
        // Print the result
        for (int num : arr) {
            System.out.print(num + " "); // Output: 1 3 4 2 6 5 7
        }
    }
}
