package Chapter34.Arithmetic;

import java.util.Scanner;

public class Matrixs implements IArithmetic{
    private double[][] matrix;

    public void CreateMatrix(boolean isRandom){
        Scanner s = new Scanner(System.in);

        System.out.println("Введите длину матрицы");
        int n = s.nextInt();
        System.out.println("Введите ширину матрицы");
        int m = s.nextInt();

        this.matrix = new double[m][n];

        if (isRandom){
            for (int i = 0; i < matrix.length; i++)
                for (int j = 0; j < matrix[i].length; j++)
                    matrix[i][j] = (int)(Math.random() * 100);
        }else{
            for (int i = 0; i < matrix.length; i++)
                for (int j = 0; j < matrix[i].length; j++){
                    System.out.print("Введите элемент массива " + i + " строки"
                    + " и " + j + " столбца: ");
                    matrix[i][j] = s.nextInt();
                }
        }
    }

    public void PrintMatrixElement(int x, int y){
        if (y < matrix.length && x < matrix[0].length)
            System.out.println("Value of element (" + x + " , " +
                    y + "): " + matrix[y][x]);
    }

    public void DivideMatrix(double div){
        if (div != 0)
            for (int i = 0; i < matrix.length; i++)
                for (int j = 0; j < matrix[i].length; j++)
                    matrix[i][j] /= div;
    }

    @Override
    public void Add(Object value) {
        double[][] matrix = (double[][]) value;

        try{
            if (matrix.length != this.matrix.length ||
                    matrix[0].length != this.matrix[0].length)
                throw new SizeMismatchExceptionClass();

            for (int i = 0; i < this.matrix.length; i++)
                for (int j = 0; j < this.matrix[i].length; j++)
                    this.matrix[i][j] =
                            this.matrix[i][j] + matrix[i][j];
        } catch (SizeMismatchExceptionClass sme) {
            System.out.println(sme);
        }
    }

    @Override
    public void Compare(Object value) {
        double[][] matrix = (double[][]) value;
        boolean isEqual = true;

        try{
            if (matrix.length != this.matrix.length ||
                    matrix[0].length != this.matrix[0].length)
                throw new SizeMismatchExceptionClass();

            for (int i = 0; i < this.matrix.length; i++)
                for (int j = 0; j < this.matrix[i].length; j++)
                    if (this.matrix[i][j] != matrix[i][j]){
                        isEqual = false;
                        break;
                    }

            if (isEqual)
                System.out.println("Equals!");
            else
                System.out.println("Is not equals!");
        } catch (SizeMismatchExceptionClass sme) {
            System.out.println(sme);
        }
    }

    public void PrintMatrix(){
        for (double[] mat : matrix) {
            for (var m : mat)
                System.out.print(m + "\t");
            System.out.println();
        }
    }

    public double[][] GetMatrix() {
        return matrix;
    }
}