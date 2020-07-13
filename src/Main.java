public class Main {

	public static void main(String... args) {
		ReadString text = new ReadString("      1  2          3         14        5  y  u      6   7              ");
		Integer[] numbers = text.getNumbers();
		ArrayOperations operations = new ArrayOperations();
		Integer response = operations.sumArrayNumbers(numbers);
		System.out.println("La suma de los números de la cadena es: " + response);
	}
}