package Chapter34.Norm;

public class ComplexNumbers implements INorm {
    private final double real, imaginary;

    public ComplexNumbers(double real, double imaginary){
        this.real = real;
        this.imaginary = imaginary;
    }

    @Override
    public void getNorm() {
        System.out.println("The norm of complex number: " +
                Math.sqrt(real * real + imaginary * imaginary));
    }
}