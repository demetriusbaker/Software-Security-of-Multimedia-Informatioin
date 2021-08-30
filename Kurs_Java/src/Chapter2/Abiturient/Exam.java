package Chapter2.Abiturient;

import java.util.ArrayList;
import java.util.Collections;

public class Exam {
    private ArrayList<Abiturient> abiturients = new ArrayList<>();

    public void AddAbiturient(Abiturient abiturient) {
        abiturients.add(abiturient);
    }

    public void Print_Info(){
        for (var a : abiturients)
            System.out.println(a);
    }

    public void Find_List_By_Bad_Mark(int minMarkBorder){
        for (var a : abiturients)
            for (int i = 0; i < a.Get_Size(); i++)
                if (a != null && a.Get_Marks(i) < minMarkBorder){
                    System.out.println(a);
                    break;
                }
    }

    public void Find_List_By_More_Average(float averageStandardMark){
        for (var a : abiturients)
            if (a != null && a.Get_Average_Mark() > averageStandardMark)
                System.out.println(a);
    }

    public void Find_List_By_Most_Average_Mark(int n){
        // инициализирую список оценок
        ArrayList<Float> bestAverageMark = new ArrayList<>();

        // Заполняем список средних баллов
        for (var a : abiturients)
            bestAverageMark.add(a.Get_Average_Mark());

        // Сортируем по порядку убывания
        Collections.sort(bestAverageMark, Collections.reverseOrder());

        // Выводим всех абитуриентов по порядку
        // убывания средних баллов
        for (var bam : bestAverageMark)
            for (var a : abiturients)
                if (a != null && bam == a.Get_Average_Mark() && n > 0){
                    System.out.println(a);
                    n--;
                }
    }
}