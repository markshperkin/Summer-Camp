import static org.junit.jupiter.api.Assertions.*;

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
    public void testLoginNull() {
        boolean result = ParentsList.getInstance().login(null, null);
        assertEquals(false, result);
    }
    @Test
    public void testAddParentToList() {
        Parent parent = new Parent("Marcus", "Campbell", "mail@email.com", "null", "null", "null", "null", "null", "null", "null", "null", "null", "null", "null");
    }



}
