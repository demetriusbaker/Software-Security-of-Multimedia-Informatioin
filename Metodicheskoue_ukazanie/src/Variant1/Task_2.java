package Variant1;

public class Task_2 {
    public static void function(double a, double b, double h){
        for(double step = a; step <= b; step += h)
            System.out.println(step + ": " + step / Math.cos(step));
    }
}
