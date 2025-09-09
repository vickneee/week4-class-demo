import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorTest {

    Calculator cal = new Calculator();

    @BeforeAll
    static void setup() {
        System.out.println("Starting Calculator Tests");
    }

    @BeforeEach
    void init() {
        System.out.println("Starting a test");
    }

    @Test
    void add() {
        assertEquals(5, cal.add(2, 3));
    }

    @Test
    void sub() {
        assertEquals(1, cal.sub(3, 2));
    }

    @Test
    void mul() {
        assertEquals(6, cal.mul(2, 3));
    }

    @Test
    void div() {
        assertEquals(2.0, cal.div(6, 3));
    }

    @AfterAll
    static void teardown() {
        System.out.println("Calculator Tests Completed");
    }
}