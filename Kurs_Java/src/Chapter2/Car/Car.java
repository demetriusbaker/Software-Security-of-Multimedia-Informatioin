package Chapter2.Car;

public class Car {
    private final int id;
    private final String brand;
    private final String model;
    private final int issueYear;
    private final String color;
    private final float price;
    private final String regNumber;

    public Car(int id, String brand, String model, int issueYear,
                String color, float price, String regNumber){
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.issueYear = issueYear;
        this.color = color;
        this.price = price;
        this.regNumber = regNumber;
    }

    public int getID(){
        return id;
    }

    public String getBrand(){
        return brand;
    }

    public String getModel(){
        return model;
    }

    public int getIssueYear(){
        return issueYear;
    }

    public String getColor(){
        return color;
    }

    public float getPrice(){
        return price;
    }

    public String getRegNumber(){
        return regNumber;
    }

    @Override
    public String toString(){
        return "ID - " + getID() + ";" + "\n" +
                "Бренд - " + getBrand() + ";" + "\n" +
                "Модель - " + getModel() + ";" + "\n" +
                "Год выпуска - " + getIssueYear() + "год;" + "\n" +
                "Цвет - " + getColor() + ";" + "\n" +
                "Цена - " + getPrice() + "$;" + "\n" +
                "Регистрационный номер - " +
                getRegNumber() + ";" + "\n";
    }
}