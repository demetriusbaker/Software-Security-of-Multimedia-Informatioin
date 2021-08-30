package Chapter34.Arithmetic;

public class SizeMismatchExceptionClass extends Exception{
    @Override
    public String toString(){
        return "Error: sizes don't match!";
    }
}
