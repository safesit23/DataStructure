/*
 * Created By Safe_IT23
 */
package Algorithm.WordFrequency;

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
public class FrequencyCounter {
    Map<String, WordFrequency> frequency;

    public FrequencyCounter() {
        frequency = new HashMap(125);
    }
    
    public void process(String fileName) throws FileNotFoundException{
        Scanner sc = new Scanner(new File(fileName));
        String line;
        while(sc.hasNextLine()){
            line = sc.nextLine();
            StringTokenizer stk = new StringTokenizer(line, ".:,;()*-/\\1234567890 ",false);  // default false ->เพื่อบอกว่าไม่เอา
            while(stk.hasMoreElements()){
                String word = stk.nextToken().toLowerCase();
                //if not has this word
                if(frequency.get(word)==null){
                    frequency.put(word, new WordFrequency(word));
                }else{
                    //else --> increment
                    frequency.get(word).increment();
                }
                
            }
        }
    }
    
    public void clear(){
        frequency.clear();
    }
    
    @Override
    public String toString(){
        //ต่อ String ระบุ capacity
        StringBuilder stb = new StringBuilder(frequency.size()*20);
        //เอาคำทั้งหมดออกมา
        List<WordFrequency> words = new ArrayList(frequency.values()); //value is method in collection
        //
        Collections.sort(words);
        //ต่อ String
        for (WordFrequency word : words) {
            //loop to
            //%-15s = 15 ตัวอักษร
            stb.append(String.format("%-15s : %3d\n", word.getWord(),word.getCount()));
        }
        return stb.toString();
    }
    
}
