package test.java.com.lab7.functional.service;

import main.java.com.lab7.functional.service.TextService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TextServiceTest {

    TextService service = new TextService();

    @Test
    public void testProcessText() {
        String result = service.processText("Hello world", 2, 3);

        assertEquals("Hello, world, Hello, ", result);
    }

    @Test
    public void testProcessTextStandard() {
        String result = service.processTextStandard("Hello world", 2, 3);

        assertEquals("Hello, world, Hello, ", result);
    }

    @Test
    public void testLimit() {
        String result = service.processText("One two three", 2, 2);

        assertEquals("One, two, ", result);
    }

    @Test
    public void testEmptyText() {
        String result = service.processText("", 2, 5);

        assertEquals("", result);
    }
}