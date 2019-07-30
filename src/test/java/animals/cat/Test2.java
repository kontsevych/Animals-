package animals.cat;

import animals.Cat;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test2 {

    @Test
    public void testCatRun()
    {
        Cat shredingerCat = new Cat();
        Assert.assertEquals(shredingerCat.getRun(), "Run");
    }
}
