public class ElementSearch {
    public static void main(String[] args) {
        int[] numbers = {2, 4, 6, 8, 10};
        int target = 6;  // Element to search for
        boolean found = false;

        // Linear search
        for (int num : numbers) {
            if (num == target) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println(target + " is found in the array.");
        } else {
            System.out.println(target + " is NOT found in the array.");
        }
    }
}
