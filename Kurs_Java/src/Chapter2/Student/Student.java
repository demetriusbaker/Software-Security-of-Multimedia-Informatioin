package Chapter2.Student;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Student {
    // id, SNP, date of birth, address, telephone, faculty, course, group
    private int id;
    private int course;
    private String surname;
    private String name;
    private String patronymic;
    private String address;
    private String phone;
    private String faculty;
    private String group;
    private GregorianCalendar date_Birth;

    public Student(int id, String surname, String name, String patronymic,
                   GregorianCalendar date_Birth, String address, String phone,
                   String faculty, int course, String group){
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.date_Birth = date_Birth;
        this.address = address;
        this.phone = phone;
        this.faculty = faculty;
        this.course = course;
        this.group = group;
    }

    public int Get_Id(){
        return id;
    }

    public String Get_Surname(){
        return surname;
    }

    public String Get_Name(){
        return name;
    }

    public String Get_Patronymic(){
        return patronymic;
    }

    public GregorianCalendar Get_Date_Birth(){
        return date_Birth;
    }

    public String Get_Address(){
        return address;
    }

    public String Get_Phone(){
        return phone;
    }

    public String Get_Faculty(){
        return faculty;
    }

    public int Get_Course(){
        return course;
    }

    public String Get_Group(){
        return group;
    }

    @Override
    public String toString(){
        return "ID: " + Get_Id() + ";" + "\n" +
                "Фамилия: " + Get_Surname() + ";" + "\n" +
                "Имя: " + Get_Name() + ";" + "\n" +
                "Отчество: " + Get_Patronymic() + ";" + "\n" +
                "Дата рождения: " + Get_Date_Birth().get(Calendar.DAY_OF_MONTH) +
                "." + Get_Date_Birth().get(Calendar.MONTH) +
                "." + Get_Date_Birth().get(Calendar.YEAR) + ";" + "\n" +
                "Адрес: " + Get_Address() + ";" + "\n" +
                "Телефон: " + Get_Phone() + ";" + "\n" +
                "Факультет: " + Get_Faculty() + ";" + "\n" +
                "Курс: " + Get_Course() + ";" + "\n" +
                "Группа: " + Get_Group() + ";" + "\n";
    }
}