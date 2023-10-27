package java11;

public class Unicode10 {
	//It means more code points, more emoji icons 🙂 The below example prints a Unicode code point.


	public static void main(String[] args) {
		String codepoint = "U+1F92A"; // crazy face
		String codepoint2 = "U+263A"; // smile
		String codepoint3 = "U+1F606"; // laugh
		System.out.println(convertCodePoints(codepoint));
		System.out.println(convertCodePoints(codepoint2));
		System.out.println(convertCodePoints(codepoint3));
	}
	
	 static char[] convertCodePoints(String codePoint) {
	        Integer i = Integer.valueOf(codePoint.substring(2), 16);
	        char[] chars = Character.toChars(i);
	        return chars;

	    }
}

/*
🤪
☺
😆


 */
