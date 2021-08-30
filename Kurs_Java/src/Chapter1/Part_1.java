package Chapter1;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.StrictMath.pow;
import static java.lang.StrictMath.random;

public class Part_1 {
    public static void solve_1(int n){
        for (int i = 0; i < 4; i++)
            System.out.printf("i: %d, value: %d\n", i, (int)pow(n, i));
    }

    public void solve_2_1(int n){
        if (n >= 1000 && n < 10000){
            int res1 = n / 1000 + n / 100 % 10;
            int res2 = n / 10 % 10 + n % 10;
            System.out.println(res1 == res2);
        }
    }

    public void solve_2_2(int n){
        if (n >= 100 && n < 1000){
            int res = n / 100 + n / 10 % 10 + n % 10;
            System.out.println(res % 2 == 0);
        }
    }

    public void solve_2_3(int n){
        System.out.println(n % 2 == 0 && n < 100 && n >= 10);
    }

    public void solve_2_4(int a, int b, int c){
        int[] arr = {a, b, c};
        arr = Arrays.stream(arr).sorted().toArray();
        System.out.println(pow(arr[0],2) + pow(arr[1],2) == pow(arr[2],2));
    }

    public void solve_2_5(int n){
        if (n >= 1000 && n < 10000){
            boolean one = n / 1000 != n / 100 % 10;
            boolean two = n / 1000 != n / 10 % 10;
            boolean three = n / 1000 != n % 10;
            System.out.println(one && two && three);
        }
    }

    public void solve_2_6(int n){
        char[] c = Integer.toString(n).toCharArray();
        int size = c.length;
        int[] dig = new int[size];

        for (int i = 0; i < size; i++)
            dig[i] = c[i] - '0';

        boolean isPalindrome = true;
        for (int i = 0; i < size; i++){
            if (dig[i] != dig[size - i - 1]) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println(isPalindrome);
    }

    public static void solve_3(double x, double y){
        if (x != y){
            double X, Y;

            if (x > y){
                X = 2 * x * y;
                Y = (x + y) / 2.0;
            }else{
                X = (x + y) / 2.0;
                Y = 2 * x * y;
            }

            System.out.println("X: " + X + ", Y: " + Y);
        }
    }

    public static void solve_4(){
        Scanner s = new Scanner(System.in);
        int password;

        System.out.print("Enter 4-numbers password: ");

        password = s.nextInt();
        while (password != 1179){
            System.out.println("Error password!");
            password = s.nextInt();
        }

        System.out.println("You're welcome!");
    }

    public static void solve_5(){
        int sum = 0;
        for (int i = 1; i <= 4; i++)
            sum += i;
        System.out.println("Sum: " + sum);
    }

    public static void solve_6(int k){
        int sum = 0;
        for (int i = 1; i <= 4; i++)
            if (i % k == 0)
                sum += i;
        System.out.println("Sum: " + sum);
    }

    public static void solve_7(int min, int max){
        Scanner s = new Scanner(System.in);
        int userEnter = 0, unknown, tryCount = 0;

        System.out.println("Task: guess number from 1 to 10");

        unknown = (int)(min + random() * (max + 1));

        do{
            tryCount++;

            do{
                System.out.print("Enter number from 1 to 10: ");
                if (s.hasNextInt())
                    userEnter = s.nextInt();
            } while (userEnter < min || userEnter > max);

            if (userEnter > unknown)
                System.out.println("More than unknown number! Need decrease!");
            else if (userEnter < unknown)
                System.out.println("Less than unknown number! Need increase!");
            else
                System.out.println("You're guessed!");

        } while(userEnter != unknown);

        System.out.printf("Amount of try: %d\n", tryCount);
    }

    public static void solve_8(){
        for (int i = 1000; i < 10000; i += 3)
            System.out.print(i + " ");
        System.out.println();
    }

    public static void solve_9(){
        for (int i = 1, step = 1; step <= 55; i += 2, step++)
            System.out.printf("step: %d, i: %d;\n", step, i);
    }

    public static void solve_10(){
        for (int i = 90; i >= 0; i -= 5)
            System.out.print(i + " ");
        System.out.println();
    }
}