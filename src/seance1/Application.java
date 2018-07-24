package seance1;

//importer la classe Cuisine : <nom de package>.<nom de classe>
//import seance1.Cuisine;

public class Application 
{
	public static void main(String[] args) 
	{
		//cr�ation d'une instance cuisineSimplon de la classe Cuisine
		Cuisine cuisineSimplon = new Cuisine();
		//assignation de valeurs aux attributs
		cuisineSimplon.cup = "cup";
		
		//j'essaie d'acc�de � la valeur de la variable firstName
		//Eclipse renvoie un message d'erreur car la variable n'est pas visible hors de sa classe
		//cuisineSimplon.firstName;
		//pour y acc�der, j'utilise la m�thode getter getFirstName()
		//qui retourne la valeur de la variable firstName
		cuisineSimplon.getFirstName();
		//j'essaie de modifier la valeur de la variable firstName
		//cuisineSimplon.firstName = "Vanessa";
		//pour la modifier, j'utiliser la m�thode setter de setFirstName()
		//qui modifie la valeur de la variable firstName
		cuisineSimplon.setFirstName("Vanessa");
		
		//on cr�� une variable pour stocker le r�sultat de l'appel de la m�thode coffeeMachine sur
		//l'instance cuisineSimplon de la classe Cuisine
		String returnCoffee;
		returnCoffee = cuisineSimplon.coffeeMachine("espresso", "water", "ON");
		
		System.out.println(returnCoffee);
		
		//Pierre : caf� avec Cristaline, colombien, on, tasse Peter Pan
		//Athanasia : volvic, arabica, tasse tinkerbell
		Cuisine cuisinePierre = new Cuisine();
		
		cuisinePierre.cup = "Peter Pan mug";
		cuisinePierre.setFirstName("Pierre");
		
		returnCoffee = cuisinePierre.coffeeMachine("colombian coffee", "Cristaline", "ON");
		
		System.out.println(returnCoffee);
		
		Cuisine cuisineAthanasia = new Cuisine();
		
		cuisineAthanasia.cup = "Tinker Bell mug";
		cuisineAthanasia.setFirstName("Athanasia");
		
		returnCoffee = cuisineAthanasia.coffeeMachine("arabica", "Volvic", "ON");
		
		System.out.println(returnCoffee);
	}
}
