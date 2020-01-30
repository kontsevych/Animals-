package animals.kennel;

import animals.Animal;
import animals.Cat;
import animals.Dog;
import animals.Kennel;
import org.testng.Assert;
import org.testng.annotations.Test;


public class Test1 extends Animal {

    @Test
    public void testGetDog() throws java.lang.NullPointerException {
        Kennel kennel = new Kennel();

        for (int counter = 0; counter < 10; counter++) {
            kennel.addAnimal(new Dog(10, "Dog" + counter));
            kennel.addAnimal(new Cat(10, "Cat" + counter));
        }

        for (Object container : kennel.getDogs()) {
            Assert.assertEquals(container.getClass(), Dog.class);
        }
    }

    @Test
    public void testGetCat() throws java.lang.NullPointerException {
        Kennel kennel = new Kennel();

        for (int counter = 0; counter < 10; counter++) {

            kennel.addAnimal(new Dog(10, "Dog"));
            kennel.addAnimal(new Cat(10, "Cat"));
        }

        for (Object container : kennel.getCats()) {
            Assert.assertEquals(container.getClass(), Cat.class);
        }
    }

    @Test
    public void testExceptionGetDog() throws java.lang.NullPointerException {
        boolean result = false;

        Kennel kennel = new Kennel();

        for (int counter = 0; counter < 10; counter++) {
            kennel.addAnimal(new Cat(10, "Cat"));
        }
        try {
            kennel.getDogs();
        } catch (NullPointerException e) {
            result = true;
        }
        Assert.assertTrue(result);
    }

    @Test
    public void testExceptionGetCat() throws java.lang.NullPointerException {
        boolean result = false;

        Kennel kennel = new Kennel();

        for (int counter = 0; counter < 10; counter++) {

            kennel.addAnimal(new Dog(10, "Dog"));

        }
        try {
            kennel.getCats();
        } catch (NullPointerException e) {
            result = true;
        }
        Assert.assertTrue(result);
    }

    @Test
    public void testGetAllPets() throws NullPointerException {
        Kennel kennel = new Kennel();

        int petQuantity = 10;

        for (int counter = 0; counter < petQuantity; counter++) {
            kennel.addAnimal(new Dog(10, "Dog"));
            kennel.addAnimal(new Cat(10, "Cat"));
        }

        Assert.assertEquals(kennel.getAllPets().size(), kennel.getCats().size() + kennel.getDogs().size());
        Assert.assertEquals(kennel.getCats().size(), petQuantity);
        Assert.assertEquals(kennel.getDogs().size(), petQuantity);
    }

}

