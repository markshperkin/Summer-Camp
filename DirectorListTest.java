import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DirectorListTest {
    @BeforeEach
    public void init() {
        DirectorList.getInstance().addDirector("name1", "last1", "email1", "password1", "num1", "street1", "town1",
                "zip1", "state1", "country1", "birthday1", "male1");
        DirectorList.getInstance().addDirector("name2", "last2", "email2", "password2", "num2", "street2", "town2",
                "zip2", "state2", "country2", "birthday2", "male2");
        DirectorList.getInstance().addDirector("name3", "last3", "email3", "password3", "num3", "street3", "town3",
                "zip3", "state3", "country3", "birthday3", "male3");

    }

    @Test
    public void testLoginInvalid() {
        boolean result = DirectorList.getInstance().login("jsmart", "12345");
        assertEquals(false, result);
    }

    @Test
    public void testLoginValid() {
        boolean result = DirectorList.getInstance().login("name1", "password1");
        assertEquals(true, result);
    }

    @Test
    public void testAddValid() {
        boolean result = DirectorList.getInstance().addDirector("name4", "last4", "email4", "password4", "num4",
                "street4", "town4", "zip4", "state4", "country4", "birthday4", "male4");
        assertTrue(result);
    }

    @Test
    public void testAddDuplicate() {
        boolean result = DirectorList.getInstance().getAllDirectors().equals(DirectorList.getInstance().getAllDirectors());
        assertFalse(result);
    }

    @Test
    public void testAddNullUserName() {
        boolean result = DirectorList.getInstance().addDirector(null, "last4", "email4", "password4", "num4",
                "street4", "town4", "zip4", "state4", "country4", "birthday4", "male4");
        assertFalse(result);
    }

    @Test
    public void testAddNullUserLastName() {
        boolean result = DirectorList.getInstance().addDirector("name4", null, "email4", "password4", "num4",
                "street4", "town4", "zip4", "state4", "country4", "birthday4", "male4");
        assertFalse(result);
    }

    @Test
    public void testAddNullEmail() {
        boolean result = DirectorList.getInstance().addDirector("name4", "last4", null, "password4", "num4",
                "street4", "town4", "zip4", "state4", "country4", "birthday4", "male4");
        assertFalse(result);
    }

    @Test
    public void testAddNullPassword() {
        boolean result = DirectorList.getInstance().addDirector("name4", "last4", "email4", null, "num4",
                "street4", "town4", "zip4", "state4", "country4", "birthday4", "male4");
        assertFalse(result);
    }

    @Test
    public void testAddNullPhoneNum() {
        boolean result = DirectorList.getInstance().addDirector("name4", "last4", "email4", "password4", null,
                "street4", "town4", "zip4", "state4", "country4", "birthday4", "male4");
        assertFalse(result);
    }

    @Test
    public void testAddNullStreet() {
        boolean result = DirectorList.getInstance().addDirector("name4", "last4", "email4", "password4", "num4",
                null, "town4", "zip4", "state4", "country4", "birthday4", "male4");
        assertFalse(result);
    }

    @Test
    public void testAddNullTown() {
        boolean result = DirectorList.getInstance().addDirector("name4", "last4", "email4", "password4", "num4",
                "street4", null, "zip4", "state4", "country4", "birthday4", "male4");
        assertFalse(result);
    }

    @Test
    public void testAddNullZipCode() {
        boolean result = DirectorList.getInstance().addDirector("name4", "last4", "email4", "password4", "num4",
                "street4", "town4", null, "state4", "country4", "birthday4", "male4");
        assertFalse(result);
    }

    @Test
    public void testAddNullState() {
        boolean result = DirectorList.getInstance().addDirector("name4", "last4", "email4", "password4", "num4",
                "street4", "town4", "zip4", null, "country4", "birthday4", "male4");
        assertFalse(result);
    }

    @Test
    public void testAddNullCountry() {
        boolean result = DirectorList.getInstance().addDirector("name4", "last4", "email4", "password4", "num4",
                "street4", "town4", "zip4", "state4", null, "birthday4", "male4");
        assertFalse(result);
    }

    @Test
    public void testAddNullBirthday() {
        boolean result = DirectorList.getInstance().addDirector("name4", "last4", "email4", "password4", "num4",
                "street4", "town4", "zip4", "state4", "country4",null, "male4");
        assertFalse(result);
    }

    @Test
    public void testAddNullGender() {
        boolean result = DirectorList.getInstance().addDirector("name4", "last4", "email4", "password4", "num4",
                "street4", "town4", "zip4", "state4", "country4", "birthday4", null);
        assertFalse(result);
    }

    @Test
    public void testAddEmptyUserName() {
        boolean result = DirectorList.getInstance().addDirector("", "last4", "email4", "password4", "num4",
                "street4", "town4", "zip4", "state4", "country4", "birthday4", "male4");
        assertFalse(result);
    }

    @Test
    public void testAddEmptyLastName() {
        boolean result = DirectorList.getInstance().addDirector("name4", "", "email4", "password4", "num4",
                "street4", "town4", "zip4", "state4", "country4", "birthday4", "male4");
        assertFalse(result);
    }

    @Test
    public void testAddEmptyEmail() {
        boolean result = DirectorList.getInstance().addDirector("name4", "last4", "", "password4", "num4",
                "street4", "town4", "zip4", "state4", "country4", "birthday4", "male4");
        assertFalse(result);
    }

    @Test
    public void testAddEmptyPassword() {
        boolean result = DirectorList.getInstance().addDirector("name4", "last4", "email4", "", "num4",
                "street4", "town4", "zip4", "state4", "country4", "birthday4", "male4");
        assertFalse(result);
    }

    @Test
    public void testAddEmptyPhoneNum() {
        boolean result = DirectorList.getInstance().addDirector("name4", "last4", "email4", "password4", "",
                "street4", "town4", "zip4", "state4", "country4", "birthday4", "male4");
        assertFalse(result);
    }

    @Test
    public void testAddEmptyStreet() {
        boolean result = DirectorList.getInstance().addDirector("name4", "last4", "email4", "password4", "num4",
                "", "town4", "zip4", "state4", "country4", "birthday4", "male4");
        assertFalse(result);
    }

    @Test
    public void testAddEmptyTown() {
        boolean result = DirectorList.getInstance().addDirector("name4", "last4", "email4", "password4", "num4",
                "street4", "", "zip4", "state4", "country4", "birthday4", "male4");
        assertFalse(result);
    }

    @Test
    public void testAddEmptyZipCode() {
        boolean result = DirectorList.getInstance().addDirector("name4", "last4", "email4", "password4", "num4",
                "street4", "town4", "", "state4", "country4", "birthday4", "male4");
        assertFalse(result);
    }

    @Test
    public void testAddEmptyState() {
        boolean result = DirectorList.getInstance().addDirector("name4", "last4", "email4", "password4", "num4",
                "street4", "town4", "zip4", "", "country4", "birthday4", "male4");
        assertFalse(result);
    }

    @Test
    public void testAddEmptyCountry() {
        boolean result = DirectorList.getInstance().addDirector("name4", "last4", "email4", "password4", "num4",
                "street4", "town4", "zip4", "state4", "", "birthday4", "male4");
        assertFalse(result);
    }

    @Test
    public void testAddEmptyBirthday() {
        boolean result = DirectorList.getInstance().addDirector("name4", "last4", "email4", "password4", "num4",
                "street4", "town4", "zip4", "state4", "country4", "", "male4");
        assertFalse(result);
    }

    @Test
    public void testAddEmptyGender() {
        boolean result = DirectorList.getInstance().addDirector("name4", "last4", "email4", "password4", "num4",
                "street4", "town4", "zip4", "state4", "country4", "birthday4", "");
        assertFalse(result);
    }

    @Test
    public void testAddInvalidEmail() {
        boolean result = DirectorList.getInstance().addDirector("name4", "last4", "emailgmail", "password4", "num4",
                "street4", "town4", "zip4", "state4", "country4", "birthday4", "male4");
        assertFalse(result);
    }

    @Test
    public void testAddInvalidPhoneNum() {
        boolean result = DirectorList.getInstance().addDirector("name4", "last4", "email4", "password4", "noNumb",
                "street4", "town4", "zip4", "state4", "country4", "birthday4", "male4");
        assertFalse(result);
    }

    @Test
    public void testAddInvalidZIpCode() {
        boolean result = DirectorList.getInstance().addDirector("name4", "last4", "email4", "password4", "num4",
                "street4", "town4", "noNumb", "state4", "country4", "birthday4", "male4");
        assertFalse(result);
    }

    @Test
    public void testAddValidBirthdayFormat() {
        boolean result = DirectorList.getInstance().addDirector("name4", "last4", "email4", "password4", "num4",
                "street4", "town4", "zip4", "state4", "country4", "01/01/0001", "male4");
        assertTrue(result);
    }

    @Test
    public void testAddInvalidBirthdayFormatDots() {
        boolean result = DirectorList.getInstance().addDirector("name4", "last4", "email4", "password4", "num4",
                "street4", "town4", "zip4", "state4", "country4", "01.01.0001", "male4");
        assertFalse(result);
    }

    @Test
    public void testAddInvalidBirthdayFormatExsistingDate() {
        boolean result = DirectorList.getInstance().addDirector("name4", "last4", "email4", "password4", "num4",
                "street4", "town4", "zip4", "state4", "country4", "99/99/0000", "male4");
        assertFalse(result);
    }

    @Test
    public void testAddInvalidBirthdayFormatFuture() {
        boolean result = DirectorList.getInstance().addDirector("name4", "last4", "email4", "password4", "num4",
                "street4", "town4", "zip4", "state4", "country4", "04/05/2320", "male4");
        assertFalse(result);
    }

    @Test
    public void testAddInvalidphoneNum() {
        DirectorList.getInstance().clear();
        boolean result = DirectorList.getInstance().addDirector("name4", "last4", "email4", "password4", "num4",
                "street4", "town4", "zip4", "state4", "country4", "birthday4", "male4");
        assertTrue(result);
    }

    @Test
    public void testGetAllDirectorsValid() {
        int size = DirectorList.getInstance().getAllDirectors().size();
        assertEquals(3, size);
    }

    public void testGetAllDirectorsZero() {
        DirectorList.getInstance().clear();
        int size = DirectorList.getInstance().getAllDirectors().size();
        assertEquals(0, size);
    }

    public void testGetAllDirectorsInvalid() {
        int size = DirectorList.getInstance().getAllDirectors().size();
        assertEquals(3, size);
    }
}
