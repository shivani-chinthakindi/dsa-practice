import java.util.Arrays;
public class SortedSquares {
    public static int[] squares(int[] nums){
        int n = nums.length;
        int[] res = new int[n];
        int left = 0;
        int right = n - 1;
        int pos = n - 1;
        while(left <= right){
            int leftSquare = nums[left]*nums[left];
            int rightSquare = nums[right]*nums[right];
            if(leftSquare > rightSquare){
                res[pos] = leftSquare;
                left++;
            }else{
                res[pos] = rightSquare;
                right--;
            }
            pos--;
        }
        return res;
    }
    public static void main(String[] args) {
        int[] nums = {-4,-1,0,3,10};
        int[] output = squares(nums);
        System.out.println(Arrays.toString(output));
    }
}
