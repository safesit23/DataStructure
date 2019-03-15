/*
 * Created By Safe_IT23
 */
package Algorithm;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author jatawatsafe
 */
public class PostfixConverter {

    public static String postfixConverter(String exp) {
        StringBuilder result = new StringBuilder(128);
        LinkedList<String> stack = new LinkedList();
        StringTokenizer stk = new StringTokenizer(exp, " +-*/%()", true);
        String token;
        while (stk.hasMoreElements()) {
            token = stk.nextToken();
            if (token.equals(" ")) {
                continue;   //วนกลับไปอ่านตัวใหม่ทันที
            }
            if (!isOperator(token)) {
                //isOperand
                //System.out.printf("%s is Operand\n",token);
                result.append(String.format(" %s", token));

            } else if (token.equals("(")) {
                stack.push(token);
            } else if (token.equals(")")) {
                while (!stack.isEmpty() && !stack.peek().equals("(")) {
                    result.append(String.format(" %s", stack.pop()));
                }
                //pop "(" for discard
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else {
                //isOperand
                //System.out.printf("%s is Operand\n",token);
                while (!stack.isEmpty() && precedenceLevel(token) <= precedenceLevel(stack.peek())) {
                    result.append(String.format(" %s", stack.pop()));
                }
                stack.push(token);
            }
        }

        while (!stack.isEmpty()) {
            result.append(String.format(" %s", stack.pop()));
        }
        return result.toString().trim();
    }

    public static boolean isOperator(String operator) {
        switch (operator) {
            case "(":
            case ")":
            case "+":
            case "-":
            case "*":
            case "/":
            case "%":
                return true;
        }
        return false;
    }

    public static int precedenceLevel(String operator) {
        switch (operator) {
            case "(":
            case ")":
                return 0;

            case "+":
            case "-":
                return 1;

            case "*":
            case "/":
            case "%":
                return 2;
        }
        throw new RuntimeException("Invalid operator");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Equation : ");
        String eq = sc.nextLine();
        System.out.printf(">>POSTFIX : " + postfixConverter(eq));
    }
}
