package seance2;

public class Glass {
	String name;
	String shape;
	String size;
	//pour une instance dans une instance, il vaut mieux créer l'instance dans l'objet plutôt que dans le main
	Liquid l = new Liquid();
	
	String glassDescription() {
		return "Le " + name + " contient " + l.quantity + " cl de " +  l.name + ". C'est un(e) " + size + " " + shape + ".";
	}
}

