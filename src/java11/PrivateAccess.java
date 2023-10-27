package java11;

public class PrivateAccess {
	private String name = "I'm Alphabet!";

	public class A {
		public void printName() {
			System.out.println(name); // access Alphabet's private member!
		}
	}

	public static void main(String[] args) {
		PrivateAccess obj = new PrivateAccess();
		PrivateAccess.A in = obj.new A();
		in.printName();

	}

}
/*

It supports private access within nest members directly, no more via an auto-generated bridge method access$000. 
Furthermore, new nested APIs for validation and allowed private reflection access within nest members.

Before Java 11.

If we compile the above class, it will generate two classes, 
Alphabet and Alphabet$A, even a nested class is a typical class with a unique name. 
The JVM access rule will not allow private access within different classes. However, 
Java allowed private access within nest members, so the Java compiler creates 
a bridge method access$000 to apply on the JVM access rule.


// After javac Alphabet.java, Java compiler created something similar to this.
public class Alphabet {
  private String name = "I'm Alphabet!";
  String access$000(){
    return name;
  }
}

public class Alphabet$A {
  final Alphabet obj;
  public void printName(){
    System.out.println(obj.access$000());
  }
}

In Java 11, The Java compiler will not generate any bridge method access$000 for
 private access within nest members. This new JVM access rule, Nest-Based Access Control allowed private access within nest members.


*/