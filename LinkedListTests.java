import org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

import org.junit.*;
public class LinkedListTests {
    @Test
    public void testAppend() {
        System.out.println("what is happening");
        LinkedList myLinkedList = new LinkedList();
        myLinkedList.prepend(1);
        myLinkedList.prepend(2);
        myLinkedList.prepend(3);
        myLinkedList.prepend(4);
        myLinkedList.append(5);
        assertEquals(5, myLinkedList.length());

    }
}
