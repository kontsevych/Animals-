package animals.kennel;

import animals.Animal;
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

    @Test
    public void testGetAnimalsByName() {
        // Створюю нову будку для тесту
        Kennel kennel = new Kennel();
        //Відокремлюю імета які часто використовую

        String dogName = "Dog";
        String catName = "Cat";
        String stupidName = "justin";
        int animalQuantity = 10;

        // Заповняю будку тваринами
        for (int counter = 0; counter < animalQuantity; counter++) {
            kennel.addAnimal(new Dog(10, dogName));
            kennel.addAnimal(new Dog(10, stupidName));
            kennel.addAnimal(new Cat(10, catName));
            kennel.addAnimal(new Cat(10, stupidName));
        }

        // Перевірити чи кількість стварин з одним іменем вірна

        Assert.assertEquals(kennel.getAnimalsByName(dogName).size(), animalQuantity);
        Assert.assertEquals(kennel.getAnimalsByName(catName).size(), animalQuantity);
        Assert.assertEquals(kennel.getAnimalsByName(stupidName).size(), animalQuantity * 2);

        //Перевірити чи правильні імена у тварин
        for (Animal animal : kennel.getAnimalsByName(dogName)) {
            Assert.assertEquals(dogName, animal.getAnimalName());
        }
        for (Animal animal : kennel.getAnimalsByName(catName)) {
            Assert.assertEquals(catName, animal.getAnimalName());
        }
        for (Animal animal : kennel.getAnimalsByName(stupidName)) {
            Assert.assertEquals(stupidName, animal.getAnimalName());
        }

    }
}
