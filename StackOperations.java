package Stack;

public class StackOperations {
    public static void main(String[] args) {
// Using FixedLengthStack through Interface reference
        Stack fixedStack = new FixedLengthStack(5);
        System.out.println("Fixed Length Stack Operations:");
        performStackOperations(fixedStack);
// Using DynamicLengthStack through Interface reference
        Stack dynamicStack = new DynamicLengthStack();
        System.out.println("\nDynamic Length Stack Operations:");
        performStackOperations(dynamicStack);
    }
    public static void performStackOperations(Stack stack) {
        System.out.println("Stack Size: " + stack.size());
        stack.push(10);
        System.out.println("Stack Size: " + stack.size());
        stack.push(20);
        System.out.println("Stack Size: " + stack.size());
        stack.push(30);
        System.out.println("Stack Size: " + stack.size());
        System.out.println("Pop: " + stack.pop());
        System.out.println("Stack Size: " + stack.size());
        System.out.println("Pop: " + stack.pop());
        System.out.println("Stack Size: " + stack.size());
        System.out.println("Is Empty: " + stack.isEmpty());
        System.out.println("Stack Size: " + stack.size());
        System.out.println("Pop: " + stack.pop());
        System.out.println("Stack Size: " + stack.size());
        System.out.println("Is Empty: " + stack.isEmpty());
    }
}
