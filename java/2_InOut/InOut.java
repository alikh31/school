import java.util.Scanner;


public class InOut {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Type in your name: ");
		String name = scanner.nextLine();

		System.out.print("Hello " + name + "!");
		
	}
}
