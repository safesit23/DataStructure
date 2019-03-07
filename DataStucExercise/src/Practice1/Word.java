/*
 * Created By Safe_IT23
 */
package Practice1;

/**
 *
 * @author jatawatsafe
 */
public class Word implements Comparable<Word>{
    private String word;
    private int count;

    public Word(String word, int count) {
        this.word = word;
        this.count = count;
    }
    
    @Override
    public int compareTo(Word o) {
        return this.word.compareTo(o.getWord());
    }
    

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
    
    public void increment(){
        this.count++;
    }
    
    
}
