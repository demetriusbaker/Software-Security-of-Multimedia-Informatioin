package Chapter2.House;

import java.util.ArrayList;

public class Accomodation {
    private ArrayList<House> houses = new ArrayList<>();

    public void AddHouse(House house){
        houses.add(house);
    }

    private void PrintInfo(House house){
        System.out.println(house);
    }

    public void PrintInfoList(){
        for (var h : houses)
            PrintInfo(h);
    }

    public void FindListByAmountRoom(int amountRoom){
        for (var h : houses)
            if (h != null && h.GetCountRoom() == amountRoom)
                PrintInfo(h);
    }

    public void FindListByAmountRoomAndFloorInRange(
            int amountRoom, int minFloor, int maxFloor){
        for (var h : houses)
            if (h != null && h.GetCountRoom() == amountRoom &&
            h.GetFloor() >= minFloor && h.GetFloor() <= maxFloor)
                PrintInfo(h);
    }

    public void FindListByMoreSquare(float square){
        for (var h : houses)
            if (h != null && h.GetSquare() > square)
                PrintInfo(h);
    }
}
