package Chapter2.Pivass;

public class Vector {
    private final double[] vector;

    public Vector(double[] vector){
        this.vector = vector;
    }

    public double[] getVector(){
        return vector;
    }

    public void add(double[] vector){
        if (this.vector.length == vector.length){
            for (int i = 0; i < this.vector.length; i++)
                this.vector[i] += vector[i];
        }
    }

    public void subtract(double[] vector){
        if (this.vector.length == vector.length){
            for (int i = 0; i < this.vector.length; i++)
                this.vector[i] -= vector[i];
        }
    }

    public void multiply(double[] vector){
        if (this.vector.length == vector.length){
            for (int i = 0; i < this.vector.length; i++)
                this.vector[i] *= vector[i];
        }
    }

    public void divide(double[] vector){
        if (this.vector.length == vector.length){
            for (int i = 0; i < this.vector.length; i++)
                this.vector[i] /= vector[i];
        }
    }

    public void increase(){
        for (int i = 0; i < vector.length; i++)
            vector[i]++;
    }

    public void decrease(){
        for (int i = 0; i < vector.length; i++)
            vector[i]--;
    }

    public double getScalarProduct(double[] vector){
        if (this.vector.length != vector.length)
            return 0.0;

        double sum = 0;

        for (int i = 0; i < this.vector.length; i++)
            sum += this.vector[i] * vector[i];

        return sum;
    }

    public double getVectorLength(){
        double sum = 0;

        for (double v : vector) sum += Math.pow(v, 2);

        return sum;
    }

    private double getVectorLength(double[] vector){
        double sum = 0;

        for (double v : vector) sum += Math.pow(v, 2);

        return sum;
    }

    public double findVectorAngle(double[] vector){
        return getScalarProduct(vector) /
                (getVectorLength() * getVectorLength(vector));
    }

    public void printVector(){
        for (var v : vector)
            System.out.print(v + "  ");
        System.out.println();
    }

    public void printVector(double[] vector){
        for (var v : vector)
            System.out.print(v + "  ");
        System.out.println();
    }
}
