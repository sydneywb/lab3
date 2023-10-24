import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.*;

public class ArrayTests {


  // example tests
	@Test 
	public void testReverseInPlaceExample() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}

  @Test
  public void testReversedExample() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

  // my tests
  @Test
  public void testReverseInPlace() {
    int[] input = {1, 2, 3, 4, 5};
    ArrayExamples.reverseInPlace(input);
    assertArrayEquals(new int[] {5, 4, 3, 2, 1}, input);
  }

  @Test
  public void testReversed() {
    int[] input = {1, 2, 3, 4, 5};
    assertEquals(false, ArrayExamples.reversed(input) == input);
  }

  @Test
  public void testAverage() {
    double[] input = {2.0, 2.0, 2.0};
    assertEquals(true, 2.0 == ArrayExamples.averageWithoutLowest(input));
  }


}
