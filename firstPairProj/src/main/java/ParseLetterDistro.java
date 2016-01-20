import java.util.ArrayList;

/**
 * Created by shaungould on 1/19/16.
 */



public class ParseLetterDistro {
    public ArrayList<Integer> distroList = new ArrayList<Integer>();
    public void makeDistroList(int length, int count){
        int remainder = count % length;
        int quotient = count / length;
        int largerDistro = remainder + quotient;
        int smallerDistro = quotient;
        int numOfSmallerDistros = length - 1;
        distroList.add(largerDistro);

        for (int x = 0; x <numOfSmallerDistros; x++){

                distroList.add(quotient);

        }


    }


}
