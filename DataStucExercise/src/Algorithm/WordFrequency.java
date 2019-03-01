/*
 * Created By Safe_IT23
 */
package Algorithm;

/**
 *
 * @author jatawatsafe
 */
public class WordFrequency implements Comparable<WordFrequency>{
    private String word;
    private int count;

    public WordFrequency(String word) {
        this.word = word;
        this.count = 1;
    }
    
    public String getWord() {
        return word;
    }

    public int getCount() {
        return count;
    }
    
   public void increment(){
       count++;
   }

    @Override
    public int compareTo(WordFrequency o) {
        //order by a-z
        return this.word.compareTo(o.word);
    }
}
