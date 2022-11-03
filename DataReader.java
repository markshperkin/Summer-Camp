import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.UUID;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class DataReader extends DataConstants {

    public static ArrayList<Parent> getAllParents() {
        ArrayList<Parent> parents = new ArrayList<Parent>();

        try {
            FileReader parentReader = new FileReader(PARENT_FILE);
            JSONParser parser = new JSONParser();
            JSONArray parentsJSON = (JSONArray) new JSONParser().parse(parentReader);

            for (int i = 0; i < parentsJSON.size(); i++) {
                JSONObject parentJSON = (JSONObject) parentsJSON.get(i);
                String UUID = (String) parentJSON.get("id");
                String fname = (String) parentJSON.get(FIRSTNAME);
                String lname = (String) parentJSON.get(LASTNAME);
                String email = (String) parentJSON.get(EMAIL);
                String password = (String) parentJSON.get(PASSWORD);
                String phoneNum = (String) parentJSON.get(PHONENUMBER);
                String birthday = (String) parentJSON.get(BIRTHDAY);
                String street = (String) parentJSON.get(STREET);
                String town = (String) parentJSON.get(TOWN);
                String state = (String) parentJSON.get(STATE);
                String zipCode = (String) parentJSON.get(ZIPCODE);
                String country = (String) parentJSON.get(COUNTRY);
                String gender = (String) parentJSON.get(GENDER);
                ArrayList<String> children = new ArrayList<String>();

                JSONArray jsonArray2 = (JSONArray) parentJSON.get("children");

                for (int k = 0; k < jsonArray2.size(); k++) {
                    children.add((String) jsonArray2.get(k));
                }

                parents.add(new Parent(fname, lname, email, password, phoneNum, birthday, street, town, state, zipCode,
                        country, gender, children, null));
            }
            return parents;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static ArrayList<Child> getAllChild() {
        ArrayList<Child> children = new ArrayList<Child>();

        try {
            FileReader childReader = new FileReader(CHILDS_FILE);
            JSONParser parser = new JSONParser();
            JSONArray childrenJSON = (JSONArray) new JSONParser().parse(childReader);

            for (int i = 0; i < childrenJSON.size(); i++) {
                JSONObject childJSON = (JSONObject) childrenJSON.get(i);
                String UUID = (String) childJSON.get("id");
                String fname = (String) childJSON.get(FIRSTNAME);
                String lname = (String) childJSON.get(LASTNAME);
                String birthday = (String) childJSON.get(BIRTHDAY);
                String gender = (String) childJSON.get(GENDER);
                String shirtSize = (String) childJSON.get(SHIRSIZE);
                String strike = (String) childJSON.get(STRIKE);

                ArrayList<Medication> medications = new ArrayList<Medication>();

                JSONArray jsonArray1 = (JSONArray) childJSON.get("medication");
                ArrayList<String> allergyList = new ArrayList<String>();

                for (int j = 0; j < jsonArray1.size(); j++) {
                    JSONObject medicationJSON = (JSONObject) jsonArray1.get(j);

                    JSONArray allergy = (JSONArray) medicationJSON.get(ALLERGY);

                    for (int l = 0; l < allergyList.size(); l++) {
                        allergyList.add((String) allergy.get(l));
                    }

                    String medName = (String) medicationJSON.get(MEDNAME);
                    String medTime = (String) medicationJSON.get(MEDTIME);
                    String medDose = (String) medicationJSON.get(MEDDOSE);

                    medications.add(new Medication(medName, medTime, medDose));

                }

                ArrayList<Contact> contacts = new ArrayList<Contact>();

                JSONArray jsonArray2 = (JSONArray) childJSON.get(CONTACTS);

                for (int k = 0; k < jsonArray2.size(); k++) {
                    JSONObject contactJSON = (JSONObject) jsonArray2.get(k);
                    String childFname = (String) contactJSON.get(FIRSTNAME);
                    String childLname = (String) contactJSON.get(LASTNAME);
                    String childPhoneNum = (String) contactJSON.get(PHONENUMBER);
                    String childEmail = (String) contactJSON.get(EMAIL);
                    String childRelationship = (String) contactJSON.get(RELATIONSHIP);

                    contacts.add(new Contact(childFname, childLname, childPhoneNum, childEmail, childRelationship));
                }

                children.add(
                        new Child(UUID, fname, lname, birthday, gender, shirtSize, contacts, medications, allergyList));
            }

            return children;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;

    }

    public static ArrayList<Director> getAllDirectors() {
        ArrayList<Director> directors = new ArrayList<Director>();

        try {
            FileReader directorReader = new FileReader(DIRECTOR_FILE);
            JSONParser parser = new JSONParser();
            JSONArray directorsJSON = (JSONArray) new JSONParser().parse(directorReader);

            for (int i = 0; i < directorsJSON.size(); i++) {
                JSONObject directorJSON = (JSONObject) directorsJSON.get(i);
                String UUID = (String) directorJSON.get("id");
                String fname = (String) directorJSON.get(FIRSTNAME);
                String lname = (String) directorJSON.get(LASTNAME);
                String email = (String) directorJSON.get(EMAIL);
                String password = (String) directorJSON.get(PASSWORD);
                String phoneNum = (String) directorJSON.get(PHONENUMBER);
                String street = (String) directorJSON.get(STREET);
                String town = (String) directorJSON.get(TOWN);
                String zipCode = (String) directorJSON.get(ZIPCODE);
                String state = (String) directorJSON.get(STATE);
                String country = (String) directorJSON.get(COUNTRY);
                String birthday = (String) directorJSON.get(BIRTHDAY);

                directors.add(new Director(UUID, fname, lname, email, password, phoneNum, street, town, zipCode, state,
                        country, birthday, null));

            }
            return directors;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static ArrayList<Counselor> getAllCounselors() {
        ArrayList<Counselor> counselors = new ArrayList<Counselor>();

        try {
            FileReader counselorReader = new FileReader(COUNSELOR_FILE);
            JSONParser parser = new JSONParser();
            JSONArray counselorJSON = (JSONArray) new JSONParser().parse(counselorReader);

            for (int i = 0; i < counselorJSON.size(); i++) {
                JSONObject counselorsJSON = (JSONObject) counselorJSON.get(i);
                String UUID = (String) counselorsJSON.get("id");
                String fname = (String) counselorsJSON.get(FIRSTNAME);
                String lname = (String) counselorsJSON.get(LASTNAME);
                String email = (String) counselorsJSON.get(EMAIL);
                String password = (String) counselorsJSON.get(PASSWORD);
                String phoneNum = (String) counselorsJSON.get(PHONENUMBER);
                String street = (String) counselorsJSON.get(STREET);
                String town = (String) counselorsJSON.get(TOWN);
                String zipCode = (String) counselorsJSON.get(ZIPCODE);
                String state = (String) counselorsJSON.get(STATE);
                String country = (String) counselorsJSON.get(COUNTRY);
                String birthday = (String) counselorsJSON.get(BIRTHDAY);
                String aboutme = (String) counselorsJSON.get(ABOUTME);
                String gender = (String) counselorsJSON.get(GENDER);
                String allergy = (String) counselorsJSON.get(ALLERGY);
                String medication = (String) counselorsJSON.get(MEDICATION);
                String size = (String) counselorsJSON.get(SHIRSIZE);
                String str = (String) counselorsJSON.get(STRIKE);
                ArrayList<Contact> contacts = new ArrayList<Contact>();

                JSONArray jsonArray = (JSONArray) counselorsJSON.get(CONTACTS);

                for (int j = 0; j < jsonArray.size(); j++) {
                    JSONObject contactJSON = (JSONObject) jsonArray.get(j);
                    String contactFname = (String) contactJSON.get(FIRSTNAME);
                    String contactLname = (String) contactJSON.get(LASTNAME);
                    String contactPhoneNum = (String) contactJSON.get(PHONENUMBER);
                    String contactEmail = (String) contactJSON.get(EMAIL);
                    String contactRelationship = (String) contactJSON.get(RELATIONSHIP);

                    contacts.add(new Contact(contactFname, contactLname, contactPhoneNum, contactEmail,
                            contactRelationship));
                }

                counselors.add(new Counselor(UUID, fname, lname, email, password, phoneNum, birthday, gender, size,
                        street, town, state, zipCode, country, aboutme, contacts, counselorJSON, jsonArray));
            }
            return counselors;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;

    }

    public static ArrayList getAllCabins() {
        ArrayList<Cabin> cabins = new ArrayList<Cabin>();
        try {
            FileReader cabinReader = new FileReader(CABIN_FILE);
            JSONParser parser = new JSONParser();
            JSONArray cabinJSON = (JSONArray) new JSONParser().parse(cabinReader);
            for (int i = 0; i < cabinJSON.size(); i++) {
                JSONObject cabinsJSON = (JSONObject) cabinJSON.get(i);
                String UUID = (String) cabinsJSON.get("id");
                ArrayList<Schedule> schedule = new ArrayList<Schedule>();

                ArrayList<Activity> Monday = new ArrayList<Activity>();

                JSONObject scheduleObj = (JSONObject) cabinsJSON.get(SCHEDULE);

                JSONArray monday = (JSONArray) scheduleObj.get(MONDAY);
                for (int j = 0; j < monday.size(); j++) {

                    JSONObject MONDAYJSON = (JSONObject) monday.get(j);
                    String Mondaytitle = (String) MONDAYJSON.get(TITLE);
                    String Mondaydescription = (String) MONDAYJSON.get(DESCRIPTION);
                    String Mondaylocation = (String) MONDAYJSON.get(LOCATION);
                    String Mondayclockhour = (String) MONDAYJSON.get(CLOCKHOURS).toString();
                    String Mondayclockmin = (String) MONDAYJSON.get(CLOCKMINUTE).toString();
                    String MondayTOD = (String) MONDAYJSON.get(TIMEOFDAY);
                    String Mondayaction = (String) MONDAYJSON.get(ACTION);

                    Monday.add(new Activity(Mondaytitle, Mondaydescription, Mondaylocation, Mondayclockhour,
                            Mondayclockmin, MondayTOD, Mondayaction));
                }
                ArrayList<Activity> Tuesday = new ArrayList<Activity>();
                JSONArray tuesday = (JSONArray) scheduleObj.get(TUESDAY);

                for (int k = 0; k < tuesday.size(); k++) {

                    JSONObject TUESDAYJSON = (JSONObject) tuesday.get(k);
                    String TUESDAYtitle = (String) TUESDAYJSON.get(TITLE);
                    String TUESDAYdescription = (String) TUESDAYJSON.get(DESCRIPTION);
                    String TUESDAYlocation = (String) TUESDAYJSON.get(LOCATION);
                    String TUESDAYclockhour = (String) TUESDAYJSON.get(CLOCKHOURS).toString();
                    String TUESDAYclockmin = (String) TUESDAYJSON.get(CLOCKMINUTE).toString();
                    String TUESDAYTOD = (String) TUESDAYJSON.get(TIMEOFDAY);
                    String TUESDAYaction = (String) TUESDAYJSON.get(ACTION);

                    Tuesday.add(new Activity(TUESDAYtitle, TUESDAYdescription, TUESDAYlocation, TUESDAYclockhour,
                            TUESDAYclockmin, TUESDAYTOD, TUESDAYaction));
                }
                ArrayList<Activity> wednesdayActivity = new ArrayList<Activity>();
                JSONArray wednesday = (JSONArray) scheduleObj.get(WEDNESDAY);

                for (int l = 0; l < wednesday.size(); l++) {

                    JSONObject WEDNESDAYJSON = (JSONObject) wednesday.get(l);
                    String WEDNESDAYtitle = (String) WEDNESDAYJSON.get(TITLE);
                    String WEDNESDAYdescription = (String) WEDNESDAYJSON.get(DESCRIPTION);
                    String WEDNESDAYlocation = (String) WEDNESDAYJSON.get(LOCATION);
                    String WEDNESDAYclockhour = (String) WEDNESDAYJSON.get(CLOCKHOURS).toString();
                    String WEDNESDAYclockmin = (String) WEDNESDAYJSON.get(CLOCKMINUTE).toString();
                    String WEDNESDAYTOD = (String) WEDNESDAYJSON.get(TIMEOFDAY);
                    String WEDNESDAYaction = (String) WEDNESDAYJSON.get(ACTION);

                    wednesdayActivity.add(new Activity(WEDNESDAYtitle, WEDNESDAYdescription, WEDNESDAYlocation,
                            WEDNESDAYclockhour, WEDNESDAYclockmin, WEDNESDAYTOD, WEDNESDAYaction));
                }

                ArrayList<Activity> thurdayActivity = new ArrayList<Activity>();
                JSONArray jsonArray3 = (JSONArray) scheduleObj.get(THURSDAY);

                for (int m = 0; m < jsonArray3.size(); m++) {

                    JSONObject THURSDAYJSON = (JSONObject) jsonArray3.get(m);
                    String THURSDAYtitle = (String) THURSDAYJSON.get(TITLE);
                    String THURSDAYdescription = (String) THURSDAYJSON.get(DESCRIPTION);
                    String THURSDAYlocation = (String) THURSDAYJSON.get(LOCATION);
                    String THURSDAYclockhour = (String) THURSDAYJSON.get(CLOCKHOURS).toString();
                    String THURSDAYclockmin = (String) THURSDAYJSON.get(CLOCKMINUTE).toString();
                    String THURSDAYTOD = (String) THURSDAYJSON.get(TIMEOFDAY);
                    String THURSDAYaction = (String) THURSDAYJSON.get(ACTION);

                    thurdayActivity.add(new Activity(THURSDAYtitle, THURSDAYdescription, THURSDAYlocation, THURSDAYclockhour,
                            THURSDAYclockmin, THURSDAYTOD, THURSDAYaction));
                }
                ArrayList<Activity> fridayActivity = new ArrayList<Activity>();
                JSONArray jsonArray4 = (JSONArray) scheduleObj.get(FRIDAY);

                for (int n = 0; n < jsonArray4.size(); n++) {

                    JSONObject FRIDAYJSON = (JSONObject) jsonArray4.get(n);
                    String FRIDAYtitle = (String) FRIDAYJSON.get(TITLE);
                    String FRIDAYdescription = (String) FRIDAYJSON.get(DESCRIPTION);
                    String FRIDAYlocation = (String) FRIDAYJSON.get(LOCATION);
                    String FRIDAYclockhour = (String) FRIDAYJSON.get(CLOCKHOURS).toString();
                    String FRIDAYclockmin = (String) FRIDAYJSON.get(CLOCKMINUTE).toString();
                    String FRIDAYTOD = (String) FRIDAYJSON.get(TIMEOFDAY);
                    String FRIDAYaction = (String) FRIDAYJSON.get(ACTION);

                    fridayActivity.add(new Activity(FRIDAYtitle, FRIDAYdescription, FRIDAYlocation, FRIDAYclockhour,
                            FRIDAYclockmin, FRIDAYTOD, FRIDAYaction));
                }
                ArrayList<Activity> saturdayActivity = new ArrayList<Activity>();
                JSONArray jsonArray5 = (JSONArray) scheduleObj.get(DataReader.SATURDAY);

                for (int s = 0; s < jsonArray5.size(); s++) {

                    JSONObject SATURDAYJSON = (JSONObject) jsonArray5.get(s);
                    String SATURDAYtitle = (String) SATURDAYJSON.get(TITLE);
                    String SATURDAYdescription = (String) SATURDAYJSON.get(DESCRIPTION);
                    String SATURDAYlocation = (String) SATURDAYJSON.get(LOCATION);
                    String SATURDAYclockhour = (String) SATURDAYJSON.get(CLOCKHOURS).toString();
                    String SATURDAYclockmin = (String) SATURDAYJSON.get(CLOCKMINUTE).toString();
                    String SATURDAYTOD = (String) SATURDAYJSON.get(TIMEOFDAY);
                    String SATURDAYaction = (String) SATURDAYJSON.get(ACTION);

                    saturdayActivity.add(new Activity(SATURDAYtitle, SATURDAYdescription, SATURDAYlocation, SATURDAYclockhour,
                            SATURDAYclockmin, SATURDAYTOD, SATURDAYaction));
                }
                ArrayList<Activity> sundayActivity = new ArrayList<Activity>();
                JSONArray jsonArray6 = (JSONArray) scheduleObj.get(SUNDAY);

                for (int su = 0; su < sundayActivity.size(); su++) {

                    JSONObject SUNDAYJSON = (JSONObject) jsonArray6.get(su);
                    String SUNDAYtitle = (String) SUNDAYJSON.get(TITLE);
                    String SUNDAYdescription = (String) SUNDAYJSON.get(DESCRIPTION);
                    String SUNDAYlocation = (String) SUNDAYJSON.get(LOCATION);
                    String SUNDAYclockhour = (String) SUNDAYJSON.get(CLOCKHOURS).toString();
                    String SUNDAYclockmin = (String) SUNDAYJSON.get(CLOCKMINUTE).toString();
                    String SUNDAYTOD = (String) SUNDAYJSON.get(TIMEOFDAY);
                    String SUNDAYaction = (String) SUNDAYJSON.get(ACTION);

                    sundayActivity.add(new Activity(SUNDAYtitle, SUNDAYdescription, SUNDAYlocation, SUNDAYclockhour,
                            SUNDAYclockmin, SUNDAYTOD, SUNDAYaction));
                }

                ArrayList<String> camper = new ArrayList<String>();
                JSONArray campers = (JSONArray) cabinsJSON.get(CAMPER);

                for(int mar = 0; mar < campers.size(); mar++) {
                    camper.add((String) campers.get(i));
                }

                String counselor = (String)cabinsJSON.get(COUNSELORS);
                
                HashMap<Days, ArrayList<Activity>> finalSchedule = new HashMap<Days, ArrayList<Activity>>();
                finalSchedule.put(Days.MONDAY, Monday);
                finalSchedule.put(Days.TUESDAY, Tuesday);
                finalSchedule.put(Days.WEDNESDAY, wednesdayActivity);
                finalSchedule.put(Days.THURSDAY, thurdayActivity);
                finalSchedule.put(Days.FRIDAY, fridayActivity);
                finalSchedule.put(Days.SATURDAY, saturdayActivity);
                finalSchedule.put(Days.SUNDAY, sundayActivity);

                cabins.add(new Cabin(getCounselorByID(counselor), camper, finalSchedule));
            }
            return cabins;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    public static Counselor getCounselorByID (String ID) {
        for(int i = 0; i < DataReader.getAllCounselors().size();i++) {
            if(DataReader.getAllCounselors().get(i).getUUID().equals(ID))
                return DataReader.getAllCounselors().get(i);
        }
        return null;
    }
}