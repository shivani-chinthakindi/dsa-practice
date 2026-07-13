import java.util.Arrays;
public class RemoveDuplicates {
    static int rem(int[] nums){
        if(nums.length == 0)
            return 0;
        int index = 0;
        for(int i = 1; i < nums.length; i++){
            if(nums[i] != nums[index]){
                index++;
                nums[index] = nums[i];
            }
        }
        return index  + 1;
    }
    public static void main(String[] args) {
        int[] nums = {1,4,6,2,3,1,2,3,3};
        Arrays.sort(nums);
        int uniqueCount = rem(nums);
        System.out.println(uniqueCount);
        for(int i = 0; i < uniqueCount; i++){
            System.out.print(nums[i] + " ");
        }
    }
}
