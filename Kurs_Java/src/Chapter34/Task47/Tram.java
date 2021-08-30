package Chapter34.Task47;

public class Tram extends PublicTransport{
    private final float power;
    private final float tonnes;

    public Tram(String nameTransport, float power, float tonnes){
        this.nameTransport = nameTransport;
        this.power = power;
        this.tonnes = tonnes;
    }

    @Override
    public String getInfoTransport() {
        return "It's tram - public transport, working by electricity\n" +
                "Next characteristics" + "\n" +
                "Name: " + nameTransport + "\n" +
                "Power: " + power + " Ghoul\n" +
                "Weight: " + tonnes + " tonnes";
    }

    @Override
    public String showSpeed() {
        return "The speed of " + nameTransport + " is " + power / (tonnes * 1000) +
                " kilometers per hour";
    }
}