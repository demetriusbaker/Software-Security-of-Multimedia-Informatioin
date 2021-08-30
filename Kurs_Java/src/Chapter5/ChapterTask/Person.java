package Chapter5.ChapterTask;

import java.util.List;

public class Person {
    private final int number;
    private final String name;

    public Person(int number, String name){
        this.number = number;
        this.name = name;
    }

    @Override
    public String toString(){
        return number + ") " + name;
    }

    public static void printList(List list){
        for (Object o : list) System.out.println(o);
        System.out.println();
    }
}
