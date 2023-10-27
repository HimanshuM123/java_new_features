package java10;

import java.util.List;

/*
 
 Implicit Typing with var
Now, we will look into the same example, but using the var keyword that Java 10 introduced. 
We still want to create several person objects and put them in a list. After that,
 we will go through that list and print out the name of each person:
 */
public class VarKeyword {
	public static void main(String[] args) {
		VarKeyword obj = new VarKeyword();
		obj.varTypes();
	}

	public void varTypes() {
		var Roland = new Person("Roland", "Deschain");
		var Susan = new Person("Susan", "Delgado");
		var Eddie = new Person("Eddie", "Dean");
		var Detta = new Person("Detta", "Walker");
		var Jake = new Person("Jake", "Chambers");

		var persons = List.of(Roland, Susan, Eddie, Detta, Jake);

		for (var person : persons) {
			System.out.println(person.firstname + " - " + person.lastname);
		}
	}
}

class Person {
	String firstname;
	String lastname;

	Person(String firstname, String lastname) {
		this.firstname = firstname;
		this.lastname = lastname;
	}
}


/*

OLD way

public void explicitTypes() {
        Person Roland = new Person("Roland", "Deschain");
        Person Susan = new Person("Susan", "Delgado");
        Person Eddie = new Person("Eddie", "Dean");
        Person Detta = new Person("Detta", "Walker");
        Person Jake = new Person("Jake", "Chambers");

        List<Person> persons =
                List.of(Roland, Susan, Eddie, Detta, Jake);

        for (Person person : persons) {
            System.out.println(person.name + " - " + person.lastname);
        }
    }
    
    


*/