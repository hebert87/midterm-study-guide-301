import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

import org.junit.jupiter.api.Test;

public class PracticeTest {

    // TODO: Make more tests for maxDiff
    @Test
    void testMaxDiffPositiveAndNegative() {
        // Arrange
        int[] numbers = {8, -2, 9, -5};

        // Act
        int actual = Practice.maxDiff(numbers);

        // Assert
        // Largest: 9, Smallest: -5, Difference: 9 - -5 = 14
        assertEquals(14, actual);
    }

    @Test
    void testMaxDiffSingleValue() {
        int[] nums = {5};
        assertEquals(0, Practice.maxDiff(nums));
    }


    // longestWord
    @Test
    void testLongestWord() {
        HashMap<String, String> map = new HashMap<>();
        map.put("a", "apple");
        map.put("b", "apricot");
        map.put("c", "banana");

        assertEquals("apricot", Practice.longestWord(map, 'a'));
    }

    @Test
    void testLongestWordNoneMatch() {
        HashMap<String, String> map = new HashMap<>();
        map.put("a", "banana");

        assertEquals("", Practice.longestWord(map, 'z'));
    }

    //countWords
    @Test
    void testCountWords() {
        ArrayList<String> words = new ArrayList<>();
        words.add("hi");
        words.add("hello");
        words.add("world");
        words.add("a");

        assertEquals(2, Practice.countWords(words, 2, 6));
    }

    //differenceInOddEven
    @Test
    void testOddEvenDifference() {
        HashSet<Integer> nums = new HashSet<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);

        assertEquals(0, Practice.differenceInOddEven(nums));
    }
    
    //secondLargestNum
    @Test
    void testSecondLargest() {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(10, 1);
        map.put(5, 2);
        map.put(20, 3);

        assertEquals(10, Practice.secondLargestNum(map));
    }
    
}


