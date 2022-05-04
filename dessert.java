
public class dessert{
	private String dessert;

	public dessert(String dessert) {
		this.dessert = dessert;
	}
	public String getDessert() {
		return dessert;
	}
	public void setDessert(String dessert) {
		this.dessert = dessert;
	}
	 public static String[][] prix = 
		{
				{"boisson","fruit","café","milk shake"},{"10","15","15","9"}
	};
	public static String[][] temp= 
		{
				{"boisson","fruit","café","milk shake"},{"0","0","0","3"}

			
	};
	public Boolean test() {
		int j=0;
		int k=0;
		while (j<temp[0].length && k==0)
		{
			if (temp[0][j]==dessert)
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
			if (prix[0][j]==dessert )
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
			if (temp[0][j]==dessert )
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
		dessert ch ;
		Boolean x ;
		ch = new dessert("boisson");
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
