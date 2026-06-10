public class SearchInsertPosition {
    static int searchInsert(int arr[], int k) {
        for(int i=0; i<arr.length; i++){
            if(arr[i] >= k){
                return i;
            }
        }
        return arr.length;
    }
    public static void main(String[] args){
        int[] arr = {1, 3, 5, 6};
        int k = 5;
        System.out.println(searchInsert(arr, k));
    }
}
