package com.company;

import Chapter1.*;

import java.util.Scanner;

public class Main1 {
    private static int matr1[][] = {
            {2,9,4},
            {7,5,3},
            {6,1,8},
    };

    private static int matr2[][] = {
            {1,2,3},
            {4,5,6},
            {7,8,9},
    };

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a;

        System.out.println("Choose tasks:");
        System.out.println("1) 1 - 10;");
        System.out.println("2) 11 - 20;");
        System.out.println("3) 21 - 30;");
        System.out.println("4) 31 - 40;");

        switch (in.nextInt()){
            case 1:
                a = 1;

                System.out.printf("%d\t-------------\n", a++);

                Part_1.Solve_1(8); // 1 8 64 512

                System.out.printf("%d\t-------------\n", a++);

                var two = new Part_1();

                two.Solve_2_1(1234); // false
                two.Solve_2_1(5849); // true
                System.out.println();
                two.Solve_2_2(832); // false
                two.Solve_2_2(233); // true
                System.out.println();
                two.Solve_2_3(122); // false
                two.Solve_2_3(63); // false
                two.Solve_2_3(86); // true
                System.out.println();
                two.Solve_2_4(8,9,1); // false
                two.Solve_2_4(5,3,4); // true
                System.out.println();
                two.Solve_2_5(8874); // false
                two.Solve_2_5(9036); // true
                System.out.println();
                two.Solve_2_6(23486432); // false
                two.Solve_2_6(98089); // true

                System.out.printf("%d\t-------------\n", a++);

                Part_1.Solve_3(3.14, 2.5);

                System.out.printf("%d\t-------------\n", a++);

                Part_1.Solve_4();

                System.out.printf("%d\t-------------\n", a++);

                Part_1.Solve_5();

                System.out.printf("%d\t-------------\n", a++);

                Part_1.Solve_6(2);

                System.out.printf("%d\t-------------\n", a++);

                Part_1.Solve_7(1,10);

                System.out.printf("%d\t-------------\n", a++);

                Part_1.Solve_8();

                System.out.printf("%d\t-------------\n", a++);

                Part_1.Solve_9();

                System.out.printf("%d\t-------------\n", a++);

                Part_1.Solve_10();

                break;
            case 2:
                a = 11;

                System.out.printf("%d\t-------------\n", a++);

                Part_2.Solve_11();

                System.out.printf("%d\t-------------\n", a++);

                Part_2.Solve_12();

                System.out.printf("%d\t-------------\n", a++);

                Part_2.Solve_13();

                System.out.printf("%d\t-------------\n", a++);

                Part_2.Solve_14();

                System.out.printf("%d\t-------------\n", a++);

                Part_2.Solve_15();

                System.out.printf("%d\t-------------\n", a++);

                Part_2.Solve_16();

                System.out.printf("%d\t-------------\n", a++);

                Part_2.Solve_17('0', '0', '3', '1', '0', '2'); // happy
                Part_2.Solve_17('5', '6', '7', '5', '7', '6'); // happy
                Part_2.Solve_17('4', '5', '6', '4', '0', '2'); // simple

                System.out.printf("%d\t-------------\n", a++);

                Part_2.Solve_18();

                System.out.printf("%d\t-------------\n", a++);

                Part_2.Solve_19(113);
                Part_2.Solve_19(72);

                System.out.printf("%d\t-------------\n", a++);

                for (int i = 0; i < 25; i++)
                    Part_2.Solve_20();

                break;
            case 3:
                a = 21;

                System.out.printf("%d\t-------------\n", a++);

                Part_3.Solve_21(23466); // 6 hourS
                Part_3.Solve_21(10644); // 2 hourS
                Part_3.Solve_21(3600); // 1 hour
                Part_3.Solve_21(1249); // Less than hour

                System.out.printf("%d\t-------------\n", a++);

                Part_3.Solve_22();

                System.out.printf("%d\t-------------\n", a++);

                Part_3.Solve_23();

                System.out.printf("%d\t-------------\n", a++);

                for (int i = 0; i < 5; i++)
                    Part_3.Solve_24();

                System.out.printf("%d\t-------------\n", a++);

                Part_3.Solve_25();

                System.out.printf("%d\t-------------\n", a++);

                Part_3.Solve_26();

                System.out.printf("%d\t-------------\n", a++);

                Part_3.Solve_27();

                System.out.printf("%d\t-------------\n", a++);

                Part_3.Solve_28();

                System.out.printf("%d\t-------------\n", a++);

                Part_3.Solve_29();

                System.out.printf("%d\t-------------\n", a++);

                Part_3.Solve_30();

                break;
            case 4:
                a = 31;

                System.out.printf("%d\t-------------\n", a++);

                Part_4.Solve_31();

                System.out.printf("%d\t-------------\n", a++);

                Part_4.Solve_32();

                System.out.printf("%d\t-------------\n", a++);

                Part_4.Solve_33();

                System.out.printf("%d\t-------------\n", a++);

                Part_4.Solve_34(8);

                System.out.printf("%d\t-------------\n", a++);

                Part_4.Solve_35(5,6);

                System.out.printf("%d\t-------------\n", a++);

                Part_4.Solve_36(5);

                System.out.printf("%d\t-------------\n", a++);

                Part_4.Solve_37(4,5);

                System.out.printf("%d\t-------------\n", a++);

                Part_4.Solve_38(matr1);
                Part_4.Solve_38(matr2);

                System.out.printf("%d\t-------------\n", a++);

                Part_4.Solve_39(4,4);

                System.out.printf("%d\t-------------\n", a++);

                Part_4.Solve_40(10);

                break;
            default:
                System.out.println("Incorrect input!");
            break;
        }
    }
}
