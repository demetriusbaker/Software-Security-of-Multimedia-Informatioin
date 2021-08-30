package Chapter34.Norm;

public class Vector implements INorm{
    private double[] vector;

    public Vector(double... vector){
        final int size = vector.length;
        this.vector = new double[size];

        for (int i = 0; i < size; i++)
            this.vector[i] = vector[i];
    }

    @Override
    public void GetNorm() {
        double undersqrt = 0;

        for (int i = 0; i < vector.length; i++)
            undersqrt += Math.pow(vector[i], 2);

        System.out.println("The norm of vector: " +
                Math.sqrt(undersqrt));
    }
}