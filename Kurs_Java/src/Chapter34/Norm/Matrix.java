package Chapter34.Norm;

public class Matrix implements INorm{
    private double[][] matrix;

    public Matrix(double[][] matrix){
        final int w = matrix.length;
        final int l = matrix[0].length;
        this.matrix = new double[w][l];

        for (int i = 0; i < w; i++)
            for (int j = 0; j < l; j++)
                this.matrix[i][j] = matrix[i][j];
    }

    @Override
    public void GetNorm() {
        double max = matrix[0][0];

        for (int i = 0; i < matrix.length; i++)
            for (int j = 0; j < matrix[i].length; j++)
                if (Math.abs(max) < Math.abs(matrix[i][j]))
                    max = matrix[i][j];

        System.out.println("The norm of matrix: " + max);
    }
}