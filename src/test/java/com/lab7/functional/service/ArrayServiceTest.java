package test.java.com.lab7.functional.service;

import main.java.com.lab7.functional.service.ArrayService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ArrayServiceTest {

    ArrayService service = new ArrayService();

    @Test
    public void testFilterCustom() {
        String[] words = {"cat", "elephant", "dog", "computer"};

        String[] expected = {"elephant", "computer"};

        assertArrayEquals(expected, service.filterCustom(words, 3));
    }

    @Test
    public void testFilterStandard() {
        String[] words = {"cat", "elephant", "dog", "computer"};

        String[] expected = {"elephant", "computer"};

        assertArrayEquals(expected, service.filterStandard(words, 3));
    }

    @Test
    public void testEmptyResult() {
        String[] words = {"cat", "dog"};

        String[] expected = {};

        assertArrayEquals(expected, service.filterCustom(words, 5));
    }
}
