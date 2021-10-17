package calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringCalculatorShould {
    
    @Test
    public void testEmptyString() {
        assertEquals(0, StringCalculator.add(""));
    }
    
    @Test
    public void testOneNum() {
        assertEquals(1, StringCalculator.add("1"));
    }
    
    
    
    
    
    
    
    
    
    
    
}
