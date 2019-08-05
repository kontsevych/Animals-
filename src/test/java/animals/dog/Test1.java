package animals.dog;

import animals.Animal;
import animals.Dog;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test1 {

    @Test
    public void testDogVoice() {
        Dog dog = new Dog();

        String[] result = dog.voice();
        Assert.assertEquals(result.length, Animal.DEFAULT_COUNT_VOICE);

        for (String i : result) {
            Assert.assertEquals(i, Dog.BARK);
        }
    }

    @Test
    public void testDogVoiceRepeat() {
        int count = 10;

        Dog dog = new Dog();
        String[] result = dog.voice(count);
        Assert.assertEquals(result.length, count);

        for (String i : result) {
            Assert.assertEquals(i, Dog.BARK);
        }
    }

}
