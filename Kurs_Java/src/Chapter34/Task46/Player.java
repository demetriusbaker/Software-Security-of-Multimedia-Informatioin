package Chapter34.Task46;

public abstract class Player implements Technique {
    protected float power;

    public String Say01(){
        return "It's principle technique!";
    }
    public abstract String On();
    public abstract String Off();
}
