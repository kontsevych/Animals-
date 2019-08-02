package animals.dog;

import animals.Dog;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test1 {

    @Test
    public void testDogVoice()
    {
        Dog dog = new Dog();
        Assert.assertEquals(dog.getVoice(), "ГАВ!");
    }

    @Test
    public void testDogVoiceRepeat()
    {
        Dog dog = new Dog();
        String[] test = dog.voice(1);
        Assert.assertEquals(test.length, 1 );
        for(String i: dog.voice(10))
        {
            Assert.assertEquals(i, Dog.BARK);
        }
    }

}
