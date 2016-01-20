import org.junit.Test;
import static org.junit.Assert.*;
/**
 * Created by shaungould on 1/19/16.
 */
public class PrompterSpec {
    @Test
    public void inputWordCountTest(){
        Prompter prompter = new Prompter();
        //int bean = prompter.inputWordCount("Enter an integer: ");
        assertEquals("If the user enters a count of 4, I want my method to return 4", "My String", prompter.inputWordCount("hi"));

    }




}
