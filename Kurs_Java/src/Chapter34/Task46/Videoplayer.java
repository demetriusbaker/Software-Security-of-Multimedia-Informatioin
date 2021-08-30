package Chapter34.Task46;

public class Videoplayer extends Player{
    private final String name;

    public Videoplayer(String name, int power){
        this.name = name;
        this.power = power;
    }

    @Override
    public String getCharacteristicsTechnic() {
        return "It's video-player! Characteristics\n" +
                "Name: " + name + "\t" + "Power: " + power;
    }

    @Override
    public String on() {
        return "Video-player started play video";
    }

    @Override
    public String off() {
        return "Video-player ended play video";
    }
}
