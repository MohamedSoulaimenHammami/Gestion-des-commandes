
public class menu_principale{
	public String princip;

	public menu_principale(String princip) {
		this.princip = princip;
	}
	 public static String[][] prix = 
		{
				{"kouskous","plat fruit de mére","escaloppe panné","ejaa"},{"70","90","40","50"}
	};
	public static String[][] temp= 
		{
				{"kouskous","plat fruit de mére","escaloppe panné","ejaa"},{"20","10","15","10"}

			
	};
	
	public String getPrincip() {
		return princip;
	}
	public void setPrincip(String princip) {
		this.princip = princip;
	}
	public Boolean test() {
		int j=0;
		int k=0;
		while (j<temp[0].length && k==0)
		{
			if (temp[0][j]==princip)
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
			if (prix[0][j]==princip )
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
			if (temp[0][j]==princip )
			{
				k=temp[1][j];
				i=1;
			}
			
			else 
				j++;
		}
		return k ;
		
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		menu_principale ch ;
		Boolean x ;
		ch = new menu_principale("kouskous");
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
