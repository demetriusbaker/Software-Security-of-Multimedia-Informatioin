package Chapter34.Norm;

public class Vector implements INorm{
    private final double[] vector;

    public Vector(double... vector){
        final int size = vector.length;
        this.vector = new double[size];

        System.arraycopy(vector, 0, this.vector, 0, size);
    }

    @Override
    public void getNorm() {
        double undersqrt = 0;

        for (double v : vector) undersqrt += Math.pow(v, 2);

        System.out.println("The norm of vector: " +
                Math.sqrt(undersqrt));
    }
}