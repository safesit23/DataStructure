/*
 * Created By Safe_IT23
 */
package Algorithm;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author jatawatsafe
 */
public class BalancedSymbolChecker {
    public static String checkBalance(String fileName) throws FileNotFoundException{
        File f = new File("");
        Scanner sc = new Scanner(f);
        while(sc.hasNextLine()){
            String line = sc.nextLine();
            StringTokenizer stk = new StringTokenizer(line,"{}()<>[]", true);
            while(stk.hasMoreTokens()){
                String token = stk.nextToken();
                if(isSymbol(token)){
                    System.out.println(token);
                    
                }
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
    
    
    public static void main(String[] args) {
        
    }
}
