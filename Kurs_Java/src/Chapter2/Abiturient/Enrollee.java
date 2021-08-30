package Chapter2.Abiturient;

public class Enrollee {
    private final int id;
    private final String surname;
    private final String name;
    private final String patronymic;
    private final String address;
    private final String phone;
    private final int[] marks;
    private final int size;

    public Enrollee(int id, String surname, String name, String patronymic,
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

    public String getAddress(){
        return address;
    }

    public String getPhone(){
        return phone;
    }

    public int getMarks(int i){
        if (i >= 0 && i < marks.length)
            return marks[i];
        return marks[0];
    }

    public float getAverageMark(){
        int sum = 0;
        for (int mark : marks) sum += mark;
        return (float)sum / marks.length;
    }

    public int getSize(){
        return size;
    }

    @Override
    public String toString(){
        return "ID: " + getId() + ";" + "\n" +
        "Фамилия: " + getSurname() + ";" + "\n" +
        "Имя: " + getName() + ";" + "\n" +
        "Отчество: " + getPatronymic() + ";" + "\n" +
        "Адрес: " + getAddress() + ";" + "\n" +
        "Телефон: " + getPhone() + ";" + "\n" +
        "Оценки"  + "\n" +
        "Информатика: " + getMarks(0) + "\n" +
        "Физика: " + getMarks(1) + "\n" +
        "Математика: " + getMarks(2) + "\n" +
        "Логика: " + getMarks(3) + "\n" +
        "Русский/Белорусский язык: " + getMarks(4) + "\n" +
        "Итоговый средний балл: " + getAverageMark() + "\n";
    }
}