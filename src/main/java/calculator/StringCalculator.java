package calculator;

class StringCalculator {

	public int add(String input) {
		if (input == null || input.isEmpty())
			return 0;
		else

		{
			int result = 0;
			String[] strings = input.split(",");
			for (int i = 0; i < strings.length; i++) {
				int num = Integer.parseInt(strings[i]);
				result += num;
			}
			return result;
		}

	}

}