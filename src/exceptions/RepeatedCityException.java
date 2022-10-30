package exceptions;

public class RepeatedCityException extends Exception{
    public RepeatedCityException(){
        super("This city already exist in the database");
    }
}
