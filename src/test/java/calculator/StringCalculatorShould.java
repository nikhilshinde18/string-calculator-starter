package calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringCalculatorShould {
    
    @Test
    public void testEmptyString() {
        //StringCalculator stringCalculator = new StringCalculator();
        assertEquals(0, StringCalculator.add(""));
    }
}
