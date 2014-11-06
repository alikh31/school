
public class App {	

	public static void main(String[] args) {

		int[] numbers = new int[3];

		numbers[0] = 12;
		numbers[1] = 12314;
		numbers[2] = 42342234;


		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
			
		}

		int[] array = {1,2,3,4,5,6};

		try{
			System.out.println(array[6]);
		} catch(ArrayIndexOutOfBoundsException e){
			System.out.println("this is the error!!! :)  " + e.toString());
		}
		

		System.out.println("I am after the error");

		for (int num : numbers) {
			num = 3;
		}

		for (int num : numbers) {
			System.out.println(num);
		}


		int n = 0;
		String w = null;

		

	}
}
