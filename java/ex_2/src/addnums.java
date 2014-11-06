import java.util.Scanner;

public class addnums {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		String output = "";

		System.out.print("enter: ");

		int sum = 0;

		int n = 0;

		output = scanner.nextLine();

		while( !output.equalsIgnoreCase("exit") )
		{

			try {

				sum += Integer.parseInt(output);

				n++;

			} catch(NumberFormatException e){

			}
			
			System.out.print(sum + " enter: ");

			output = scanner.nextLine();
		}
		
		System.out.print("You have entered " + n + " numbers totalling " + sum + ". Good bye.");

	}
	
}
