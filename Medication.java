import java.util.ArrayList;

/**
 * creating the class of medication
 */
public class Medication {
/**
 * creating the respentation of the string of the class of medication
 */    
    public String medName;
    public String medTime;
    public String medDose;
/**
 * creaating the string of the accessors of getmedname
 * @return medName
 */
    public String getMedName() {
        return medName;
    }
/**
 * creating the string 
 * @return
 */
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