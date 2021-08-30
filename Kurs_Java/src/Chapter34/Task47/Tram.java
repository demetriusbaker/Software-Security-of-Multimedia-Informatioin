package Chapter34.Task47;

public class Tram extends PublicTransport{
    private float power, tonnes;

    public Tram(String nameTransport, float power, float tonnes){
        this.nameTransport = nameTransport;
        this.power = power;
        this.tonnes = tonnes;
    }

    @Override
    public String GetInfoTransport() {
        return "It's tram - public transport, working by electricity\n" +
                "Next characteristics" + "\n" +
                "Name: " + nameTransport + "\n" +
                "Power: " + power + " Ghoul\n" +
                "Weight: " + tonnes + " tonnes";
    }

    @Override
    public String ShowSpeed() {
        return "The speed of " + nameTransport + " is " + power / (tonnes * 1000) +
                " kilometers per hour";
    }
}