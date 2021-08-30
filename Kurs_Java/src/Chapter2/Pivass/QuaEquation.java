package Chapter2.Pivass;

import static java.lang.StrictMath.pow;
import static java.lang.StrictMath.sqrt;

public class QuaEquation {
    private final double a, b, c;

    public QuaEquation(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public QuaEquation(){
        a = 1;
        b = 2;
        c = -5;
    }

    public QuaEquation(double a){
        this.a = a;
        b = 2;
        c = -5;
    }

    public QuaEquation(double a, double b){
        this.a = a;
        this.b = b;
        c = -5;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getDiscriminant() {
        return pow(b, 2) - 4 * a * c;
    }

    public double[] findX(){
        double[] x;
        double d = getDiscriminant();

        if (d > 0) {
            x = new double[2];
            x[0] = (-b - sqrt(d)) / (a * 2);
            x[1] = (-b + sqrt(d)) / (a * 2);

            return x;
        } else if (d == 0) {
            x = new double[1];
            x[0] = -b / (2 * a);

            return x;
        } else
            x = new double[0];

        return x;
    }

    public double getExtremum(){
        return -b / (a * 2);
    }

    public double[] getIncreasingInterval(){
        double[] interval = new double[2];

        if (a > 0){
            interval[0] = getExtremum();
            interval[1] = Double.POSITIVE_INFINITY;
        } else{
            interval[0] = Double.NEGATIVE_INFINITY;
            interval[1] = getExtremum();
        }

        return interval;
    }

    public double[] getDecreasingInterval() {
        double[] interval = new double[2];

        if (a > 0) {
            interval[0] = Double.NEGATIVE_INFINITY;
            interval[1] = getExtremum();
        } else {
            interval[0] = getExtremum();
            interval[1] = Double.POSITIVE_INFINITY;
        }

        return interval;
    }

    public static String printInfoMaxMixRoots(double[] x){
        if (x.length == 2){
            double max = Math.max(x[0], x[1]);
            double min = Math.min(x[0], x[1]);

            return "Max root: " + max +
                    "\n" + "Min root: " + min;
        } else if (x.length == 1)
            return "Max and min are " + x[0];
        else
            return "No max and min!";
    }

    @Override
    public String toString(){
        return "A: " + getA() + " B: " + getB()
                + " C: " + getC();
    }
}
