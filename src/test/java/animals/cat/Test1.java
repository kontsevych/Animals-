package animals.cat;

import animals.Cat;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test1 {

    @Test
    public void testCatVoice()
    {
        Cat shredingerCat = new Cat();
        Assert.assertEquals(shredingerCat.getVoice(), "Мяв!");
    }

}
