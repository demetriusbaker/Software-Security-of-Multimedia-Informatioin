package Chapter34.Norm;

public class Matrix implements INorm{
    private final double[][] matrix;

    public Matrix(double[][] matrix){
        final int w = matrix.length;
        final int l = matrix[0].length;
        this.matrix = new double[w][l];

        for (int i = 0; i < w; i++)
            System.arraycopy(matrix[i], 0, this.matrix[i], 0, l);
    }

    @Override
    public void getNorm() {
        double max = matrix[0][0];

        for (double[] doubles : matrix)
            for (double aDouble : doubles)
                if (Math.abs(max) < Math.abs(aDouble))
                    max = aDouble;

        System.out.println("The norm of matrix: " + max);
    }
}