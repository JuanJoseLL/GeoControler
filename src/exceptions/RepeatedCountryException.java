package exceptions;

public class RepeatedCountryException extends Exception{
    public RepeatedCountryException(){
        super("This country already exist in the database ");
    }
}
