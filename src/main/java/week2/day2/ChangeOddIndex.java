package week2.day2;

public class ChangeOddIndex {

	public static void main(String[] args) {
		
		String test = "changeme";
		char strArray[] = test.toCharArray();
		
	    
		for (int i=0;i<strArray.length;i++) {
			if ((i % 2) != 0) {
				strArray[i] = Character.toUpperCase(strArray[i]);
				
			}
			
			
		} 
		System.out.println(strArray);
		

	}

}
