package reviewclass03;

public class NestedIfVsLogicalAnd {

	public static void main(String[] args) {
		boolean programmer = true;
		boolean manualTester = true;
		boolean knowFrameWork = false;
	if (programmer) {
		if (manualTester) {
			if (knowFrameWork) {
				System.out.println("You can be an automation engineer");
			}else {
				System.out.println("You need to know framework as well");
			}
		}else {
			System.out.println("You need to know manual testing as well");
		}
	}else {
		System.out.println("You need to be a programmer");
	}
	
	
		
	}
	

}
