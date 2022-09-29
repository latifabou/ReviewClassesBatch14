package reviewclass03;

public class LogicalOperator {

	public static void main(String[] args) {
		boolean programmer=true;
		boolean manualTester=false;
		boolean knowFrameWork=true;
		
		if (programmer && manualTester&&knowFrameWork) {
			System.out.println("You can be an automation enginer");
			
		}else {
			System.out.println("You must know a programing language and manual testiong"
					+"to be an automation engineer");
		}
		
		
		
	
	}

}
