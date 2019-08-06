package animals;

public class Animal {
    public final static int DEFAULT_COUNT_VOICE = 1;
    public final static double DEFAULT_DISTANCE_RUN = 1;
    public final static String RUN = "Run";

    private String voice = null;
    private double weight = 0;

    public double getWeight() {
        return weight;
    }

    public String getVoice() {
        return voice;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setVoice(String voice) {
        this.voice = voice;
    }

    public String[] voice() {
        return voice(DEFAULT_COUNT_VOICE);
    }

    public String[] voice(int repeat) {

        String[] voice = new String[repeat];

        for (int i = 0; i < repeat; i++) {
            voice[i] = getVoice();

            System.out.println(getVoice());
        }
        return voice;
    }

    public double run() // Run method with default statement.
    {
        return run(DEFAULT_DISTANCE_RUN);
    }

    public double run(double distance) {
        double time = 0;

        if (distance <= 0) {
            throw new IllegalArgumentException("Value of a distance is negative or 0: distance = " + distance);
        }
        if (weight <= 0) {
            throw new IllegalArgumentException("Value of a weight is negative or 0: weight = " + weight);
        } else {
            time = distance / (weight / 2);
            System.out.println("The " + distance + " meters distance can be run in " + time + " seconds");
        }
        return time;
    }
}
