package tk.andy.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SquareTest {

    @Test
    public void testarea(){
        Square s = new Square(6);
        Assert.assertEquals(s.area(), 36);
    }
}
