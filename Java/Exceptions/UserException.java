package Exceptions;

class SivaException extends Exception {
    public SivaException(String string) {
        super(string);
    }
}
public class UserException {
    public static void main(String[] x) {
        try {
            throw new SivaException("This is a custom exception");
        } catch (SivaException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }
    }
}
