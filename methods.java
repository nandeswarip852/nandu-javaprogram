public class StringMethodsDemo {
    public static void main(String[] args) {
        String str = "  Hello Java World!  ";

        System.out.println("Original String: '" + str + "'");

        // 1. length()
        System.out.println("Length: " + str.length());

        // 2. trim()
        String trimmed = str.trim();
        System.out.println("Trimmed: '" + trimmed + "'");

        // 3. toLowerCase() and toUpperCase()
        System.out.println("Lowercase: " + trimmed.toLowerCase());
        System.out.println("Uppercase: " + trimmed.toUpperCase());

        // 4. charAt()
        System.out.println("Character at index 6: " + trimmed.charAt(6));

        // 5. substring()
        System.out.println("Substring (6 to 10): " + trimmed.substring(6, 10));

        // 6. contains()
        System.out.println("Contains 'Java'? " + trimmed.contains("Java"));

        // 7. indexOf() and lastIndexOf()
        System.out.println("Index of 'a': " + trimmed.indexOf('a'));
        System.out.println("Last index of 'a': " + trimmed.lastIndexOf('a'));

        // 8. replace()
        System.out.println("Replace 'Java' with 'Python': " + trimmed.replace("Java", "Python"));

        // 9. equals() and equalsIgnoreCase()
        System.out.println("Equals 'hello java world!'? " + trimmed.equals("hello java world!"));
        System.out.println("EqualsIgnoreCase 'hello java world!'? " + trimmed.equalsIgnoreCase("hello java world!"));

        // 10. split()
        String[] words = trimmed.split(" ");
        System.out.println("Words in string:");
        for (String word : words) {
            System.out.println("- " + word);
        }
    }
}
