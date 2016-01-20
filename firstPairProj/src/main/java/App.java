import java.util.ArrayList;

/**
 * Created by shaungould on 1/19/16.
 */
public class App {
    public static void main(String[] args) {
        Prompter prompt = new Prompter();
        ParseLetterDistro parser = new ParseLetterDistro();
        Words word = new Words();

        ArrayList<String> lettersToMake=prompt.inputLetters("Enter the letters you would like your words to start with(ie: 'a b c d'");
        int numWords = prompt.inputWordCount("Enter the number of words you would like to be made.");

        parser.makeDistroList(lettersToMake.size(),numWords); //stored in distroList

        for(int x=0;x<parser.distroList.size();x++){

            for(int y=0;y<parser.distroList.get(x);y++){
                word.makeWord(lettersToMake.get(x));
            }
        }

        ArrayList<String> wordsToPrint = word.getWords();
        System.out.println("Here are your words, ya jerk : "+ wordsToPrint);
        ArrayList<String> alphabitizedWordsToPrint = word.getAlphabitizedWords();
        System.out.println("Here they are, alphabetized: " + alphabitizedWordsToPrint);

    }
}
