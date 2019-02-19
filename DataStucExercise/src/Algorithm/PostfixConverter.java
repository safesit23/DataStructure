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
        LinkedList<String> stack = new LinkedList();
        String postfix = "";
        String c;
        for(int i=0;i<eq.length();i++){
            c = ""+eq.charAt(i);
            //check Is it operator ?
            if(isOperator(c)){
                //If empty, It can push
                if(stack.isEmpty()){
                    stack.push(c);
                }else{  //If not empty, we need to check value
                    while(checkValues(c) <= checkValues(stack.peek())){
                        if(!stack.isEmpty()){
                            postfix = postfix + stack.pop();
                        }else{
                            break;
                        }
                    }
                    stack.push(c);
                }
            }else{ //is Operand
                postfix = postfix + c;
            }
        }
        while(!stack.isEmpty()){
            postfix = postfix + stack.pop();
        }
        return postfix;
    }
    
    public static boolean isOperator(String t){
        switch(t){
            case "+" :  
            case "-" :  
            case "*" :
            case "/" : return true;
        }
        return false;
    }
    
    public static int checkValues(String t){
        if(t!=null){
            switch(t){
                case "+" :  
                case "-" :  return 1;
                case "*" :
                case "/" :  return 2;
            }
        }else{
            return -1;
        }
        return -1;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Equation : ");
        String eq = sc.nextLine();
        System.out.printf(">>POSTFIX : "+postfixConverter(eq));
    }
}
