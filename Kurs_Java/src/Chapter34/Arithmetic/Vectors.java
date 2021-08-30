package Chapter34.Arithmetic;

import java.util.Scanner;

public class Vectors implements IArithmetic{
    private double[] vector;

    public Vectors(){
        Scanner s = new Scanner(System.in);

        System.out.print("Enter size: ");
        final int size = s.nextInt();

        vector = new double[size];
        for (int i = 0; i < size; i++){
            System.out.print("Enter " + (i + 1) + " vector element: ");
            vector[i] = s.nextDouble();
        }
    }

    public void CompareLengthVector(double[] vector){
        System.out.println(this.vector.length == vector.length ?
                "Length is equal!" : "length isn't equal!");
    }

    @Override
    public void Add(Object value) {
        double[] vector = (double[]) value;

        try{
            if (this.vector.length != vector.length)
                throw new SizeMismatchExceptionClass();

            for (int i = 0; i < this.vector.length; i++)
                this.vector[i] = this.vector[i] + vector[i];
        } catch (SizeMismatchExceptionClass sme) {
            System.out.println(sme);
        }
    }

    @Override
    public void Compare(Object value) {
        double[] vector = (double[]) value;
        boolean isEqual = true;

        try{
            if (this.vector.length != vector.length)
                throw new SizeMismatchExceptionClass();

            for (int i = 0; i < this.vector.length; i++)
                if (this.vector[i] != vector[i]){
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

    public void PrintVector(){
        for (int i = 0; i < this.vector.length; i++)
            System.out.print(this.vector[i] + " ");
        System.out.println();
    }

    public double[] GetVector() {
        return vector;
    }
}