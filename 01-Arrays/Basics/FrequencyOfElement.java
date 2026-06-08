import java.util.HashMap;

public class FrequencyOfElement {
    public static void main(String[] args) {
        // Example array of numbers
        int[] arr = {1, 2, 2, 3, 1, 4, 2, 5};

        HashMap<Integer, Integer> freqMap = new HashMap<>();
        for (int num : arr) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        System.out.println("Frequency Map: " + freqMap);
    }
}