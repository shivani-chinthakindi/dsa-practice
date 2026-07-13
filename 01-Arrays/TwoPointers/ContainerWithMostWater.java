public class ContainerWithMostWater {
    static int maxWater(int[] arr){
        int left = 0, right = arr.length - 1;
        int res = 0;
        while(left < right){
            int water = Math.min(arr[left], arr[right]) * (right - left);
            res = Math.max(res, water);
            if(arr[left] < arr[right])
                left++;
            else
                right--;
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr = {2,1,8,6,4,6,5,5};
        System.out.println(maxWater(arr));
    }
}
