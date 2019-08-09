package animals;

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

}
