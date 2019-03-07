/*
 * Created By Safe_IT23
 */
package Practice1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author jatawatsafe
 */
public class Frequency {
    private Map<String, Word> counter;

    public Frequency() {
        counter = new HashMap();
    }
    
    public void countProcess(String fileName) throws FileNotFoundException{
        Scanner sc = new Scanner(new File(fileName));
        String line;
        while(sc.hasNextLine()){
            line = sc.nextLine();
            StringTokenizer stk = new StringTokenizer(line,".,/();01234567890 ", false);
            while(stk.hasMoreElements()){
                String word = stk.nextToken().toLowerCase();
                if(counter.get(word)==null){
                    counter.put(word, new Word(word, 1));
                }else{
                    counter.get(word).increment();
                }
            }
        }
    }
    
    public void clear(){
        counter.clear();
    }
    
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        List<Word> list = new ArrayList(counter.values());
        Collections.sort(list);
        for (Word word : list) {
            sb.append(String.format("%-15s : %d\n", word.getWord(),word.getCount()));
        }
        return sb.toString();
    }
    
    
}
