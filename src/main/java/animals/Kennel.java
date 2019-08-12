package animals;

import java.util.ArrayList;

/**
 * * 1. Сервіс "будка". У неї можна додавати собак та котів.
 * * 2. Будка може повертати всіх котів, всіх собак, повертати всіх.
 * 3. Будка повертає всіх тварин з однаковим ім’ям.
 */
public class Kennel extends Animal {
    public final static String GET_DOGS_EXCEPTION = "There is not dogs in the kennel. \nTry to add dogs and than use this method.";
    public final static String GET_CATS_EXCEPTION = "There is not cats in the kennel. \nTry to add dogs and than use this method.";
    private ArrayList<Animal> kennel = new ArrayList<Animal>();

    public void addAnimal(Animal animal) {
        kennel.add(animal);
    }

    public ArrayList<Animal> getDog() throws NullPointerException {
        ArrayList<Animal> dogs = new ArrayList<Animal>();

        for (Animal dogsContainer : kennel) {
            if (dogsContainer.getClass() == Dog.class) {
                dogs.add(dogsContainer);
            }
        }
        if (dogs.isEmpty()) {
            throw new NullPointerException(GET_DOGS_EXCEPTION);
        } else {
            return dogs;
        }
    }

    public ArrayList<Object> getCat() throws NullPointerException {
        ArrayList<Object> cats = new ArrayList<Object>();

        for (Object catsContainer : kennel) {
            if (catsContainer.getClass() == Cat.class) {
                cats.add(catsContainer);
            }
        }
        if (cats.isEmpty()) {
            throw new NullPointerException(GET_CATS_EXCEPTION);
        } else {
            return cats;
        }
    }

    public ArrayList<Object> getAllPets() {
        return kennel;
    }

    public void getAnimalByName(String name) {

        for (Object cont : getDog()) {

        }
    }
}
