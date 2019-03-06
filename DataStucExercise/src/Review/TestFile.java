/*
 * Created By Safe_IT23
 */
package Review;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jatawatsafe
 */
public class TestFile {
    public static void main(String[] args){
        testNewFile();
        
    }
    
    public static void testNewFile(){
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
    
    public static void testScanner(){
        ArrayList<String> listAll = new ArrayList();  //เพิ่ม ArrayList
        try{
            File myFile=new File("StudentList.txt");
            Scanner sc = new Scanner(myFile);
            while(sc.hasNextLine()){   //Loop นับบรรทัด   โดยผูกกับไฟล์
                String line=sc.nextLine();
                //System.out.println(line);
                StringTokenizer stk = new StringTokenizer(line, ". ",false);
                while(stk.hasMoreElements()){         //Loop นับคำ โดยผูกกับString
                    String text=stk.nextToken();
                    //System.out.println(scStr.next());
                }
            }
        }catch (FileNotFoundException ex) {
            Logger.getLogger(TestFile.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
