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

        String dogName = "Зубастик";
        String catName = "Чухопуз";

        kennel.addAnimal(new Dog(dogName));
        kennel.addAnimal(new Cat(catName));

        Assert.assertEquals(dogName, kennel.getAnimalByName(dogName).getName());
        Assert.assertEquals(catName, kennel.getAnimalByName(catName).getName());

    }

    @Test
    public void testGetAnimalsByName() {
        // Створюю нову будку для тесту
        Kennel kennel = new Kennel();
        //Відокремлюю імета які часто використовую

        String dogName = "Гавчик";
        String catName = "Кусослав";
        String stupidName = "justin";
        int animalQuantity = 10;

        // Заповняю будку тваринами
        for (int counter = 0; counter < animalQuantity; counter++) {
            kennel.addAnimal(new Dog(dogName));
            kennel.addAnimal(new Dog(stupidName));
            kennel.addAnimal(new Cat(catName));
            kennel.addAnimal(new Cat(stupidName));
        }

        // Перевірити чи кількість стварин з одним іменем вірна

        Assert.assertEquals(kennel.getAnimalsByName(dogName).size(), animalQuantity);
        Assert.assertEquals(kennel.getAnimalsByName(catName).size(), animalQuantity);
        Assert.assertEquals(kennel.getAnimalsByName(stupidName).size(), animalQuantity * 2);

        //Перевірити чи правильні імена у тварин
        for (Animal animal : kennel.getAnimalsByName(dogName)) {
            Assert.assertEquals(dogName, animal.getName());
        }
        for (Animal animal : kennel.getAnimalsByName(catName)) {
            Assert.assertEquals(catName, animal.getName());
        }
        for (Animal animal : kennel.getAnimalsByName(stupidName)) {
            Assert.assertEquals(stupidName, animal.getName());
        }

    }
}
