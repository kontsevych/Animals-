package animals.dog;

import animals.Animal;
import animals.Dog;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test2 {

    @Test
    public void testDogRun()
    {
        double weight = 1;
        double time = Animal.DEFAULT_DISTANCE_RUN / (weight/2);

        Dog dog = new Dog(weight);

        Assert.assertEquals(dog.run(), time);
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
