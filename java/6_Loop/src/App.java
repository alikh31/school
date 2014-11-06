import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		if (args.length>0) {

			if (args[0].equals("exit")) {

				System.out.println("okay bye!!!");

				System.exit(0);
				
			}
			
		}

		Scanner scanner = new Scanner(System.in);

		String output;

		while( true )
		{
			System.out.print("1- input: ");
			output = scanner.nextLine();
			if (output.equals("exit")) {
				break;
			}
		}
		
		// System.out.print("1- output :" + output + "\n");

		// output = "";

		// while( !output.equalsIgnoreCase("exit") )
		// {
		// 	System.out.print("2- input: ");
		// 	output = scanner.nextLine();
		// }
		
		// System.out.print("2- output :" + output );


		/*output = "";

		do
		{
			System.out.print("3- input: ");
			output = scanner.nextLine();
			System.out.print("3- output :" + output + "\n");

		} while( !output.equalsIgnoreCase("exit") );
		*/

		System.out.println("bye");
		
	}
	
}
