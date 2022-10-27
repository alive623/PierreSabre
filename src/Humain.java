
public class Humain {
	private String nom ;
	private String boissonPreferee;
	private int quantiteArgent;
	
	public Humain(String nom, String boissonPreferee , int quantiteArgent) {
		this.nom = nom;
		this.boissonPreferee = boissonPreferee ;
		this.quantiteArgent = quantiteArgent;
	}

	public String getNom() {
		return nom;
	}
	
	
	public String direBonjour() {
		return "bonjour ! je m'appelle " + nom + "et j'aime boire du" + boissonPreferee ;
	}

	public String boire() {
		return "Mmmm, un bon verre de" + boissonPreferee + "! GLOUPS !" ;
	}

	public void acheter(int bien ,int prix){
		if (bien >= prix) {
			parler("J'ai" + bien + "sous en poche. Je vais pouvoir m'offrir une boisson à " + prix + "sous");
		}
		else {
			parler("Je n'ai plus que" + bien + "je ne peux même pas m'offrir un kimono à " + prix + "sous");
		}
		}
		
	}
}

