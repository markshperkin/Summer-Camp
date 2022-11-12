import static org.junit.jupiter.api.Assertions.*;

import java.beans.Transient;
import java.util.ArrayList;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ParentListTest {
    @Test
    public void testLoginInvalid() {
        boolean result = ParentsList.getInstance().login("jsmart", "12345");
        assertEquals(false, result);
    }
   
    @Test
    public void testNullFirstName() {
        ArrayList<String> Marcus = new ArrayList<String>();
        Marcus.add("adlfasdf");
        Parent parent = new Parent(null, "Campbell", "afdl@gmail.com", "jalfd", "8529639876", "null", "Magnoial", "Columbia", "Sc", "29205", "US", "Male", Marcus , "dafaddfasdf");
        Boolean result = false;

        ParentsList.getInstance().addParentToList(parent);

        for(int i = 0; i < ParentsList.getInstance().getAllParents().size(); i++) {
            if(ParentsList.getInstance().getAllParents().get(i).equals(parent)) {
                result = true;
                assertEquals(false, result);
            }
        } 
    }

    @Test
    public void testNullLastName() {
        ArrayList<String> Marcus = new ArrayList<String>();
        Marcus.add("adlfasdf");
        Parent parent = new Parent("Marcus", null, "afdl@gmail.com", "jalfd", "8529639876", "null", "Magnoial", "Columbia", "Sc", "29205", "US", "Male", Marcus , "dafaddfasdf");
        Boolean result = false;

        ParentsList.getInstance().addParentToList(parent);

        for(int i = 0; i < ParentsList.getInstance().getAllParents().size(); i++) {
            if(ParentsList.getInstance().getAllParents().get(i).equals(parent)) {
                result = true;
                assertEquals(false, result);
            }
        } 
    }

    @Test
    public void testNullEmail() {
        ArrayList<String> Marcus = new ArrayList<String>();
        Marcus.add("adlfasdf");
        Parent parent = new Parent("Marcus", "Campbell", null, "jalfd", "8529639876", "null", "Magnoial", "Columbia", "Sc", "29205", "US", "Male", Marcus, "dafaddfasdf");
        Boolean result = false;

        ParentsList.getInstance().addParentToList(parent);

        for(int i = 0; i < ParentsList.getInstance().getAllParents().size(); i++) {
            if(ParentsList.getInstance().getAllParents().get(i).equals(parent)) {
                result = true;
                assertEquals(false, result);
            }
        } 
    }

    @Test
    public void testNullPassword() {
        ArrayList<String> Marcus = new ArrayList<String>();
        Marcus.add("adlfasdf");
        Parent parent = new Parent("Marcus", "Campbell", "afdl@gmail.com", null, "8529639876", "null", "Magnoial", "Columbia", "Sc", "29205", "US", "Male", Marcus, "dafaddfasdf");
        Boolean result = false;

        ParentsList.getInstance().addParentToList(parent);

        for(int i = 0; i < ParentsList.getInstance().getAllParents().size(); i++) {
            if(ParentsList.getInstance().getAllParents().get(i).equals(parent)) {
                result = true;
                assertEquals(false, result);
            }
        } 
    }

    @Test
    public void testNullPhoneNum() {
        ArrayList<String> Marcus = new ArrayList<String>();
        Marcus.add("adlfasdf");
        Parent parent = new Parent("Marcus", "Campbell", "afdl@gmail.com", "jalfd", null, "null", "Magnoial", "Columbia", "Sc", "29205", "US", "Male", Marcus, "dafaddfasdf");        
        Boolean result = false;

        ParentsList.getInstance().addParentToList(parent);

        for(int i = 0; i < ParentsList.getInstance().getAllParents().size(); i++) {
            if(ParentsList.getInstance().getAllParents().get(i).equals(parent)) {
                result = true;
                assertEquals(false, result);
            }
        } 
    }

    @Test
    public void testNullBirthday() {
        ArrayList<String> Marcus = new ArrayList<String>();
        Marcus.add("adlfasdf");
        Parent parent = new Parent("Marcus", "Campbell", "afdl@gmail.com", "jalfd", "8529639876", null, "Magnoial", "Columbia", "Sc", "29205", "US", "Male", Marcus, "dafaddfasdf");
        Boolean result = false;
        
        ParentsList.getInstance().addParentToList(parent);

        for(int i = 0; i < ParentsList.getInstance().getAllParents().size(); i++) {
            if(ParentsList.getInstance().getAllParents().get(i).equals(parent)) {
                result = true;
                assertEquals(false, result);
            }
        } 
    }

    @Test
    public void testNullStreet() {
        ArrayList<String> Marcus = new ArrayList<String>();
        Marcus.add("adlfasdf");
        Parent parent = new Parent("Marcus", "Campbell", "afdl@gmail.com", "jalfd", "8529639876", "null", null, "Columbia", "Sc", "29205", "US", "Male", Marcus, "dafaddfasdf");
        Boolean result = false;
        
        ParentsList.getInstance().addParentToList(parent);

        for(int i = 0; i < ParentsList.getInstance().getAllParents().size(); i++) {
            if(ParentsList.getInstance().getAllParents().get(i).equals(parent)) {
                result = true;
                assertEquals(false, result);
            }
        } 
    }

    @Test
    public void testNullTown() {
        ArrayList<String> Marcus = new ArrayList<String>();
        Marcus.add("adlfasdf");
        Parent parent = new Parent("Marcus", "Campbell", "afdl@gmail.com", "jalfd", "8529639876", "null", "Magnoial", null, "Sc", "29205", "US", "Male", Marcus, "dafaddfasdf");        
        Boolean result = false;
        
        ParentsList.getInstance().addParentToList(parent);

        for(int i = 0; i < ParentsList.getInstance().getAllParents().size(); i++) {
            if(ParentsList.getInstance().getAllParents().get(i).equals(parent)) {
                result = true;
                assertEquals(false, result);
            }
        } 
    }

    @Test
    public void testNullState() {
        ArrayList<String> Marcus = new ArrayList<String>();
        Marcus.add("adlfasdf");
        Parent parent = new Parent("Marcus", "Campbell", "afdl@gmail.com", "jalfd", "8529639876", "null", "Magnoial", "Columbia", null, "29205", "US", "Male", Marcus, "dafaddfasdf");
        Boolean result = false;
        
        ParentsList.getInstance().addParentToList(parent);

        for(int i = 0; i < ParentsList.getInstance().getAllParents().size(); i++) {
            if(ParentsList.getInstance().getAllParents().get(i).equals(parent)) {
                result = true;
                assertEquals(false, result);
            }
        } 
    }

    @Test
    public void testNullzipCode() {
        ArrayList<String> Marcus = new ArrayList<String>();
        Marcus.add("adlfasdf");
        Parent parent = new Parent("Marcus", "Campbell", "afdl@gmail.com", "jalfd", "8529639876", "null", "Magnoial", "Columbia", "FL", null, "US", "Male", Marcus, "dafaddfasdf");
        Boolean result = false;
        
        ParentsList.getInstance().addParentToList(parent);

        for(int i = 0; i < ParentsList.getInstance().getAllParents().size(); i++) {
            if(ParentsList.getInstance().getAllParents().get(i).equals(parent)) {
                result = true;
                assertEquals(false, result);
            }
        } 
    }

    @Test
    public void testNullCountry() {
        ArrayList<String> Marcus = new ArrayList<String>();
        Marcus.add("adlfasdf");
        Parent parent = new Parent("Marcus", "Campbell", "afdl@gmail.com", "jalfd", "8529639876", "null", "Magnoial", "Columbia", "GA", "15462", null, "Male", Marcus, "dafaddfasdf");
        Boolean result = false;
        
        ParentsList.getInstance().addParentToList(parent);

        for(int i = 0; i < ParentsList.getInstance().getAllParents().size(); i++) {
            if(ParentsList.getInstance().getAllParents().get(i).equals(parent)) {
                result = true;
                assertEquals(false, result);
            }
        } 
    }

    @Test
    /** These method is supposed to be true just incase user does not want to say their Gender */
    public void testNullGender() {
        ArrayList<String> Marcus = new ArrayList<String>();
        Marcus.add("adlfasdf");
        Parent parent = new Parent("Marcus", "Campbell", "afdl@gmail.com", "jalfd", "8529639876", "null", "Magnoial", "Columbia", "GA", "15462", "CA", null, Marcus, "dafaddfasdf");
        Boolean result = false;
        
        ParentsList.getInstance().addParentToList(parent);

        for(int i = 0; i < ParentsList.getInstance().getAllParents().size(); i++) {
            if(ParentsList.getInstance().getAllParents().get(i).equals(parent)) {
                result = true;
                assertEquals(true, result);
            }
        } 
    }

    @Test
    public void testNullChild() {
        ArrayList<String> Marcus = new ArrayList<String>();
        Parent parent = new Parent("Marcus", "Campbell", "afdl@gmail.com", "jalfd", "8529639876", "null", "Magnoial", "Columbia", "GA", "15462", "US", "Male", Marcus, "dafaddfasdf");
        Boolean result = false;
        
        ParentsList.getInstance().addParentToList(parent);

        for(int i = 0; i < ParentsList.getInstance().getAllParents().size(); i++) {
            if(ParentsList.getInstance().getAllParents().get(i).equals(parent)) {
                result = true;
                assertEquals(false, result);
            }
        } 
    }

    @Test
    public void testEmptyFirstName() {
        ArrayList<String> Marcus = new ArrayList<String>();
        Marcus.add("adlfasdf");
        Parent parent = new Parent("", "Campbell", "afdl@gmail.com", "jalfd", "8529639876", "null", "Magnoial", "Columbia", "GA", "15462", "US", "Male", Marcus, "dafaddfasdf");
        Boolean result = false;
        
        ParentsList.getInstance().addParentToList(parent);

        for(int i = 0; i < ParentsList.getInstance().getAllParents().size(); i++) {
            if(ParentsList.getInstance().getAllParents().get(i).equals(parent)) {
                result = true;
                assertEquals(false, result);
            }
        } 
    }

    @Test
    public void testEmptyLastName() {
        ArrayList<String> Marcus = new ArrayList<String>();
        Marcus.add("adlfasdf");
        Parent parent = new Parent("Marcus", "", "afdl@gmail.com", "jalfd", "8529639876", "null", "Magnoial", "Columbia", "GA", "15462", "US", "Male", Marcus, "dafaddfasdf");
        Boolean result = false;
        
        ParentsList.getInstance().addParentToList(parent);

        for(int i = 0; i < ParentsList.getInstance().getAllParents().size(); i++) {
            if(ParentsList.getInstance().getAllParents().get(i).equals(parent)) {
                result = true;
                assertEquals(false, result);
            }
        } 
    }

    @Test
    public void testEmptyEmail() {
        ArrayList<String> Marcus = new ArrayList<String>();
        Marcus.add("adlfasdf");
        Parent parent = new Parent("Marcus", "Campbell", "", "jalfd", "8529639876", "null", "Magnoial", "Columbia", "GA", "15462", "US", "Male", Marcus, "dafaddfasdf");
        Boolean result = false;
        
        ParentsList.getInstance().addParentToList(parent);

        for(int i = 0; i < ParentsList.getInstance().getAllParents().size(); i++) {
            if(ParentsList.getInstance().getAllParents().get(i).equals(parent)) {
                result = true;
                assertEquals(false, result);
            }
        } 
    }

    @Test
    public void testEmptyPassword() {
        ArrayList<String> Marcus = new ArrayList<String>();
        Marcus.add("adlfasdf");
        Parent parent = new Parent("Marcus", "Campbell", "adsfafd@gmail.com", "", "8529639876", "null", "Magnoial", "Columbia", "GA", "15462", "US", "Male", Marcus, "dafaddfasdf");
        Boolean result = false;
        
        ParentsList.getInstance().addParentToList(parent);

        for(int i = 0; i < ParentsList.getInstance().getAllParents().size(); i++) {
            if(ParentsList.getInstance().getAllParents().get(i).equals(parent)) {
                result = true;
                assertEquals(false, result);
            }
        } 
    }

    @Test
    public void testEmptyPhoneNum() {
        ArrayList<String> Marcus = new ArrayList<String>();
        Marcus.add("adlfasdf");
        Parent parent = new Parent("Marcus", "Campbell", "adf@gmail.com", "jalfd", "", "null", "Magnoial", "Columbia", "GA", "15462", "US", "Male", Marcus, "dafaddfasdf");
        Boolean result = false;
        
        ParentsList.getInstance().addParentToList(parent);

        for(int i = 0; i < ParentsList.getInstance().getAllParents().size(); i++) {
            if(ParentsList.getInstance().getAllParents().get(i).equals(parent)) {
                result = true;
                assertEquals(false, result);
            }
        } 
    }

    @Test
    public void testEmptyBirthday() {
        ArrayList<String> Marcus = new ArrayList<String>();
        Marcus.add("adlfasdf");
        Parent parent = new Parent("Marcus", "Campbell", "", "jalfd", "8529639876", "", "Magnoial", "Columbia", "GA", "15462", "US", "Male", Marcus, "dafaddfasdf");
        Boolean result = false;
        
        ParentsList.getInstance().addParentToList(parent);

        for(int i = 0; i < ParentsList.getInstance().getAllParents().size(); i++) {
            if(ParentsList.getInstance().getAllParents().get(i).equals(parent)) {
                result = true;
                assertEquals(false, result);
            }
        } 
    }

    @Test
    public void testEmptyStreet() {
        ArrayList<String> Marcus = new ArrayList<String>();
        Marcus.add("adlfasdf");
        Parent parent = new Parent("Marcus", "Campbell", "", "jalfd", "8529639876", "null", "", "Columbia", "GA", "15462", "US", "Male", Marcus, "dafaddfasdf");
        Boolean result = false;
        
        ParentsList.getInstance().addParentToList(parent);

        for(int i = 0; i < ParentsList.getInstance().getAllParents().size(); i++) {
            if(ParentsList.getInstance().getAllParents().get(i).equals(parent)) {
                result = true;
                assertEquals(false, result);
            }
        } 
    }

    @Test
    public void testEmptyZipCode() {
        ArrayList<String> Marcus = new ArrayList<String>();
        Marcus.add("adlfasdf");
        Parent parent = new Parent("Marcus", "Campbell", "afd@gmail.com", "jalfd", "8529639876", "null", "Magnoial", "Columbia", "GA", "", "US", "Male", Marcus, "dafaddfasdf");
        Boolean result = false;
        
        ParentsList.getInstance().addParentToList(parent);

        for(int i = 0; i < ParentsList.getInstance().getAllParents().size(); i++) {
            if(ParentsList.getInstance().getAllParents().get(i).equals(parent)) {
                result = true;
                assertEquals(false, result);
            }
        } 
    }

    @Test
    public void testEmptyCountry() {
        ArrayList<String> Marcus = new ArrayList<String>();
        Marcus.add("adlfasdf");
        Parent parent = new Parent("Marcus", "Campbell", "", "jalfd", "8529639876", "null", "Magnoial", "Columbia", "GA", "15462", "", "Male", Marcus, "dafaddfasdf");
        Boolean result = false;
        
        ParentsList.getInstance().addParentToList(parent);

        for(int i = 0; i < ParentsList.getInstance().getAllParents().size(); i++) {
            if(ParentsList.getInstance().getAllParents().get(i).equals(parent)) {
                result = true;
                assertEquals(false, result);
            }
        } 
    }

    @Test
    /** Supposed to be true if user doesnt want to add gender */
    public void testEmptyGender() {
        ArrayList<String> Marcus = new ArrayList<String>();
        Marcus.add("adlfasdf");
        Parent parent = new Parent("Marcus", "Campbell", "", "jalfd", "8529639876", "null", "Magnoial", "Columbia", "GA", "15462", "US", "", Marcus, "dafaddfasdf");
        Boolean result = false;
        
        ParentsList.getInstance().addParentToList(parent);

        for(int i = 0; i < ParentsList.getInstance().getAllParents().size(); i++) {
            if(ParentsList.getInstance().getAllParents().get(i).equals(parent)) {
                result = true;
                assertEquals(true, result);
            }
        } 
    }

    @Test
    public void testEmptyChild() {
        ArrayList<String> Marcus = new ArrayList<String>();
        Marcus.add("");
        Parent parent = new Parent("Marcus", "Campbell", "", "jalfd", "8529639876", "null", "Magnoial", "Columbia", "GA", "15462", "US", "", Marcus, "dafaddfasdf");
        Boolean result = false;
        
        ParentsList.getInstance().addParentToList(parent);

        for(int i = 0; i < ParentsList.getInstance().getAllParents().size(); i++) {
            if(ParentsList.getInstance().getAllParents().get(i).equals(parent)) {
                result = true;
                assertEquals(false, result);
            }
        } 
    }

    @Test
    public void testGetAllParentValid() {
        int size = ParentsList.getInstance().getAllParents().size();
        assertEquals(28, size);
    }
    
}
