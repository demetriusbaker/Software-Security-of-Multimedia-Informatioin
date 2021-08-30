package Variant5;

import static java.lang.StrictMath.*;

public class Task {
    public static boolean isParallelogram(double x1, double y1, double x2, double y2,
                                          double x3, double y3, double x4, double y4){
        return (y1 - y4 == y2 - y3) && (x2 - x1 == x3 - x4);
    }

    public static void getFunction(float a, float b, float h){
        for (float x = a; x <= b; x += h){
            float res = (float)(7 * pow(sin(x), 2) - 0.5 * cos(x));
            System.out.printf("X: %f, F(X): %f (%.3f);\n", x, res, res);
        }
    }

    public static void printMatrixWMN(int[][] A, int[][] B, int[][] C){
        int a = maxABS(A);
        int b = maxABS(B);
        int c = maxABS(C);
        int max = max(max(a, b), c);

        if (a == max)
            print(A, 1);
        if (b == max)
            print(B, 1);
        if (c == max)
            print(C, 1);
    }

    private static int maxABS(int[][] matrix){
        int max_abs = matrix[0][0];
        for (int[] ints : matrix)
            for (int anInt : ints)
                if (max_abs < abs(anInt))
                    max_abs = anInt;

        return max_abs;
    }

    private static void print(int[][] matrix, int indentionCount){
        StringBuilder indent = new StringBuilder();
        indent.append(" ".repeat(Math.max(0, indentionCount)));

        for (int[] m : matrix){
            for (var l : m)
                System.out.print(l + indent.toString());
            System.out.println();
        }
    }

    public static void createAndPrintMatrixN(int n){
        int[][] matrix = new int[n][n];

        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                matrix[i][j] = (int)pow(j + 1, i);

        print(matrix, 10);
    }
}
