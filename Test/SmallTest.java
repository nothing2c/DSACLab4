import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SmallTest {

    @Test
    void testFindSmallest()
    {
        int[] numbers = {11, 6, 14, 7, 45, 98, 34, 23, 23};

        int expected = 6;
        int actual = Small.findSmallest(numbers, numbers.length - 1);

        assertEquals(expected, actual);
    }

    @Test
    void testFindSmallestFirst()
    {
        int[] numbers = {1, 6, 14, 7, 45, 98, 34, 23, 23};

        int expected = 1;
        int actual = Small.findSmallest(numbers, numbers.length - 1);

        assertEquals(expected, actual);
    }

    @Test
    void testFindSmallestLast()
    {
        int[] numbers = {2, 6, 14, 7, 45, 98, 34, 23, 1};

        int expected = 1;
        int actual = Small.findSmallest(numbers, numbers.length - 1);

        assertEquals(expected, actual);
    }

    @Test
    void testFindSmallestNegative()
    {
        int[] numbers = {-2, 6, 14, 7, 45, 98, 34, 23, 1};

        int expected = -2;
        int actual = Small.findSmallest(numbers, numbers.length - 1);

        assertEquals(expected, actual);
    }
}