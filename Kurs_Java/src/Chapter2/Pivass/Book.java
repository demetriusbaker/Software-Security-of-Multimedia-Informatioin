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

    public void setAuthor(){
        System.out.println("Введите автора: ");
        author = returnString();
    }

    public void setAuthor(String author){
        this.author = author;
    }

    public void setName(){
        System.out.println("Введите название произведения: ");
        name = returnString();
    }

    public void setName(String name){
        this.name = name;
    }

    public void setYear(){
        System.out.println("Введите год выпуска: ");
        year = returnInt();
    }

    public void setYear(int year){
        this.year = year;
    }

    public void setPages(){
        System.out.println("Введите количество страниц: ");
        pages = returnInt();
    }

    public void setPages(int pages){
        this.pages = pages;
    }

    public void findInfoAboutBook(String name){
        if (name.equals(this.name))
            System.out.printf("""
                            Автор: %s
                            Название: %s
                            Год выпуска: %d
                            Количество страниц: %d
                            """,
                    author, name, year, pages);
    }

    private int returnInt(){
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        if (scanner.hasNextInt())
            num = scanner.nextInt();
        return num;
    }

    private String returnString(){
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
