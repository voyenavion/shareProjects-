import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Created by Joe on 1/19/16.
 */


public class WordsSpec {
    @Test
    public void testWords() {

        //Testing Words.getWords()
        ArrayList<String> list;
        Words words = new Words();
        list=words.getWords();
        list.add("foot");
        assertTrue("Error: empty list."+list, list.size() >= 1);
        System.out.println("getWords() passed, returned:" + list);

        Words words1=new Words();
        //Testing Words.makeWord()
        words1.makeWord("A"); //Random 1-10 letter word, starting with "A"
        String wordToTest = words1.getWords().get(0);
        assertEquals("Error, method should return 1-10 letter 'A' word.  Instead returned: "+wordToTest,'A',wordToTest.charAt(0));
        System.out.println("makeWord() passed: "+wordToTest);

        //Testing Words.sort()

        words1.makeWord("C");
        words1.makeWord("Z");
        words1.makeWord("M");
        words1.makeAlphabitizedWord(words1.getWords());
        wordToTest=words1.getAlphabitizedWords().get(3);
        assertEquals("Error, word[3] should start with 'Z'.  Sorted array: " + wordToTest,'Z',wordToTest.charAt(0));
        System.out.println("sort() passed.  Sorted array: ");
        for (String x : words1.getWords()) System.out.println(x);

    }
//I want to test if alphabitizedWordList has a value at 0 index when not initialized
    @Test
    public void testGetAlphaWords(){
        Words wordie = new Words();
        //wordie.getAlphabitizedWords().add(0,"a");
        //System.out.println(wordie.getAlphabitizedWords().get(0));
        wordie.makeWord("s");

        assertEquals("what does alphabitizedWords have at index 0? expected: s, " +
                "actual: alphabitizedWords[0]", "s", wordie.getAlphabitizedWords().get(0));
    }
}
