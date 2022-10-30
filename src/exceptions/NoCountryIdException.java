package exceptions;

public class NoCountryIdException extends Exception{
    public NoCountryIdException(){
        super("There is no country with that id");
    }
}
