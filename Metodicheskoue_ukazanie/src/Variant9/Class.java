package Variant9;

import static java.lang.StrictMath.cos;
import static java.lang.StrictMath.pow;

public class Class {
    public static void method1(double a, double b, double c){
        if (a + b > c && a + c > b && b + c > a){
            double p = (a + b + c) / 2;
            double s = pow(p * (p - a) * (p - b) * (p - c),0.5);
            System.out.println("Triangle square: " + s);
        }else
            System.out.println("It's not triangle");
    }

    public static void method2(float a, float b, float h){
        for (float x = a; x <= b; x += h){
            float res = (float)(2 * cos(pow(x, 0.5) + 0.5));
            System.out.printf("X: %f, F(X): %f (%.3f);\n", x, res, res);
        }
    }

    public static void method3(){
        for (int i = 1000; i < 10000; i++){
            int a = i / 1000, b = i / 100 % 10,
                    c = i / 10 % 10, d = i % 10;
            boolean A = a != b && a != c && a != d &&
                    b != c && b != d && c != d;
            boolean B = a * b - c * d ==
                    a + b + c + d;

            if (A && B)
                System.out.println(i);
        }
    }

    public static void method4(int n){
        int[][] matrix = new int[n][n];

        for (int i = 0; i < matrix.length; i++)
            for (int j = i; j < matrix[i].length; j++)
                matrix[i][j] = j - i + 1;

        for (int[] ints : matrix) {
            for (int anInt : ints) System.out.print(anInt + "\t");
            System.out.println();
        }
    }
}