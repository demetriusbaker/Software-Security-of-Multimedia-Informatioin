package Chapter34.Task46;

public abstract class Player implements Technique {
    protected float power;

    public String say01(){
        return "It's principle technique!";
    }
    public abstract String on();
    public abstract String off();
}
