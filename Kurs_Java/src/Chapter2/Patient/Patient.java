package Chapter2.Patient;

public class Patient {
    private int id;
    private String surname;
    private String name;
    private String patronymic;
    private String address;
    private String phone;
    private int cardNumber;
    private String diagnosis;

    public Patient(int id, String surname, String name,
                   String patronymic, String address, String phone,
                   int cardNumber, String diagnosis){
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.address = address;
        this.phone = phone;
        this.cardNumber = cardNumber;
        this.diagnosis = diagnosis;
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

    public int Get_CardNumber(){
        return cardNumber;
    }

    public String Get_Diagnosis(){
        return diagnosis;
    }

    @Override
    public String toString(){
        return "ID: " + Get_Id() + ";" + "\n" +
                "Фамилия: " + Get_Surname() + ";" + "\n" +
                "Имя: " + Get_Name() + ";" + "\n" +
                "Отчество: " + Get_Patronymic() + ";" + "\n" +
                "Адрес: " + Get_Address() + ";" + "\n" +
                "Телефон: " + Get_Phone() + ";" + "\n" +
                "Номер медкарты: " + Get_CardNumber() + ";" + "\n" +
                "Диагноз: " + Get_Diagnosis() + ";" + "\n";
    }
}
