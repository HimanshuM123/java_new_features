package java17;

public class SwitchExample {
	public static void main(String[] args) {
		
		String day = "Monday";
		int dayNumber = switch (day) {
		    case "Monday" -> 1;
		    case "Tuesday" -> 2;
		    // ... cases for other days
		    default -> 0;
		};
		
		System.out.println(dayNumber);
	}

}


//1