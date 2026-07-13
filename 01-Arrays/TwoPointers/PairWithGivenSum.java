import java.util.Arrays;
public class PairWithGivenSum {
    // Two Sum
    static int[] twoSum (int[] arr, int target){
        Arrays.sort(arr);
        int left = 0;
        int right = arr.length-1;
        while(left < right){
            int sum = arr[left] + arr[right];
            if (sum == target){
                return new int[] {left, right};
            }
            else if(sum < target)
                left++;
            else
                right--;
        }
        return new int[] {};
    }
    public static void main(String[] args) {
        int[] arr = {0,-1,2,-3,1};
        int target = -2;
        int[] res = twoSum(arr,target);
        if(res.length == 2){
            System.out.println("Indices found at: [" + res[0] + " , " + res[1] + "]");
        }
        else {
            System.out.println("No pair found.");
        }
    }
}
