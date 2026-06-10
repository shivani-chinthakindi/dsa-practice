public class FloorInSortedArray {
    static int findFloor(int arr[], int x){
        int n = arr.length;
        if(x >= arr[n-1])
            return arr[n-1];
        if(x < arr[0])
            return -1;
        int ans = -1;
        for(int i = 0; i < n; i++){
            if(arr[i] > x){
                return arr[i-1];
            }
        }
        return ans;
    }
    public static void main(String[] args){
        int arr[] = {1, 2, 4, 6, 10, 12, 14};
        int x = 7;
        int res = findFloor(arr, x);
        System.out.println(res);
    }
}
