package Chapter2.Patient;

import java.util.ArrayList;

public class Hospital {
    private ArrayList<Patient> patients = new ArrayList<>();

    public void AddPatients(Patient patient) {
        patients.add(patient);
    }

    private void Print(Patient p){
        System.out.println(p);
    }

    public void Print_Info(){
        for (var p : patients)
            Print(p);
    }

    public void Find_List_By_Diagnosis(String diagnosis){
        for (var p : patients)
            if (p != null && diagnosis.equalsIgnoreCase(p.Get_Diagnosis()))
                Print(p);
    }

    public void Find_List_By_MedCards_In_Range(int low, int high){
        for (var p : patients)
            if (p != null && IsInRange(p.Get_CardNumber(), low, high))
                Print(p);
    }

    private boolean IsInRange(int value, int low, int high){
        if (value <= high && value >= low)
            return true;
        return false;
    }
}
