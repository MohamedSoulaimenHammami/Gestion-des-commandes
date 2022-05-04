
public class Restaurant {
	

	public static void main(String[] args) {
		client c1 ;
		String  num = "50156014";
		String nom="Soulaimen";
		String prenom="Ejmal";
		int des =8;
		entrée ch;
		menu_principale mp ;
		dessert de; 
		commande cd;
		ch=new entrée("chorba");
		mp=new menu_principale("kouskous");
		de=new dessert("boisson");
		cd=new commande(ch,mp,de);
		System.out.println(" 0:restaurant \n 1:Route Mahdia \n 2: Route Tunis \n 3: Route Aein \n 4: Route Manzel Chaker");
		int z,e;
		z=cd.prix_totale();
		e=cd.temps_totale();
		System.out.println("le prix totale est "+z+" le temps totale pour la realisiation de commande est "+e+"\n");
		
		c1=new client(num,nom,prenom,des,cd);
		int N = Graphe.ALPHA_NOTDEF ;
		int [][] matDuree={
				{N,2,1,1,N,N,N,N,N,N,N,N,N,N,N},
				{2,N,1,N,N,N,N,N,N,N,N,N,N,N,2},
				{1,1,N,N,N,N,N,N,N,N,N,N,N,N,N},
				{1,N,N,N,2,2,N,N,N,N,N,N,N,N,N},
				{N,N,N,2,N,N,2,N,1,N,N,N,N,N,N},
				{N,1,N,2,N,N,N,N,N,N,N,N,N,N,N},
				{N,N,N,N,2,N,N,2,N,N,N,N,N,N,N},
				{N,N,N,N,N,N,N,2,N,N,1,N,N,3,N},
				{N,N,N,N,1,N,N,N,N,2,2,3,N,N,N},
				{N,N,N,N,N,N,N,1,1,N,N,N,N,4,N},
				{N,N,N,N,N,N,N,N,2,N,N,7,2,N,N},
				{N,N,N,N,N,N,N,N,3,N,7,N,N,5,N},
				{N,N,N,N,N,N,N,N,N,N,2,N,N,N,3},
				{N,N,N,N,N,N,N,3,N,4,N,5,N,N,N},
				{N,2,N,N,N,N,N,N,N,N,N,N,3,N,N}
		                  };
		//creation du graphe			
		Graphe g0 = new Graphe(matDuree);

		//LA SUITE		
		
		
		// creation d'une instance de l'algorithme avec le graphe g0
		Dijkstra restaurant= new Dijkstra(0,g0);
		
		
		// Calcul du plus court chemin avec l'algorithme de Dijkstra 
		restaurant.calculePlusCourtChemin();
		

		
		// Affichage du temps de trajet
		int duree = restaurant.longueurChemin(8);
		System.out.println("Le temps mini pour aller du restaurant à Manzel Chaker est :"+duree+" min");
		int duree2 = restaurant.longueurChemin(8);
	
		
		// Pour afficher le chemin le plus rapide pour aller du restaurant à manzel chaker
		restaurant.afficheChemin(8); 
		
		
		}

	}

