package Chapter34.Task46;

public class Videoplayer extends Player{
    private String name;

    public Videoplayer(String name, int power){
        this.name = name;
        this.power = power;
    }

    @Override
    public String GetCharacteristicsTechnic() {
        return "It's video-player! Characteristics\n" +
                "Name: " + name + "\t" + "Power: " + power;
    }

    @Override
    public String On() {
        return "Video-player started play video";
    }

    @Override
    public String Off() {
        return "Video-player ended play video";
    }
}
