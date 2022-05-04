import java.util.Vector;


public class Dijkstra {
	
	 
	// creation du graphe
	public static final int INFINITE = 1000;//Integer.MAX_VALUE;
	public final static int ALPHA_NOTDEF = -999 ;// on met final psk c'est une constante
	private int x0;
	private int [] S;//ensemble de sommets dont les distances les plus courtes � la source sont connues au d�part seulement Source
	private int [] R;//ensemble des pr�d�cesseur des sommets de 0 � N-1;
	private Graphe g0;
	private int [] D;//tableau des valeurs du meilleur raccourci pour se rendre � chaque sommet
	// rajout
	private boolean [] noeudsMarqus;
	private static int dimensionDeLaMatrice;//je rajoute �a pour simplifier le code.
	
	public Dijkstra( int x, Graphe g){	
		x0 = x;
		g0 = g;
		dimensionDeLaMatrice = g0.nbSommet();
		S = new int [dimensionDeLaMatrice];//sommets atteints
		D = new int [dimensionDeLaMatrice];//distances
		noeudsMarqus = new boolean[dimensionDeLaMatrice];
		R = new int [dimensionDeLaMatrice];
		calculePlusCourtChemin();
	}
	
	public void calculePlusCourtChemin(){ 
	    int n =0;
		for (int a = 0; a < dimensionDeLaMatrice; a++){
			noeudsMarqus[a] =false;
			S[a]=-1; //en supposant qu'on num�rote les sommets de 0 ou de 1 � n.
			R[a]=-1; // pour les noeuds qui n'ont pas de pr�dec�sseur
		}
		
		S[n]=x0;
		D[x0]=0;
		R[x0]=x0;
		initDistMin();
		for (int i = 0; i< dimensionDeLaMatrice ;i++){	
			if (!contains(S,i)){// � revoir
				int t = choixSommet();
				noeudsMarqus[t] = true;
				n++;
				S[n]=t;
				majDistMin(t);
			} //end if
		}//end for
//		for (int i=0; i<dimensionDeLaMatrice;i++){
//			System.out.print(" S[i]"+S[i]);
//		}
//		for (int i=0; i<dimensionDeLaMatrice;i++){
//			System.out.print(" R["+i+"]"+R[i]);
//		}
//		System.out.println();
	}
	
	//impl�mentation de initDistMin
	public void initDistMin(){
		noeudsMarqus[x0]=true;
		for (int i=0; i<dimensionDeLaMatrice;i++){
			if(g0.existeArc(x0,i)){
				D[i] = g0.getU()[x0][i];
				R[i] = x0;
			}
			else {
				if (x0 != i)
				D[i] =- g0.ALPHA_NOTDEF+1;
			}
		}
	}
	
	public void majDistMin(int n){
		for (int i = 0; i < dimensionDeLaMatrice; i++){			
				if (!contains(S,i)){
					//D[i] = min(D[i], D[n] + distanceDsGraphe(n,i));
					if (D[n] + distanceDsGraphe(n,i)<D[i]){
						D[i]=D[n] + distanceDsGraphe(n,i);
						R[i]=n;
					}
				}
		}
	}
	public int distanceDsGraphe (int t, int s){
		if (g0.existeArc(t, s)){		
			return g0.getU()[t][s];
		}
		else {
			return INFINITE;
		}
	}

	public int choixSommet(){
		int valeurMin = INFINITE;
		int min = x0;
		for (int i=0; i<dimensionDeLaMatrice ;i++){
			if (!noeudsMarqus[i])
				if (D[i]<=valeurMin){
					min = i;
					valeurMin = D[i];
				}
		}
		return min;
	}
	
	
    //fonction � d�finir :S.contains(i)
	public boolean contains(int[] S, int i){
		return noeudsMarqus[i];
	}
	
	public int longueurChemin (int i){
		return D[i];
	}
	//fonction � d�finir min
	public int min (int i, int j){
		if (i<=j)
			return i;
		else return j;
	}
	public void afficheChemin(int i){
		int source = x0;
		int ant = i;
		Vector <Integer> lesNoeudsIntermediaires = new Vector<Integer>();;
		System.out.println("Chemin de "+x0+" à "+ i+":");
		while (ant!=source){
			lesNoeudsIntermediaires.add(ant);
			ant = R[ant];
			
		}
		lesNoeudsIntermediaires.add(source);
		for (int j= lesNoeudsIntermediaires.size()-1; j>0;j--){
			System.out.print("-->"+lesNoeudsIntermediaires.get(j));
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		int N = Graphe.ALPHA_NOTDEF ;
		int [][] matDuree={
				{N,1,2,3,N},
				{1,N,1,2,N},
				{2,1,N,N,N},
				{3,2,N,N,3},
				{N,N,N,3,N}
		                  };
		//cr�ation du graphe			
		Graphe g0 = new Graphe(matDuree);
		//LA SUITE		
		
		
		// creation d'une instance de l'algorithme avec le graphe g0
		Dijkstra restaurant= new Dijkstra(0,g0);
		
		
		
		// Calcul du plus court chemin avec l'algorithme de Dijkstra 
		restaurant.calculePlusCourtChemin();
		

		
		// Affichage du temps de trajet
		int duree = restaurant.longueurChemin(4);
		System.out.println("Le temps mini pour aller du restaurant à Manzel Chaker est :"+duree);
		int duree2 = restaurant.longueurChemin(2);
	
		
		// Pour afficher le chemin le plus rapide pour aller du restaurant à manzel chaker
		restaurant.afficheChemin(4); // pour �a il faut un tableau de pr�d�cesseur, il nous faudra un tableau de routage
		//il nous faudrait cr�er un tableau R des pr�decesseurs.
		
		
	}

}