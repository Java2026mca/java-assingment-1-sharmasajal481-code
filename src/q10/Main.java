import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();

        String[] tokens = line.split(" ");
        Stack<Integer> stack = new Stack<>();

        for (String t : tokens) {
            if (Character.isDigit(t.charAt(0))) {
                stack.push(Integer.parseInt(t));
            } else {
                int b = stack.pop();
                int a = stack.pop();

                if (t.equals("+")) stack.push(a + b);
                else if (t.equals("-")) stack.push(a - b);
                else if (t.equals("*")) stack.push(a * b);
                else if (t.equals("/")) stack.push(a / b);
            }
        }

        System.out.println(stack.pop());
    }
}
