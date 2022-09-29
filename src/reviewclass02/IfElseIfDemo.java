package reviewclass02;

public class IfElseIfDemo {

	public static void main(String[] args) {
		/*
		 * If have to check one condition:use if conditions;
		 * If you have to check two conditions:use if else conditions;
		 * If you have to check more than two conditions always use if
		else if conditions 
		 */
		int number = 12;
		if (number > 0) {
		System.out.println("number is positive");
		}
		if (number < 0) {
		System.out.println("number is negative");
		}
		if (number == 0) {
		System.out.println("number is 0");
		}
		//*********************************************Second 
		//Program*************************************************
		if (number > 0) 
		{
		System.out.println("number is positive");
		} 
		else if (number < 0) 
		{
		System.out.println("number is negative");
		}
		else  {
		System.out.println("number is 0");
		}

	}

}
