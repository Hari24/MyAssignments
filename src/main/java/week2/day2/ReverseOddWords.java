package week2.day2;

public class ReverseOddWords {

	public static void main(String[] args) {
		String inputStr="She got ten apples for lunch";
		String reverseStr="";
		
		String[] words=inputStr.split(" ");
		for (int i=0;i<words.length;i++)
		{
			if (i%2 != 0)
			{
				reverseStr="";
				char charArr[]=words[i].toCharArray();
				//System.out.println(charArr);
				for (int j=charArr.length-1;j>=0;j--)
				{
					reverseStr=reverseStr+charArr[j];
				}
				System.out.print(reverseStr+" ");
			}
			else {
				System.out.print(words[i]+ " ");
			}
			
		}
		
	
		

	}

}
