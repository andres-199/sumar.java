public class ReadString {

	private String text;

	public ReadString(String text) {
		this.text = text;
	}

	public Integer[] getNumbers() {
		Integer[] numbers = new Integer[0];
		String[] textArray = this.text.split(" ");

		for (int i = 0; i < textArray.length; i++) {
			String text = textArray[i];

			if (!text.isEmpty()) {
				try {
					Integer number = Integer.parseInt(text);
					numbers = ArrayOperations.pushNumber(numbers, number);
				} catch (Exception e) {
					System.out.println("\"" + text + "\" no es un número. " + text.length());
				}
			}

		}

		return numbers;
	}

}