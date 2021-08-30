package Chapter2.Abiturient;

public class Abiturient {
    private int id;
    private String surname;
    private String name;
    private String patronymic;
    private String address;
    private String phone;
    private int[] marks;
    private int size;

    public Abiturient(){}

    public Abiturient(int id, String surname, String name, String patronymic,
                      String address, String phone, int[] marks){
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.address = address;
        this.phone = phone;
        this.marks = marks;
        size = marks.length;
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

    public String Get_Address(){
        return address;
    }

    public String Get_Phone(){
        return phone;
    }

    public int Get_Marks(int i){
        if (i >= 0 && i < marks.length)
            return marks[i];
        return marks[0];
    }

    public float Get_Average_Mark(){
        int sum = 0;
        for (int i = 0; i < marks.length; i++)
            sum += marks[i];
        return (float)sum / marks.length;
    }

    public int Get_Size(){
        return size;
    }

    @Override
    public String toString(){
        return "ID: " + Get_Id() + ";" + "\n" +
        "Фамилия: " + Get_Surname() + ";" + "\n" +
        "Имя: " + Get_Name() + ";" + "\n" +
        "Отчество: " + Get_Patronymic() + ";" + "\n" +
        "Адрес: " + Get_Address() + ";" + "\n" +
        "Телефон: " + Get_Phone() + ";" + "\n" +
        "Оценки"  + "\n" +
        "Информатика: " + Get_Marks(0) + "\n" +
        "Физика: " + Get_Marks(1) + "\n" +
        "Математика: " + Get_Marks(2) + "\n" +
        "Логика: " + Get_Marks(3) + "\n" +
        "Русский/Белорусский язык: " + Get_Marks(4) + "\n" +
        "Итоговый средний балл: " + Get_Average_Mark() + "\n";
    }
}