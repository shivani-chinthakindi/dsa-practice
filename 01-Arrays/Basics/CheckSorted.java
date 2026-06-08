class CheckSorted {
    public static void main(String[] args) {
        // 1. Declare a sample array to test
        int[] arr = {1, 2, 5, 7, 9}; 

        // 2. Your provided logic
        boolean isSorted = true;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                isSorted = false;
                break;
            }
        }

        // 3. Print the result
        if (isSorted) {
            System.out.println("The array is sorted.");
        } else {
            System.out.println("The array is NOT sorted.");
        }
    }
}