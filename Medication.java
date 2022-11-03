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
 * creating the string medtime
 * @return medTime
 */
    public String getMedTime() {
        return medTime;
    }
/**
 * creating the string of the medDose 
 * @return medose
 */

    public String getMedDose() {
        return medDose;
    }
/**
 * this is the parmeters of the Medication class
 * @param medName
 * @param medTime
 * @param medDose
 */
    public Medication(String medName,String medTime,String medDose){
    this.medName=medName;
    this.medDose=medDose;
    this.medTime=medTime;
    }
/**
 * this is String toString for the medication class
 */
    public String toString() {
        return medName + " at " + medTime + " for this Doses: " + medDose;
    }
}