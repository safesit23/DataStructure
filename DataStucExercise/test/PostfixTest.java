
import Algorithm.PostfixConverter;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/*
 * Created By Safe_IT23
 */

/**
 *
 * @author jatawatsafe
 */
public class PostfixTest {
    private String equation1 = "x-y*z";
    private String equation2 = "x*y-z";
    private String equation3 = "a+b*c/d-e";
    private String equation4 = "x*(y+z)";
    private String equation5 = "x*(y+z–(a/b+c)*d)/e";

    @Test
    public void test1() {
        String expectResult = "xyz*-";
        String result = PostfixConverter.postfixConverter(equation1);
        assertEquals(expectResult, result);
    }
    
    @Test
    public void test2() {
        String expectResult = "xy*z-";
        String result = PostfixConverter.postfixConverter(equation2);
        assertEquals(expectResult, result);
    }
    
    @Test
    public void test3() {
        String expectResult = "abc*d/+e-";
        String result = PostfixConverter.postfixConverter(equation3);
        assertEquals(expectResult, result);
    }
    
//    @Test
//    public void test4Level2() {
//        String expectResult = "xyz+*";
//        String result = PostfixConverter.postfixConverter(equation4);
//        assertEquals(expectResult, result);
//    }
    
//    @Test
//    public void test5Level3() {
//        String expectResult = "";
//        String result = PostfixConverter.postfixConverter(equation5);
//        assertEquals(expectResult, result);
//    }
    
}
