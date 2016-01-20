import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by Joe on 1/19/16.
 */
public class RandomizerSpec {
    @Test
    public void testRandomizer() {

        //Testing Randomizer.randLength()
        int random = Randomizer.randLength();
        int high = 10;
        int low = 1;
        assertTrue("Error, random is too high: "+random, high >= random);
        assertTrue("Error, random is too low: "+random,  low  <= random);
        System.out.println("randLength() passed: " + random + " is within " + high + " and "+ low);

        //Testing Randomizer.randLetterNumber()
        random = Randomizer.randLetterNumber();
        high = 90;
        low = 65;
        assertTrue("Error, random is too high: "+random, high >= random);
        assertTrue("Error, random is too low: "+random,  low  <= random);
        System.out.println("randLetter() passed: " + random + " is within " + high + " and "+ low);

    }

}
