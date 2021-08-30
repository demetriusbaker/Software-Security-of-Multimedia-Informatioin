package Variant1;

public class Task_4 {
    public static double[][] FormSquareMatrixAndGetPositive(int n){
        double[][] matrix = new double[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                matrix[i][j] = Math.sin((i * i - j * j) / n);

            return matrix;
    }

    public static int GetPositiveElementsOfMatrix(double[][] matrix){
        int sum = 0;
        for (int i = 0; i < matrix.length; i++)
            for (int j = 0; j < matrix.length; j++)
                if (matrix[i][j] > 0) sum++;

        return sum;
    }
}