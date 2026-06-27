import java.util.*;
public class PrefixSumArray {
    public static void main(String[] args){
        int[] arr = {10, 20, 10, 5, 15};
        ArrayList<Integer> prefixSum = prefixSum(arr);
        for(int i: prefixSum){
            System.out.print(i + " ");
        }
    }
    public static ArrayList<Integer> prefixSum(int[] arr){
        int n = arr.length;
        ArrayList<Integer> prefixSum = new ArrayList<>();
        prefixSum.add(arr[0]);
        for(int i = 1; i < n; i++){
            prefixSum.add(prefixSum.get(i-1)+arr[i]);
        }
        return prefixSum;
    }
}
