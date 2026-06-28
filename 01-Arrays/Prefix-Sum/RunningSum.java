    public class RunningSum {
    public static void main(String[] args){
        int[] nums = {10, 20, 10, 5, 15};
        int[] ans = runningSum(nums);
        for(int num: ans){
            System.out.print(num + " ");
        }
    }
    public static int[] runningSum(int[] nums){
        int[] res = new int[nums.length];
        res[0] = nums[0];
        for(int i = 1; i < nums.length; i++){
            res[i] = res[i-1]+nums[i];
        }
        return res;
    }
}
