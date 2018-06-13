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
    public void works() {
        // This will produce a string include contents of the "Items".
        tryToString(box);
    }

    @Test
    public void fails() {
        // This will cause a NoSuchFieldError.
        tryToString(i1);
    }

    private void tryToString(Object obj) {
        try {
            String string = obj.toString();
            assertFalse(string.isEmpty());
            System.out.println(string);
        } catch (NoSuchFieldError e) {
            e.printStackTrace();
            fail();
        }
    }
}
