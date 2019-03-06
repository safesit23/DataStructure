/*
 * Created By Safe_IT23
 */
package Review;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jatawatsafe
 */
public class TestFile {
    public static void main(String[] args){
        
        
    }
    
    public void testNewFile(){
        try {
            File file = new File("text.txt");
            Scanner sc;
            sc = new Scanner(file);
            
            int num = sc.nextInt();
            System.out.println(num);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(TestFile.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void testStack(){
        Map<Integer,String> warehouse = new HashMap();
        warehouse.put(1, "AAAA");
        warehouse.put(2, "BBB");
        warehouse.put(3, "CCCC");
//         = warehouse.values();
    }
}
