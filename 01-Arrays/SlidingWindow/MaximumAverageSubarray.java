import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MaximumAverageSubarray {
    static int findMaxAvg(List<Integer> arr, int k){
        if(k > arr.size())
            return -1;
        int sum = 0;
        for(int i = 0; i < k; i++){
            sum += arr.get(i);
        }
        int maxSum = sum;
        int startIndex = 0;
        for(int i = k; i < arr.size(); i++){
            sum = sum + arr.get(i) - arr.get(i-k);
            if(sum > maxSum){
                maxSum = sum;
                startIndex = i-k+1;
            }
        }
        return startIndex;
    }
    public static void main(String[] args) {
        int k = 4;
        List<Integer> arr = new ArrayList<>(Arrays.asList(1, 12, -5, -6, 50, 3));
        int ans = findMaxAvg(arr,k);
        System.out.println(ans);
    }
}
