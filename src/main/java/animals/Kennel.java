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

    public ArrayList<Dog> getDog() throws NullPointerException {
        ArrayList<Dog> dogs = new ArrayList<Dog>();

        for (Animal dogsContainer : kennel) {
            if (dogsContainer.getClass() == Dog.class) {
                dogs.add((Dog) dogsContainer);
            }
        }
        if (dogs.isEmpty()) {
            throw new NullPointerException(GET_DOGS_EXCEPTION);
        } else {
            return dogs;
        }
    }

    public ArrayList<Cat> getCat() throws NullPointerException {
        ArrayList<Cat> cats = new ArrayList<Cat>();

        for (Animal catsContainer : kennel) {
            if (catsContainer.getClass() == Cat.class) {
                cats.add((Cat) catsContainer);
            }
        }
        if (cats.isEmpty()) {
            throw new NullPointerException(GET_CATS_EXCEPTION);
        } else {
            return cats;
        }
    }

    public ArrayList<Animal> getAllPets() {
        return kennel;
    }

    public ArrayList<Animal> getAnimalByName(String name) {
        ArrayList<Animal> returnList = new ArrayList<Animal>();

        for (Animal container : getAllPets()) {
            if (container.getAnimalName() == name) {
                returnList.add(container);
            }
        }
        if (returnList.size() == 0) {
            throw new IllegalArgumentException("Can't find animal with such name");
        } else {
            System.out.println(returnList.size());
            return returnList;
        }
    }
}
