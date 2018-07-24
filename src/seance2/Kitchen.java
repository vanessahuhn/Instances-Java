package seance2;

public class Kitchen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//création d'une instance de Person nommée p1
		Person p1 = new Person();
		p1.firstName = "Vanessa";
		p1.familyName = "Huhn";
		p1.phoneNb = "06 32 74 33 06";
		p1.eMail = "vanessa.huhn@gmail.com";
		//création d'une instance de Glass nommée g1
		Glass g1 = new Glass();
		g1.name = "verre de Vanessa";
		g1.shape = "pinte";
		g1.size = "grande";
		g1.l.name = "bière";
		g1.l.quantity = 50;
		//création d'une instance de Person nommée p2
		Person p2 = new Person();
		p2.firstName = "Pierre";
		p2.familyName = "Poulouin";
		p2.phoneNb = "06 49 85 66 25";
		p2.eMail = "pierrepoulouin@gmail.com";
		//création d'une instance de Glass nommée g2
		Glass g2 = new Glass();
		g2.name = "verre de Pierre";
		g2.shape = "verre à pied";
		g2.size = "petit";
		g2.l.name = "vin rouge";
		g2.l.quantity = 12;
		
		System.out.println(p1.personDescription());
		System.out.println(p2.personDescription());
		System.out.println(g1.glassDescription());
		System.out.println(g2.glassDescription());
	}

}