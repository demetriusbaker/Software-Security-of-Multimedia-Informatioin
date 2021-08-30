package Variant1;

public class Task_1 {
    public static int getSumOfMaxAndMin(int a, int b, int c){
        return Math.max(Math.max(a, b), c) - Math.min(Math.min(a, b), c);
    }
}