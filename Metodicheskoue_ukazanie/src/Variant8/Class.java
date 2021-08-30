package Variant8;

import static java.lang.StrictMath.*;

public class Class {
    public static void Method1(double a, double b, double c){
        double ab = abs(a - b), ac = abs(a - c);
        System.out.println(ac < ab ? "C" : ac == ab ? "B and C" : "B");
    }

    public static void Method2(float a, float b, float h){
        for (float x = a; x <= b; x += h){
            float res = (float)(x * x * sin(x) + 1);
            System.out.printf("X: %f, F(X): %f (%.3f);\n", x, res, res);
        }
    }

    public static void Method3(int k){
        for (int i = 1; i <= k; i++){
            int n = 0, bufer = i;
            while (bufer > 0){
                n++;
                bufer /= 10;
            }

            int sum = 0, bufer2 = i, digit;
            while (bufer2 > 0){
                digit = bufer2 % 10;
                sum += pow(digit, n);
                bufer2 /= 10;
            }

            System.out.println(i + (i == sum ? " - Strong arm!" : " - Common"));
        }
    }

    public static void Method4(int n){
        int[][] matrix = new int[n][n];
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                if (i == j || i + j == n - 1) matrix[i][j] = 1;
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
}