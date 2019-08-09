package animals.kennel;

import animals.Cat;
import animals.Dog;
import animals.Kennel;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.InvalidObjectException;

public class Test2 {

    @Test
    public void testAddDog() throws NullPointerException {
        boolean result = false;

        Kennel kennel = new Kennel();
        Dog dog = new Dog(10, "Doom");

        kennel.addAnimal(dog);

        for (Object container : kennel.getDog()) {
            result = container == dog;
        }
        Assert.assertTrue(result);
    }

    @Test
    public void testAddCat() throws NullPointerException {
        boolean result = false;

        Kennel kennel = new Kennel();
        Cat cat = new Cat(10, "Doom");

        kennel.addAnimal(cat);

        for (Object container : kennel.getCat()) {
            result = container == cat;
        }
        Assert.assertTrue(result);
    }

}
