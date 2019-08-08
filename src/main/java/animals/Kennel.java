package animals;

import java.io.InvalidObjectException;
import java.util.ArrayList;

/**
 * 1. Сервіс "будка". У неї можна додавати собак та котів.
 * 2. Будка може повертати всіх котів, всіх собак, повертати всіх.
 * 3. Будка повертає всіх тварин з однаковим ім’ям.
 */
public class Kennel {

    private ArrayList<Object> kennel = new ArrayList<Object>();


    public void addAnimal(Object animal) throws InvalidObjectException {
        if (animal.getClass() == Cat.class) {
            kennel.add(animal);
        } else if (animal.getClass() == Dog.class) {
            kennel.add(animal);
        } else {
            throw new InvalidObjectException("Wrong animal type");
        }
    }

    public int getSize() {
        return kennel.size();
    }

    public Object returnAnimal(Object animal) throws InvalidObjectException {
        ArrayList<Object> animals = new ArrayList<Object>();

        for (Object container : kennel) {
            if (container.getClass() == animal) {
                animals.add(container);
            } else {
                throw new InvalidObjectException("Can't find this type of animal" + animal.getClass());
            }
        }
        System.out.println(animals);
        return animals;
    }

    public static void main(String[] args) throws Throwable {
        Dog dog = new Dog(10, "Doom");
        Cat cat = new Cat(5, "Sony");
        Dog dog1 = new Dog(10, "Doom1");
        Cat cat1 = new Cat(5, "Sony1");
        Dog dog2 = new Dog(10, "Doom2");
        Cat cat2 = new Cat(5, "Sony2");

        Kennel kennel = new Kennel();


    }
}
