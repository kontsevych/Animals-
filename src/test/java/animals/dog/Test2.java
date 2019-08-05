package animals.dog;

import animals.AbstractAnimalTest;
import animals.Animal;
import animals.Dog;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test2 extends AbstractAnimalTest {

    @Test
    public void testDogRunDefault()
    {
        double weight = 1;
        double time = getTimeOfDistance(weight, Animal.DEFAULT_DISTANCE_RUN);

        Dog dog = new Dog(weight);

        Assert.assertEquals(dog.run(), time);
    }

    @Test
    public void testDogRunDistance()
    {
        int count = 10;
        double weight = 1;
        double time = getTimeOfDistance(weight, count);

        Dog dog = new Dog(weight);

        Assert.assertEquals(dog.run(count), time);
    }

}
