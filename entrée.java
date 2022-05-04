
public class entrée {
	public String ch;

	public entrée(String entree) {
		this.ch = entree;
	}
	 public static String[][] temp = 
		{
				{"chorba","tchich","salade","salade speciale"},{"10","10","3","5"}
	};
	public static String[][] prix= 
		{
			{"chorba","tchich","salade","salade speciale"},
			{"15","15","10","20"}
			
	};
	public Boolean test() {
		int j=0;
		int k=0;
		while (j<temp[0].length && k==0)
		{
			if (temp[0][j]==ch )
				k=1;
			else 
				j++;
		}
		if (k==0)
			return false ;
		else 
			return true ;
		
	}
	public String get_prix() {
		int j=0;
		int i=0;
		String k="";
	
		while (j<prix[0].length&& i==0 )
		{
			if (prix[0][j]==ch )
			{
				k=prix[1][j];
				i=1;
			}
			
			else 
				j++;
		}
		return k ;
		
	}	
	public String get_temp() {
		int j=0;
		int i=0;
		String k="";
	
		while (j<temp[0].length&& i==0 )
		{
			if (temp[0][j]==ch )
			{
				k=temp[1][j];
				i=1;
			}
			
			else 
				j++;
		}
		return k ;
		
	}
	public String getCh() {
		return ch;
	}
	public void setCh(String ch) {
		this.ch = ch;
	}


	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		entrée ch ;
		Boolean x ;
		ch = new entrée ("chorba");
		x =ch.test();
		if (x == true )
		{
			System.out.println ( "founded" );
			System.out.println ( ch.get_prix());
			System.out.println ( ch.get_temp());


		}
		
		else 
			System.out.println("error");
		
		

	}

	
	
	


}
