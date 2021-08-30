package Chapter34.Task41;

public class PartTimeStudent extends Student{
    private boolean isPartTime;

    public PartTimeStudent(String name, boolean isPartTime){
        this.name = name;
        this.isPartTime = isPartTime;
    }

    @Override
    public String GetInfo() {
        return "I am a part-time student!";
    }

    @Override
    public String GetPerson() {
        return "Name: " + name + "\n" +
                "Is part-time student? - " + isPartTime;
    }
}
