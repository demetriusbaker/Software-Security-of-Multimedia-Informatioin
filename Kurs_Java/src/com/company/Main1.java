package com.company;

import Chapter1.*;

import java.util.Scanner;

public class Main1 {
    private static final int[][] matrix1 = {
            {2, 9, 4},
            {7, 5, 3},
            {6, 1, 8},
    };

    private static final int[][] matrix2 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9},
    };

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a;
        int key;

        while (true) {
            System.out.println("Choose tasks:");
            System.out.println("0) exit");
            System.out.println("1) 1 - 10;");
            System.out.println("2) 11 - 20;");
            System.out.println("3) 21 - 30;");
            System.out.println("4) 31 - 40;");

            while (!in.hasNextInt())
                in.next();
            key = in.nextInt();

            switch (key) {
                case 0 -> System.exit(0);
                case 1 -> {
                    a = 1;
                    System.out.printf("%d\t-------------\n", a++);
                    Part_1.solve_1(8); // 1 8 64 512
                    System.out.printf("%d\t-------------\n", a++);
                    var two = new Part_1();
                    two.solve_2_1(1234); // false
                    two.solve_2_1(5849); // true
                    System.out.println();
                    two.solve_2_2(832); // false
                    two.solve_2_2(233); // true
                    System.out.println();
                    two.solve_2_3(122); // false
                    two.solve_2_3(63); // false
                    two.solve_2_3(86); // true
                    System.out.println();
                    two.solve_2_4(8, 9, 1); // false
                    two.solve_2_4(5, 3, 4); // true
                    System.out.println();
                    two.solve_2_5(8874); // false
                    two.solve_2_5(9036); // true
                    System.out.println();
                    two.solve_2_6(23486432); // false
                    two.solve_2_6(98089); // true
                    System.out.printf("%d\t-------------\n", a++);
                    Part_1.solve_3(3.14, 2.5);
                    System.out.printf("%d\t-------------\n", a++);
                    Part_1.solve_4();
                    System.out.printf("%d\t-------------\n", a++);
                    Part_1.solve_5();
                    System.out.printf("%d\t-------------\n", a++);
                    Part_1.solve_6(2);
                    System.out.printf("%d\t-------------\n", a++);
                    Part_1.solve_7(1, 10);
                    System.out.printf("%d\t-------------\n", a++);
                    Part_1.solve_8();
                    System.out.printf("%d\t-------------\n", a++);
                    Part_1.solve_9();
                    System.out.printf("%d\t-------------\n", a++);
                    Part_1.solve_10();
                }
                case 2 -> {
                    a = 11;
                    System.out.printf("%d\t-------------\n", a++);
                    Part_2.solve_11();
                    System.out.printf("%d\t-------------\n", a++);
                    Part_2.solve_12();
                    System.out.printf("%d\t-------------\n", a++);
                    Part_2.solve_13();
                    System.out.printf("%d\t-------------\n", a++);
                    Part_2.solve_14();
                    System.out.printf("%d\t-------------\n", a++);
                    Part_2.solve_15();
                    System.out.printf("%d\t-------------\n", a++);
                    Part_2.solve_16();
                    System.out.printf("%d\t-------------\n", a++);
                    Part_2.solve_17('0', '0', '3', '1', '0', '2'); // happy
                    Part_2.solve_17('5', '6', '7', '5', '7', '6'); // happy
                    Part_2.solve_17('4', '5', '6', '4', '0', '2'); // simple
                    System.out.printf("%d\t-------------\n", a++);
                    Part_2.solve_18();
                    System.out.printf("%d\t-------------\n", a++);
                    Part_2.solve_19(113);
                    Part_2.solve_19(72);
                    System.out.printf("%d\t-------------\n", a++);
                    for (int i = 0; i < 25; i++)
                        Part_2.solve_20();
                }
                case 3 -> {
                    a = 21;
                    System.out.printf("%d\t-------------\n", a++);
                    Part_3.solve_21(23466); // 6 hourS
                    Part_3.solve_21(10644); // 2 hourS
                    Part_3.solve_21(3600); // 1 hour
                    Part_3.solve_21(1249); // Less than hour
                    System.out.printf("%d\t-------------\n", a++);
                    Part_3.solve_22();
                    System.out.printf("%d\t-------------\n", a++);
                    Part_3.solve_23();
                    System.out.printf("%d\t-------------\n", a++);
                    for (int i = 0; i < 5; i++)
                        Part_3.solve_24();
                    System.out.printf("%d\t-------------\n", a++);
                    Part_3.solve_25();
                    System.out.printf("%d\t-------------\n", a++);
                    Part_3.solve_26();
                    System.out.printf("%d\t-------------\n", a++);
                    Part_3.solve_27();
                    System.out.printf("%d\t-------------\n", a++);
                    Part_3.solve_28();
                    System.out.printf("%d\t-------------\n", a++);
                    Part_3.solve_29();
                    System.out.printf("%d\t-------------\n", a++);
                    Part_3.solve_30();
                }
                case 4 -> {
                    a = 31;
                    System.out.printf("%d\t-------------\n", a++);
                    Part_4.solve_31();
                    System.out.printf("%d\t-------------\n", a++);
                    Part_4.solve_32();
                    System.out.printf("%d\t-------------\n", a++);
                    Part_4.solve_33();
                    System.out.printf("%d\t-------------\n", a++);
                    Part_4.solve_34(3);
                    System.out.printf("%d\t-------------\n", a++);
                    Part_4.solve_35(5, 6);
                    System.out.printf("%d\t-------------\n", a++);
                    Part_4.solve_36(5);
                    System.out.printf("%d\t-------------\n", a++);
                    Part_4.solve_37(4, 5);
                    System.out.printf("%d\t-------------\n", a++);
                    Part_4.solve_38(matrix1);
                    Part_4.solve_38(matrix2);
                    System.out.printf("%d\t-------------\n", a++);
                    Part_4.solve_39(4, 4);
                    System.out.printf("%d\t-------------\n", a++);
                    Part_4.solve_40(10);
                }
                case 34 -> {
                    double first, second;

                    System.out.print("Введите делимое: ");
                    while (!in.hasNextDouble())
                        in.next();
                    first = in.nextDouble();

                    System.out.print("Введите делитель: ");
                    while (!in.hasNextDouble())
                        in.next();
                    second = in.nextDouble();

                    try {
                        System.out.println("Результат деления: " + first / second);
                    } catch (java.lang.ArithmeticException exception) {
                        System.out.println("Деление на нуль! Не повезло - не фортануло");
                    } finally {
                        System.out.println("Красавчик, нашел меня!");
                    }
                }
                default -> System.out.println("Incorrect input!");
            }
        }
    }
}
