
public class commande {
	public entr�e ch;
	public menu_principale mp ;
	public dessert de;
	public commande(entr�e ch ,menu_principale mp ,dessert de) {
		this.ch=ch;
		this.mp =mp;
		this.de=de;
	}

	public int temps_totale() {
		int d;
		int x=Integer.parseInt(ch.get_temp());
		int y=Integer.parseInt(mp.get_temp());
		int z=Integer.parseInt(de.get_temp());

		d=x+y+z;
		return d;
	}
		public int prix_totale() {
			int d;
			int x=Integer.parseInt(ch.get_prix());
			int y=Integer.parseInt(mp.get_prix());
			int z=Integer.parseInt(de.get_prix());

			d=x+y+z;
			return d;
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		entr�e ch;
		menu_principale mp ;
		dessert de; 
		commande cd;
		int z;
		
		ch=new entr�e("chorba");
		mp=new menu_principale("kouskous");
		de=new dessert("boison");
		cd=new commande(ch,mp,de);
		
		z=cd.prix_totale();
		System.out.println(z);
		
		

	}


}
