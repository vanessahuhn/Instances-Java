package getters_setters;

public class Preparation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//création de l'instance recette1 de la classe Recette
		Recette recette1 = new Recette();
		//attribuer des valeurs aux attributs de recette1
		recette1.setNomDuPlat("Blinis");
		recette1.setDifficulte("facile");
		recette1.setCout("économique");
		recette1.setTempsDeCuisson(10);
		recette1.setTempsDePréparation(20);
		recette1.setNbPersonnes(4);
		recette1.setRecetteMinceur(false);
		recette1.afficherDescription();
		recette1.IsRecetteMinceur();
		
		recette1.getIngredient1().setNomIngredient("fromage blanc");
		recette1.getIngredient1().setBesoinQuantite(true);
		recette1.getIngredient1().setQuantite("100");
		recette1.getIngredient1().setUniteDeMesure("g");
		recette1.getIngredient2().setNomIngredient("farine de sarrasin");
		recette1.getIngredient2().setBesoinQuantite(true);
		recette1.getIngredient2().setQuantite("50");
		recette1.getIngredient2().setUniteDeMesure("g");
		recette1.getIngredient3().setNomIngredient("farine complète d'épeautre");
		recette1.getIngredient3().setBesoinQuantite(true);
		recette1.getIngredient3().setQuantite("50");
		recette1.getIngredient3().setUniteDeMesure("g");
		recette1.getIngredient4().setNomIngredient("oeuf");
		recette1.getIngredient4().setBesoinQuantite(true);
		recette1.getIngredient4().setQuantite("1");
		recette1.getIngredient4().setUniteDeMesure("");
		recette1.getIngredient5().setNomIngredient("eau chaude");
		recette1.getIngredient5().setBesoinQuantite(true);
		recette1.getIngredient5().setQuantite("5");
		recette1.getIngredient5().setUniteDeMesure("cuillères à soupe");
		recette1.getIngredient6().setNomIngredient("levure chimique");
		recette1.getIngredient6().setBesoinQuantite(true);
		recette1.getIngredient6().setQuantite("2");
		recette1.getIngredient6().setUniteDeMesure("cuillères à soupe");
		recette1.getIngredient7().setNomIngredient("sel");
		recette1.getIngredient7().setBesoinQuantite(false);
		recette1.getIngredient7().setQuantite("100");
		recette1.getIngredient7().setUniteDeMesure("g");
		recette1.getIngredient8().setNomIngredient("poivre");
		recette1.getIngredient8().setBesoinQuantite(false);
		recette1.getIngredient8().setQuantite("100");
		recette1.getIngredient8().setUniteDeMesure("g");
		recette1.getIngredient9().setNomIngredient("beurre");
		recette1.getIngredient9().setBesoinQuantite(false);
		recette1.getIngredient9().setQuantite("100");
		recette1.getIngredient9().setUniteDeMesure("g");
		recette1.afficherIngredients();
		recette1.getUstensile1().setNomUstensile("saladier");
		recette1.getUstensile2().setNomUstensile("poêle");
		recette1.afficherUstensiles();
		
		

	}

}
