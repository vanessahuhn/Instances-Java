package seance2;

public class Person {
	String familyName;
	String firstName;
	String phoneNb;
	String eMail;
	
	String personDescription() {
		return firstName + " " + familyName + " est dans la cuisine.";
	}
}

