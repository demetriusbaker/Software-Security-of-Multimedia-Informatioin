package Chapter34.Task43;

public class Theater extends PublicBuilding {
    private final String name;
    private final int attendance;

    public Theater(String typeBuilding, String name, int attendance){
        this.typeBuilding = typeBuilding;
        this.name = name;
        this.attendance = attendance;
    }

    @Override
    public String getNameBuilding() {
        return "Name: " + name;
    }

    @Override
    public String getInfo() {
        return "Type of building: " + typeBuilding + "\n" +
                "Attendance: " + attendance + " people in day";
    }
}
