package zman0900;

import com.example.common.Item;
import com.example.user.Box;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DemoTest {
    private Item i1;
    private Item i2;
    private Box box;

    @Before
    public void setup() {
        i1 = new Item();
        i1.setName("item 1");
        i1.setSize(5);

        i2 = new Item();
        i2.setName("item 2");
        i2.setSize(42);

        box = new Box();
        box.getItem().add(i1);
        box.getItem().add(i2);
    }

    @Test
    public void localToStringWorks() {
        // This will produce a string include contents of the "Items".
        String string = box.toString();
        assertFalse(string.isEmpty());
        System.out.println("Working toString: " + string);
    }

    @Test
    public void commonToStringFails() {
        try {
            // This will cause a NoSuchFieldError.
            i1.toString();
            fail("Exception expected");
        } catch (NoSuchFieldError e) {
            System.out.println("toString fails!");
            e.printStackTrace();
        }
    }

    @Test
    public void localCloneWorks() {
        Box copy = (Box) box.clone();
        assertNotSame(box, copy);
        assertEquals(box, copy);
    }

    @Test
    public void commonCloneFails() {
        try {
            // This will cause a NoSuchFieldError.
            i1.clone();
            fail("Exception expected");
        } catch (NoSuchFieldError e) {
            System.out.println("clone fails!");
            e.printStackTrace();
        }
    }
}
