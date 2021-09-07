package Chapter2.Pivass;

import java.util.Scanner;

import static java.lang.StrictMath.abs;
import static java.lang.StrictMath.max;

public class Fraction {
    private int m, n;

    private int getDenominator(Fraction f){
        int value1 = abs(n), value2 = abs(f.getN());

        for (int i = max(value1, value2); i <= value1 * value2; i++)
            if (value1 % i == 0 && value2 % i == 0)
                return i;

        return value1 * value2;
    }

    private int getGCD(){
        int a = m, b = n;

        while (b != 0){
            int bufA = a;
            a = b;
            b = bufA % b;
        }

        return abs(a);
    }

    public Fraction(){
        m = 10;
        n = 25;
    }

    public Fraction(int m, int n){
        this.m = m;
        this.n = n != 0 ? n : 1;
    }

    public int getM() {
        return m;
    }

    public int getN() {
        return n;
    }

    public void simplify(){
        int div = getGCD();
        m /= div;
        n /= div;
    }

    public void add(Fraction... f){
        for (var fraction : f) {
            int lcm = getDenominator(fraction);
            m = m * lcm / n + fraction.getM() * lcm / fraction.getN();
            n = lcm;
            simplify();
        }
    }

    public void subtract(Fraction f){
        int lcm = getDenominator(f);
        m = m * lcm / n - f.getM() * lcm / f.getN();
        n = lcm;
        simplify();
    }

    public void multiply(Fraction... f){
        for (var fraction : f) {
            m = m * fraction.getM();
            n = n * fraction.getN();
            simplify();
        }
    }

    public void divide(Fraction f){
        m = m * f.getN();
        n = n * f.getM();
        simplify();
    }

    public static void createAndPrintArray(){
        System.out.print("Enter array's size: ");
        Scanner scanner = new Scanner(System.in);
        int size;

        do {
            while (!scanner.hasNextInt())
                scanner.next();
            size = scanner.nextInt();
        } while (size <= 0);


        Fraction[] fractions = new Fraction[size];
        for (int i = 0; i < fractions.length; i++) {
            System.out.println("Enter numerator and denominator" +
                    " of " + (i + 1) + " element");

            int numerator, denominator;

            while (!scanner.hasNextInt())
                scanner.next();
            numerator = scanner.nextInt();

            while (!scanner.hasNextInt())
                scanner.next();
            denominator = scanner.nextInt();

            fractions[i] = new Fraction(numerator, denominator);
        }

        for (var f : fractions)
            System.out.println(f);
    }

    public static void changeObjArray(Fraction[] fractions){
        int size = fractions.length % 2 == 0 ?
                fractions.length : fractions.length - 1;
        for (int i = 0; i < size; i += 2)
            fractions[i].add(fractions[i + 1]);
    }

    @Override
    public String toString(){
        return m + " / " + n;
    }
}