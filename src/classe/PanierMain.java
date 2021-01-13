package classe;
import java.util.ArrayList;

public class PanierMain {

	public static void main(String[] args) {
		ArrayList<Orange> panier = new ArrayList<Orange>();
		ArrayList<Orange> panier2 = new ArrayList<Orange>();

		ArrayList<Orange> panier3 = new ArrayList<Orange>();
		ArrayList<Orange> panier4 = new ArrayList<Orange>();


//		Panier p = new Panier(panier,10);
//		try {
//			p.ajouter(new Orange(0.80, "France"));
//			p.ajouter(new Orange(0.80, "Espagne"));
//			p.ajouter(new Orange(0.90, "Floride"));
//			System.out.println("Contenance du panier\n"+p);
//			p.retirer();
//			System.out.println("le dernier produit ajouté est retiré :\n"+p);
//			p.boycotteOrigine("France");
//			System.out.println("la panier en boycottant la France :\n"+p);
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		//Test des paniers identiques
	try {
		Panier p1 = new Panier(panier,10);
		p1.ajouter(new Orange(0.80, "France"));
		p1.ajouter(new Orange(0.80, "Espagne"));
		p1.ajouter(new Orange(0.90, "Floride"));
		System.out.println(panier.size());
		Panier p2 = new Panier(panier2,10);
		p2.ajouter(new Orange(0.80, "France"));
		p2.ajouter(new Orange(0.80, "Espagne"));
		p2.ajouter(new Orange(0.90, "Floride"));
		System.out.println(panier2.size());

		Panier p3 = new Panier(panier3,5);
		p3.ajouter(new Orange(0.80, "France"));
		p3.ajouter(new Orange(0.80, "Espagne"));
		Panier p4 = new Panier(panier4,10);
		p4.ajouter(new Orange(0.80, "France"));
		p4.ajouter(new Orange(0.80, "Espagne"));
		p4.ajouter(new Orange(0.90, "Miami"));
		//System.out.println(p1.equals(p3));
		System.out.println(p1.equals(p2));
		//System.out.println(p1.equals(p4));
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	
	

}
