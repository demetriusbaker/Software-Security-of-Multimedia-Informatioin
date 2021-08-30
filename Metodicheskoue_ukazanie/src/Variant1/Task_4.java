package Variant1;

public class Task_4 {
    public static double[][] formSquareMatrixAndGetPositive(int n){
        double[][] matrix = new double[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                matrix[i][j] = Math.sin((i * i - j * j) / n);

            return matrix;
    }

    public static int getPositiveElementsOfMatrix(double[][] matrix){
        int sum = 0;
        for (double[] doubles : matrix)
            for (int j = 0; j < matrix.length; j++)
                if (doubles[j] > 0) sum++;

        return sum;
    }
}