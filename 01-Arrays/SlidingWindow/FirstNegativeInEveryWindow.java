import java.util.ArrayList;
import java.util.List;
public class FirstNegativeInEveryWindow {
    public static List<Integer> firstNegIdx(int[] arr, int k){
        int fstNegIdx = 0;
        List<Integer> res = new ArrayList<>( );
        int n = arr.length;
        for(int i = k - 1; i < n; i++){
            while(fstNegIdx < i && (fstNegIdx <= i-k || arr[fstNegIdx] >= 0)){
                fstNegIdx++;
            }
        if(fstNegIdx < n && arr[fstNegIdx] < 0){
            res.add(arr[fstNegIdx]);
        }
        else {
            res.add(0);
        }
        return res;
    }
    public static void main(String[] args){
        int[] arr = {12, -1, -7, 8, -15, 30, 16};
        int k = 3;
        List<Integer> res = firstNegIdx(arr, k);
        for(int i = 0; i < res.size(); i++){
            System.out.print(res.get(i) + " ");
        }
    }
}
