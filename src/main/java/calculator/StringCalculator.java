package calculator;

class StringCalculator {

	public static int add(String text){
		if(text.equals("")){
			return 0;
		}
		else{
			String delimiter = ",";
			if(text.matches("//(.*)\n(.*)")){
				delimiter = Character.toString(text.charAt(2));
				text = text.substring(4);
			}
			
			String numList[] = splitNumbers(text, delimiter + "|\n");
			return sum(numList);
		}
	}

	private static int toInt(String num){
		return Integer.parseInt(num);
	}

	private static String[] splitNumbers(String numbers, String divider){
	    return numbers.split(divider);
	}

	private static int sum(String[] numbers){
 	    int total = 0;
 	    String negString = "";

        for(String num : numbers){
        	if(toInt(num) < 0){
        		if(negString.equals(""))
        			negString = num;
        		else
        			negString += ("," + num);
        	}
        	if(toInt(num) < 1000)
		    	total += toInt(num);
		}

		if(!negString.equals("")){
			throw new IllegalArgumentException("Negatives not allowed: " + negString);
		}

		return total;
    }
}