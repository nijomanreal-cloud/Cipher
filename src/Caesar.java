import java.util.Scanner;

public class Caesar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		//Read in message
		System.out.println("Type something to shift:");
		String message = in.nextLine();
		//Read in shift
		System.out.println("Type number to shift by:");
		char shift = in.nextLine().charAt(0);
		String output = "";
		int numShift = (int)(shift-'A');

		
		
		//Loop through message
		for (int x=0;x<message.length();x++){
			char letter = message.charAt(x);
			
			
			
			
			output+=shiftedLetter;
		}

			//if letter is alphabetic
				//apply shift
				//if letter is past 'Z'
					//subtract 26
			//add letter to output
		
		//print output
		System.out.println("");
	}
}
