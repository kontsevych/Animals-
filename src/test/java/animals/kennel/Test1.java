package animals.kennel;

import animals.Animal;
import animals.Cat;
import animals.Dog;
import animals.Kennel;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.InvalidObjectException;

public class Test1 extends Animal {

    @Test
    public void testGetDog() throws  java.lang.NullPointerException {
        Kennel kennel = new Kennel();

        Dog[] dog = new Dog[10];
        Cat[] cat = new Cat[10];

        for (int counter = 0; counter < 10; counter++) {
            dog[counter] = new Dog(10, "Dog");
            cat[counter] = new Cat(10, "Cat");

            kennel.addAnimal(dog[counter]);
            kennel.addAnimal(cat[counter]);
        }

        for (Dog container : kennel.getDogs()) {
            Assert.assertEquals(container.getClass(), Dog.class);
        }
    }

    @Test
    public void testGetCat() throws InvalidObjectException, java.lang.NullPointerException {
        Kennel kennel = new Kennel();

        Dog[] dog = new Dog[10];
        Cat[] cat = new Cat[10];

        for (int counter = 0; counter < 10; counter++) {
            dog[counter] = new Dog(10, "Dog");
            cat[counter] = new Cat(10, "Cat");

            kennel.addAnimal(dog[counter]);
            kennel.addAnimal(cat[counter]);
        }

        for (Object container : kennel.getCats()) {
            Assert.assertEquals(container.getClass(), Cat.class);
        }
    }

    @Test
    public void testExceptionGetDog() throws java.lang.NullPointerException {
        boolean result = false;

        Kennel kennel = new Kennel();
        Cat[] cat = new Cat[10];

        for (int counter = 0; counter < 10; counter++) {
            cat[counter] = new Cat(10, "Cat");
            kennel.addAnimal(cat[counter]);
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
        Dog[] dog = new Dog[10];

        for (int counter = 0; counter < 10; counter++) {
            dog[counter] = new Dog(10, "Dog");
            kennel.addAnimal(dog[counter]);
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
        boolean result = false;

        Dog[] dog = new Dog[10];
        Cat[] cat = new Cat[10];

        for (int counter = 0; counter < 10; counter++) {
            dog[counter] = new Dog(10, "Dog");
            cat[counter] = new Cat(10, "Dog");
            kennel.addAnimal(dog[counter]);
            kennel.addAnimal(cat[counter]);
        }

        for (Object petsContainer : kennel.getAllPets()) {
            result = petsContainer.getClass() == Cat.class || petsContainer.getClass() == Dog.class;
        }
        Assert.assertTrue(result);
    }

    @Test
    public void testGetAllAnimals() throws NullPointerException {
        Kennel kennel = new Kennel();
        boolean result = false;

        Dog[] dog = new Dog[10];
        Cat[] cat = new Cat[10];

        for (int counter = 0; counter < 10; counter++) {
            dog[counter] = new Dog(10, "Dog");
            cat[counter] = new Cat(10, "Dog");
            kennel.addAnimal(dog[counter]);
            kennel.addAnimal(cat[counter]);
        }

        for (Object petsContainer : kennel.getAnimals(Dog.class)) {
            System.out.println(petsContainer.toString());
            result = petsContainer.getClass() == Cat.class || petsContainer.getClass() == Dog.class;
        }
        Assert.assertTrue(result);
    }

}
