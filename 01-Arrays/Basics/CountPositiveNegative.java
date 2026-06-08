class CountPositiveNegative{
    public static void main(String[] args) {
        int[] arr = {-1, 2, 3};
        int posCount = 0, negCount = 0;
        for(int num : arr){
            if(num > 0)
                posCount++;
            else
                negCount++;
        }
        System.out.println("Total Positive numbers: " + posCount);
        System.out.println("Total Negative numbers: " + negCount);
    }
}