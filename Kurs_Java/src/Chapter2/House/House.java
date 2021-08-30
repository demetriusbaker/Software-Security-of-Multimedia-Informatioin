package Chapter2.House;

public class House {
    private final int id;
    private final int numHouse;
    private final float square;
    private final int floor;
    private final int countRoom;
    private final String nameStreet;
    private final String typeBuilding;
    private final int lifetime;

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

    public int getId(){
        return id;
    }

    public int getNumHouse(){
        return numHouse;
    }

    public float getSquare(){
        return square;
    }

    public int getFloor(){
        return floor;
    }

    public int getCountRoom(){
        return countRoom;
    }

    public String getNameStreet(){
        return nameStreet;
    }

    public String getTypeBuilding(){
        return typeBuilding;
    }

    public int getLifetime(){
        return lifetime;
    }

    @Override
    public String toString(){
        return "ID:\t" + getId() + ";" + "\n" +
                "№ квартиры:\t" + getNumHouse() + ";" + "\n" +
                "Площадь:\t" + getSquare() + " кв. метров;" + "\n" +
                "Этаж:\t" + getFloor() + ";" + "\n" +
                "Кол-во комнат:\t" + getCountRoom() + ";" + "\n" +
                "Улица:\t" + getNameStreet() + ";" + "\n" +
                "Тип здания:\t" + getTypeBuilding() + ";" + "\n" +
                "Срок эксплуатации:\t" + getLifetime() + ";" + "\n";
    }
}
