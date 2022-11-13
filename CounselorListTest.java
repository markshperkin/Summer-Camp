/**
 * CounselorList written and tested by Rick Jiang
 */

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



public class CounselorListTest {
    @BeforeEach
    public void init(){
        CounselorList.getInstance().addCounselor("fname", "lname", "birth", "gender","aboutme", "shirtSize","uuid", "email","password","phonenum", "street", "town", "zipcode", "state", "country");
        CounselorList.getInstance().addCounselor("name2", "last2", "email2", "password2", "num2", "street2", "town2",
        "zip2", "state2", "country2", "birthday2", "town","zipcode", "state", "country");
        CounselorList.getInstance().addCounselor("name3", "last3", "email3", "password3", "num3", "street3", "town3",
        "zip3", "state3", "country3", "birthday3", "male3", "zipcode2", "state", "country");
    }
        @Test
        public void testLoginInvalid() {
            boolean result = CounselorList.getInstance().login("jsmart", "12345");
            assertEquals(false, result);
        }
    
        @Test
        public void testLoginValid() {
            boolean result = CounselorList.getInstance().login("name1", "password1");
            assertEquals(true, result);
        }
    
        @Test
        public void testAddValid() {
            boolean result = CounselorList.getInstance().addCounselor("name4", "last4", "email4", "password4", "num4",
                    "street4", "town4", "zip4", "state4", "country4", "birthday4", "male4", "zipcode4", "state4", "country4");
            assertTrue(result);
        }
    
        @Test
        public void testAddDuplicate() {
            boolean result = CounselorList.getInstance().getAllCounselors().equals(CounselorList.getInstance().getAllCounselors());
            assertFalse(result);
        }
    
        @Test
        public void testAddNullUserName() {
            boolean result = CounselorList.getInstance().addCounselor(null, "last4", "email4", "password4", "num4",
                    "street4", "town4", "zip4", "state4", "country4", "birthday4", "male4","zipcode4","state4", "country4");
            assertFalse(result);
        }
    
        @Test
        public void testAddNullUserLastName() {
            boolean result = CounselorList.getInstance().addCounselor("name4", "lname", "email4", "password4", "num4",
                    "street4", "town4", "zip4", "state4", "country4", "birthday4", "male4", "zipcode4", "state4", "country");
            assertFalse(result);
        }
    
        @Test
        public void testAddNullEmail() {
            boolean result = CounselorList.getInstance().addCounselor("name4", "last4", "birth4", "password4", "num4",
                    "street4", "town4", "zip4", "state4", "country4", "birthday4", "male4", "zipcode4", "state4", "country4");
            assertFalse(result);
        }
    
        @Test
        public void testAddNullPassword() {
            boolean result = CounselorList.getInstance().addCounselor("name4", "last4", "email4", "gender4", "num4",
                    "street4", "town4", "zip4", "state4", "country4", "birthday4", "male4", "zipcode4", "statte4", null);
            assertFalse(result);
        }
    
        @Test
        public void testAddNullPhoneNum() {
            boolean result = CounselorList.getInstance().addCounselor("name4", "last4", "email4", "password4", "aboutme",
                    "street4", "town4", "zip4", "state4", "country4", "birthday4", "male4","zipCode", "state5","country9");
            assertFalse(result);
        }
    
        @Test
        public void testAddNullStreet() {
            boolean result = CounselorList.getInstance().addCounselor("name4", "last4", "email4", "password4", "num4",
                    null, "town4", "zip4", "state4", "country4", "birthday4", "male4", "zipcode", "state","country");
            assertFalse(result);
        }
    
        @Test
        public void testAddNullTown() {
            boolean result = CounselorList.getInstance().addCounselor("name4", "last4", "email4", "password4", "num4",
                    "street4", null, "zip4", "state4", "country4", "birthday4", "male4", "zipcode4","state4", "country4");
            assertFalse(result);
        }
    
        @Test
        public void testAddNullZipCode() {
            boolean result = CounselorList.getInstance().addCounselor("name4", "last4", "email4", "password4", "num4",
                    "street4", "town4", null, "state4", "country4", "birthday4", "male4", "zipcode4", "state4", "country4");
            assertFalse(result);
        }
    
        @Test
        public void testAddNullState() {
            boolean result = CounselorList.getInstance().addCounselor("name4", "last4", "email4", "password4", "num4",
                    "street4", "town4", "zip4", null, "country4", "birthday4", "male4", "zipcode4"," ", "country4");
            assertFalse(result);
        }
    
        @Test
        public void testAddNullCountry() {
            boolean result = CounselorList.getInstance().addCounselor("name4", "last4", "email4", "password4", "num4",
                    "street4", "town4", "zip4", "state4", "phonenum", "birthday4", "male4", "zipcode4", "state4", " ");
            assertFalse(result);
        }
    
        @Test
        public void testAddNullBirthday() {
            boolean result = CounselorList.getInstance().addCounselor("name4", "last4", "email4", "password4", "num4",
                    "street4", "town4", "zip4", "state4", "country4","street4", "male4", "zipcode4","state4", "country4");
            assertFalse(result);
        }
    
        @Test
        public void testAddNullGender() {
            boolean result = CounselorList.getInstance().addCounselor("name4", "last4", "email4", "password4", "num4",
                    "street4", "town4", "zip4", "state4", "country4", "birthday4", null, null, null, null);
            assertFalse(result);
        }
    
        @Test
        public void testAddEmptyUserName() {
            boolean result = CounselorList.getInstance().addCounselor("", "last4", "email4", "password4", "num4",
                    "street4", "town4", "zip4", "state4", "country4", "birthday4", "male4", "zipcode4", "state4", "country4");
            assertFalse(result);
        }
    
        @Test
        public void testAddEmptyLastName() {
            boolean result = CounselorList.getInstance().addCounselor("name4", "", "email4", "password4", "num4",
                    "street4", "town4", "zip4", "state4", "country4", "birthday4", "male4", "zipcode4", "state4" , "country");
            assertFalse(result);
        }
    
        @Test
        public void testAddEmptyEmail() {
            boolean result = CounselorList.getInstance().addCounselor("name4", "last4", "", "password4", "num4",
                    "street4", "town4", " ", "state4", "country4", "birthday4", "male4", "zipcode4", "state4","country4");
            assertFalse(result);
        }
    
        @Test
        public void testAddEmptyPassword() {
            boolean result = CounselorList.getInstance().addCounselor("name4", "last4", "email4", "gender", "num4",
                    "street4", "town4", "zip4", " ", "country4", "birthday4", "male4", "zipcode4", "state4", "country4");
            assertFalse(result);
        }
    
        @Test
        public void testAddEmptyPhoneNum() {
            boolean result = CounselorList.getInstance().addCounselor("name4", "last4", "email4", "password4", "",
                    "street4", "town4", "zip4", "state4", "country4", "birthday4", "male4", "zipcode4", "state4", "country4");
            assertFalse(result);
        }
    
        @Test
        public void testAddEmptyStreet() {
            boolean result = CounselorList.getInstance().addCounselor("name4", "last4", "email4", "password4", "num4",
                    "", "town4", "zip4", "state4", "country4", "birthday4", "male4", "zipcode4", "state4","country4");
            assertFalse(result);
        }
    
        @Test
        public void testAddEmptyTown() {
            boolean result = CounselorList.getInstance().addCounselor("name4", "last4", "email4", "password4", "num4",
                    "street4", "", "zip4", "state4", "country4", "birthday4", " ", "zipcode4", "state4", "country4");
            assertFalse(result);
        }
    
        @Test
        public void testAddEmptyZipCode() {
            boolean result = CounselorList.getInstance().addCounselor("name4", "last4", "email4", "password4", "num4",
                    "street4", "town4", "", "state4", "country4", "birthday4", "male4", " ", "state", "country4");
            assertFalse(result);
        }
    
        @Test
        public void testAddEmptyState() {
            boolean result = CounselorList.getInstance().addCounselor("name4", "last4", "email4", "password4", "num4",
                    "street4", "town4", "zip4", "password4", "country4", "birthday4", "male4", "zipcode4", " ", "country4");
            assertFalse(result);
        }
    
        @Test
        public void testAddEmptyCountry() {
            boolean result = CounselorList.getInstance().addCounselor("name4", "last4", "email4", "password4", "num4",
                    "street4", "town4", "zip4", "state4", "phoneNum", "birthday4", "male4", "zipcode4", "state4", " ");
            assertFalse(result);
        }
    
        @Test
        public void testAddEmptyBirthday() {
            boolean result = CounselorList.getInstance().addCounselor("name4", "last4", " ", "password4", "num4",
                    "street4", "town4", "zip4", "state4", "country4", "street4", "male4", "zipcode4", "state4", "country4");
            assertFalse(result);
        }
    
        @Test
        public void testAddEmptyGender() {
            boolean result = CounselorList.getInstance().addCounselor("name4", "last4", "email4", "password4", "num4",
                    "street4", "town4", "zip4", "state4", "country4", "birthday4", "town4", "zipcode4", "state4", "country4");
            assertFalse(result);
        }
    
        @Test
        public void testAddInvalidEmail() {
            boolean result = CounselorList.getInstance().addCounselor("name4", "last4", "emailgmail", "password4", "num4",
                    "street4", "town4", "zip4", "state4", "country4", "birthday4", "male4", "zipcode4", "state4", "country4");
            assertFalse(result);
        }
    
        @Test
        public void testAddInvalidPhoneNum() {
            boolean result = CounselorList.getInstance().addCounselor("name4", "last4", "email4", "password4", "noNumb",
                    "street4", "town4", "zip4", "state4", "country4", "birthday4", "male4", "zipCode4", "state4", "country4");
            assertFalse(result);
        }
    
        @Test
        public void testAddInvalidZIpCode() {
            boolean result = CounselorList.getInstance().addCounselor("name4", "last4", "email4", "password4", "num4",
                    "street4", "town4", "noNumb", "state4", "country4", "birthday4", "male4", "no332", "state4", "country4");
            assertFalse(result);
        }
    
        @Test
        public void testAddValidBirthdayFormat() {
            boolean result = CounselorList.getInstance().addCounselor("name4", "last4", "email4", "password4", "num4",
                    "street4", "town4", "zip4", "state4", "country4", "01/01/0001", "male4", "zipcode4", "state4", "country4");
            assertTrue(result);
        }
    
        @Test
        public void testAddInvalidBirthdayFormatDots() {
            boolean result = CounselorList.getInstance().addCounselor("name4", "last4", "email4", "password4", "num4",
                    "street4", "town4", "zip4", "state4", "country4", "01.01.0001", "male4", "zipcode4", "state4", "country4");
            assertFalse(result);
        }
    
        @Test
        public void testAddInvalidBirthdayFormatExsistingDate() {
            boolean result = CounselorList.getInstance().addCounselor("name4", "last4", "email4", "password4", "num4",
                    "street4", "town4", "zip4", "state4", "country4", "99/99/0000", "male4", "zipCode4", "state4", "country4");
            assertFalse(result);
        }
    
        @Test
        public void testAddInvalidBirthdayFormatFuture() {
            boolean result = CounselorList.getInstance().addCounselor("name4", "last4", "email4", "password4", "num4",
                    "street4", "town4", "zip4", "state4", "country4", "04/05/2320", "male4", null, null, null);
            assertFalse(result);
        }
    
        @Test
        public void testAddInvalidphoneNum() {
            CounselorList.getInstance().clear();
            boolean result = CounselorList.getInstance().addCounselor("name4", "last4", "email4", "password4", "num4",
                    "street4", "town4", "zip4", "state4", "country4", "birthday4", "male4", null, null, null);
            assertTrue(result);
        }
    
        @Test
        public void testgetAllCounselorsValid() {
            int size = CounselorList.getInstance().getAllCounselors().size();
            assertEquals(3, size);
        }
    
        public void testgetAllCounselorsZero() {
            CounselorList.getInstance().clear();
            int size = CounselorList.getInstance().getAllCounselors().size();
            assertEquals(0, size);
        }
    
        public void testgetAllCounselorsInvalid() {
            int size = CounselorList.getInstance().getAllCounselors().size();
            assertEquals(3, size);
        
    
}
}




    

