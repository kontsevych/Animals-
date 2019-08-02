package animals.dog;

import animals.Dog;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test2 {

    @Test
    public void testDogRun()
    {
        Dog dog = new Dog();
        Assert.assertEquals(Dog.RUN, "Run");
    }
}
