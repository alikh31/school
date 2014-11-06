
public class App {

	public static void main(String[] args) {

		int myNumber = 6;
		int anotheNumber = 8;
		String myName = "ali";

		System.out.println(myName + ' ' + myNumber);


		String words = myName + ' ' + myNumber;
		System.out.println(words);

		String x = Integer.toString(12) + Integer.toString(23);
		System.out.println(x);

		int y = Integer.parseInt(x);
		System.out.println(y);

		String one = "1", two = "2";
		int result = Integer.parseInt(one) + Integer.parseInt(two);
		System.out.println(result);
	}	
}
