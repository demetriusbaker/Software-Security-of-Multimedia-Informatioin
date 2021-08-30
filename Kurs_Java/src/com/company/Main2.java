package com.company;

import Chapter2.Abiturient.*;
import Chapter2.Car.*;
import Chapter2.House.*;
import Chapter2.Patient.*;
import Chapter2.Pivass.*;
import Chapter2.Student.*;

import java.io.*;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) throws IOException {
        System.out.println("Добро пожаловать!");
        while (true) {
            System.out.println("Какое задание вывести?");
            System.out.println("0) Выход из программы");
            System.out.println("1) Список студентов");
            System.out.println("2) Список пациентов");
            System.out.println("3) Список абитуриентов");
            System.out.println("4) Список домов");
            System.out.println("5) Список автомобилей");
            System.out.println("6) Класс Круг");
            System.out.println("7) Класс Склад");
            System.out.println("8) Класс Книга");
            System.out.println("9) Класс Дробь в виде пары (m,n)");
            System.out.println("10) Класс Вектор");
            System.out.println("11) Класс Множество символов мощности n");
            System.out.println("12) Класс Квадратное уравнение");

            Scanner s = new Scanner(System.in);
            switch (s.next()) {
                case "0":
                    System.out.println("Произошел выход из программы!");
                    System.exit(0);
                    break;
                case "1":
                    Task1();
                    break;
                case "2":
                    Task2();
                    break;
                case "3":
                    Task3();
                    break;
                case "4":
                    Task4();
                    break;
                case "5":
                    Task5();
                    break;
                case "6":
                    Task6();
                    break;
                case "7":
                    Task7();
                    break;
                case "8":
                    Task8();
                    break;
                case "9":
                    Task9();
                    break;
                case "10":
                    Task10();
                    break;
                case "11":
                    Task11();
                    break;
                case "12":
                    Task12();
                    break;
                default:
                    System.out.println("Некорректный ввод!");
                    break;
            }
        }
    }

    private static void Task1() throws IOException {
        // чтение файла с бд студентами
        File file = new File("students_bsuir");
        FileReader fr = new FileReader(file);
        BufferedReader reader = new BufferedReader(fr);

        // нахождение количества строк в файле
        FileInputStream fis = new FileInputStream(file);
        byte[] byteArray = new byte[(int) file.length()];
        fis.read(byteArray);
        String data = new String(byteArray);
        String[] stringArray = data.split("\r\n");

        // точный размер массива
        final int size = stringArray.length;

        // непостредственно чтение файла построчно
        String line = reader.readLine();

        // инициализация массива и создание объекта классов
        Student[] stud = new Student[size];
        University BSUIR = new University();

        // заполнение списка данными студентов
        int i = 0;
        while (line != null) {
            String[] split = line.split(" ");

            int id = Integer.parseInt(split[0]);
            String name = split[1];
            String patronymic = split[2];
            String surname = split[3];
            int year = Integer.parseInt(split[4]);
            int month = Integer.parseInt(split[5]);
            int day = Integer.parseInt(split[6]);
            String address = split[7];
            String phone = split[8];
            String faculty = split[9];
            int course = Integer.parseInt(split[10]);
            String group = split[11];

            stud[i] = new Student(id, surname, name, patronymic,
                    new GregorianCalendar(year, month, day),
                    address, phone, faculty, course, group);

            BSUIR.AddStudent(stud[i]);

            // также чтение файла построчно после каждой итерации
            i++;
            line = reader.readLine();
        }

        // критерии отбора по списку
        String faculty = "Инфокоммуникаций";
        int course = 3;
        GregorianCalendar birthday =
                new GregorianCalendar(2002, Calendar.NOVEMBER, 1);
        String group = "123456";

        System.out.println("Список студентов БГУИРа");
        boolean isInMainCycle = true;
        while (isInMainCycle) {
            System.out.println("Что вывести?");
            System.out.println("-1) Изменить поиск студентов по ключевым словам");
            System.out.println("0) Выход из списка");
            System.out.println("1) Информацию о всех введенных студентах");
            System.out.println("2) Список студентов заданного факультета");
            System.out.println("3) Списки студентов для каждого факультета и курса");
            System.out.println("4) Список студентов, родившихся после заданного года");
            System.out.println("5) Список учебной группы");

            Scanner s = new Scanner(System.in);
            switch (s.next()) {
                case "-1":
                    boolean isInCycle = true;
                    while (isInCycle) {
                        System.out.println("По умолчанию:");
                        System.out.println("Факультет: " + faculty);
                        System.out.println("Курс: " + course);
                        System.out.println("Дата рождения: " + birthday.get(Calendar.YEAR) + "." +
                                birthday.get(Calendar.MONTH) + "." + birthday.get(Calendar.DAY_OF_MONTH));
                        System.out.println("Группа: " + group);

                        System.out.println("\nЧто изменить?");
                        System.out.println("0) Ничего (или выйти из этого меню)");
                        System.out.println("1) Факультет");
                        System.out.println("2) Курс");
                        System.out.println("3) Дату рождения");
                        System.out.println("4) Группу");

                        switch (s.next()) {
                            case "0":
                                isInCycle = false;
                                break;
                            case "1":
                                System.out.print("Введите факультет: ");
                                faculty = Return_String();
                                break;
                            case "2":
                                System.out.print("Введите курс: ");
                                int c = s.nextInt();
                                course = c;
                                break;
                            case "3":
                                System.out.print("Введите год рождения: ");
                                int year = s.nextInt();
                                System.out.print("Введите месяц рождения: ");
                                int month = s.nextInt();
                                System.out.print("Введите день (месяца) рождения: ");
                                int day_of_month = s.nextInt();

                                birthday = new GregorianCalendar(year, month, day_of_month);
                                break;
                            case "4":
                                System.out.print("Введите группу: ");
                                group = Return_String();
                                break;
                        }
                    }
                    break;
                case "0":
                    isInMainCycle = false;
                    break;
                case "1":
                    System.out.println("----------------------------");
                    BSUIR.Print_Info();
                    System.out.println("----------------------------");
                    break;
                case "2":
                    System.out.println("----------------------------");
                    BSUIR.Find_List_By_Faculty(faculty);
                    System.out.println("----------------------------");
                    break;
                case "3":
                    System.out.println("----------------------------");
                    BSUIR.Find_List_By_Faculty_And_Course(faculty, course);
                    System.out.println("----------------------------");
                    break;
                case "4":
                    System.out.println("----------------------------");
                    BSUIR.Find_List_By_Year(birthday);
                    System.out.println("----------------------------");
                    break;
                case "5":
                    System.out.println("----------------------------");
                    BSUIR.Find_List_By_Group(group);
                    System.out.println("----------------------------");
                    break;
                default:
                    System.out.println("Некорректный ввод!");
                    break;
            }
        }
    }

    private static void Task2() throws IOException {
        File file = new File("patients_polyclinic");
        FileReader fr = new FileReader(file);
        BufferedReader reader = new BufferedReader(fr);

        FileInputStream fis = new FileInputStream(file);
        byte[] byteArray = new byte[(int) file.length()];
        fis.read(byteArray);
        String data = new String(byteArray);
        String[] stringArray = data.split("\r\n");

        final int size = stringArray.length;

        String line = reader.readLine();

        Patient[] pat = new Patient[size];
        Hospital polyclinic = new Hospital();

        int i = 0;
        while (line != null) {
            String[] split = line.split(" ");

            int id = Integer.parseInt(split[0]);
            String name = split[1];
            String surname = split[2];
            String patronymic = split[3];
            String address = split[4];
            String phone = split[5];
            int cardNumber = Integer.parseInt(split[6]);
            String diagnoses = split[7];

            pat[i] = new Patient(id, name, surname, patronymic,
                    address, phone, cardNumber, diagnoses);

            polyclinic.AddPatients(pat[i]);

            i++;
            line = reader.readLine();
        }

        String diagnoses = "Здоров";
        int min = 1100, max = 1300;

        System.out.println("Список пациентов поликлиники");
        boolean isInMainCycle = true;
        while (isInMainCycle) {
            System.out.println("Что вывести?");
            System.out.println("-1) Изменить поиск пациентов по ключевым словам");
            System.out.println("0) Выход из списка");
            System.out.println("1) Информацию о всех введенных пациентах");
            System.out.println("2) Список пациентов по данному диагнозу");
            System.out.println("3) Список пациентов по медкарте из заданного промежутка");

            Scanner s = new Scanner(System.in);
            switch (s.next()) {
                case "-1":
                    boolean isInCycle = true;
                    while (isInCycle) {
                        System.out.println("По умолчанию:");
                        System.out.println("Диагноз: " + diagnoses);
                        System.out.printf("Номера медицинских карт(диапазон)\n" +
                                "Min: %d, Max: %d\n", min, max);

                        System.out.println("\nЧто изменить?");
                        System.out.println("0) Ничего (или выйти из этого меню)");
                        System.out.println("1) Диагноз");
                        System.out.println("2) Диапазон номеров медкарт");

                        switch (s.next()) {
                            case "0":
                                isInCycle = false;
                                break;
                            case "1":
                                System.out.print("Введите диагноз: ");
                                diagnoses = Return_String();
                                break;
                            case "2":
                                System.out.println("Введите нижний и верхний диапазон: ");

                                System.out.print("Min: ");
                                int l = s.nextInt();
                                min = l;

                                System.out.print("Max: ");
                                int h = s.nextInt();
                                max = h;
                                break;
                        }
                    }
                    break;
                case "0":
                    isInMainCycle = false;
                    break;
                case "1":
                    System.out.println("----------------------------");
                    polyclinic.Print_Info();
                    System.out.println("----------------------------");
                    break;
                case "2":
                    System.out.println("----------------------------");
                    polyclinic.Find_List_By_Diagnosis(diagnoses);
                    System.out.println("----------------------------");
                    break;
                case "3":
                    System.out.println("----------------------------");
                    polyclinic.Find_List_By_MedCards_In_Range(min, max);
                    System.out.println("----------------------------");
                    break;
            }
        }
    }

    private static void Task3() throws IOException {
        File file = new File("abiturient_exam");
        FileReader fr = new FileReader(file);
        BufferedReader reader = new BufferedReader(fr);

        FileInputStream fis = new FileInputStream(file);
        byte[] byteArray = new byte[(int) file.length()];
        fis.read(byteArray);
        String data = new String(byteArray);
        String[] stringArray = data.split("\r\n");

        final int size = stringArray.length;

        String line = reader.readLine();

        Abiturient[] abiturients = new Abiturient[size];
        Exam exam = new Exam();

        int i = 0;
        while (line != null) {
            String[] split = line.split(" ");

            int id = Integer.parseInt(split[0]);
            String name = split[1];
            String surname = split[2];
            String patronymic = split[3];
            String address = split[4];
            String phone = split[5];
            int[] marks = {
                    Integer.parseInt(split[6]),
                    Integer.parseInt(split[7]),
                    Integer.parseInt(split[8]),
                    Integer.parseInt(split[9]),
                    Integer.parseInt(split[10])
            };

            abiturients[i] = new Abiturient(id, name, surname, patronymic, address, phone, marks);
            exam.AddAbiturient(abiturients[i]);

            i++;
            line = reader.readLine();
        }

        int minMark = 4;
        float averageMark = 7.5f;
        int countBestAbitur = 2;

        System.out.println("Список абитуриентов");
        boolean isInMainCycle = true;
        while (isInMainCycle) {
            System.out.println("Что вывести?");
            System.out.println("-1) Изменить поиск абитуриентов по ключевым словам");
            System.out.println("0) Выход из списка");
            System.out.println("1) Информацию о всех введенных абитуриентах");
            System.out.println("2) Список абитуриентов имеющих неудовлетворительные оценки");
            System.out.println("3) Список абитуриентов, средний балл у которых выше заданного");
            System.out.println("4) Выбрать  заданное  число n абитуриентов,  имеющих  самый  высокий");
            System.out.println("средний  балл  (вывести  также полный  список");
            System.out.println("абитуриентов,  имеющих полупроходной балл).");

            Scanner s = new Scanner(System.in);
            switch (s.next()) {
                case "-1":
                    boolean isInCycle = true;
                    while (isInCycle) {
                        System.out.println("По умолчанию:");
                        System.out.println("Неудовлетворительная оценка: " + minMark);
                        System.out.println("Средний балл: " + averageMark);
                        System.out.println("Количество ТОП: " + countBestAbitur);

                        System.out.println("\nЧто изменить?");
                        System.out.println("0) Ничего (или выйти из этого меню)");
                        System.out.println("1) Неудовлетворительную оценку");
                        System.out.println("2) Средний балл");
                        System.out.println("3) Количество ТОП");

                        switch (s.next()) {
                            case "0":
                                isInCycle = false;
                                break;
                            case "1":
                                System.out.print("Введите неудовлетворительную оценку: ");
                                int m = s.nextInt();
                                minMark = m;
                                break;
                            case "2":
                                System.out.println("Введите cредний балл: ");
                                float a = s.nextFloat();
                                averageMark = a;
                                break;
                            case "3":
                                System.out.println("Введите количество ТОП: ");
                                int c = s.nextInt();
                                countBestAbitur = c;
                                break;
                        }
                    }
                    break;
                case "0":
                    isInMainCycle = false;
                    break;
                case "1":
                    System.out.println("----------------------------");
                    exam.Print_Info();
                    System.out.println("----------------------------");
                    break;
                case "2":
                    System.out.println("----------------------------");
                    exam.Find_List_By_Bad_Mark(minMark);
                    System.out.println("----------------------------");
                    break;
                case "3":
                    System.out.println("----------------------------");
                    exam.Find_List_By_More_Average(averageMark);
                    System.out.println("----------------------------");
                    break;
                case "4":
                    System.out.println("----------------------------");
                    exam.Find_List_By_Most_Average_Mark(countBestAbitur);
                    System.out.println("----------------------------");
                    break;
            }
        }
    }

    private static void Task4() throws IOException {
        File file = new File("house_accomodation");
        FileReader fr = new FileReader(file);
        BufferedReader reader = new BufferedReader(fr);

        FileInputStream fis = new FileInputStream(file);
        byte[] byteArray = new byte[(int) file.length()];
        fis.read(byteArray);
        String data = new String(byteArray);
        String[] stringArray = data.split("\r\n");

        final int size = stringArray.length;

        String line = reader.readLine();

        House[] houses = new House[size];
        Accomodation accomodation = new Accomodation();

        int i = 0;
        while (line != null) {
            String[] split = line.split(" ");

            int id = Integer.parseInt(split[0]);
            int number = Integer.parseInt(split[1]);
            float square = Float.parseFloat(split[2]);
            int floor = Integer.parseInt(split[3]);
            int rooms = Integer.parseInt(split[4]);
            String street = split[5];
            String type = split[6];
            int lifetime = Integer.parseInt(split[7]);

            houses[i] = new House(id, number, square, floor, rooms, street, type, lifetime);
            accomodation.AddHouse(houses[i]);

            i++;
            line = reader.readLine();
        }

        int rooms = 3, minF = 4, maxF = 8;
        float square = 243.5f;

        System.out.println("Список домов");
        boolean isInMainCycle = true;
        while (isInMainCycle) {
            System.out.println("Что вывести?");
            System.out.println("-1) Изменить поиск домов по ключевым словам");
            System.out.println("0) Выход из списка");
            System.out.println("1) Информацию о всех введенных домах");
            System.out.println("2) Список квартир, имеющих заданное число комнат");
            System.out.println("3) Список квартир, имеющих заданное число комнат и\n" +
                    "расположенных на этаже, который находится в заданном промежутке");
            System.out.println("4) Список квартир, имеющих площадь, превосходящую заданную");

            Scanner s = new Scanner(System.in);
            switch (s.next()) {
                case "-1":
                    boolean isInCycle = true;
                    while (isInCycle) {
                        System.out.println("По умолчанию:");
                        System.out.println("Кол-во комнат: " + rooms);
                        System.out.println("Нижний этаж: " + minF);
                        System.out.println("Верхний этаж: " + maxF);
                        System.out.println("Площадь: " + square);

                        System.out.println("\nЧто изменить?");
                        System.out.println("0) Ничего (или выйти из этого меню)");
                        System.out.println("1) Кол-во комнат");
                        System.out.println("2) Промежуток этажей");
                        System.out.println("3) Площадь");

                        switch (s.next()) {
                            case "0":
                                isInCycle = false;
                                break;
                            case "1":
                                System.out.print("Введите кол-во комнат: ");
                                int r = s.nextInt();
                                rooms = r;
                                break;
                            case "2":
                                System.out.println("Введите нижний этаж: ");
                                int low = s.nextInt();
                                minF = low;

                                System.out.println("Введите верхний этаж: ");
                                int high = s.nextInt();
                                maxF = high;
                                break;
                            case "3":
                                System.out.println("Введите площадь: ");
                                float sq = s.nextFloat();
                                square = sq;
                                break;
                        }
                    }
                    break;
                case "0":
                    isInMainCycle = false;
                    break;
                case "1":
                    System.out.println("----------------------------");
                    accomodation.PrintInfoList();
                    System.out.println("----------------------------");
                    break;
                case "2":
                    System.out.println("----------------------------");
                    accomodation.FindListByAmountRoom(rooms);
                    System.out.println("----------------------------");
                    break;
                case "3":
                    System.out.println("----------------------------");
                    accomodation.FindListByAmountRoomAndFloorInRange(rooms, minF, maxF);
                    System.out.println("----------------------------");
                    break;
                case "4":
                    System.out.println("----------------------------");
                    accomodation.FindListByMoreSquare(square);
                    System.out.println("----------------------------");
                    break;
            }
        }
    }

    private static void Task5() throws IOException {
        File file = new File("car_shop");
        FileReader fr = new FileReader(file);
        BufferedReader reader = new BufferedReader(fr);

        FileInputStream fis = new FileInputStream(file);
        byte[] byteArray = new byte[(int) file.length()];
        fis.read(byteArray);
        String data = new String(byteArray);
        String[] stringArray = data.split("\r\n");

        final int size = stringArray.length;

        String line = reader.readLine();

        Car[] car = new Car[size];
        Shop shop = new Shop();

        int i = 0;
        while (line != null) {
            String[] split = line.split(" ");

            int id = Integer.parseInt(split[0]);
            String brand = split[1];
            String model = split[2];
            int year = Integer.parseInt(split[3]);
            String color = split[4];
            float price = Float.parseFloat(split[5]);
            String regNumber = split[6];

            car[i] = new Car(id, brand, model, year, color, price, regNumber);
            shop.AddCar(car[i]);

            i++;
            line = reader.readLine();
        }

        String brand = "BMW";
        int year = 5;
        float price = 10000.6f;

        System.out.println("Список автомобилей");
        boolean isInMainCycle = true;
        while (isInMainCycle) {
            System.out.println("Что вывести?");
            System.out.println("-1) Изменить поиск автомобилей по ключевым словам");
            System.out.println("0) Выход из списка");
            System.out.println("1) Информацию о всех введенных автомобилях");
            System.out.println("2) Список автомобилей заданной марки");
            System.out.println("3) Список  автомобилей  заданной  модели,\n" +
                    "которые  эксплуатируются больше n лет");
            System.out.println("4) Список  автомобилей  заданного  года  выпуска,\n" +
                    "цена  которых  больше указанной");

            Scanner s = new Scanner(System.in);
            switch (s.next()) {
                case "-1":
                    boolean isInCycle = true;
                    while (isInCycle) {
                        System.out.println("По умолчанию:");
                        System.out.println("Марка: " + brand);
                        System.out.println("Год: " + year);
                        System.out.println("Цена: " + price);

                        System.out.println("\nЧто изменить?");
                        System.out.println("0) Ничего (или выйти из этого меню)");
                        System.out.println("1) Марку");
                        System.out.println("2) Год");
                        System.out.println("3) Цену");

                        switch (s.next()) {
                            case "0":
                                isInCycle = false;
                                break;
                            case "1":
                                System.out.print("Введите марку: ");
                                brand = Return_String();
                                break;
                            case "2":
                                System.out.println("Введите год: ");
                                int y = s.nextInt();
                                year = y;
                                break;
                            case "3":
                                System.out.println("Введите цену: ");
                                float p = s.nextFloat();
                                price = p;
                                break;
                        }
                    }
                    break;
                case "0":
                    isInMainCycle = false;
                    break;
                case "1":
                    System.out.println("----------------------------");
                    shop.PrintInfoList();
                    System.out.println("----------------------------");
                    break;
                case "2":
                    System.out.println("----------------------------");
                    shop.FindListByBrand(brand);
                    System.out.println("----------------------------");
                    break;
                case "3":
                    System.out.println("----------------------------");
                    shop.FindListByIssueYear(brand, year);
                    System.out.println("----------------------------");
                    break;
                case "4":
                    System.out.println("----------------------------");
                    shop.FindListByPriceMore(year, price);
                    System.out.println("----------------------------");
                    break;
            }
        }
    }

    private static String Return_String() {
        Scanner scanner = new Scanner(System.in);
        String str = "";
        if (scanner.hasNextLine())
            str = scanner.nextLine();
        return str;
    }

    private static void Task6() {
        Circle[] circles = new Circle[4];
        circles[0] = new Circle();
        circles[1] = new Circle(2.5);
        circles[2] = new Circle(3, 4);
        circles[3] = new Circle(7.5, 5, 4);

        System.out.println("Класс Круг");
        boolean isInMainCycle = true;
        while (isInMainCycle) {
            System.out.println("0) Выйти из класса");
            System.out.println("1) Вывести 0 элемент масссива класса");
            System.out.println("2) Вывести 1 элемент масссива класса");
            System.out.println("3) Вывести 2 элемент масссива класса");
            System.out.println("4) Вывести 3 элемент масссива класса");
            System.out.println("5) Все сразу");

            Scanner s = new Scanner(System.in);
            switch (s.nextLine()) {
                case "0":
                    isInMainCycle = false;
                    break;
                case "1":
                    RealiseCircle(circles, 0);
                    break;
                case "2":
                    RealiseCircle(circles, 1);
                    break;
                case "3":
                    RealiseCircle(circles, 2);
                    break;
                case "4":
                    RealiseCircle(circles, 3);
                    break;
                case "5":
                    for (int i = 0; i < circles.length; i++)
                        RealiseCircle(circles, i);
                    break;
                default:
                    System.out.println("Некорректный ввод!");
                    break;
            }
        }
    }

    private static void RealiseCircle(Circle[] c, int i) {
        Print(c[i].GetCharacteristics());
        Print("Square: " + c[i].GetSquare());
        Print("Length: " + c[i].GetLengthCircle());

        c[i].ChangeXAndY(2.5, 2.5);
        c[i].ChangeRadius(10);

        System.out.println("--------------------");

        Print(c[i].GetCharacteristics());
        Print("Square: " + c[i].GetSquare());
        Print("Length: " + c[i].GetLengthCircle());

        System.out.println("++++++++++++++++++++");
    }

    private static void Task7() {
        Storage[] store = new Storage[2];
        store[0] = new Storage();
        store[1] = new Storage(100, 2.5f);

        System.out.println("Класс Склад");
        boolean isInMainCycle = true;
        while (isInMainCycle) {
            System.out.println("0) Выйти из класса");
            System.out.println("1) Вывести 0 элемент масссива класса");
            System.out.println("2) Вывести 1 элемент масссива класса");
            System.out.println("3) Все сразу");

            Scanner s = new Scanner(System.in);
            switch (s.nextLine()) {
                case "0":
                    isInMainCycle = false;
                    break;
                case "1":
                    RealiseStorage(store, 0);
                    break;
                case "2":
                    RealiseStorage(store, 1);
                    break;
                case "3":
                    for (int i = 0; i < store.length; i++)
                        RealiseStorage(store, i);
                    break;
                default:
                    System.out.println("Некорректный ввод!");
                    break;
            }
        }
    }

    private static void RealiseStorage(Storage[] s, int i) {
        Print(s[i].GetInfo());
        Print(s[i].ComparePrice(10.5f));

        s[i].ChangeCountProduct(50);
        s[i].ChangePrice(5.2f);

        System.out.println("--------------------");

        Print(s[i].GetInfo());

        System.out.println("++++++++++++++++++++");
    }

    private static void Task8() {
        Book book1 = new Book();
        book1.FindInfoAboutBook("Собачье сердце");

        System.out.println();

        book1.SetAuthor();
        book1.SetName();
        book1.SetYear();
        book1.SetPages();
        book1.FindInfoAboutBook("Мы");

        System.out.println("--------------------");

        Book book2 = new Book("Свифт Джонатан",
                "Путешествия Гулливера", 1727, 400);
        book2.FindInfoAboutBook("Путешествия Гулливера");

        System.out.println();

        book2.SetAuthor("Джордж Оруэлл");
        book2.SetName("1984");
        book2.SetYear(1949);
        book2.SetPages(318);
        book2.FindInfoAboutBook("1984");

        System.out.println("++++++++++++++++++++");
    }

    private static void Task9() {
        Fraction fraction = new Fraction();
        System.out.println("Default: " + fraction);

        fraction.simplify();
        System.out.println("Simplified: " + fraction);

        fraction.add(new Fraction(4, 5), new Fraction(51, 15));
        System.out.println("Added 4/5 and 51/15: " + fraction);

        fraction.subtract(new Fraction(3, 5));
        System.out.println("Subtracted 3/5: " + fraction);

        fraction.multiply(new Fraction(3, 4));
        System.out.println("Multiplied 3/4: " + fraction);

        fraction.divide(new Fraction(1, 3));
        System.out.println("Divided 1/3: " + fraction);

        System.out.println("---");

        Fraction.createAndPrintArray();

        System.out.println("---");

        Fraction[] arr1 = {
                new Fraction(1, 5),
                new Fraction(4, 5),
                new Fraction(1, 3),
                new Fraction(3, 4),
                new Fraction(6, 7)
        };

        Fraction.changeObjArray(arr1);

        for (var a : arr1)
            System.out.println(a);

        System.out.println("---");

        Fraction[] arr2 = {
                new Fraction(),
                new Fraction(2, 3),
                new Fraction(3, 4),
                new Fraction(4, 3)
        };

        Fraction.changeObjArray(arr2);

        for (var a : arr2)
            System.out.println(a);

        System.out.println("++++++++++++++++++++");
    }

    private static void Task10() {
        double[] v1 = {1, 2, 4};
        double[] v2 = {2, 7, -1};
        double[] v3 = {1, 3, 6};
        double[] v4 = {10, 5, -2};
        double[] v5 = {-1, 6, 3};

        Vector vector = new Vector(v1);

        System.out.println("First vector");
        vector.printVector(v1);
        System.out.println("Second vector");
        vector.printVector(v2);
        System.out.println("Thirsty vector");
        vector.printVector(v3);
        System.out.println("Fourth vector");
        vector.printVector(v4);
        System.out.println("Fifth vector");
        vector.printVector(v5);
        System.out.println();

        vector.add(v2);
        System.out.println("Add");
        vector.printVector();
        System.out.println();

        vector.subtract(v3);
        System.out.println("Subtract");
        vector.printVector();
        System.out.println();

        vector.multiply(v4);
        System.out.println("Multiply");
        vector.printVector();
        System.out.println();

        vector.divide(v5);
        System.out.println("Divide");
        vector.printVector();
        System.out.println();

        vector.increase();
        System.out.println("Increase");
        vector.printVector();
        System.out.println();

        vector.decrease();
        System.out.println("Decrease");
        vector.printVector();
        System.out.println();

        Vector[] vectors = {
                new Vector(v2),
                new Vector(v3),
                new Vector(v4),
                new Vector(v5),
        };

        for (int i = 0; i < vectors.length - 1; i++) {
            System.out.println("---");
            double sP = vectors[i].getScalarProduct(vectors[i + 1].getVector());
            System.out.println("Scalar product: " + sP);
            double vL = vectors[i].getVectorLength();
            System.out.println("Vector length: " + vL);
            double angle = vectors[i].findVectorAngle(vectors[i + 1].getVector());
            System.out.println("Vector angle: " + angle);
        }

        System.out.println("++++++++++++++++++++");
    }

    private static void Task11() {
        char[] c = {'c', '3', 'r', 'q', 'a', 'u'};
        char[] c1 = {'3', 'z', 'r', 'x', 'c'};
        char[] c2 = {'a', 'b', 'c'};
        char[] c3 = {'c', 'd', 'a', 'u'};
        char[] c4 = {'!', '3', 'q', '@', '/', '#'};

        MultiSymPower msp = new MultiSymPower(c);
        msp.printC();
        msp.printC(c1);
        System.out.println("---");
        msp.getInfoOperations(c1);
        System.out.println("---");
        msp.printC(c2);
        msp.add(c2);
        msp.printC();
        System.out.println("---");
        msp.printC(c3);
        msp.subtract(c3);
        msp.printC();
        System.out.println("---");
        msp.printC(c4);
        msp.multiply(c4);
        msp.printC();
        System.out.println("---");
        msp.findElementByIndex(1);
        msp.findElementByIndex(32);
        System.out.println("---");
        msp.toAssignment(2, '8');
        msp.printC();

        MultiSymPower[] array = {
                new MultiSymPower(new char[]{'1','3','a'}),
                new MultiSymPower(new char[]{'a','e','-'}),
                new MultiSymPower(new char[]{'-','+','q'}),
                new MultiSymPower(new char[]{'+','#','j'}),
                new MultiSymPower(new char[]{'j','k','a'}),
                new MultiSymPower(new char[]{'k','r','p'})
        };

        System.out.println("Object array:");

        for (int i = 0; i < array.length - 1; i++)
            array[i].printC();
        System.out.println();

        for (int i = 0; i < array.length - 1; i++){
            System.out.println(i + 1 + " ***");
            char[] symbols = MultiSymPower.InnerTool.GetDeal(array[i], array[i + 1], true);
            for (int j = 0; j < symbols.length; j++)
                System.out.print(symbols[j] + " ");
            System.out.println();
            System.out.println();
        }

        System.out.println("++++++++++++++++++++");
    }

    private static void Task12() {
        QuaEquation[] quaEquations = {
                new QuaEquation(3,2,-1),
                new QuaEquation(0,6,59),
                new QuaEquation(5,-10,1),
                new QuaEquation(-1,-2,3),
                new QuaEquation(7,6,-1),
                new QuaEquation(),
                new QuaEquation(-2),
                new QuaEquation(-1,3),
                new QuaEquation(1,6, 9)
        };

        for (var qe : quaEquations) {
            int i = 0;
            System.out.println(++i);
            System.out.println(qe);
            System.out.println("Discriminant: " + qe.getDiscriminant());
            System.out.println("Root or roots: " + Arrays.toString(qe.findX()));
            System.out.println("Increasing interval: " +
                    Arrays.toString(qe.getIncreasingInterval()));
            System.out.println("Decreasing interval: " +
                    Arrays.toString(qe.getDecreasingInterval()));
            System.out.println(QuaEquation.PrintInfoMaxMixRoots(qe.findX()));
        }

        System.out.println("++++++++++++++++++++");
    }

    private static void Print(Object o) {
        System.out.println(o);
    }
}