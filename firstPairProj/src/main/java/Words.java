import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

public class Words{
    private ArrayList<String> wordList = new ArrayList<String>();
    private ArrayList<String> alphabitizedWords = new ArrayList<String>();

    public ArrayList<String> getWords(){
        return wordList;
    }
    public ArrayList<String> getAlphabitizedWords() {
       if (alphabitizedWords.isEmpty() == true){
           this.makeAlphabitizedWord(wordList);
       }



        return alphabitizedWords;
    }

    public void makeWord(String a){


        int length = Randomizer.randLength();

        String word = "";

        word+=a;
        for (int x = 1;  x<length; x++){
            int z = Randomizer.randLetterNumber();
            word += Converter.convertIntToLetter(z);
        }
        wordList.add(word);
    }

    public ArrayList<String> makeAlphabitizedWord(ArrayList<String> list){
        for(int x = 0; x < list.size(); x++){
            alphabitizedWords.add(list.get(x));
        }
        Collections.sort(alphabitizedWords);
        return alphabitizedWords;
    }


}
