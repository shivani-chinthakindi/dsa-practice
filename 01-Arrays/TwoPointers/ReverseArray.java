import java.util.Arrays;
public class ReverseArray {
    static void reverse(int[] arr){
        int start = 0;
        int end = arr.length-1;
        int temp = 0;
        while(start < end){
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args){
    int[] nums = {2, 6, 9, -1, 7, -5};
    reverse(nums);
    System.out.println(Arrays.toString(nums));
    }
}
