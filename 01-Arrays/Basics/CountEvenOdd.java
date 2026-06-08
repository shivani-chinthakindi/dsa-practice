class CountEvenOdd{
    public static void main(String[] args) {
        int evenCount = 0, oddCount = 0;
        int[] arr = {10, 20, 30, 40, 50};
        for(int num: arr){
            if(num % 2 == 0)
                evenCount++;
            else
                oddCount++;
        }
        System.out.println("Total Even Numbers: " + evenCount);
        System.out.println("Total Odd Numbers: " + oddCount);
    }
}