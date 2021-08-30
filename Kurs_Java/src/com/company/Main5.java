package com.company;

import Chapter5.ChapterTask.*;
import Chapter5.Education.*;

import java.util.*;

public class Main5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        boolean isExit = false;

        while (!isExit){
            System.out.println("Выберите действие");
            System.out.println("0) Выйти");
            System.out.println("1) Примеры");
            System.out.println("2) Задачи");

            switch (s.nextLine()) {
                case "0" -> isExit = true;
                case "1" -> showEducation();
                case "2" -> showTask();
                default -> System.out.println("Неверный ввод!");
            }
        }
    }

    public static void showEducation(){
        Scanner s = new Scanner(System.in);
        boolean isExit = false;

        while (!isExit){
            System.out.println("0) Выйти из списка");
            System.out.println("1) Общие сведения об универсальных типах");
            System.out.println("2) Универсальныйкласс с двумя параметрами типа");
            System.out.println("3) Ограниченные типы");
            System.out.println("4) Использование групповых параметров");
            System.out.println("5) Универсальные методы");
            System.out.println("6) Универсальные интерфейсы");
            System.out.println("7) Класс ArrayList");
            System.out.println("8) Класс HashSet");
            System.out.println("9) Класс TreeSet");
            System.out.println("10) Доступ к коллекции через итератор");

            switch (s.nextLine()){
                case "0" -> isExit = true;
                case "1" -> Education.showExample1();
                case "2" -> Education.showExample2();
                case "3" -> {
                    Education.showExample3();
                    TaskWork.showTask53();
                }
                case "4" -> Education.showExample4();
                case "5" -> {
                    Education.showExample5();
                    Education.showExample6();
                }
                case "6" -> {
                    Education.showExample7();
                    TaskWork.showTask56();
                }
                case "7" -> {
                    Education.showExample8();
                    TaskWork.showTask591();
                }
                case "8" -> Education.showExample9();
                case "9" -> {
                    Education.showExample10();
                    Education.showExample11();
                }
                case "10" -> Education.showExample12();
                default -> System.out.println("Неверный ввод!");
            }
        }
    }

    public static void showTask(){
        Scanner s = new Scanner(System.in);
        boolean isExit = false;

        while (!isExit){
            System.out.println("0) Выйти из списка");
            System.out.println("1) Класс Студент");
            System.out.println("2) Переставить \"-\" элементы данного списка в конец, " +
                    "а \"+\" в начало этого списка");
            System.out.println("3) ArrayList и LinkedList");
            System.out.println("4) Список целых чисел и X");
            System.out.println("5) Попарное суммирование");
            System.out.println("6) Реализации структуры хранения");

            switch (s.nextLine()){
                case "0" -> isExit = true;
                case "1" -> realiseFirstTask();
                case "2" -> realiseSecondTask();
                case "3" -> realiseThirstyTask();
                case "4" -> realiseFourthTask();
                case "5" -> realiseFifthTask();
                case "6" -> realiseSixthTask();
                default -> System.out.println("Неверный ввод!");
            }
        }
    }

    public static void realiseFirstTask(){
        System.out.println("----------------------------");
        System.out.println("Первый список");

        Student[] students = {
                new Student("Кирильчук", 2),
                new Student("Таракашенко", 3),
                new Student("Войтенко", 1),
                new Student("Раенок", 2),
                new Student("Новиков", 1),
                new Student("Шевцов", 3),
                new Student("Панасюк", 4),
                new Student("Орехва", 3),
                new Student("Астапашонок", 4),
                new Student("Данченко", 2)
        };

        LinkedList<Student> listStudent = new LinkedList<>(Arrays.asList(students));

        Student.printList(listStudent);
        Student.printStudents(listStudent, 3);

        System.out.println("----------------------------");
        System.out.println("Второй список");

        Student[] students2 = {
                new Student("Егерев", 4),
                new Student("Синявский", 2),
                new Student("Шишло", 1),
                new Student("Чекан", 2),
                new Student("Бахмат", 3)
        };

        LinkedList<Student> listStudent2 = new LinkedList<>(Arrays.asList(students2));

        Student.printList(listStudent2);
        Student.printStudents(listStudent2, 2);

        System.out.println("----------------------------");
        System.out.println("Третий список");

        LinkedList<Student> listStudent3 = new LinkedList<>();
        listStudent3.add(new Student("Кукин", 1));
        listStudent3.add(new Student("Прищепа", 2));
        listStudent3.add(new Student("Кирильчук", 2));
        listStudent3.add(new Student("Власова", 2));
        listStudent3.add(new Student("Савилова", 1));

        Student.printList(listStudent3);
        Student.printStudents(listStudent3, 1);

        System.out.println("----------------------------");
        System.out.println("Объединение");

        Student.toUnion(listStudent, listStudent2);
        Collections.sort(listStudent, Student.comparator);
        Student.printList(listStudent);

        System.out.println("----------------------------");
        System.out.println("Пересечение");

        Student.toIntersect(listStudent, listStudent3);
        Collections.sort(listStudent, Student.comparator);
        Student.printList(listStudent);

        System.out.println("----------------------------");
        System.out.println("Проверка сортировки с помощью TreeSet");

        TreeSet<Student> treeSet = new TreeSet<>(Student.comparator);
        Collections.addAll(treeSet, students);
        Collections.addAll(treeSet, students2);

        for (var ts : treeSet)
            System.out.println(ts);
        System.out.println();

        System.out.println("Вывод: все работает (в трисет закинул студ.компаратор)!");
        System.out.println("++++++++++++++++++++++++++++");
    }

    public static void realiseSecondTask(){
        class SortingList<T extends Number> {
            public void sortPlusMinus(List<T> list) {
                for (int i = 0; i < list.size(); i++) {
                    T min = list.get(i);
                    int minIndex = i;

                    for (int j = i + 1; j < list.size(); j++)
                        if (min.doubleValue() < list.get(j).doubleValue()) {
                            // изменил ">" на "<" для изменения списка
                            // теперь список идет по убыванию
                            min = list.get(j);
                            minIndex = j;
                        }

                    if (i != minIndex) {
                        T buf1 = list.get(i), buf2 = list.get(minIndex);
                        list.set(i, buf2);
                        list.set(minIndex, buf1);
                    }
                }
            }
        }
        SortingList sl = new SortingList<>();

        List<Integer> list;
        Integer[] arr1 = {1,-2,-8,4,8,0,3,-5,-3,7,-4,9};
        list = Arrays.asList(arr1);

        System.out.println("До: " + list);

        sl.sortPlusMinus(list);

        System.out.println("После: " + list);

        List<Float> list2;
        Float[] arr2 = {3.14f, -2.34f, 1.23f, -8.56f, 9.99f, 1.23f, -2.14f, 5.45f};
        list2 = Arrays.asList(arr2);

        System.out.println("До: " + list2);

        sl.sortPlusMinus(list2);

        System.out.println("После: " + list2);

        System.out.println("++++++++++++++++++++++++++++");
    }

    public static void realiseThirstyTask(){
        String[] names = {
                "Дима",
                "Вася",
                "Петя",
                "Миша",
                "Игорь",
                "Вова",
                "Кирилл",
                "Лёша",
                "Антон",
                "Андрей",
                "Саша",
                "Рома",
        };

        ArrayList<Person> al = new ArrayList<>();
        LinkedList<Person> ll = new LinkedList<>();
        for (int i = 0; i < names.length; i++){
            al.add(new Person(i + 1, names[i]));
            ll.add(new Person(i + 1, names[i]));
        }

        System.out.println("ArrayList:");

        Person.printList(al);

        while (al.size() > 1) {
            int size = al.size();
            for (int i = 1; i <= size / 2; i++)
                al.remove(i);

            Person.printList(al);
        }

        System.out.println("LinkedList:");

        Person.printList(ll);

        while (ll.size() > 1) {
            int size = ll.size();
            for (int i = 1; i <= size / 2; i++)
                ll.remove(i);

            Person.printList(ll);
        }

        System.out.println("++++++++++++++++++++++++++++");
    }

    public static void realiseFourthTask(){
        List<Integer> list = new LinkedList<>();
        list.add(13);
        list.add(64);
        list.add(91);
        list.add(27);
        list.add(89);
        list.add(10);
        list.add(99);
        list.add(34);
        list.add(63);

        System.out.println("----------------------------");
        System.out.println(list);
        System.out.println("----------------------------");
        SortingClassX.sortSimple(list);
        System.out.println(list);
        SortingClassX.printByX(list, 60);

        System.out.println("++++++++++++++++++++++++++++");
    }

    public static void realiseFifthTask(){
        List<Integer> list = new LinkedList<>();
        list.add(5);
        list.add(8);
        list.add(1);
        list.add(3);
        list.add(5);
        list.add(4);
        list.add(2);

        System.out.println(list);

        while (list.size() != 1){
            for (int i = 0; i < list.size() - 1; i++)
                list.set(i, list.get(i) + list.get(i + 1));

            list.remove(list.size() - 1);

            System.out.println(list);
        }

        System.out.println("++++++++++++++++++++++++++++");
    }

    public static void realiseSixthTask(){
        NumberStructure ns = new NumberStructure();
        ns.addNumber(4);
        ns.addNumber(8);
        ns.addNumber(5);

        ns.getList();

        ns.deleteNumber();
        ns.deleteNumber(8);

        ns.getList();

        ns.addNumber(12);
        ns.addNumber(9);
        ns.addNumber(7);
        ns.addNumber(13);
        ns.addNumber(45);
        ns.addNumber(32);

        ns.getList();

        ns.findSimilarNumber(40);

        System.out.println("++++++++++++++++++++++++++++");
    }
}