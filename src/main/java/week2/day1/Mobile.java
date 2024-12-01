package week2.day1;

public class Mobile {
	
	public void MakeCall(String sNumber) {
		System.out.println("Called the number: "+sNumber);
	}
	
	public void SendSMS(String sNumber, String sMsg) {
		System.out.println("Texted the message - "+sMsg+" to the number "+sNumber);
	}

	public static void main(String[] args) {
		Mobile mobile = new Mobile();
		
	mobile.MakeCall("9880012345");
		mobile.SendSMS("9880012345","Hello Sir");
		

	}

}
