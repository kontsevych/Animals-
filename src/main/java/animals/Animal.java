package animals;

public class Animal {

    private String voice = null;
    public final static String RUN = "Run";

    public String getVoice() {
        return voice;
    }

    public void setVoice(String voice) {
        this.voice = voice;
    }

    public void voice()
    {
        System.out.println(getVoice());
    }

    public String[] voice(int repeat) {
        String voice[] = new String[repeat];

        for (int i = 0; i < repeat; i++ )
        {
            voice[i] = getVoice();
            System.out.println(getVoice());
        }
        return voice;
    }
    public void run()
    {
        System.out.println(RUN);
    }

}
