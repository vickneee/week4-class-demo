import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorTest {

    private Calculator calculator;

    // Runs ONCE before all tests
    @BeforeAll
    static void setupAll() {
        System.out.println("Starting Calculator Tests");
    }

    // Runs BEFORE EACH test
    @BeforeEach
    void setup() {
        calculator = new Calculator();
        System.out.println(">>> @BeforeEach: Starting a test");
    }

    // A TEST method
    @Test
    void add() {
        assertEquals(5, calculator.add(2, 3));
    }

    @Test
    void sub() {
        assertEquals(1, calculator.sub(3, 2));
    }

    @Test
    void mul() {
        assertEquals(6, calculator.mul(2, 3));
    }

    @Test
    void div() {
        assertEquals(2.0, calculator.div(6, 3));
    }

    @Test
    void divByZero() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            calculator.div(1, 0);
        });
    }

    // Runs AFTER EACH test
    @AfterEach
    void teardownEach() {
        System.out.println(">>> @AfterEach: Test completed");
    }

    // Runs ONCE after all tests
    @AfterAll
    static void teardownAll() {
        System.out.println("Calculator Tests Completed");
    }
}