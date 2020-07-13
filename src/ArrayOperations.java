public class ArrayOperations {

	public Integer sumArrayNumbers(Integer[] numbers) {
		Integer response = 0;

		for (int i = 0; i < numbers.length; i++) {
			response += numbers[i];
		}

		return response;
	}

	public static Integer[] pushNumber(Integer[] numbers, Integer number) {
		Integer[] _nummbers = new Integer[numbers.length + 1];

		for (int i = 0; i < numbers.length; i++) {
			_nummbers[i] = numbers[i];
		}

		_nummbers[numbers.length] = number;
		return _nummbers;
	}
}