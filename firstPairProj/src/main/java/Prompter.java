import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by shaungould on 1/19/16.
 */
public class Prompter {
    //Scanner scan = new Scanner(System.in);

    public ArrayList<String> inputLetters(String prompt1){
        Scanner scan1 = new Scanner(System.in);
        System.out.println(prompt1);
        String userInput = scan1.nextLine();
        ArrayList<String> arrayToReturn = new ArrayList<String>();

        for (int x = 0;x<userInput.length();x++){
            if(Character.isLetter(userInput.charAt(x))){
                arrayToReturn.add(Character.toString(userInput.charAt(x)));

            }
        }
        return arrayToReturn;

    }

    public int inputWordCount(String prompt){
        Scanner scan = new Scanner(System.in);

        System.out.println(prompt);
        int count = scan.nextInt();
        scan.close();
        return count;
    }

}
