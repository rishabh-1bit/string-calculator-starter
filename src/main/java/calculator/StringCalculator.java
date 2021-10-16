package calculator;

class StringCalculator {

	public int add(String input) {
		if (input == null || input.isEmpty())
			return 0;
		else if(input.contains(","))

		{
			int result=0;
			String[] strings = input.split(",");
			for(int i=0;i<strings.length;i++) {
				int num=changeToInt(strings[i] );
				result+=num;
			}
			return result;
		} 
		else {
			return changeToInt(input);
		}

	}

	private int changeToInt(String string) throws NumberFormatException {
		
		return Integer.parseInt(string);
	}

}