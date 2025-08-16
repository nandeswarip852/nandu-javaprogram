public class LinearSearch {
    // Method to perform linear search
    public static int linearSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;  // Return the index where key is found
            }
        }
        return -1;  // Return -1 if key is not found
    }

    public static void main(String[] args) {
        int[] numbers = {10, 25, 30, 45, 50};
        int key = 30;

        int result = linearSearch(numbers, key);

        if (result == -1) {
            System.out.println("Element " + key + " not found in the array.");
        } else {
            System.out.println("Element " + key + " found at index: " + result);
        }
    }
}



