import java.util.*;
public class RangeSumQuery {
   static int rangeSum(int[] prefSum, int a, int b){
    int start = a-1;
    int end = b-1;
    if(start == 0){
        return prefSum[end];
    }
    return prefSum[end] - prefSum[start-1];
   }
   static int[] buildPrefSum(int[] arr){
    int n = arr.length;
    int[] prefix = new int[n];
    prefix[0] = arr[0];
    for(int i = 1; i<n; i++){
        prefix[i] = prefix[i-1] + arr[i];
    }
    return prefix;
   }
    static void findSum(int[] v1, int q, int Queries[][]){
        int n = v1.length;
        int[] v2 = v1.clone();
        Arrays.sort(v2);
        int[] prefixV1 = buildPrefSum(v1);
        int[] prefixV2 = buildPrefSum(v2);
        for(int i = 0; i < q; i++){
            int m = Queries[i][0];
            int a = Queries[i][1];
            int b = Queries[i][2];
            if(m==1){
                System.out.print(rangeSum(prefixV1,a,b) + " ");
            }
            else if(m==2){
                System.out.print(rangeSum(prefixV2,a,b) + " ");
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {6,4,2,7,2,7};
        int Q = 3;
        int Queries[][] = {{2,3,6}, 
            {1,3,4}, 
            {1,1,6}
        };
        findSum(arr,Q,Queries);
    }
}
