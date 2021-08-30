package Chapter34.Task41;

public class PartTimeStudent extends Student{
    private final boolean isPartTime;

    public PartTimeStudent(String name, boolean isPartTime){
        this.name = name;
        this.isPartTime = isPartTime;
    }

    @Override
    public String getInfo() {
        return "I am a part-time student!";
    }

    @Override
    public String getPerson() {
        return "Name: " + name + "\n" +
                "Is part-time student? - " + isPartTime;
    }
}
