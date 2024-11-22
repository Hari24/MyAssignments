package week1.day2;

public class ForLoop {

	public static void main(String[] args) {
		int sum=0;		
		for (int i=0;i<=5;i++) {
			sum=sum+i;
			System.out.println("I am in loop number:  " + i);
			System.out.println("Sum in loop number " +i+" is "+ sum);;
		}
		System.out.println();
		System.out.println("Total sum is: " + sum);
		
	}

}
