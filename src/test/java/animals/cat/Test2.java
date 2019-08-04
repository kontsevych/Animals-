package animals.cat;

import animals.Animal;
import animals.Cat;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test2 {

    @Test
    public void testCatRun()
    {
        double weight = 1;
        double time = Animal.DEFAULT_DISTANCE_RUN / (weight/2);

        Cat shredingerCat = new Cat(weight);
        Assert.assertEquals(shredingerCat.run(Animal.DEFAULT_DISTANCE_RUN), time);
    }

    @Test
    public void testCatRunDistance()
    {
        int distance = 1;
        double weight = 1;
        double time = distance / (weight/2);

        Cat shredingerCat = new Cat(weight);
        Assert.assertEquals(shredingerCat.run(distance), time);
    }
}

