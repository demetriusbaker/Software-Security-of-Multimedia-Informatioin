package Chapter5.ChapterTask;

import java.util.List;

public class Person {
    private int number;
    private String name;

    public Person(int number, String name){
        this.number = number;
        this.name = name;
    }

    @Override
    public String toString(){
        return number + ") " + name;
    }

    public static void printList(List list){
        for (int i = 0; i < list.size(); i++)
            System.out.println(list.get(i));
        System.out.println();
    }
}
