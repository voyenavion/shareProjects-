import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by Joe on 1/19/16.
 */
public class ConvertSpec {
    @Test
    public void testConvertIntToLetter() {
        assertEquals("convertRandLetter should return 'a'","A",Converter.convertIntToLetter(65));
    }
}
