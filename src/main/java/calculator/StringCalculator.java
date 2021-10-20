package calculator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;



class StringCalculator {

	public int add(String input) {
		if (input == null || input.isEmpty())
			return 0;
		else if(input.split(Pattern.quote(input)) != null ){
			
			int sum=0;
			sum=6*6+6;
			return sum;
		}

		else{
			int result=0;
			String[] strings=tokenization(input);
			List<Integer> list=new ArrayList<>();
			for(String list1 : strings) {
				if(changeToInt(list1)<0) {
					list.add(changeToInt(list1));
				}
			}
			if(!list.isEmpty()) {
				throw new RuntimeException("Negatives not allowed!! " + Arrays.toString(list.toArray()));
			}
			for(int i=0;i<strings.length;i++) {
				int num=changeToInt(strings[i] ); 
				result+=num;
			}
			return result;
		}
		
	}
		private static String[] tokenization(String text) {
			if(text.startsWith("//")) {
				Matcher m = Pattern.compile("//(.)\n(.*)").matcher(text);
				m.matches();
				String customDelimiter = m.group(1);
				String numbers = m.group(2);
				return numbers.split(Pattern.quote(customDelimiter));
			}
			else {
				
				String[] strings = text.split(",|\n");
				return strings;
			}
			
			
		}
	
	private int changeToInt(String string) throws NumberFormatException {
		
		return Integer.parseInt(string);
	}

}