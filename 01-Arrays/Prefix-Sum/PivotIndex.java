public class PivotIndex {
    public static int findPivot(int[] nums){
        int totalSum = 0;
        int leftSum = 0;
        for(int num: nums){
            totalSum += num;
        }
        for(int i = 0; i < nums.length; i++){
            if(leftSum == totalSum - leftSum - nums[i]){
                return i;
            }
            leftSum = nums[i];
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] nums = {1,7,3,6,5,6};
        int res = findPivot(nums);
        System.out.println("The pivot index is: " + res);
    }
}
