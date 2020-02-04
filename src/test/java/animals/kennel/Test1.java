package animals.kennel;

import animals.Animal;
import animals.Cat;
import animals.Dog;
import animals.Kennel;
import exception.KennelExceptions;
import names.Names;
import org.testng.Assert;
import org.testng.annotations.Test;


public class Test1 extends Animal {

    @Test
    public void testGetDogs() throws KennelExceptions {
        Kennel kennel = new Kennel();
        Names[] names = Names.values();
        int animalsQuantity = Names.values().length;
        // Я створив енам клас з іменами собак
        // Зробив масив якому передав список енам

        for (int counter = 0; counter < animalsQuantity; counter++) {
            kennel.addAnimal(new Dog(names[counter].toString()));
            kennel.addAnimal(new Cat());
        }

        Assert.assertEquals(animalsQuantity, kennel.getDogs().size());

        for (int counter = 0; counter < kennel.getDogs().size(); counter++) {
            Assert.assertEquals(Dog.class, kennel.getDogs().get(counter).getClass());
            Assert.assertEquals(names[counter].toString(), kennel.getDogs().get(counter).getName());
        }
    }


    @Test
    public void testGetCats() throws KennelExceptions {
        Kennel kennel = new Kennel();
        Names names[] = Names.values();

        int animalsQuantity = names.length;

        for (int counter = 0; animalsQuantity > counter; counter++) {
            kennel.addAnimal(new Dog(names[counter].toString()));
            kennel.addAnimal(new Cat(names[counter].toString()));
        }

        Assert.assertEquals(animalsQuantity, kennel.getCats().size());

        for (int counter = 0; counter < kennel.getCats().size(); counter++) {
            Assert.assertEquals(Cat.class, kennel.getCats().get(counter).getClass());
            Assert.assertEquals(names[counter].toString(), kennel.getCats().get(counter).getName());
        }

    }

    @Test
    public void testExceptionGetDogs() throws KennelExceptions {

        Kennel kennel = new Kennel();

        for (int counter = 0; counter < 10; counter++) {
            kennel.addAnimal(new Cat());
        }
        try {
            kennel.getDogs();
        } catch (KennelExceptions e) {
            Assert.assertEquals(Kennel.GET_DOGS_EXCEPTION, e.toString());
        }
    }

    @Test
    public void testExceptionGetCats() throws KennelExceptions {


        Kennel kennel = new Kennel();

        for (int counter = 0; counter < 10; counter++) {

            kennel.addAnimal(new Dog());
        }
        try {
            kennel.getCats();
        } catch (KennelExceptions e) {
            //Assert.assertEquals(Kennel.GET_CATS_EXCEPTION, e.toString());
            System.out.println(e.getMessage());
            //Assert.assertEquals(Kennel.GET_CATS_EXCEPTION, e.getMessage());
        }
    }

    @Test
    public void testGetAllPets() throws KennelExceptions {
        Kennel kennel = new Kennel();

        int petQuantity = 10;

        for (int counter = 0; counter < petQuantity; counter++) {
            kennel.addAnimal(new Dog());
            kennel.addAnimal(new Cat());
        }

        Assert.assertEquals(kennel.getCats().size() + kennel.getDogs().size(), kennel.getAllAnimals().size());
        Assert.assertEquals(petQuantity, kennel.getCats().size());
        Assert.assertEquals(petQuantity, kennel.getDogs().size());
    }

}

