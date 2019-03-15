/*
 * Created By Safe_IT23
 */
package Algorithm;

import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author jatawatsafe
 */
public class PostfixConverter {
    public static String postfixConverter(String eq){
        StringBuilder result = new StringBuilder(128);
        LinkedList<String> stack = new LinkedList();
        
        
        while(!stack.isEmpty()){
            result.append(" ");
            result.append(stack.pop());
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
        System.out.printf(">>POSTFIX : "+postfixConverter(eq));
    }
}
