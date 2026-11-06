package test.java.com.lab7.functional.service;

import main.java.com.lab7.functional.service.NumberService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumberServiceTest {

    NumberService service = new NumberService();

    @Test
    public void testZero() {
        assertEquals("zero", service.convertCustom(0));
    }

    @Test
    public void testNumber() {
        assertEquals("twenty-five", service.convertCustom(25));
    }

    @Test
    public void testHundred() {
        assertEquals("one hundred twenty-three", service.convertCustom(123));
    }

    @Test
    public void testThousand() {
        assertEquals("one thousand", service.convertCustom(1000));
    }

    @Test
    public void testStandardInterface() {
        assertEquals("two hundred forty-five", service.convertStandard(245));
    }

    @Test
    public void testInvalidNumber() {
        assertEquals("Number must be between 0 and 9999", service.convertCustom(10000));
    }
}
