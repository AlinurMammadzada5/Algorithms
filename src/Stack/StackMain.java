package Stack;

public class StackMain {
    public static void main(String[] args) {

        Stack stack = new Stack(0);
//        System.out.println(stack.getTop());
//        System.out.println(stack.getHeight());
        stack.push(1);
        stack.push(2);
//        stack.printStack();
        stack.pop();
        stack.printStack();
        //finished session 15:45
    }
}
