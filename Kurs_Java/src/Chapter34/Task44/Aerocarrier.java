package Chapter34.Task44;

public class Aerocarrier extends Warship{
    private int countPlaces;

    public Aerocarrier(int warPower, int countPlaces){
        this.warPower = warPower;
        this.countPlaces = countPlaces;
    }

    @Override
    public String SayWarInfo(){
        return "I am a ship, that can convey war airplanes!";
    }

    @Override
    public String GetCharacteristics() {
        return "War power: " + warPower + "\n" +
                "Count of places: " + countPlaces;
    }
}
