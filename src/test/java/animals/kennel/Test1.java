package animals.kennel;

import animals.Cat;
import animals.Dog;
import animals.Kennel;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.InvalidObjectException;

public class Test1 {

    @Test
    public void testGetDog() throws InvalidObjectException, java.lang.NullPointerException {
        Kennel kennel = new Kennel();

        Dog[] dog = new Dog[10];
        Cat[] cat = new Cat[10];

        for (int x = 0; x < 10; x++) {
            dog[x] = new Dog(10, "Dog");
            cat[x] = new Cat(10, "Cat");

            kennel.addAnimal(dog[x]);
            kennel.addAnimal(cat[x]);
        }

        for (Object container : kennel.getDog()) {
            Assert.assertEquals(container.getClass(), Dog.class);
        }
    }

    @Test
    public void testGetCat() throws InvalidObjectException, java.lang.NullPointerException {
        Kennel kennel = new Kennel();

        Dog[] dog = new Dog[10];
        Cat[] cat = new Cat[10];

        for (int x = 0; x < 10; x++) {
            dog[x] = new Dog(10, "Dog");
            cat[x] = new Cat(10, "Cat");

            kennel.addAnimal(dog[x]);
            kennel.addAnimal(cat[x]);
        }

        for (Object container : kennel.getCat()) {
            Assert.assertEquals(container.getClass(), Cat.class);
        }
    }

    @Test
    public void testExceptionGetDog() throws InvalidObjectException, java.lang.NullPointerException {
        Kennel kennel = new Kennel();
        Cat[] cat = new Cat[10];

        for (int x = 0; x < 10; x++) {
            cat[x] = new Cat(10, "Cat");
            kennel.addAnimal(cat[x]);
        }
        try {
            kennel.getDog();
            Assert.assertTrue(false);
        } catch (NullPointerException e) {
            Assert.assertTrue(true);
        }
    }

    @Test
    public void testExceptionGetCat() throws InvalidObjectException, java.lang.NullPointerException {
        Kennel kennel = new Kennel();
        Dog[] dog = new Dog[10];

        for (int x = 0; x < 10; x++) {
            dog[x] = new Dog(10, "Dog");
            kennel.addAnimal(dog[x]);
        }
        try {
            kennel.getCat();
            Assert.assertTrue(false);
        } catch (NullPointerException e) {
            Assert.assertTrue(true);
        }
    }

    @Test
    public void testGetAllPets() throws NullPointerException, InvalidObjectException {
        Kennel kennel = new Kennel();

        Dog[] dog = new Dog[10];
        Cat[] cat = new Cat[10];

        for (int x = 0; x < 10; x++) {
            dog[x] = new Dog(10, "Dog");
            cat[x] = new Cat(10, "Dog");
            kennel.addAnimal(dog[x]);
            kennel.addAnimal(cat[x]);
        }
        kennel.getAllPets();

    }
}
