package animals;

public class Animal {

    private String voice = null;
    private final String Run = "Run";

    public String getVoice() {
        return voice;
    }

    public String getRun() {
        return Run;
    }

    public void setVoice(String voice) {
        this.voice = voice;
    }

    public void voice()
    {
        System.out.println(getVoice());
    }

    public void run()
    {
        System.out.println(getRun());
    }

}
