package Chapter2.Car;

import java.util.ArrayList;
import java.util.Calendar;

public class Shop {
    private Calendar calendar = Calendar.getInstance();
    private ArrayList<Car> cars = new ArrayList<>();

    public void AddCar(Car car){
        cars.add(car);
    }

    private void PrintInfo(Car car){
        System.out.println(car);
    }

    public void PrintInfoList(){
        for (var c : cars)
            PrintInfo(c);
    }

    public void FindListByBrand(String brand){
        for (var c : cars)
            if (c != null && brand.equalsIgnoreCase(c.GetBrand()))
                PrintInfo(c);
    }

    public void FindListByIssueYear(String brand, int n){
        for (var c : cars)
            if (c != null && brand.equalsIgnoreCase(c.GetBrand())
                    && calendar.get(Calendar.YEAR) - c.GetIssueYear() > n)
                PrintInfo(c);
    }

    public void FindListByPriceMore(int n, float price){
        for (var c : cars)
            if (c != null && calendar.get(Calendar.YEAR) -
                    c.GetIssueYear() > n && c.GetPrice() > price)
                PrintInfo(c);
    }
}