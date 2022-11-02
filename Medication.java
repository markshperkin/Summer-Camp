import java.util.ArrayList;

public class Medication {
    
    public String medName;
    public String medTime;
    public String medDose;

    public String getMedName() {
        return medName;
    }

    public String getMedTime() {
        return medTime;
    }

    public String getMedDose() {
        return medDose;
    }

    public Medication(String medName,String medTime,String medDose){
    this.medName=medName;
    this.medDose=medDose;
    this.medTime=medTime;
    }

    public String toString() {
        return medName + " at " + medTime + " for this Doses: " + medDose;
    }
}