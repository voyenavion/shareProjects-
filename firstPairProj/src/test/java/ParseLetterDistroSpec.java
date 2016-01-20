/**
 * Created by shaungould on 1/19/16.
 */
import static org.junit.Assert.*;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;


public class ParseLetterDistroSpec {
    @Test
    public void distroListTest() {
        ParseLetterDistro parsie = new ParseLetterDistro();
        parsie.makeDistroList(3, 100);

        ArrayList<Integer> list = new ArrayList<Integer>(
                Arrays.asList(1,2,3)
        );
        assertSame(34, parsie.distroList.get(0));


    }

}
/*
ArrayList<Type> obj = new ArrayList<Type>(
        Arrays.asList(Object o1, Object o2, Object o3, ....so on));

 */