package exception;

public class KennelExceptions extends Exception {
    private String details;

    public KennelExceptions(String a) {
        details = a;
    }

    public String toString() {
        return details;
    }

}
