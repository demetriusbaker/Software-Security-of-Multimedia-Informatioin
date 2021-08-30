package Chapter2.Student;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Student {
    // id, SNP, date of birth, address, telephone, faculty, course, group
    private final int id;
    private final int course;
    private final String surname;
    private final String name;
    private final String patronymic;
    private final String address;
    private final String phone;
    private final String faculty;
    private final String group;
    private final GregorianCalendar date_Birth;

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

    public int getId(){
        return id;
    }

    public String getSurname(){
        return surname;
    }

    public String getName(){
        return name;
    }

    public String getPatronymic(){
        return patronymic;
    }

    public GregorianCalendar getDateBirth(){
        return date_Birth;
    }

    public String getAddress(){
        return address;
    }

    public String getPhone(){
        return phone;
    }

    public String getFaculty(){
        return faculty;
    }

    public int getCourse(){
        return course;
    }

    public String getGroup(){
        return group;
    }

    @Override
    public String toString(){
        return "ID: " + getId() + ";" + "\n" +
                "Фамилия: " + getSurname() + ";" + "\n" +
                "Имя: " + getName() + ";" + "\n" +
                "Отчество: " + getPatronymic() + ";" + "\n" +
                "Дата рождения: " + getDateBirth().get(Calendar.DAY_OF_MONTH) +
                "." + getDateBirth().get(Calendar.MONTH) +
                "." + getDateBirth().get(Calendar.YEAR) + ";" + "\n" +
                "Адрес: " + getAddress() + ";" + "\n" +
                "Телефон: " + getPhone() + ";" + "\n" +
                "Факультет: " + getFaculty() + ";" + "\n" +
                "Курс: " + getCourse() + ";" + "\n" +
                "Группа: " + getGroup() + ";" + "\n";
    }
}