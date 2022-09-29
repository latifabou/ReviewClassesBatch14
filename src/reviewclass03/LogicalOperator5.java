package reviewclass03;

public class LogicalOperator5 {

	public static void main(String[] args) {

		String country = "x";
		/*
		 * if(country.equals("Turkey")||country.equals("Japan")||country.equals("Spain")
		 * ) { System.out.println("Welcome to USA"); }
		 * 
		 */
if (!country.equalsIgnoreCase("North Korea")) {
	System.out.println("Welcome to USA");
}
		
	}

}
