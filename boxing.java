package lab01_08;

public class boxing {
    public static void main(String[] args) {
        // Boxing and Unboxing
        Integer boxedInt = Integer.valueOf(10); // Boxing
        int unboxedInt = boxedInt.intValue(); // Unboxing

        System.out.println("Boxed Integer: " + boxedInt);
        System.out.println("Unboxed Integer: " + unboxedInt);

        Double boxedDouble = Double.valueOf(20.5); // Boxing
        double unboxedDouble = boxedDouble.doubleValue(); // Unboxing

        System.out.println("Boxed Double: " + boxedDouble);
        System.out.println("Unboxed Double: " + unboxedDouble);

        Character boxedChar = Character.valueOf('A'); // Boxing
        char unboxedChar = boxedChar.charValue();

        System.out.println("Boxed Character: " + boxedChar);
        System.out.println("Unboxed Character: " + unboxedChar);

        Float boxedFloat = Float.valueOf(15.5f); // Boxing
        float unboxedFloat = boxedFloat.floatValue(); // Unboxing

        System.out.println("Boxed Float: " + boxedFloat);
        System.out.println("Unboxed Float: " + unboxedFloat);
    }
}
