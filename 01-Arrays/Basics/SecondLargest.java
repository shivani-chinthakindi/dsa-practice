class SecondLargest{
    public static void main(String[] args) {
        int[] arr = {12, 35, 1, 10, 34, 1}; // Example array

int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE; 

for (int num : arr) { 
    if (num > first) { 
        second = first; 
        first = num; 
    } else if (num > second && num != first) { 
        second = num; 
    } 
}

// Printing the result directly without methods
if (second == Integer.MIN_VALUE) {
    System.out.println("There is no second largest distinct element.");
} else {
    System.out.println("The second largest element is: " + second);
}
    }
}