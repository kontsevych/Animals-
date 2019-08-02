package animals.cat;

import animals.Cat;
import animals.Dog;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test2 {

    @Test
    public void testCatRun()
    {
        Cat shredingerCat = new Cat();
        Assert.assertEquals(Cat.RUN, "Run");
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

