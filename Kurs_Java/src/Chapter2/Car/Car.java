package Chapter2.Car;

public class Car {
    private int id;
    private String brand;
    private String model;
    private int issueYear;
    private String color;
    private float price;
    private String regNumber;

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

    public int GetID(){
        return id;
    }

    public String GetBrand(){
        return brand;
    }

    public String GetModel(){
        return model;
    }

    public int GetIssueYear(){
        return issueYear;
    }

    public String GetColor(){
        return color;
    }

    public float GetPrice(){
        return price;
    }

    public String GetRegNumber(){
        return regNumber;
    }

    @Override
    public String toString(){
        return "ID - " + GetID() + ";" + "\n" +
                "Бренд - " + GetBrand() + ";" + "\n" +
                "Модель - " + GetModel() + ";" + "\n" +
                "Год выпуска - " + GetIssueYear() + "год;" + "\n" +
                "Цвет - " + GetColor() + ";" + "\n" +
                "Цена - " + GetPrice() + "$;" + "\n" +
                "Регистрационный номер - " +
                GetRegNumber() + ";" + "\n";
    }
}