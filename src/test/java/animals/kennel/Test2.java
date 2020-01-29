package animals.kennel;

import animals.Cat;
import animals.Dog;
import animals.Kennel;
import org.testng.Assert;
import org.testng.annotations.Test;


public class Test2 {

    @Test
    public void testAddDog() throws NullPointerException {

        Kennel kennel = new Kennel();

        kennel.addAnimal(new Dog(10, "Doom"));

        for (Object container : kennel.getDogs()) {
            Assert.assertEquals(container.getClass(), Dog.class);
        }

    }

    @Test
    public void testAddCat() throws NullPointerException {

        Kennel kennel = new Kennel();
        Cat cat = new Cat(10, "Doom");

        kennel.addAnimal(cat);

        for (Object container : kennel.getCats()) {
            Assert.assertEquals(container.getClass(), Cat.class);
        }
    }

}
