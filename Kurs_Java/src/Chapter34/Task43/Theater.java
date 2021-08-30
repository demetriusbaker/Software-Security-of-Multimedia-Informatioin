package Chapter34.Task43;

public class Theater extends PublicBuilding {
    private String name;
    private int attendance;

    public Theater(String typeBuilding, String name, int attendance){
        this.typeBuilding = typeBuilding;
        this.name = name;
        this.attendance = attendance;
    }

    @Override
    public String GetNameBuilding() {
        return "Name: " + name;
    }

    @Override
    public String GetInfo() {
        return "Type of building: " + typeBuilding + "\n" +
                "Attendance: " + attendance + " people in day";
    }
}
