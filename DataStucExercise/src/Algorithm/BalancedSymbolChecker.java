/*
 * Created By Safe_IT23
 */
package Algorithm;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author jatawatsafe
 */
public class BalancedSymbolChecker {
    public static String checkBalance(String fileName) throws FileNotFoundException{
        File f = new File(fileName);
        Scanner sc = new Scanner(f);
        LinkedList<Integer> stack = new LinkedList();
        while(sc.hasNextLine()){
            String line = sc.nextLine();
            StringTokenizer stk = new StringTokenizer(line,"{}()<>[]", true);
            while(stk.hasMoreTokens()){
                String token = stk.nextToken();
                if(isSymbol(token)){
                    System.out.printf("Get: %s",token);
                    if(checkOpenParenthesis(token)){
                        stack.push(getValue(token));
                        System.out.printf("\t\t PUSH STACK: %d\n",stack.peek());
                    }else{
                        int value = getValue(token);
                        System.out.printf("\t\t Check %d == %d -->",value,stack.peek());
                        if(!stack.isEmpty()){
                            if(stack.peek()==value){
                                System.out.printf("TRUE \t POP : %s %s \n",getMissingSymbol(value),getSymbol(value));
                                stack.pop();
                            }else{
                                System.out.printf("False \nNot Match\n");
                                break;
                            }
                        }else{
                            System.out.printf("FALSE \nMissing Open Symbol\n");
                            break;
                        }
                    }
                }
            }
            if(stack.isEmpty()){
                return "Balance";
            }else{
                return "NOT BALANCE";
            }
            
        }
        return null;
    }
    
    private static boolean isSymbol(String symbol){
        if(getValue(symbol)!=-1){
            return true;
        }else{
            return false;
        }
    }
    
    
   //เทียบ
    public static int getValue(String symbol){
        switch(symbol){
            case "[" : 
            case "]" : return 1;
            
            case "{" : 
            case "}" : return 2;
            
            case "(" :
            case ")" : return 4;
            
            case "<" : 
            case ">" : return 8;
        }
        return -1;
    }
    
    
    public static String getSymbol(int value){
        switch(value){
            case 1 : return "]";
            case 2 : return "}";
            case 4 : return ")";
            case 8 : return ">";
        }
        return "";
    }
    
    public static String getMissingSymbol(int value){
        switch(value){
            case 1 : return "[";
            case 2 : return "{";
            case 4 : return "(";
            case 8 : return "<";
        }
        return "";
    }
    
    
    public static boolean checkOpenParenthesis(String symbol){
        switch(symbol){
            case "[" : 
            case "{" : 
            case "(" :
            case "<" : return true;
        }
        return false;
    }
    
    
    public static void main(String[] args) throws FileNotFoundException {
        //String message = checkBalance("/Users/jatawatsafe/NetBeansProjects1/DataStructure/DataStucExercise/src/Algorithm/BalancedSymbolChecker.java");
        String message = checkBalance("TestSymbolChecker.txt");
        System.out.println("\n"+message);
    }
}
