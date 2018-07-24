package seance1;

//importer la classe Cuisine : <nom de package>.<nom de classe>
//import seance1.Cuisine;

public class Application 
{
	public static void main(String[] args) 
	{
		//création d'une instance cuisineSimplon de la classe Cuisine
		Cuisine cuisineSimplon = new Cuisine();
		//assignation de valeurs aux attributs
		cuisineSimplon.cup = "cup";
		
		//j'essaie d'accède à la valeur de la variable firstName
		//Eclipse renvoie un message d'erreur car la variable n'est pas visible hors de sa classe
		//cuisineSimplon.firstName;
		//pour y accéder, j'utilise la méthode getter getFirstName()
		//qui retourne la valeur de la variable firstName
		cuisineSimplon.getFirstName();
		//j'essaie de modifier la valeur de la variable firstName
		//cuisineSimplon.firstName = "Vanessa";
		//pour la modifier, j'utiliser la méthode setter de setFirstName()
		//qui modifie la valeur de la variable firstName
		cuisineSimplon.setFirstName("Vanessa");
		
		//on créé une variable pour stocker le résultat de l'appel de la méthode coffeeMachine sur
		//l'instance cuisineSimplon de la classe Cuisine
		String returnCoffee;
		returnCoffee = cuisineSimplon.coffeeMachine("espresso", "water", "ON");
		
		System.out.println(returnCoffee);
		
		//Pierre : café avec Cristaline, colombien, on, tasse Peter Pan
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
