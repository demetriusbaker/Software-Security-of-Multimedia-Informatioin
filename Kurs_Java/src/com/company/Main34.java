package com.company;

import Chapter34.Arithmetic.*;
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

            switch (s.nextLine()){
                case "0":
                    isExit = true;
                    break;
                case "1":
                    RealiseInnerTasks();
                    break;
                case "2":
                    ISquare[] iSquares = {
                            new Rectangle(2.5,3.5),
                            new Circle(5),
                            new RightTriangle(9.8,4.6),
                            new Trapezoid(3.5,5.5, 8)
                    };

                    for (int i = 0; i < iSquares.length; i++)
                        iSquares[i].GetSquareInfo();
                    break;
                case "3":
                    double[][] matrix = {
                            {5,-7},
                            {6,3}
                    };

                    INorm[] iNorms = {
                            new ComplexNumbers(3,4),
                            new Vector(0,1,2,3,4,5,6,7,8,9),
                            new Matrix(matrix)
                    };

                    for (int i = 0; i < iNorms.length; i++)
                        iNorms[i].GetNorm();
                    break;
                case "4":
                    RealiseForthTask();
                    break;
                default:
                    System.out.println("Incorrect input!");
                    break;
            }
        }
    }

    private static void RealiseInnerTasks(){
        Scanner s = new Scanner(System.in);
        boolean isExitSmall = false;

        while (!isExitSmall){
            System.out.println("Выберите класс");
            System.out.println("0) Выход из списка");
            System.out.println("1) Матрица");
            System.out.println("2) Строка");
            System.out.println("3) Вектор");

            switch (s.nextLine()){
                case "0":
                    isExitSmall = true;
                    break;
                case "1":
                    Matrixs m = new Matrixs();
                    m.CreateMatrix(false);
                    m.PrintMatrix();
                    m.PrintMatrixElement(0,1);

                    System.out.println("===");

                    m.DivideMatrix(2);
                    m.PrintMatrix();

                    System.out.println("===");

                    Matrixs m1 = new Matrixs();
                    m1.CreateMatrix(false);
                    m1.PrintMatrix();

                    System.out.println("===");

                    m.Compare(m1.GetMatrix());
                    m.Add(m1.GetMatrix());
                    m.PrintMatrix();
                    break;
                case "2":
                    Strings obj1 = new Strings();
                    obj1.PrintSymbols();
                    obj1.OutputValueByIndex(5);

                    System.out.println("===");

                    Strings obj2 = new Strings();
                    obj2.PrintSymbols();
                    obj2.OutputValueByIndex(3);

                    System.out.println("===");

                    obj1.Compare(obj2.getC());
                    obj1.Add(obj2.getC());
                    obj1.PrintSymbols();
                    break;
                case "3":
                    Vectors vector1 = new Vectors();
                    vector1.PrintVector();

                    System.out.println("===");

                    Vectors vector2 = new Vectors();
                    vector2.PrintVector();
                    vector2.CompareLengthVector(vector1.GetVector());

                    System.out.println("===");

                    vector2.Compare(vector1.GetVector());
                    vector2.Add(vector1.GetVector());
                    vector2.Compare(vector1.GetVector());
                    break;
                default:
                    System.out.println("Incorrect input!");
                    break;
            }
        }
    }

    private static void RealiseForthTask(){
        System.out.println("1) interface Абитуриент <- abstract class Студент <- class Студент-Заочник");
        System.out.println();

        PartTimeStudent pts = new PartTimeStudent("Lili", true);
        System.out.println(pts.GetInfo());
        System.out.println(pts.GetPerson());

        System.out.println();
        System.out.println("2) interface Сотрудник <- class Инженер <- class Руководитель");
        System.out.println();

        Engineer e = new Engineer("Peter");
        System.out.println(e.GetInfo());

        System.out.println();

        Leader l = new Leader("Dietmar", "Senior");
        System.out.println(l.GetInfo());

        System.out.println();
        System.out.println("3) interface Здание <- abstract class Общественное Здание <- class Театр");
        System.out.println();

        Theater th = new Theater("Culture building", "Belarusian Opera", 1000);
        System.out.println(th.PrintDefaultInfo());
        System.out.println(th.GetNameBuilding());
        System.out.println(th.GetInfo());

        System.out.println();
        System.out.println("4) interface Корабль <- abstract class Военный Корабль <- class Авианосец");
        System.out.println();

        Aerocarrier ac = new Aerocarrier(1250,150);
        System.out.println(ac.SayWarInfo());
        System.out.println(ac.GetCharacteristics());

        System.out.println();
        System.out.println("5) interface Корабль <- class Грузовой Корабль <- class Танкер");
        System.out.println();

        Cargoship cs = new Cargoship(35, 5.3f);
        System.out.println(cs.GetInfo());
        System.out.println(cs.GetCharacteristics());

        System.out.println();

        Tanker t = new Tanker(12500,2.6f, 120, 234.4f);
        System.out.println(t.GetInfo());
        System.out.println(t.GetCharacteristics());

        System.out.println();
        System.out.println("6) interface Техника <- abstract class Плеер <- class Видеоплеер");
        System.out.println();

        Videoplayer vp = new Videoplayer("Samsung", 1500);
        System.out.println(vp.Say01());
        System.out.println(vp.GetCharacteristicsTechnic());
        System.out.println(vp.On());
        System.out.println(vp.Off());

        System.out.println();
        System.out.println("7) interface Транспортное Средство <- abstract class Общественный Транспорт" +
                " <- class Трамвай");
        System.out.println();

        Tram tram = new Tram("Belovezh Zybr", 75000000, 1500);
        System.out.println(tram.GetInfoTransport());
        System.out.println(tram.ShowSpeed());
        System.out.println();
    }
}