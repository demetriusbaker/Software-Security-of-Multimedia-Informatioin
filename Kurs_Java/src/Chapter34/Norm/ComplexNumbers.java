package Chapter34.Norm;

public class ComplexNumbers implements INorm {
    private double real, imaginary;

    public ComplexNumbers(double real, double imaginary){
        this.real = real;
        this.imaginary = imaginary;
    }

    @Override
    public void GetNorm() {
        System.out.println("The norm of complex number: " +
                Math.sqrt(real * real + imaginary * imaginary));
    }
}