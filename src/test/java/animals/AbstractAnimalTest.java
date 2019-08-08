package animals;

import java.io.InvalidObjectException;
import java.util.ArrayList;

public abstract class AbstractAnimalTest {

    protected double getTimeOfDistance(double weight, double distance) {

        if (distance <= 0) {
            throw new IllegalArgumentException("Value of a distance is negative or 0: distance = " + distance);
        }
        if (weight <= 0) {
            throw new IllegalArgumentException("Value of a weight is negative or 0: weight = " + weight);
        } else {
            return distance / (weight / 2);
        }
    }

    protected Object returnAnimal(Class animal, ArrayList list) throws InvalidObjectException {
        ArrayList<Object> animals = new ArrayList<Object>();
        if(animal != Cat.class && animal != Dog.class) {
            throw new InvalidObjectException("Can't find this type of animal :" + animal);
        }

        for (Object container : list) {
            if (container.getClass() == animal) {
                animals.add(container);
            }
        }
        return animals;
    }

    public void addAnimal(Object animal, ArrayList list) throws InvalidObjectException {
        if (animal.getClass() == Cat.class) {
            list.add(animal);
        } else if (animal.getClass() == Dog.class) {
            list.add(animal);
        } else {
            throw new InvalidObjectException("Wrong animal type");
        }
    }
    public Object returnAllAnimals(ArrayList animals) throws InvalidObjectException {
        return animals;
    }
}
