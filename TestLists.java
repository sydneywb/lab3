import org.junit.Assert.*;

import java.util.List;
import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;

import java.util.ArrayList;

import org.junit.*;



class ShortStringChecker implements StringChecker {
  public boolean checkString(String s) {
    if (s.length() < 4) { // short strings are those with length of 3 or less
      return true;
    }
    return false;
  }
}



public class TestLists {

    // helper method
    public String[] toArray(List<String> list) {
        String[] result = new String[list.size()];
        for (int i = 0; i < list.size(); ++i) {
            result[i] = list.get(i);
        }
        return result;
    }



    @Test
    public void testFilter() {
        List<String> input = new ArrayList<String> (Arrays.asList("apple", "banana", "orange", "cat", "dog"));
        StringChecker sc = new ShortStringChecker();
        String[] expected = new String[] {"cat", "dog"};
        assertArrayEquals(expected, toArray(ListExamples.filter(input, sc)));
    }

    @Test
    public void testMerge() {
        List<String> input1 = new ArrayList<String> (Arrays.asList("a"));
        List<String> input2 = new ArrayList<String> (Arrays.asList("a", "b"));
        String[] actual = toArray(ListExamples.merge(input1, input2));
        String[] expected = new String[] {"a", "a", "b"};
        assertArrayEquals(expected, actual);

    }
}
