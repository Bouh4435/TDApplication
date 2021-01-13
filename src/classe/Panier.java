package classe;
import java.util.ArrayList;

public class Panier {
	private ArrayList<Orange> panier;
	private int size;
	
	
	public Panier(ArrayList<Orange> panier, int size) {
		this.panier = panier;
		this.size = size;
	}

	public boolean estPlein() {
		if(panier.size()==size)
			return true;
		return false;
	}
	
	public boolean estVide() {
		if (panier.isEmpty())
			return true;
		return false;
	}

	public ArrayList<Orange> getPanier() {
		return panier;
	}
	
	public String toString() {
		String s="";
		for (Orange orange : panier) {
			s+=orange.toString()+"\n";
		}
		return s;
	}

	public Panier ajouter(Orange o) {
			ArrayList<Orange> P = this.panier;
			if (estPlein()==true)
				return this;
			else
				P.add(o);
		return this;
		}
	
	public Panier retirer() {
		if(!this.estVide())
			this.panier.remove((panier.size()-1));
		return this;
	}
	
	public int getPrix() {
		int prix=0;
		for (Orange orange : panier)
			prix+=orange.getPrix();
		return prix;
	}
	
	public Panier boycotteOrigine(String pays) {
		for (Orange o : this.panier) {
			if (o.getOrigine()==pays)
				panier.remove(o);
		return this;
		}
		return this;
	}
	
	public boolean equals(Panier p) {
		boolean test=false;
		if (p.panier.size()!=this.panier.size()) {
			return false;
		}
		for(int i=0;i<(p.panier.size());i++) {
			test=false;
			
			for(int j=0;j<(this.panier.size());j++) {
				//System.out.println(panier.get(i));
				if(p.panier.get(i).equals(panier.get(j)))
						{
					//System.out.println(("--------"+panier.get(i)));
						test=true;
				break;}
				
			}
//		for(Orange o : p.getPanier()) {
//			test=false;
//			for(Orange o2 : this.getPanier()) {
//				if(o.equals(o2))
//					test=true;
//					break;
//			}
		if(!test)
			return false;
		}
	return true;
	}
	
	
	
	
	
}
