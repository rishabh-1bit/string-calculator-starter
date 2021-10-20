package calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringCalculatorShould {
	 
	private  StringCalculator stringCalculator = new StringCalculator();
    
	@Test
    void empty_string_should_return_0() {
       
        assertEquals(0, stringCalculator.add(""));
    }

    @Test
    void string_with_single_number_should_return_number_as_int() {

        assertEquals(1, stringCalculator.add("1"));
    }
    @Test
    void string_with_two_number_should_return_result_as_int() {

        assertEquals(4, stringCalculator.add("3,1"));
        }
    @Test
    void string_with_multiple_number_should_return_result_as_int() {

        assertEquals(6, stringCalculator.add("1,2,3"));
        }
    
    @Test
    void should_accept_NewLine_as_delimiter() {
    	assertEquals(6, stringCalculator.add("1,2\n3"));
    }
    
    @Test
    void should_accept_different_syntax_as_delimiters() {
    	assertEquals(3, stringCalculator.add("//;\n1;2"));
    }
    @Test
    void string_with_negative_integers() {
    	try {
    		stringCalculator.add("-1,-2,7");
    		fail("Exception expected");
    	}catch(RuntimeException re){
    		assertEquals("Negatives not allowed!! [-1, -2]", re.getMessage());
    	}
    }
    @Test
    void should_return_42() {
    	assertEquals(42, stringCalculator.add("1,6,6,6,4,5,6"));
    }

}
