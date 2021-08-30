package Variant2;

import java.util.Arrays;

import static java.lang.StrictMath.*;

public class Task {
    public static double findAngleC(double a, double b, double c) {
        double[] tri = {a,b,c};
        Arrays.sort(tri);

        if (pow(tri[0], 2) + pow(tri[1], 2) == pow(tri[2], 2))
            return Math.PI / 2;
        else
            return acos((pow(tri[0], 2) + pow(tri[1], 2)
                    - pow(tri[2], 2)) / (2 * tri[0] * tri[1]));
    }

    public static void function(double a, double b, double h){
        for (double x = a; x <= b; x += h){
            double result = sin(x) + 0.5 * cos(x);
            System.out.println("x = " + x + ", F(x) = " + result);
        }
    }

    public static long moreDigits(long a, long b){
        if (getCounts(a) == getCounts(b))
            showEquals(a,b);
        return getCounts(a) > getCounts(b) ? a : b;
    }

    private static long getCounts(long number) {
        int count = number == 0 ? 1 : 0;

        while (number != 0) {
            count++;
            number /= 10;
        }

        return count;
    }

    private static void showEquals(long a, long b){
        System.out.println("Oба! a и b: " + a + " " + b);
    }

    public static int[][] generateArray(int n)
    {
        if(n%2!=0)
            return oddMagicSquare(n);
        else
            return evenMatrixSquare(n);
    }

    private static int[][] evenMatrixSquare(int n){
        int[][] matrix = standardMatrixFilling(n);
        // Перестановка элементов главной диагонали
        int count = 0;

        for (int i = 0; i < matrix.length/2; i++) {
            int transition;
            if(i<matrix.length/2) {
                transition = matrix[i][i];
                matrix[i][i] = matrix[matrix.length-1-count][matrix.length-1-count];
                matrix[matrix.length-1-count][matrix.length-1-count] = transition;
                count++;
            }
        }

        // Перестановка элементов побочной диагонали
        count = 0;
        for (int i = 0; i <matrix.length/2 ; i++) {
            int transition;
            if(i<matrix.length/2){
                transition = matrix[matrix.length - 1 -count][i];
                matrix[matrix.length - 1 - count][i] = matrix[i][matrix.length-1-count];
                matrix[i][matrix.length-1-count] = transition;
                count++;
            }
        }

        return matrix;
    }

    private static int[][] oddMagicSquare(int n) {
        int[][] matrix = new int[n][n];
        int x = n/2;
        int y = matrix.length-1;
        int count = 1;

        while (true){
            matrix[(matrix.length-1)-y][x] = count;
            count++;

            if(x==matrix.length-1) x=-1;
            if(y>=matrix.length-1) y=-1;
            y++;
            x++;
            if (matrix[matrix.length-1-y][x] != 0) y--;

            int count1=0;
            for (int[] array:matrix) {
                for (int z :array) {
                    if(z == 0) count1++;
                }
            }
            if (count1==0) break;
        }

        return matrix;
    }

    private static int[][] standardMatrixFilling(int n){
        int[][] matrix = new int[n][n];
        int count = 1;

        for (int i = 0; i > matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = count;
                count++;
            }
        }

        return matrix;
    }
}
