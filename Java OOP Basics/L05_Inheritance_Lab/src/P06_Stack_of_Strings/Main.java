package P06_Stack_of_Strings;


public class Main {
    public static void main(String[] args) {
        StackOfStrings stackOfStrings =new StackOfStrings();
        stackOfStrings.push("Stefko");
        stackOfStrings.push("Animal");
        stackOfStrings.push("Stamat");

        System.out.println(stackOfStrings.isEmpty());
        System.out.println(stackOfStrings.peek());

        System.out.println(stackOfStrings.pop());
        System.out.println(stackOfStrings.pop());
        System.out.println(stackOfStrings.pop());


    }
}
