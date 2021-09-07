package Variant10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Class.method1(2,3);
        Class.method1(-4,-5);
        Class.method1(64, -16);
        System.out.println();
        Class.method2(0.5f,2.4f, 0.35f);
        System.out.println();
        Class.method3(1000);
        System.out.println();
//        Class.method4(5, 1, 0.5);
//        Class.method4(0, 1, 0.5);
//        Class.method4(-1, 1, 0.5);
//        Class.method4(5, -1, 0.5);
        Scanner scanner = new Scanner(System.in);
        int size;
        double a, b;

       while (true) {
           do {
               System.out.println("Please enter size!");
               while (!scanner.hasNextInt()) {
                   scanner.next();
               }
               size = scanner.nextInt();
           } while (size <= 0);

           System.out.println("Please enter start value!");
           while (!scanner.hasNextDouble()) {
               scanner.next();
           }
           a = scanner.nextDouble();

           System.out.println("Please enter step!");
           while (!scanner.hasNextDouble()) {
               scanner.next();
           }
           b = scanner.nextDouble();

           Class.method4(size, a, b);
           System.out.println("Matrix was printed!");
       }
     }
}