public class CountOccurrences {
    static int countFreq (int[] arr, int target) {
        int res = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == target)
                res++;
        }
        return res;
    }
    public static void main(String[] args){
        int[] arr = {1, 1, 2, 2, 2, 2, 3};
        int target = 2;
        System.out.println(countFreq(arr, target));
    }
}
