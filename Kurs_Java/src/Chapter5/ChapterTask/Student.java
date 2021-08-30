package Chapter5.ChapterTask;

import java.util.Comparator;
import java.util.LinkedList;

public class Student {
    private final String name;
    private final int course;

    public Student(String name, int course){
        this.name = name;
        this.course = course;
    }

    private String getName(){
        return name;
    }

    private int getCourse(){
        return course;
    }

    @Override
    public String toString(){
        return "Имя: " + getName() + " Курс: " + getCourse();
    }

    public static void printStudents(LinkedList<Student> students, int course){
        System.out.println("Студенты " + course + " курса:");

        for (Student student : students) {
            if (student.getCourse() == course)
                System.out.println(student.getName());
        }
    }

    public static void toUnion(LinkedList<Student> set1, LinkedList<Student> set2){
        set1.addAll(set2);
    }

    public static void toIntersect(LinkedList<Student> set1, LinkedList<Student> set2){
        set1.retainAll(set2);
    }

    public static void printList(LinkedList<Student> students){
        for (Student student : students) System.out.println(student);
    }

    public static Comparator<Student> comparator =
            Comparator.comparingInt(Student::getCourse).thenComparing(Student::getName);

    @Override
    public boolean equals(Object o){
        Student student = (Student) o;
        return getName().equals(student.getName()) &&
                getCourse() == student.getCourse();
    }
}