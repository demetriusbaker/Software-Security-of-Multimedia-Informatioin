package Variant4;

import static java.lang.StrictMath.cos;
import static java.lang.StrictMath.max;

public class Task {
    public static int getRes3Num(int a, int b, int c, int d){
        return d == a ? a : d == b ? b : d == c ? c :
                max(d - a, max(d - b, d - c));
    }

    public static void function(float a, float b, float h){
        for (float x = a; x <= b; x += h){
            float res = (float)(-cos(2 * x));
            System.out.printf("X: %f, F(X): %f (%.3f);\n", x, res, res);
        }
    }

    public static int[] createArrayWithKN(int k, int n){
        int[] arr = new int[k + 1];
        int c = 0;
        for (int i = 1; i < n; i++)
            if (getSumOfDigits(i) == k)
                arr[c++] = i;
        return arr;
    }

    private static int getSumOfDigits(int n){
        int sum = 0, number = n;
        while (number > 0){
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }

    public static int[][] formMatrix(int n){
        int[][] matrix = new int[n][n];
        for (int i = 0; i < matrix.length; i++)
            for(int j = 0; j < matrix[i].length; j++)
                matrix[i][j] = (j + 1) * (i + 1);
        return matrix;
    }
}
