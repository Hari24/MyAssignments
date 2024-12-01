package week2.day2;

public class DuplicateWords {

	public static void main(String[] args) {
		String input_text = "Java learn java basics as part of java sessions in java week 1";
		String output_text="";
      
               // Split the string into words based on space
        String[] words = input_text.split(" ");
             
        for (int i=0;i<words.length;i++)
           {
        	  for (int j=i+1;j<words.length-1;j++) 
        	  {
        		if (words[i].equalsIgnoreCase(words[j])) 
        		{
        			//count++;
        			words[j]=""; // replace repeated word with empty space
        		}
        	  }
        	output_text=output_text+ " "+ words[i]; //Append empty string with replaced array 
        	

	       }
        System.out.println(output_text);
	}
}
