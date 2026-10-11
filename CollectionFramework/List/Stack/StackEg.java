package List.Stack;

import java.util.Stack;

public class StackEg {
    public static void main(String args[]) {

        Stack s1 = new Stack<>();

        // push()
        s1.push("HTML");
        s1.push("CSS");
        s1.push("JS");
        s1.push("Java");
        System.out.println(s1);

        // pop()
        s1.pop();
        System.out.println(s1);

        // peek()
        System.out.println(s1.peek());

    }
}
