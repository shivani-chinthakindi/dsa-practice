public class SlidingWindowMax {
    public static int[] maxSW(int[] arr, int k){
        if(arr == null || arr.length == 0 || k <= 0 || k > arr.length){
            return new int[0];
        }
    int[] res = new int[arr.length-k+1];
    for(int start = 0; start <= arr.length-k; start++)
    {
        int currentMax = arr[start];
        for(int index = start+1; index < start+k; index++){
            currentMax = Math.max(currentMax, arr[index]);
        }
        res[start] = currentMax;
    }
    return res;
}
public static void main(String[] args){
 int[] arr = {4, 3, 1, 2, -1, 0, 1, 3};
 int k = 3;
 int[] res = maxSW(arr, k);
 for(int i = 0; i < arr.length-k+1; i++){
    System.out.print(res[i] + " ");
 }
}
}