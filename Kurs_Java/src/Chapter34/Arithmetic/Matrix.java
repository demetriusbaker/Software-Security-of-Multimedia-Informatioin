package Chapter34.Arithmetic;

import java.util.Scanner;

public class Matrix implements IArithmetic {
    private double[][] matrix;

    public void createMatrix(boolean isRandom){
        Scanner s = new Scanner(System.in);
        int n, m;

        System.out.println("Введите длину матрицы");
        do {
            while (!s.hasNextInt())
                s.next();
            n = s.nextInt();
        } while (n <= 0);

        System.out.println("Введите ширину матрицы");
        do {
            while (!s.hasNextInt())
                s.next();
            m = s.nextInt();
        } while (m <= 0);

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

                    while (!s.hasNextInt())
                        s.next();
                    matrix[i][j] = s.nextInt();
                }
        }
    }

    public void printMatrixElement(int x, int y){
        if (y < matrix.length && x < matrix[0].length)
            System.out.println("Value of element (" + x + " , " +
                    y + "): " + matrix[y][x]);
    }

    public void divideMatrix(double div){
        if (div != 0)
            for (int i = 0; i < matrix.length; i++)
                for (int j = 0; j < matrix[i].length; j++)
                    matrix[i][j] /= div;
    }

    @Override
    public void add(Object value) {
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
    public void compare(Object value) {
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

    public void printMatrix(){
        for (double[] mat : matrix) {
            for (var m : mat)
                System.out.print(m + "\t");
            System.out.println();
        }
    }

    public double[][] getMatrix() {
        return matrix;
    }
}