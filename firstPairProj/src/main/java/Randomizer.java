/**
 * Created by Joe on 1/19/16.
 */
import java.util.Random;
public class Randomizer {

    public static int randLength(){
        /*int range = (max - min) + 1;
         *return (int)(Math.random() * range) + min;  */

        int range = (10-1)+1;
        return (int)(Math.random()*range)+1;
        //random.nextInt(max - min + 1) + min  - doesnt work, non-static method in static context

    }
    public static int randLetterNumber(){
        int range = (122-97)+1;
        return (int)(Math.random()*range)+97;
    }

}
