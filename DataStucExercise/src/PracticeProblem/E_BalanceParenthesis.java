/*
 * Created By Safe_IT23
 */
package PracticeProblem;

import java.util.LinkedList;
import java.util.StringTokenizer;

/**
 *
 * @author jatawatsafe 
 * Practice01 : Balance Parenthesis Checker
 * Level: Easy
 */
public class E_BalanceParenthesis {

    public static void main(String[] args) {
        String q1 = "{[{}]}";
        System.out.printf("Input: %s\n",q1);
        System.out.printf("output: %s\n\n",checkParenthesis(q1));
        String q2 = "[]{}()";
        System.out.printf("Input: %s\n",q2);
        System.out.printf("output: %s\n\n",checkParenthesis(q2));
        String q3 = "{()}[)";
        System.out.printf("Input: %s\n",q3);
        System.out.printf("output: %s\n\n",checkParenthesis(q3));
        String q4 = "{(})";
        System.out.printf("Input: %s\n",q4);
        System.out.printf("output: %s\n\n",checkParenthesis(q4));
    }

    //PROCESS
    public static String checkParenthesis(String input) {
        LinkedList<String> stack = new LinkedList();
        StringTokenizer stk = new StringTokenizer(input, "()[]{}", true);
        while (stk.hasMoreTokens()) {
            String token = stk.nextToken();
            //1. Check that symbol is Symbol or not
            if (isSymbol(token)) {
                //2. Check that is Open or not
                if (checkOpenParenthesis(token)) {
                    stack.push(token);
                } else { //2.1. If it isn't open (It is Close)
                    int valueOfThisToken = getValue(token);
                    if (!stack.isEmpty()) { //The stack must not empty
                        if (getValue(stack.peek()) == valueOfThisToken) {    //last one in stack is equal this symbol
                            stack.pop();
                        } else {    //Means Not Match
                            break;
                        }
                    } else {    //The stack is empty
                        break;  //Missing Open Symbol
                    }
                }
            }//Close if isSymbol
        }//Close Loop
        //3. Check in stack
        if (stack.isEmpty()) {
            return "true - Balance";    //Balanced
        } else {
            return "false - NOT BALANCE";   //Not Balanced
        }

    }

    //Method
    private static boolean isSymbol(String symbol) {
        if (getValue(symbol) != -1) {
            return true;
        } else {
            return false;
        }
    }

    public static int getValue(String symbol) {
        switch (symbol) {
            case "[":
            case "]":
                return 1;

            case "{":
            case "}":
                return 2;

            case "(":
            case ")":
                return 4;

        }
        return -1;
    }

    public static boolean checkOpenParenthesis(String symbol) {
        switch (symbol) {
            case "[":
            case "{":
            case "(":
                return true;
        }
        return false;
    }
}
