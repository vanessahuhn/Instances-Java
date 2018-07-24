package getters_setters;

public class Ingredient {
	//d�claration des variables correspondant aux attributs de la classe Ingredient
	private String nomIngredient;
	private boolean besoinQuantite;
	private String quantite;
	private String uniteDeMesure;
	//d�claration de la m�thode qui v�rifie si l'ingr�dient n�cessite une quantit�
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
	
	//g�n�ration des getters et setters de mes variables
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
