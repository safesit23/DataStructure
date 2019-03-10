
import Algorithm.FindMode.FindMode;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/*
 * Created By Safe_IT23
 */

/**
 *
 * @author jatawatsafe
 */
public class FindModeTest {

    @Test
    public void test1() {
        int[] numbers = {1,2,2,1,3};
        String expectResult = "2 (2) : [1, 2]";
        String result = FindMode.findMode(numbers);
        assertEquals(expectResult, result);
    }
    
    @Test
    public void test2() {
        int[] numbers = {3,4,1,4,8,7,3,8,5,2,4,8};
        String expectResult = "8 (3) : [4, 7, 11]";
        String result = FindMode.findMode(numbers);
        assertEquals(expectResult, result);
    }
    
    @Test
    public void test3() {
        int[] numbers = {15,54,67,44,23,88,34,23,88,98,14,35};
        String expectResult = "88 (2) : [5, 8]";
        String result = FindMode.findMode(numbers);
        assertEquals(expectResult, result);
    }
    
    @Test
    public void test4() {
        int[] numbers = {29,34,53,74,85,96,36,25,45,67};
        String expectResult = "96 (1) : [5]";
        String result = FindMode.findMode(numbers);
        assertEquals(expectResult, result);
    }
    
}
