public class LeftRotateByOne {
    public static void leftRotate(int[] arr){
        int first = arr[0];
        int n = arr.length;
        for(int i = 0; i < n-1; i++){
            arr[i] = arr[i+1];
        }
        arr[n-1] = first;
    }
    public static void main(String[] args){
        int[] arr = {1, 2, 3, 4, 5};
        leftRotate(arr);
        for(int num: arr){
            System.out.print(num + " ");
        }
    }
}
