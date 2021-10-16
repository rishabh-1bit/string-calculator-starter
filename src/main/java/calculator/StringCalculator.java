package calculator;

class StringCalculator {

    public int add(String input) {
    	if(input==null || input.isEmpty())
        return 0;
    	else
    		return Integer.parseInt(input);
    }

}