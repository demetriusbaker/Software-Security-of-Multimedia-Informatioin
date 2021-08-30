package Chapter34.Task42;

public class Engineer implements Employee{
    protected String name;

    public Engineer(String name){
        this.name = name;
    }

    @Override
    public String GetInfo() {
        return "Name: " + name + ". " + "He works a software engineer.";
    }
}
