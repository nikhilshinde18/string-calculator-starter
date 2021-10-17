package calculator;

import org.junit.jupiter.api.Test;


import static org.junit.Assert.assertEquals;
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
    
    @Test
	public void testTwoNumbers(){
		assertEquals(3, StringCalculator.add("1,2"));
	}
    
    
    @Test
    public void testThreeNumbers(){
    	assertEquals(6, StringCalculator.add("1,2,3"));
    }
    
    

    @Test
    public void testLine(){
    	assertEquals(6, StringCalculator.add("1\n2,3"));
    }

    @Test
    public void testNegativeNumver(){
    	try {
    		StringCalculator.add("-1,2");
		}
		catch (IllegalArgumentException e){
			assertEquals(e.getMessage(), "Negatives not allowed: -1");
		}

		try {
			StringCalculator.add("2,-4,3,-5");
		}
		catch (IllegalArgumentException e){
			assertEquals(e.getMessage(), "Negatives not allowed: -4,-5");
		}
    }

    @Test
    public void testOverThousand(){
    	assertEquals(2, StringCalculator.add("1000,2"));
    }

    @Test
    public void testOtherDelimiter(){
    	assertEquals(3, StringCalculator.add("//;\n1;2"));
    }
    
    
    
    
    
}
