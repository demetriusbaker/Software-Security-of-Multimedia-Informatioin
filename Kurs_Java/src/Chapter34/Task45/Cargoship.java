package Chapter34.Task45;

public class Cargoship implements IShip{
    protected int cargoWeight;
    protected float price;

    public Cargoship(int cargoWeight, float price){
        this.cargoWeight = cargoWeight;
        this.price = price;
    }

    @Override
    public String GetInfo() {
        return "It's cargo ship. It can to transport cargo";
    }

    @Override
    public String GetCharacteristics() {
        return "Next characteristics\n" +
                "Cargo weight: " + cargoWeight + "\n" +
                "Price: " + price + "\n" +
                "Total cargo cost: " + cargoWeight * price;
    }
}
