package Chapter2.House;

public class House {
    private int id;
    private int numHouse;
    private float square;
    private int floor;
    private int countRoom;
    private String nameStreet;
    private String typeBuilding;
    private int lifetime;

    public House(int id, int numHouse, float square, int floor, int countRoom,
                 String nameStreet, String typeBuilding, int lifetime){
        this.id = id;
        this.numHouse = numHouse;
        this.square = square;
        this.floor = floor;
        this.countRoom = countRoom;
        this.nameStreet = nameStreet;
        this.typeBuilding = typeBuilding;
        this.lifetime = lifetime;
    }

    public int GetId(){
        return id;
    }

    public int GetNumHouse(){
        return numHouse;
    }

    public float GetSquare(){
        return square;
    }

    public int GetFloor(){
        return floor;
    }

    public int GetCountRoom(){
        return countRoom;
    }

    public String GetNameStreet(){
        return nameStreet;
    }

    public String GetTypeBuilding(){
        return typeBuilding;
    }

    public int GetLifetime(){
        return lifetime;
    }

    @Override
    public String toString(){
        return "ID:\t" + GetId() + ";" + "\n" +
                "№ квартиры:\t" + GetNumHouse() + ";" + "\n" +
                "Площадь:\t" + GetSquare() + " кв. метров;" + "\n" +
                "Этаж:\t" + GetFloor() + ";" + "\n" +
                "Кол-во комнат:\t" + GetCountRoom() + ";" + "\n" +
                "Улица:\t" + GetNameStreet() + ";" + "\n" +
                "Тип здания:\t" + GetTypeBuilding() + ";" + "\n" +
                "Срок эксплуатации:\t" + GetLifetime() + ";" + "\n";
    }
}
