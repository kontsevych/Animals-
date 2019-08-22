package animals.kennel;

import animals.Cat;
import animals.Dog;
import animals.Kennel;
import org.testng.Assert;
import org.testng.annotations.Test;


public class Test2 {

    @Test
    public void testAddDog() throws NullPointerException {
        boolean result = false;

        Kennel kennel = new Kennel();
        Dog dog = new Dog(10, "Doom");

        kennel.addAnimal(dog);

        for (Object container : kennel.getDogs()) {
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

        for (Object container : kennel.getCats()) {
            result = container == cat;
        }
        Assert.assertTrue(result);
    }

}
