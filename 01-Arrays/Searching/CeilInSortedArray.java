public class CeilInSortedArray {
    static int ceilSearch(int arr[], int x){
        int n = arr.length;
        if(x <= arr[0])
            return arr[0];
        for(int i = 0; i < n; i++){
            if(arr[i] == x)
                return arr[i];
            if(arr[i] < x && arr[i+1] >= x)
                return arr[i+1];
        }
        return -1;
    }
    public static void main(String[] args){
        int arr[] = {1, 2, 8, 10, 10, 12, 19};
        int x = 3;
        int res = ceilSearch(arr, x);
        if(res == -1)
            System.out.println("Ceiling of " + x + " doesn't exist");
        else
            System.out.println("Ceiling of " + x + " is " + res);
    }
}
