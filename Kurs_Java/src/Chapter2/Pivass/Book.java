package Chapter2.Pivass;

import java.util.Scanner;

public class Book {
    private String author;
    private String name;
    private int year;
    private int pages;

    public Book(){
        author = "Булгаков М.А.";
        name = "Собачье сердце";
        year = 1925;
        pages = 120;
    }

    public Book(String author, String name, int year, int pages){
        this.author = author;
        this.name = name;
        this.year = year;
        this.pages = pages;
    }

    public void SetAuthor(){
        System.out.println("Введите автора: ");
        author = ReturnString();
    }

    public void SetAuthor(String author){
        this.author = author;
    }

    public void SetName(){
        System.out.println("Введите название произведения: ");
        name = ReturnString();
    }

    public void SetName(String name){
        this.name = name;
    }

    public void SetYear(){
        System.out.println("Введите год выпуска: ");
        year = ReturnInt();
    }

    public void SetYear(int year){
        this.year = year;
    }

    public void SetPages(){
        System.out.println("Введите количество страниц: ");
        pages = ReturnInt();
    }

    public void SetPages(int pages){
        this.pages = pages;
    }

    public void FindInfoAboutBook(String name){
        if (name.equals(this.name))
            System.out.printf("Автор: %s\nНазвание: %s\n" +
                    "Год выпуска: %d\nКоличество страниц: %d\n",
                    author, name, year, pages);
    }

    private int ReturnInt(){
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        if (scanner.hasNextInt())
            num = scanner.nextInt();
        return num;
    }

    private String ReturnString(){
        Scanner scanner = new Scanner(System.in);
        String str = "";
        if (scanner.hasNextLine())
            str = scanner.nextLine();
        return str;
    }

    // Замятин Е.И.
    // Мы
    // 1920
    // 288

    // Свифт Джонатан
    // Путешествия Гулливера
    // 1727
    // 400

    // Джордж Оруэлл
    // 1984
    // 1949
    // 318
}
