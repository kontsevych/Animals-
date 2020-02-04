package animals;

import exception.KennelExceptions;

import java.util.ArrayList;

public class Kennel extends Animal {
    public final static String GET_DOGS_EXCEPTION = "There is not dogs in the kennel. \nTry to add dogs and than use this method.";
    public final static String GET_CATS_EXCEPTION = "There is not cats in the kennel. \nTry to add dogs and than use this method.";
    public final static String GET_ANIMAL_BY_NAME = "Can't find animal with such name: ";
    public final static String GET_ANIMAL_BY_NAME_FEW_ANSWERS_RESPOND = "There is more than one animal with such name. \nPlease use another method ";
    public final static String ADD_ANIMAL = "Can't find the animal: ";
    public final static String GET_ANIMAL_BY_CLASS_EXCEPTION = "Can't find this class: ";

    private ArrayList<Animal> animals = new ArrayList<Animal>();

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    /*
        public ArrayList<Animal> getAnimals(Class animalClass) throws KennelExceptions {
            ArrayList<Animal> animalsContainer = new ArrayList<Animal>();

            for (Animal animalContainer : this.animals) {
                if (animalContainer.getClass() == Dog.class) {
                    animalsContainer.add((Dog) animalContainer);
                } else if (animalContainer.getClass() == Cat.class) {
                    animalsContainer.add((Cat) animalContainer);
                }
                throw new KennelExceptions(ADD_ANIMAL + animalClass);
            }
            return animalsContainer;
        }
    */
    public ArrayList<Animal> getAnimalsByClass(Class animalClass) throws KennelExceptions {
        ArrayList<Animal> animals = new ArrayList<Animal>();

        if(animalClass != Dog.class & animalClass != Cat.class){
            throw new KennelExceptions(GET_ANIMAL_BY_CLASS_EXCEPTION);
        }

        if (animalClass == Dog.class) {
            for (Animal animalContainer : this.animals) {
                if (animalContainer.getClass() == Dog.class) {
                    animals.add((Dog) animalContainer);
                }
            }
        } else if (animalClass == Cat.class) {
            for (Animal animalContainer : this.animals) {
                if (animalContainer.getClass() == Cat.class) {
                    animals.add((Cat) animalContainer);
                }
            }
        }

        if (animals.size() == 0){
            throw new KennelExceptions("Empty list");
        }

        return animals;
    }

    public ArrayList<Dog> getDogs() throws KennelExceptions {
        ArrayList<Dog> dogs = new ArrayList<Dog>();
        for (Animal dog : getAnimalsByClass(Dog.class)) {
            dogs.add((Dog) dog);
        }

        if (dogs.size() == 0) {
            throw new KennelExceptions(GET_DOGS_EXCEPTION);
        }
        return dogs;
    }

    public ArrayList<Cat> getCats() throws KennelExceptions {
        ArrayList<Cat> cats = new ArrayList<Cat>();

        for (Animal cat : getAnimalsByClass(Cat.class)) {
            cats.add((Cat) cat);
        }
        if (cats.size() == 0) {
            throw new KennelExceptions(GET_CATS_EXCEPTION);
        }
        return cats;
    }

    public ArrayList<Animal> getAllAnimals() {
        return animals;
    }

    public Animal getAnimalByName(String name) throws KennelExceptions {

        Animal animal = null;
        ArrayList<Animal> animals = new ArrayList<Animal>();

        for (Animal container : getAllAnimals()) {
            if (container.getName().equals(name)) {
                animal = container;
                animals.add(container);
            }
        }

        if (animal == null) {
            throw new KennelExceptions(GET_ANIMAL_BY_NAME + name);
        }
        if (animals.size() > 1) {
            throw new KennelExceptions(GET_ANIMAL_BY_NAME_FEW_ANSWERS_RESPOND);
        }
        return animal;
    }


    public ArrayList<Animal> getAnimalsByName(String name) throws KennelExceptions {
        ArrayList<Animal> returnList = new ArrayList<Animal>();

        for (Animal container : getAllAnimals()) {
            if (container.getName().equals(name)) {
                returnList.add(container);
            }
        }
        if (returnList.size() == 0) {
            throw new KennelExceptions(GET_ANIMAL_BY_NAME + name);
        }
        return returnList;
    }

    public ArrayList<Animal> getDogsByName(String name) throws KennelExceptions {
        ArrayList<Animal> returnList = new ArrayList<Animal>();

        for (Animal container : getDogs()) {
            if (container.getName().equals(name)) {
                returnList.add(container);
            }
        }
        if (returnList.size() == 0) {
            throw new KennelExceptions(GET_ANIMAL_BY_NAME + name);
        }
        return returnList;
    }

}
