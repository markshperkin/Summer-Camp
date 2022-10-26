import java.util.ArrayList;

public class Medication {
    
    public ArrayList <String> allergy = new ArrayList<String>();
    public String medName;
    public String medTime;
    public String medDose;

public Medication(ArrayList<String> allergy,String MedName,String medTime,String medDose)
{
   this.allergy = allergy;
   this.medName=medName;
   this.medDose=medDose;
   this.medTime=medTime;
}
}