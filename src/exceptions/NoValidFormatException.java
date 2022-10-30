package exceptions;

public class NoValidFormatException extends Exception{
    public NoValidFormatException(){
        super("The format of the parameter is wrong");
    }
}
