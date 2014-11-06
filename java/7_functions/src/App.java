

public class App {


	public static void main(String[] args) {
		func_a("this is it");
	}


	public static int func_a(String inside)
	{
		
		System.out.println("inside is: " + Calc.getBigger(12,1) );
		System.out.println("inside is: " + Calc.getBigger(1,12) );
		System.out.println("inside is: " + Calc.getBigger(12,12) );

		int[] t = {1,2,5,3,4,67, 4 ,5};

		System.out.println("inside is: " + Calc.getBiggest(t) );
		System.out.println("inside is: " + Test.getAverage(t) );


		try {

			int[] t1 = {};
			System.out.println("inside is: " + Test.testArray(t1) );	
		}
		catch (Exception e) {

			System.err.println(e.getMessage());

		}
		

		return 0;
	}
}

class Test {

	public static double getAverage(int[] num) {

		double sum = 0;
		for (int i = 0 ; i < num.length ; i++) {
			
			sum += num[i];
			
		}

		return (double)Math.round((sum / (double)num.length)*100)/100 ; 

	}

	public static int testArray(int[] n) throws Exception {
		
		if (n.length > 0) {
			return n.length;
		}
		else {
			throw new Exception("array is empty");
		}

	}
}