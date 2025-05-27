package lab01_08;
import java.util.Scanner;

public class StringBufferHandling {
    public static void main(String[] args) {
        StringBuffer sb1 = new StringBuffer();
        StringBuffer sb2 = new StringBuffer("Hello");

        System.out.println("Capacity of StringBuffer object sb1: " + sb1.capacity());
        System.out.println("Capacity of StringBuffer object sb2: " + sb2.capacity());

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        StringBuffer sb3 = new StringBuffer(input);
        sb3.reverse();
        String UpperCase = sb3.toString().toUpperCase();
        System.out.println("Reversed and uppercased string: " + UpperCase);

        System.out.print("Enter a string to append: ");
        String appendString = scanner.nextLine();
        sb3.append(appendString);
        System.out.println("String after appending: " + sb3);

        scanner.close();
    }
}

