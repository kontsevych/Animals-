package animals.dog;

import animals.Dog;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test2 {

    @Test
    public void testDogRun()
    {
        Dog dog = new Dog();

        Assert.assertEquals(dog.getVoice(), Dog.RUN);
    }

    @Test
    public void testDogRunDistance()
    {
        int distance = 1;
        double weight = 1;
        double time = distance / (weight/2);

        Dog dog = new Dog(weight);

        Assert.assertEquals(dog.run(distance), time);
    }
}
