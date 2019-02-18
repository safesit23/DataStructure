
import Algorithm.PostfixConverter;
import static org.junit.Assert.assertArrayEquals;
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
    private String equation1 = "a+b*c";

    @Test
    public void test1() {
        String expectResult = "abc*+";
        String result = PostfixConverter.postfixConverter(equation1);
        assertEquals(expectResult, result);
    }
    
    
}
