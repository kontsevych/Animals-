package animals.dog;

import animals.Dog;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test1 {

    @Test
    public void testDogVoice()
    {
        Dog dog = new Dog();
        Assert.assertEquals(dog.getVoice(), "Гав!");
    }
}
