package getters_setters;

public class Recette {
	//déclaration des variables correspondant aux attributs de la classe Recette
	private String nomDuPlat;
	private String difficulte;
	private String cout;
	private int tempsDeCuisson;
	private int tempsDePréparation;
	private int nbPersonnes;
	private boolean recetteMinceur;
	
	//déclaration des instances de la classe Ustensile
	private Ustensile ustensile1 = new Ustensile();
	private Ustensile ustensile2 = new Ustensile();
	
	//déclaration des instances de la classe Ingredient
	private Ingredient ingredient1 = new Ingredient();
	private Ingredient ingredient2 = new Ingredient();
	private Ingredient ingredient3 = new Ingredient();
	private Ingredient ingredient4 = new Ingredient();
	private Ingredient ingredient5 = new Ingredient();
	private Ingredient ingredient6 = new Ingredient();
	private Ingredient ingredient7 = new Ingredient();
	private Ingredient ingredient8 = new Ingredient();
	private Ingredient ingredient9 = new Ingredient();
	
	//déclaration de la méthode qui affiche la présentation de la recette
	public void afficherDescription() {
		System.out.println(nomDuPlat + " : c'est une recette " + difficulte + " et "+ cout + " pour " + nbPersonnes + " personnes.\nElle nécessite " + tempsDePréparation + " minutes de préparation et " + tempsDeCuisson + " minutes de temps de cuisson.");
	}
		
	//déclaration de la méthode qui vérifie si c'est une recette minceur
	public void IsRecetteMinceur() {
		if (recetteMinceur)
			System.out.println("Cette recette est faible en calories.");
	}
	
	//déclaration de la méthode qui affiche les ingrédients
	public void afficherIngredients() {
		System.out.println("Pour cette recette, il vous faudra :");
		System.out.println(ingredient1.returnIngredient());
		System.out.println(ingredient2.returnIngredient());
		System.out.println(ingredient3.returnIngredient());
		System.out.println(ingredient4.returnIngredient());
		System.out.println(ingredient5.returnIngredient());
		System.out.println(ingredient6.returnIngredient());
		System.out.println(ingredient7.returnIngredient());
		System.out.println(ingredient8.returnIngredient());
		System.out.println(ingredient9.returnIngredient());
	}
	//déclaration de la méthode qui affiche les ustensiles
	public void afficherUstensiles() {
		System.out.println("Munissez-vous des ustensiles suivants :");
		System.out.println(ustensile1.getNomUstensile());
		System.out.println(ustensile2.getNomUstensile());
	}
	//déclaration de la méthode qui affiche la recette
	public void afficherRecette() {
		
	}
	
	//génération des getters et setters de mes variables

	public String getNomDuPlat() {
		return nomDuPlat;
	}

	public void setNomDuPlat(String nomDuPlat) {
		this.nomDuPlat = nomDuPlat;
	}

	public String getDifficulte() {
		return difficulte;
	}

	public void setDifficulte(String difficulte) {
		this.difficulte = difficulte;
	}

	public String getCout() {
		return cout;
	}

	public void setCout(String cout) {
		this.cout = cout;
	}

	public int getTempsDeCuisson() {
		return tempsDeCuisson;
	}

	public void setTempsDeCuisson(int tempsDeCuisson) {
		this.tempsDeCuisson = tempsDeCuisson;
	}

	public int getTempsDePréparation() {
		return tempsDePréparation;
	}

	public void setTempsDePréparation(int tempsDePréparation) {
		this.tempsDePréparation = tempsDePréparation;
	}

	public int getNbPersonnes() {
		return nbPersonnes;
	}

	public void setNbPersonnes(int nbPersonnes) {
		this.nbPersonnes = nbPersonnes;
	}

	public boolean isRecetteMinceur() {
		return recetteMinceur;
	}

	public void setRecetteMinceur(boolean recetteMinceur) {
		this.recetteMinceur = recetteMinceur;
	}

	public Ustensile getUstensile1() {
		return ustensile1;
	}

	public void setUstensile1(Ustensile ustensile1) {
		this.ustensile1 = ustensile1;
	}

	public Ustensile getUstensile2() {
		return ustensile2;
	}

	public void setUstensile2(Ustensile ustensile2) {
		this.ustensile2 = ustensile2;
	}

	public Ingredient getIngredient1() {
		return ingredient1;
	}

	public void setIngredient1(Ingredient ingredient1) {
		this.ingredient1 = ingredient1;
	}

	public Ingredient getIngredient2() {
		return ingredient2;
	}

	public void setIngredient2(Ingredient ingredient2) {
		this.ingredient2 = ingredient2;
	}

	public Ingredient getIngredient3() {
		return ingredient3;
	}

	public void setIngredient3(Ingredient ingredient3) {
		this.ingredient3 = ingredient3;
	}

	public Ingredient getIngredient4() {
		return ingredient4;
	}

	public void setIngredient4(Ingredient ingredient4) {
		this.ingredient4 = ingredient4;
	}

	public Ingredient getIngredient5() {
		return ingredient5;
	}

	public void setIngredient5(Ingredient ingredient5) {
		this.ingredient5 = ingredient5;
	}

	public Ingredient getIngredient6() {
		return ingredient6;
	}

	public void setIngredient6(Ingredient ingredient6) {
		this.ingredient6 = ingredient6;
	}

	public Ingredient getIngredient7() {
		return ingredient7;
	}

	public void setIngredient7(Ingredient ingredient7) {
		this.ingredient7 = ingredient7;
	}

	public Ingredient getIngredient8() {
		return ingredient8;
	}

	public void setIngredient8(Ingredient ingredient8) {
		this.ingredient8 = ingredient8;
	}

	public Ingredient getIngredient9() {
		return ingredient9;
	}

	public void setIngredient9(Ingredient ingredient9) {
		this.ingredient9 = ingredient9;
	}
}
