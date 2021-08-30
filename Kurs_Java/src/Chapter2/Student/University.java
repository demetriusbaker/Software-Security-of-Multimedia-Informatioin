package Chapter2.Student;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class University {
    private final ArrayList<Student> students = new ArrayList<>();

    public void addStudent(Student student) {
        students.add(student);
    }

    public void printInfo(){
        for (var s : students)
            System.out.println(s);
    }

    public void findListByFaculty(String faculty){
        for (var s : students)
            if (s != null && faculty.equalsIgnoreCase(s.getFaculty()))
                System.out.println(s);
    }

    public void findListByFacultyAndCourse(String faculty, int course){
        for (var s : students)
            if (s != null && faculty.equalsIgnoreCase(s.getFaculty()) && s.getCourse() == course)
                System.out.println(s);
    }

    public void findListByGroup(String group){
        for (var s : students)
            if (s != null && group.equalsIgnoreCase(s.getGroup()))
                System.out.println(s);
    }

    public void findListByYear(GregorianCalendar year){
        for (var s : students)
            if (s != null && s.getDateBirth().get(Calendar.YEAR) > year.get(Calendar.YEAR))
                System.out.println(s);
    }
}