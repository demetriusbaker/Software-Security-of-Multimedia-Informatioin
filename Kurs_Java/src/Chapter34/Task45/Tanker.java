package Chapter34.Task45;

public class Tanker extends Cargoship{
    private final int countContainers;
    private final float priceContainers;

    public Tanker(int cargoWeight, float price, int countContainers, float priceContainers) {
        super(cargoWeight, price);
        this.countContainers = countContainers;
        this.priceContainers = priceContainers;
    }

    @Override
    public String getInfo() {
        return "It's tanker. It more big, that cargo ship and transport containers";
    }

    @Override
    public String getCharacteristics() {
        return "Next characteristics\n" +
                "Cargo weight: " + cargoWeight + "\n" +
                "Price: " + price + "\n" +
                "Count of containers: " + countContainers + "\n" +
                "Price of containers: " + priceContainers + "\n" +
                "Total cargo cost: " + (cargoWeight * price +
                countContainers * priceContainers);
    }
}
