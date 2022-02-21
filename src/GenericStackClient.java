public class GenericStackClient {
    private static void stackOfStrings(){
        GenericStack<String> stack = new GenericStack<>();
        stack.push("Five");
        stack.push("Four");
        stack.push("Three");
        stack.push("Two");
        stack.push("One");
        System.out.println("Size of stack after pushed: " + stack.getSize());
        System.out.println("Pop elements from stack: ");
        while (!stack.isEmpty()) {
            System.out.printf(" %s", stack.pop());
        }
        System.out.println("\n Size of stack after poped: " + stack.getSize());
    }
    private static void stackOfIntegers(){
        GenericStack<Integer> stack = new GenericStack<>();
        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);
        System.out.println("Size of stack after pushed: " + stack.getSize());
        System.out.println("Pop elements from stack: ");
        while (!stack.isEmpty()){
            System.out.printf(" %d",stack.pop());
        }
        System.out.println("\n Size of stack after poped: " + stack.getSize());
    }

    public static void main(String[] args) {
        System.out.println("1. Stack of integers");
        stackOfIntegers();
        System.out.println("\n2.Stack of Strings");
        stackOfStrings();
    }
}
