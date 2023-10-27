package java11;

import java.util.stream.Collectors;

public class NewStringMethods {
	public static void main(String[] args) {
		String str1 = "";
		System.out.println(str1.isBlank());// true

		String str2 = "GeeksForGeeks";
		System.out.println(str2.isBlank());// false

		// lines(): This method is to return a collection of strings that are divided by
		// line terminators.
		String str = "Geeks\nFor\nGeeks";
		System.out.println(str.lines().collect(Collectors.toList()));// [Geeks, For, Geeks]

		String str3 = "GeeksForGeeks";
		System.out.println(str3.repeat(4));// GeeksForGeeksGeeksForGeeksGeeksForGeeksGeeksForGeeks

		// removes space
		String str4 = " GeeksForGeeks";
		System.out.println(str4.stripLeading());// GeeksForGeeks

		String str5 = "GeeksForGeeks ";
		System.out.println(str5.stripTrailing());// GeeksForGeeks

		String str6 = " GeeksForGeeks ";
		System.out.println(str6.strip());// GeeksForGeeks

	}

}
