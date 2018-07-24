package getters_setters;

public class Ingredient {
	//déclaration des variables correspondant aux attributs de la classe Ingredient
	private String nomIngredient;
	private boolean besoinQuantite;
	private String quantite;
	private String uniteDeMesure;
	//déclaration de la méthode qui vérifie si l'ingrédient nécessite une quantité
	public void isBesoinQuantite() {
		if (besoinQuantite == false) {
			quantite = "";
			uniteDeMesure = "";			
		}
	}
	
	public String returnIngredient() {
		isBesoinQuantite();
		return nomIngredient + " " + quantite + " " + uniteDeMesure;
	}
	
	//génération des getters et setters de mes variables
	public String getNomIngredient() {
		return nomIngredient;
	}
	public void setNomIngredient(String nomIngredient) {
		this.nomIngredient = nomIngredient;
	}
	public String getQuantite() {
		return quantite;
	}
	public void setQuantite(String quantite) {
		this.quantite = quantite;
	}
	public String getUniteDeMesure() {
		return uniteDeMesure;
	}
	public void setUniteDeMesure(String uniteDeMesure) {
		this.uniteDeMesure = uniteDeMesure;
	}
	public void setBesoinQuantite(boolean besoinQuantite) {
		this.besoinQuantite = besoinQuantite;
	}
}
