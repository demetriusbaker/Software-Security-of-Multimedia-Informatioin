package Variant1;

public class Task_1 {
    public static int GetSumOfMaxAndMin(int a, int b, int c){
        return Math.max(Math.max(a, b), c) - Math.min(Math.min(a, b), c);
    }
}