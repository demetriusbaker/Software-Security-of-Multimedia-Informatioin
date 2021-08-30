package Chapter2.Patient;

public class Patient {
    private final int id;
    private final String surname;
    private final String name;
    private final String patronymic;
    private final String address;
    private final String phone;
    private final int cardNumber;
    private final String diagnosis;

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

    public int getCardNumber(){
        return cardNumber;
    }

    public String getDiagnosis(){
        return diagnosis;
    }

    @Override
    public String toString(){
        return "ID: " + getId() + ";" + "\n" +
                "Фамилия: " + getSurname() + ";" + "\n" +
                "Имя: " + getName() + ";" + "\n" +
                "Отчество: " + getPatronymic() + ";" + "\n" +
                "Адрес: " + getAddress() + ";" + "\n" +
                "Телефон: " + getPhone() + ";" + "\n" +
                "Номер медкарты: " + getCardNumber() + ";" + "\n" +
                "Диагноз: " + getDiagnosis() + ";" + "\n";
    }
}
