package animals;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CatTest {
    Cat shredingerCat = new Cat();

    @Test
    public void testCatVoice()
    {
        Assert.assertEquals(shredingerCat.getVoice(), "Мяв!");
    }

    @Test
    public void testCatRun()
    {
        Assert.assertEquals(shredingerCat.getRun(), "Run");
    }
}
