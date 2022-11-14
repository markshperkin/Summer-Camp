import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
public class childListTest {
    @BeforeEach
    public void init() {
        
        Child child1 = new Child("n1", "n2", "birthday1", "m", "L", "1");
        ChildsList.getInstance().addChild(child1);
        Child child2 = new Child("n2", "n2", "birthday2", "m", "m", "1");
        ChildsList.getInstance().addChild(child2);
        Child child3 = new Child("n3", "n3", "birthday3", "m", "l", "3");
        ChildsList.getInstance().addChild(child3);
    }

    @Test
    public void testAddValid() {
        Child child4 = new Child("n3", "n3", "birthday3", "m", "l", "3");
        boolean result = ChildsList.getInstance().addChild(child4);
        assertTrue(result);
    }

    @Test
    public void testAddDuplicate() {
        boolean result = ChildsList.getInstance().getAllChild().equals(ChildsList.getInstance().getAllChild());
        assertFalse(result);
    }

    @Test
    public void testNullChild() {
        Child child5 = new Child(null, null, null, null, null, null);
        Boolean result = false;
        ChildsList.getInstance().addChild(child5);
        for (int i=0; i < ChildsList.getInstance().getAllChild().size(); i++) {
            if(ChildsList.getInstance().getAllChild().get(i).equals(child5)) {
                result = true;
                assertEquals(false, result);
            }
        }
    }

    @Test
    public void testAddEmptyFirstName() {
        boolean result = ChildsList.getInstance().addChild(new Child("", "ln", "bd", "f", "l", "2"));
        assertFalse(result);
    }

    @Test
    public void testAddEmptyLastName() {
        boolean result = ChildsList.getInstance().addChild(new Child("nn", "", "bd", "f", "l", "2"));
        assertFalse(result);
    }

    @Test
    public void testAddEmptyBirthday() {
        boolean result = ChildsList.getInstance().addChild(new Child("nn", "ln", "", "f", "l", "2"));
        assertFalse(result);
    }

    @Test
    public void testAddEmptyGender() {
        boolean result = ChildsList.getInstance().addChild(new Child("nn", "", "bd", "", "l", "2"));
        assertFalse(result);
    }

    @Test
    public void testAddEmptyShirtSize() {
        boolean result = ChildsList.getInstance().addChild(new Child("nn", "", "bd", "f", "", "2"));
        assertFalse(result);
    }

    @Test
    public void testAddEmptyStrike() {
        boolean result = ChildsList.getInstance().addChild(new Child("nn", "", "bd", "f", "l", ""));
        assertFalse(result);
    }

    @Test
    public void testAddNullGender() {
        boolean result = ChildsList.getInstance().addChild(new Child("nn", "ln", "bd", null, "l", "2"));
        assertFalse(result);
    }

    @Test
    public void testAddNullBirthday() {
        boolean result = ChildsList.getInstance().addChild(new Child("nn", "ln", null, "m", "l", "2"));
        assertFalse(result);
    }

    @Test
    public void testAddNullShirtSize() {
        boolean result = ChildsList.getInstance().addChild(new Child("nn", "ln", null, "m", null, "2"));
        assertFalse(result);
    }

    @Test
    public void testAddNullStrike() {
        boolean result = ChildsList.getInstance().addChild(new Child("nn", "ln", null, "m", "m", null));
        assertFalse(result);
    }
    
    @Test
    public void testGetAllChildsValid() {
        int size = ChildsList.getInstance().getAllChild().size();
        assertEquals(3, size);
    }

    public void testgetAllChildsZero() {
        ChildsList.getInstance().clear();
        int size = ChildsList.getInstance().getAllChild().size();
        assertEquals(0,size);
    }

    public void testgetAllChildsInvalid() {
        int size = ChildsList.getInstance().getAllChild().size();
        assertEquals(3,size);
    }

}
