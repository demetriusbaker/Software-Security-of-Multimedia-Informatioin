package Chapter2.Student;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class University {
    private ArrayList<Student> students = new ArrayList<>();

    public void AddStudent(Student student) {
        students.add(student);
    }

    public void Print_Info(){
        for (var s : students)
            System.out.println(s);
    }

    public void Find_List_By_Faculty(String faculty){
        for (var s : students)
            if (s != null && faculty.equalsIgnoreCase(s.Get_Faculty()))
                System.out.println(s);
    }

    public void Find_List_By_Faculty_And_Course(String faculty, int course){
        for (var s : students)
            if (s != null && faculty.equalsIgnoreCase(s.Get_Faculty()) && s.Get_Course() == course)
                System.out.println(s);
    }

    public void Find_List_By_Group(String group){
        for (var s : students)
            if (s != null && group.equalsIgnoreCase(s.Get_Group()))
                System.out.println(s);
    }

    public void Find_List_By_Year(GregorianCalendar year){
        for (var s : students)
            if (s != null && s.Get_Date_Birth().get(Calendar.YEAR) > year.get(Calendar.YEAR))
                System.out.println(s);
    }
}