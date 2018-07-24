package seance1;

public class Cuisine 
{
	
	String cup;
	private String firstName;
	String familyName;
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	String coffeeMachine(String coffee, String water, String button) 
	{
		return firstName + " " + familyName + " made a(n) " + coffee + " in a " + cup + " with " + water + " by pushing the " + button + " button.";
	}

}
