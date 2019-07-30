package animals;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CatTest {
    Cat ShredingerCat = new Cat();

    @Test
    public void testCatVoice()
    {
        Assert.assertEquals(ShredingerCat.getVoice(), "Мяв!");
    }

    @Test
    public void testCatRun()
    {
        Assert.assertEquals(ShredingerCat.getRun(), "Run");
    }
}
