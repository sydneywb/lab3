import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.*;

public class FileTests {

    public String[] toArray(List<File> list) {
        String[] result = new String[list.size()];
        for (int i = 0; i < list.size(); ++i) {
            result[i] = list.get(i).getPath();
        }
        return result;
    }

    public boolean isSubset(String[] big, String[] small) {
        for (int i = 0; i < small.length; ++i) {
            if (!Arrays.asList(big).contains(small[i])) {
                return false;
            }
        }
        return true;
    }

    @Test
    public void testFile() throws IOException{
        File start = new File("some-files");
        List<File> expected = new ArrayList<File> (Arrays.asList(new File("some-files/a.txt"), new File("some-files/more-files/b.txt"), new File("some-files/more-files/c.java"), new File("some-files/even-more-files/d.java"), new File("some-files/even-more-files/a.txt")));


        // System.out.println(Arrays.toString(toArray(FileExample.getFiles(start))));
        // System.out.println(Arrays.toString(toArray(expected)));
        assertEquals(true, isSubset(toArray(FileExample.getFiles(start)), toArray(expected)));
        assertEquals(true, isSubset(toArray(expected), toArray(FileExample.getFiles(start))));
    }
}

/*
 * some-files/
  |-  a.txt
  |-  more-files/
      |-  b.txt
      |-  c.java
  |-  even-more-files/
      |-  d.java
      |-  a.txt
 */