package week1.day2;

public class LearnBreakAndContinue {

	public static void main(String[] args) {
		int balance;
		System.out.println("Demo of BREAK concept in JAVA");
		System.out.println("******************************************************************************");

		for (balance=10000;balance>0;balance--) {
			if (balance == 4000) {
				System.out.println("Cannot deduct further as minimum balance required is: "+balance);
				break;
			}
		}
		System.out.println("Current Balance is : " + balance);
		System.out.println();
		System.out.println("Demo of Continue concept in JAVA:");
		System.out.println("******************************************************************************");

		
		 for (int i = 1; i <= 10; i++) {
	            // Skip the iteration if the number is even
	            if (i % 2 == 0) {
	                continue; // Skip to the next iteration
	            }
	            // Print the odd numbers
	            System.out.println("Odd number: " + i);

		 	}
	}
}


