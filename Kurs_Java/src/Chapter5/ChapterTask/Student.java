package Chapter5.ChapterTask;

import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;

public class Student {
    private String name;
    private int course;

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

        Iterator<Student> is = students.iterator();
        while (is.hasNext()){
            var student = is.next();

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
        for (int i = 0; i < students.size(); i++)
            System.out.println(students.get(i));
    }

    public static Comparator<Student> comparator = new Comparator<Student>() {
        @Override
        public int compare(Student s1, Student s2) {
            int result = s1.getCourse() - s2.getCourse();
            return result != 0 ? result :
                    s1.getName().compareTo(s2.getName());
        }
    };

    @Override
    public boolean equals(Object o){
        Student student = (Student) o;
        return getName().equals(student.getName()) &&
                getCourse() == student.getCourse();
    }
}