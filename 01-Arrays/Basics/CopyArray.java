class CopyArray{
    public static void main(String[] args) {
        int[] arr = {2, 4, 6};
        int[] copiedArr = new int[arr.length];
        for(int i = 0; i < arr.length; i++){
            copiedArr[i] = arr[i]; 
        }
        System.out.print("Copied Array: ");
        for (int num : copiedArr) {
            System.out.print(num + " ");
        }
    }
}