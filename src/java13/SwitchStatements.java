package java13;

public class SwitchStatements {
	public static void main(String[] args) {
		int sizeNumber = 2; // Replace with your desired size (1, 2, 3, 4, or 5)
/*
		switch (sizeNumber) {
		case 1:
			System.out.println("Extra Small");
			break;
		case 2:
			System.out.println("Small");
			break;
		case 3:
			System.out.println("Medium");
			break;
		default:
			System.out.println("Invalid size number");

		}
		*/
		
		/*
		 Switch expressions can now return a value.
		  And you can use a lambda-style syntax for your expressions, 
		  without the fall-through/break issues:
		 * */
		
		String result  = switch (sizeNumber) {
		case 1 -> "Extra Small";
		case 2 -> "Small";
		case 3 -> "Medium";
		default -> throw new IllegalArgumentException("Unexpected value: " + sizeNumber);
		};
		
		System.out.println(result);
	}

}
