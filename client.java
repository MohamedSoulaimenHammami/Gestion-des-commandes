
public class client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}
	private String num;
	private String nom;
	private String prenom;
	public int destination;
	private commande commande ;
	public client (String num, String nom, String prenom ,int destination , commande commande) {
		this.num=num;
		this.nom=nom;
		this.destination=destination;
		this.prenom = prenom;
		this.commande = commande ;
		
	}
	
	
	
	public String getNum() {
		return num;
	}



	public void setNum(String num) {
		this.num = num;
	}



	public String getNom() {
		return nom;
	}



	public void setNom(String nom) {
		this.nom = nom;
	}



	public int getDestination() {
		return destination;
	}



	public void setDestination(int destination) {
		this.destination = destination;
	}



	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	


	public commande getCommande() {
		return commande;
	}



	public void setCommande(commande commande) {
		this.commande = commande;
	}



	public Boolean verify_num(String num) {
		int n=Integer.parseInt(num);
		if (num.length() != 8)
				return false;
		else 
		{ 
			int x;
			x=n % 10000000;
			Math.floor(x);
			if (x!=5 && x!= 2 && x !=4 && x != 9)
				return false ;
			else return true ;
		}
		
	}
	
	

}
