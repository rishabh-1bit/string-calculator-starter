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
}
