package calculator;

class StringCalculator {

    public int add(String input) {
        if(input.equals("")){
			return 0;
		}
		else{
			String delimiter = ",";
			if(input.matches("//(.)\n(.)")){
				delimiter = Character.toString(input.charAt(2));
				input = input.substring(4);
			}

			String numList[] = splitNumbers(input, delimiter + "|\n");
			return sum(numList);
        }
    }
    private int sum(String[] numList) {
		return 0;
	}
	private String[] splitNumbers(String input, String string) {
		return null;
	}
	private static int toInt(String number){
		return Integer.parseInt(number);
    }
}
