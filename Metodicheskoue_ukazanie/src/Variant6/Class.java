package Variant6;

import static java.lang.StrictMath.*;

public class Class {
    public static void findABC(double x1, double y1, double x2, double y2,
                               double x3, double y3){
        if (x3 / x2 == y3 / y2 && x2 / x1 == y2 / y1)
            System.out.println("Yes, they in one line!");
        else{
            double ab = pow(pow(x2 - x1, 2) + pow(y2 - y1, 2), 1.0 / 2);
            double bc = pow(pow(x3 - x2, 2) + pow(y3 - y2, 2), 1.0 / 2);
            double ac = pow(pow(x1 - x3, 2) + pow(y1 - y3, 2), 1.0 / 2);

            double result = (pow(ab,2) + pow(bc, 2) - pow(ac, 2)) / (2 * ab * bc);
            System.out.println("<ABC = " + toDegrees(acos(result)) + "°");
        }
    }

    public static void getFunction(float a, float b, float h){
        for (float x = a; x <= b; x += h){
            float res = (float)(pow(sin(x), 2) - cos(2 * x));
            System.out.printf("X: %f, F(X): %f (%.3f);\n", x, res, res);
        }
    }

    public static void findFriendNumbers(int n){
        for (int i = 0; i < n; i++)
            for (int j = i + 1; j < n; j++)
                if (sfn(i) == j && sfn(j) == i)
                    System.out.printf("i: %d j: %d\n", i, j);
    }

    private static int sfn(int n){
        int result = 1;

        for (int i = 2; i < n; i++)
            if (n % i == 0) result += i;

        return result;
    }

    public static void createAndPrintMatrixN(int n){
        int[][] matrix = new int[n][n];

        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                matrix[i][j] = (int)pow(j + 1, i + 1);

        print(matrix, 10);
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
}
