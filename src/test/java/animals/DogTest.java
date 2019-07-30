package animals;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DogTest {

    Dog dog = new Dog();

    @Test
    public void testDogVoice()
    {
        Assert.assertEquals(dog.getVoice(), "Гав!");
    }

    @Test
    public void testDogRun()
    {
        Assert.assertEquals(dog.getRun(), "Run");
    }

}
