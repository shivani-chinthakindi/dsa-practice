class MoveNegativesToOneSide {
    public static void moveAllNegatives (int[] arr) {
        int left = 0;
        int right = arr.length-1;
        while (left <= right){
            if( arr[left] < 0 && arr[right] < 0){
                left++;
            }
            else if (arr[left] >=0 && arr[right] < 0) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
            else if (arr[left] >=0 && arr[right] >=0){
                right++;
            }
            else {
                left++;
                right--;
            }
        }
    }
    public static void main(String[] args){
        int[] arr = {-12, 11, -13, -5, 6, -7, 5, -3, -6};
        System.out.println("Original Array: ");
        for(int num : arr){
            System.out.print(num + " ");
        }
        System.out.println();
        moveAllNegatives(arr);
        System.out.println("Modified Array: ");
        for(int num : arr){
            System.out.print(num + " ");
        }
    }
}