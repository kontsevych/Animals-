package animals.cat;

import animals.AbstractAnimalTest;
import animals.Animal;
import animals.Cat;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test2 extends AbstractAnimalTest {

    @Test
    public void testCatRunDefault()
    {
        double weight = 1;
        double time = getTimeOfDistance(weight, Animal.DEFAULT_DISTANCE_RUN);

        Cat shredingerCat = new Cat(weight);
        Assert.assertEquals(shredingerCat.run(), time);
    }

    @Test
    public void testCatRunDistance()
    {
        int distance = 1;
        double weight = 1;
        double time = getTimeOfDistance(weight, distance);

        Cat shredingerCat = new Cat(weight);
        Assert.assertEquals(shredingerCat.run(distance), time);
    }
}

