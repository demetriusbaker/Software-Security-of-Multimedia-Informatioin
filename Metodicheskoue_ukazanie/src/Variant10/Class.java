package Variant10;

import static java.lang.StrictMath.pow;
import static java.lang.StrictMath.sin;

public class Class {
    public static void method1(double a, double b){
        System.out.println("A: " + a + " and B: " + b);
        if (a < 0 ^ b < 0 || a > 0 ^ b > 0){
            double x = pow(-b / a, 0.5);
            System.out.println("Xo = 0 and X = " + x);
        }else
            System.out.println("Не имеет решение, кроме Xo = 0!");
    }

    public static void method2(float a, float b, float h){
        for (float x = a; x <= b; x += h){
            float res = (float)(0.5 * sin(x / 4) + 1);
            System.out.printf("X: %f, F(X): %f (%.3f);\n", x, res, res);
        }
    }

    public static void method3(int n){
        for (int i = 1; i <= n; i++)
            if (isSimple(i) && isBinaryPalindrome(i))
                System.out.println(i);
    }

    private static boolean isSimple(int n){
        if (n % 2 == 0 || n <= 1)
            return false;

        for (int i = 2; i < n; i++)
            if (n % i == 0)
                return false;

        return true;
    }

    private static boolean isBinaryPalindrome(int n){
        int two = 0, bin = 2;
        while (n > bin){
            two++;
            bin *= 2;
        }

        return n == pow(2, two) - 1 || n == pow(2, two) + 1 ||
                n == bin - 1 || n == bin + 1;
    }

    public static void method4(int size, double a, double inc){
        double[][] matrix = new double[size][size];

        for (int i = 0; i < size; i++){
            double a1 = a;

            for (int j = 0; j < size; j++){
                matrix[i][j] = a1;
                a1 += inc;
            }

            int I = i;
            while (I > 0){
                for (int q = 1; q < size; q++){
                    double buf = matrix[i][q];
                    matrix[i][q] = matrix[i][q - 1];
                    matrix[i][q - 1] = buf;
                }

                I--;
            }
        }

        for (int i = 0; i < size; i++){
            for (int j = 0; j < size; j++)
                System.out.print(matrix[i][j] + "\t");
            System.out.println();
        }
    }
}