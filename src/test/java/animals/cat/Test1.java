package animals.cat;

import animals.Animal;
import animals.Cat;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test1 {

    @Test
    public void testCatVoice() {
        Cat shredingerCat = new Cat(10);

        String[] result = shredingerCat.voice();
        Assert.assertEquals(result.length, Animal.DEFAULT_COUNT_VOICE);

        for (String i : result) {
            Assert.assertEquals(i, Cat.MEOW);
        }
    }

    @Test
    public void testCatVoiceRepeat() {
        int count = 10;
        Cat shredingerCat = new Cat(10);

        String[] result = shredingerCat.voice(count);
        Assert.assertEquals(result.length, count);

        for (String i : result) {
            Assert.assertEquals(i, Cat.MEOW);
        }
    }

}
