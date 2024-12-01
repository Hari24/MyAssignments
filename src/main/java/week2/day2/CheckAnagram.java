package week2.day2;
import java.util.*;
public class CheckAnagram {

	public static void main(String[] args) {
		String str1 = new String("Friend");
		String str2 = new String("Dinfer");
		
		int str1Length=str1.length();
		int str2Length=str2.length();
		
		if (str1Length != str2Length) {
			System.out.println("Given strings are not Anagrams as their Lengths are not equal. ");
						
		}
		else {
			char[] charArray1 = str1.toLowerCase().toCharArray();
			Arrays.sort(charArray1);
			
			char[] charArray2 = str2.toLowerCase().toCharArray();
			Arrays.sort(charArray2);
			System.out.println(charArray1);
			System.out.println(charArray2);

			
			if (Arrays.equals(charArray1, charArray2)){
					System.out.println("Given strings are Anagrams");
				}
			
		}
		
		
		
	}

}
