package Variant3;

import static java.lang.StrictMath.*;

public class Task {
    public static int Get_Mins_In_Max(int a, int b, int c, int d){
        return max(min(a,b), min(c,d));
    }

    public static void Function(double a, double b, double h){
        for (double x = a; x <= b; x += h){
            double result = tan(2 * x) - 3;
            System.out.println("x = " + x + ", F(x) = " + result);
        }
    }

    public static int Reverse_Number(int number){
        char[] c = String.valueOf(number).toCharArray();
        int[] digits = new int[c.length];
        int final_number = 0;

        for (int i = digits.length - 1; i >= 0; i--){
            digits[i] = c[i] - '0';
            final_number += digits[i] * pow(10, i);
        }

        return final_number;
    }

    public static int[][] Get_Main_Diagonal_Matrix(int n){
        int[][] matrix = new int[n][n];

        for (int i = 0; i < n; i++)
            matrix[i][i] = i;

        return matrix;
    }
}
