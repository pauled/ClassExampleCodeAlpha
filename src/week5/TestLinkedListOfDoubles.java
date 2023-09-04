package week5;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestLinkedListOfDoubles {


    @Test
    public void exampleTest(){
        LinkedListOfDoubles numbers = new LinkedListOfDoubles();
        numbers.addDouble(5.6);
        numbers.addDouble(3.1);
        numbers.addDouble(9.0);

        assertEquals(3.1, numbers.min(), 0.001);
    }

}
