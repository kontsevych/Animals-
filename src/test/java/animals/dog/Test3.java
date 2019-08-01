package animals.dog;

import animals.Dog;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test3 {
    @Test
    public void test3()
    {
    Dog dog = new Dog();
    String test[] = dog.voice(1);
    Assert.assertEquals(test.length, 1 );
    Assert.assertEquals(test[0], "ГАВ!");
    }
}
