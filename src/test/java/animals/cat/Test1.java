package animals.cat;

import animals.Cat;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test1 {

    @Test
    public void testCatVoice()
    {
        Cat shredingerCat = new Cat();
        Assert.assertEquals(shredingerCat.getVoice(), "Я сказав МЯВ!");
    }

    @Test
    public void testCatVoiceRepeat()
    {
        Cat shredingerCat = new Cat();
        String[] test = shredingerCat.voice(1);
        Assert.assertEquals(test.length, 1);
        for(String i: shredingerCat.voice(3))
        {
            Assert.assertEquals(i, Cat.MEOW);
        }
    }
}
