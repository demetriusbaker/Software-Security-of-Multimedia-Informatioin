package Chapter2.Patient;

import java.util.ArrayList;

public class Hospital {
    private final ArrayList<Patient> patients = new ArrayList<>();

    public void addPatients(Patient patient) {
        patients.add(patient);
    }

    private void print(Patient p){
        System.out.println(p);
    }

    public void printInfo(){
        for (var p : patients)
            print(p);
    }

    public void findListByDiagnosis(String diagnosis){
        for (var p : patients)
            if (p != null && diagnosis.equalsIgnoreCase(p.getDiagnosis()))
                print(p);
    }

    public void findListByMedCardsInRange(int low, int high){
        for (var p : patients)
            if (p != null && isInRange(p.getCardNumber(), low, high))
                print(p);
    }

    private boolean isInRange(int value, int low, int high){
        return value <= high && value >= low;
    }
}
