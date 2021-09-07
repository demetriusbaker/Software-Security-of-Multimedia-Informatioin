package com.company;

import Chapter34.Arithmetic.*;
import Chapter34.Arithmetic.Matrix;
import Chapter34.Norm.*;
import Chapter34.Square.*;
import Chapter34.Task41.*;
import Chapter34.Task42.*;
import Chapter34.Task43.*;
import Chapter34.Task44.*;
import Chapter34.Task45.*;
import Chapter34.Task46.*;
import Chapter34.Task47.*;

import java.util.Scanner;

public class Main34 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        boolean isExit = false;

        while (!isExit){
            System.out.println("Добро пожаловать!");
            System.out.println("Выберите задание");
            System.out.println("0) Выход");
            System.out.println("1) Арифметика");
            System.out.println("2) Площадь");
            System.out.println("3) Норма");
            System.out.println("4) Наследования и полиморфизы");

            switch (s.nextLine()) {
                case "0" -> isExit = true;
                case "1" -> realiseInnerTasks();
                case "2" -> {
                    ISquare[] iSquares = {
                            new Rectangle(2.5, 3.5),
                            new Circle(5),
                            new RightTriangle(9.8, 4.6),
                            new Trapezoid(3.5, 5.5, 8)
                    };
                    for (ISquare iSquare : iSquares) iSquare.getSquareInfo();
                }
                case "3" -> {
                    double[][] matrix = {
                            {5, -7},
                            {6, 3}
                    };
                    INorm[] iNorms = {
                            new ComplexNumbers(3, 4),
                            new Vector(0, 1, 2, 3, 4, 5, 6, 7, 8, 9),
                            new Chapter34.Norm.Matrix(matrix)
                    };
                    for (INorm iNorm : iNorms) iNorm.getNorm();
                }
                case "4" -> realiseForthTask();
                default -> System.out.println("Incorrect input!");
            }
        }
    }

    private static void realiseInnerTasks(){
        Scanner s = new Scanner(System.in);
        boolean isExitSmall = false;

        while (!isExitSmall){
            System.out.println("Выберите класс");
            System.out.println("0) Выход из списка");
            System.out.println("1) Матрица");
            System.out.println("2) Строка");
            System.out.println("3) Вектор");

            switch (s.nextLine()) {
                case "0" -> isExitSmall = true;
                case "1" -> {
                    Matrix m = new Matrix();
                    m.createMatrix(false);
                    m.printMatrix();
                    m.printMatrixElement(0, 1);

                    System.out.println("===");

                    m.divideMatrix(2);
                    m.printMatrix();

                    System.out.println("===");

                    Matrix m1 = new Matrix();
                    m1.createMatrix(false);
                    m1.printMatrix();

                    System.out.println("===");

                    m.compare(m1.getMatrix());
                    m.add(m1.getMatrix());
                    m.printMatrix();

                    System.out.println("===");

                    Matrix testMatrix = new Matrix();
                    testMatrix.createMatrix(true);
                    testMatrix.printMatrix();
                }
                case "2" -> {
                    Strings stringObject1 = new Strings();
                    stringObject1.printSymbols();
                    stringObject1.outputValueByIndex(5);
                    System.out.println("===");
                    Strings stringObject2 = new Strings();
                    stringObject2.printSymbols();
                    stringObject2.outputValueByIndex(3);
                    System.out.println("===");
                    stringObject1.compare(stringObject2.getC());
                    stringObject1.add(stringObject2.getC());
                    stringObject1.printSymbols();
                }
                case "3" -> {
                    Vectors vector1 = new Vectors();
                    vector1.printVector();
                    System.out.println("===");
                    Vectors vector2 = new Vectors();
                    vector2.printVector();
                    vector2.compareLengthVector(vector1.getVector());
                    System.out.println("===");
                    vector2.compare(vector1.getVector());
                    vector2.add(vector1.getVector());
                    vector2.compare(vector1.getVector());
                }
                default -> System.out.println("Incorrect input!");
            }
        }
    }

    private static void realiseForthTask(){
        System.out.println("1) interface Абитуриент <- abstract class Студент <- class Студент-Заочник");
        System.out.println();

        PartTimeStudent pts = new PartTimeStudent("Lili", true);
        System.out.println(pts.getInfo());
        System.out.println(pts.getPerson());

        System.out.println();
        System.out.println("2) interface Сотрудник <- class Инженер <- class Руководитель");
        System.out.println();

        Engineer e = new Engineer("Peter");
        System.out.println(e.getInfo());

        System.out.println();

        Leader l = new Leader("Dietmar", "Senior");
        System.out.println(l.getInfo());

        System.out.println();
        System.out.println("3) interface Здание <- abstract class Общественное Здание <- class Театр");
        System.out.println();

        Theater th = new Theater("Culture building", "Belarusian Opera", 1000);
        System.out.println(th.printDefaultInfo());
        System.out.println(th.getNameBuilding());
        System.out.println(th.getInfo());

        System.out.println();
        System.out.println("4) interface Корабль <- abstract class Военный Корабль <- class Авианосец");
        System.out.println();

        Aerocarrier ac = new Aerocarrier(1250,150);
        System.out.println(ac.sayWarInfo());
        System.out.println(ac.getCharacteristics());

        System.out.println();
        System.out.println("5) interface Корабль <- class Грузовой Корабль <- class Танкер");
        System.out.println();

        Cargoship cs = new Cargoship(35, 5.3f);
        System.out.println(cs.getInfo());
        System.out.println(cs.getCharacteristics());

        System.out.println();

        Tanker t = new Tanker(12500,2.6f, 120, 234.4f);
        System.out.println(t.getInfo());
        System.out.println(t.getCharacteristics());

        System.out.println();
        System.out.println("6) interface Техника <- abstract class Плеер <- class Видеоплеер");
        System.out.println();

        Videoplayer vp = new Videoplayer("Samsung", 1500);
        System.out.println(vp.say01());
        System.out.println(vp.getCharacteristicsTechnic());
        System.out.println(vp.on());
        System.out.println(vp.off());

        System.out.println();
        System.out.println("7) interface Транспортное Средство <- abstract class Общественный Транспорт" +
                " <- class Трамвай");
        System.out.println();

        Tram tram = new Tram("Belovezh Zybr", 75000000, 1500);
        System.out.println(tram.getInfoTransport());
        System.out.println(tram.showSpeed());
        System.out.println();
    }
}