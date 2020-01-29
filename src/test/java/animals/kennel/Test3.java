package animals.kennel;

import animals.Cat;
import animals.Dog;
import animals.Kennel;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test3 {
    @Test
    public void testGetAnimalByName() {

        Kennel kennel = new Kennel();

        String dogName = "Dog";
        String catName = "Cat";

        kennel.addAnimal(new Dog(10, dogName));
        kennel.addAnimal(new Cat(10, catName));

        Assert.assertEquals(dogName, kennel.getAnimalByName(dogName).getAnimalName());
        Assert.assertEquals(catName, kennel.getAnimalByName(catName).getAnimalName());

    }

   /* @Test
    public void testGetAnimalsByName() {

        Kennel kennel = new Kennel();

        String dogName = "Dog";
        String catName = "Cat";

        for (int counter = 10; counter > 0; counter--) {
            kennel.addAnimal(new Dog(10, dogName + (counter/2)));
            //kennel.addAnimal(new Cat(10, catName));
            System.out.println(dogName + counter);
        }
        Assert.assertEquals(dogName, kennel.getAnimalByName(dogName).getAnimalName());
        Assert.assertEquals(catName, kennel.getAnimalByName(catName).getAnimalName());

    }*/
}
