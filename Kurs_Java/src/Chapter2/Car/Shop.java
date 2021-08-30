package Chapter2.Car;

import java.util.ArrayList;
import java.util.Calendar;

public class Shop {
    private final Calendar calendar = Calendar.getInstance();
    private final ArrayList<Car> cars = new ArrayList<>();

    public void addCar(Car car){
        cars.add(car);
    }

    private void printInfo(Car car){
        System.out.println(car);
    }

    public void printInfoList(){
        for (var c : cars)
            printInfo(c);
    }

    public void findListByBrand(String brand){
        for (var c : cars)
            if (c != null && brand.equalsIgnoreCase(c.getBrand()))
                printInfo(c);
    }

    public void findListByIssueYear(String brand, int n){
        for (var c : cars)
            if (c != null && brand.equalsIgnoreCase(c.getBrand())
                    && calendar.get(Calendar.YEAR) - c.getIssueYear() > n)
                printInfo(c);
    }

    public void findListByPriceMore(int n, float price){
        for (var c : cars)
            if (c != null && calendar.get(Calendar.YEAR) -
                    c.getIssueYear() > n && c.getPrice() > price)
                printInfo(c);
    }
}