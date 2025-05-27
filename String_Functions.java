package lab01_08;

public class String_Functions {
    public static boolean compareStrings(String str1, String str2) {
        return str1.equals(str2);
    }
    public static String concatenateStrings(String str1, String str2) {
        return str1 + str2;
    }
    public static String copyString(String str) {
        return new String(str);
    }

    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";

        System.out.println("String comparison:");
        System.out.println("Are the strings equal? " + compareStrings(str1, str2));

        String original = "copy me";
        String copied = copyString(original);

        System.out.println("\nString copy:");
        System.out.println("Original string: " + original);
        System.out.println("Copied string: " + copied);

        System.out.println("\nString concatenation:");
        System.out.println("Concatenated string: " + concatenateStrings(str1, str2));


    }
}
