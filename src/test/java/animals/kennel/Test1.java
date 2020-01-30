package animals.kennel;

import animals.Animal;
import animals.Cat;
import animals.Dog;
import animals.Kennel;
import org.testng.Assert;
import org.testng.annotations.Test;


public class Test1 extends Animal {

    @Test
    public void testGetDogs() throws java.lang.NullPointerException {
        Kennel kennel = new Kennel();
        int animalsQuantity = 10;

        for (int counter = 0; counter < animalsQuantity; counter++) {
            kennel.addAnimal(new Dog());
            kennel.addAnimal(new Cat());
        }

        Assert.assertEquals(animalsQuantity, kennel.getDogs().size());

        for (Animal animal : kennel.getDogs()) {
            Assert.assertEquals(Dog.class, animal.getClass());
        }
    }

    @Test
    public void testGetCats() throws java.lang.NullPointerException {
        Kennel kennel = new Kennel();

        int animalsQuantity = 10;

        for (int counter = 0; animalsQuantity > counter; counter++) {
            kennel.addAnimal(new Dog());
            kennel.addAnimal(new Cat());
        }

        Assert.assertEquals(animalsQuantity, kennel.getCats().size());

        for (Animal animal : kennel.getCats()) {
            Assert.assertEquals(Cat.class, animal.getClass());
        }
    }

    @Test
    public void testExceptionGetDogs() throws java.lang.NullPointerException {

        Kennel kennel = new Kennel();

        for (int counter = 0; counter < 10; counter++) {
            kennel.addAnimal(new Cat());
        }
        try {
            kennel.getDogs();
        } catch (NullPointerException e) {
            assert true;
        }

    }

    @Test
    public void testExceptionGetCats() throws java.lang.NullPointerException {


        Kennel kennel = new Kennel();

        for (int counter = 0; counter < 10; counter++) {

            kennel.addAnimal(new Dog());

        }
        try {
            kennel.getCats();
        } catch (NullPointerException e) {
            assert true;
        }
    }

    @Test
    public void testGetAllPets() throws NullPointerException {
        Kennel kennel = new Kennel();

        int petQuantity = 10;

        for (int counter = 0; counter < petQuantity; counter++) {
            kennel.addAnimal(new Dog());
            kennel.addAnimal(new Cat());
        }

        Assert.assertEquals(kennel.getCats().size() + kennel.getDogs().size(), kennel.getAllPets().size());
        Assert.assertEquals(petQuantity, kennel.getCats().size());
        Assert.assertEquals(petQuantity, kennel.getDogs().size());
    }

}

