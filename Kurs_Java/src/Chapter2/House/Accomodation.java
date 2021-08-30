package Chapter2.House;

import java.util.ArrayList;

public class Accomodation {
    private final ArrayList<House> houses = new ArrayList<>();

    public void addHouse(House house){
        houses.add(house);
    }

    private void printInfo(House house){
        System.out.println(house);
    }

    public void printInfoList(){
        for (var h : houses)
            printInfo(h);
    }

    public void findListByAmountRoom(int amountRoom){
        for (var h : houses)
            if (h != null && h.getCountRoom() == amountRoom)
                printInfo(h);
    }

    public void findListByAmountRoomAndFloorInRange(
            int amountRoom, int minFloor, int maxFloor){
        for (var h : houses)
            if (h != null && h.getCountRoom() == amountRoom &&
            h.getFloor() >= minFloor && h.getFloor() <= maxFloor)
                printInfo(h);
    }

    public void findListByMoreSquare(float square){
        for (var h : houses)
            if (h != null && h.getSquare() > square)
                printInfo(h);
    }
}
