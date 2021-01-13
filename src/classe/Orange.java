package classe;

public class Orange {
	private double prix;
	private String origine;
	
	public Orange(double prix, String origine) throws Exception {
		if (prix < 0){
		      throw new Exception("Prix négatif");
		}
		this.prix = prix;
		this.origine = origine;
	}

	public double getPrix() {
		return prix;
	}

	public String getOrigine() {
		return origine;
	}

	public String toString() {
		return "Orange : origine=" + origine + ", prix=" + prix;
	}

	
	public boolean equals(Orange o) {
		System.out.println("------"+this.getPrix()); 
		if(o.getOrigine()!=this.getOrigine())
			return false;
		if(o.getPrix()!=this.getPrix())
		{
			System.out.println(this.getPrix()); 			
			return false;

		}
		return true;
	}
	
}
