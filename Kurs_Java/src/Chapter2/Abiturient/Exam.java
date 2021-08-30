package Chapter2.Abiturient;

import java.util.ArrayList;
import java.util.Collections;

public class Exam {
    private final ArrayList<Enrollee> enrollees = new ArrayList<>();

    public void addEnrollee(Enrollee enrollee) {
        enrollees.add(enrollee);
    }

    public void printInfo(){
        for (var a : enrollees)
            System.out.println(a);
    }

    public void findListByBadMark(int minMarkBorder){
        for (var a : enrollees)
            for (int i = 0; i < a.getSize(); i++)
                if (a.getMarks(i) < minMarkBorder){
                    System.out.println(a);
                    break;
                }
    }

    public void findListByMoreAverage(float averageStandardMark){
        for (var a : enrollees)
            if (a != null && a.getAverageMark() > averageStandardMark)
                System.out.println(a);
    }

    public void findListByMostAverageMark(int n){
        // инициализирую список оценок
        ArrayList<Float> bestAverageMark = new ArrayList<>();

        // Заполняем список средних баллов
        for (var a : enrollees)
            bestAverageMark.add(a.getAverageMark());

        // Сортируем по порядку убывания
        bestAverageMark.sort(Collections.reverseOrder());

        // Выводим всех абитуриентов по порядку
        // убывания средних баллов
        for (var bam : bestAverageMark)
            for (var a : enrollees)
                if (a != null && bam == a.getAverageMark() && n > 0){
                    System.out.println(a);
                    n--;
                }
    }
}