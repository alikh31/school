
public class addints {

	public static void main(String[] args) {
		
		if (args.length == 0) {

			System.out.println("the input is empty!!!");
			System.exit(0);
			
		}

		int sum = 0;

		int[] array = new int[args.length];
		int n = 0;

		for (int i = 0 ; i < args.length ; i++ ) {

			try {

				sum +=  Integer.parseInt(args[i]);

				array[n] = Integer.parseInt(args[i]);

				n++;

			} catch(NumberFormatException e){

			}
		}

		for (int i = 0 ; i < n ; i++ ) {

			if (i != (n - 1) ) {
				System.out.print(array[i] + " + ");
			}
			else {
				System.out.print(array[i] );
			}

		}

		System.out.println(" = " + sum);
	}
	
}
