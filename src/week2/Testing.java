package week2;

import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class Testing {

    @Test
    public void testAdd() {
        String str1="ab";
        String str2="ab";
        assertTrue("strings equal?",str1.equals(str2));
    }

}
