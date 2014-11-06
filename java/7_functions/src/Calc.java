

public class Calc {	

	public static int getBigger(int i, int j) {

		if(i > j)
			return i;

		return j;
	}

	public static int getBiggest(int[] num)
	{
		int t = num[0];
		for (int i = 0 ; i < num.length ; i++) {
			
			if(t < num[i])
			{
				t = num[i];
			}
		}

		return t;
	}
	
}
