package Chapter1;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.StrictMath.*;

public class Part_2 {
    public static void solve_11(){
        for (int a = 2; a < 10000; a = a * 2 - 1)
            System.out.print(a + " ");
        System.out.println();
    }

    public static void solve_12(){
        for (int a = -166; a < 100; a = a * 2 + 200)
            if (abs(a) >= 10 && abs(a) < 100)
                System.out.print(a + " ");
        System.out.println();
    }

    public static void solve_13(){
        Scanner s = new Scanner(System.in);
        int n;

        do {
            System.out.print("Enter natural number: ");
            while (!s.hasNextInt())
                s.next();
            n = s.nextInt();
        } while (n <= 0);

        System.out.printf("Dividers of %d: ", n);
        for (int i = 1; i <= n; i++)
            if (n % i == 0)
                System.out.print(i + " ");
        System.out.println();
    }

    public static void solve_14(){
        Scanner s = new Scanner(System.in);
        int n;
        boolean isPrimeNum = true;

        do{
            System.out.print("Enter natural number: ");
            while (!s.hasNextInt())
                s.next();
            n = s.nextInt();
        } while (n <= 0);

        for (int i = 2; i < n; i++)
            if (n % i == 0){
                isPrimeNum = false;
                break;
            }

        if (isPrimeNum)
            System.out.println("This number is prime!");
        else {
            System.out.printf("Dividers of %d: ", n);
            for (int i = 2; i <= n; i++){
                Integer res = i;

                for (int j = 2; j < i; j++){
                    if (i % j == 0){
                        res = null;
                        break;
                    }
                }

                if (res != null && n % res == 0)
                    System.out.print(res + " ");
            }

            System.out.println();
        }
    }

    public static void solve_15(){
        int[] fib = new int[11];
        fib[0] = 1;
        fib[1] = 1;
        System.out.print(fib[0] + " ");
        System.out.print(fib[1] + " ");

        for (int i = 2; i < fib.length; i++){
            fib[i] = fib[i - 1] + fib[i - 2];
            System.out.print(fib[i] + " ");
        }
        System.out.println();
    }

    public static void solve_16(){
        Scanner in = new Scanner(System.in);

        System.out.print("Enter number: ");
        char[] c = in.next().toCharArray();

        int[] digs = new int[c.length];
        for (int i = 0; i < digs.length; i++)
            digs[i] = c[i] - '0';

        System.out.println("Sum = " + Arrays.stream(digs).sum());
    }

    public static void solve_17(char ... happy_ticket){
        if (happy_ticket.length < 1000000){
            int[] digs = new int[happy_ticket.length];

            for (int i = 0; i < happy_ticket.length; i++)
                digs[i] = happy_ticket[i] - '0';

            if (digs[0] + digs[1] + digs[2] ==
                    digs[3] + digs[4] + digs[5])
                System.out.println("It's happy ticket!!!");
            else
                System.out.println("It's simple ticket!");
        }
    }

    public static void solve_18(){
        int amount = 0;

        System.out.println("Need to exclude:");
        for (int i = 1; i <= 99999; i++){
            String row = Integer.toString(i);

            if (row.contains("4") || row.contains("13")){
                System.out.println(i);
                amount++;
            }
        }

        System.out.printf("Amount of exclude elements: %d\n", amount);
    }

    public static void solve_19(int n){
        if (n >= 5 && n <= 155){
            if (n > 25 && n < 100)
                System.out.printf("Number %d is contains in (25,100)\n", n);
            else
                System.out.printf("Number %d isn't contains in (25,100)\n", n);
        }
    }

    public static void solve_20(){
        int random = 100 + (int)(random() * 1000);
        int[] res = {random / 100, random / 10 % 10, random % 10};

        System.out.printf("In number %d most digit is %d\n",
                random, max(max(res[0], res[1]), res[2]));
    }
}