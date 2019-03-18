public class CiagFibonacciego {
	public static int fibonaccie(int index) {
		if(index==0)
			return 0;
		if ((index==1)||(index==2))
			return 1;
			else
			return fibonaccie(index-2)+fibonaccie(index-1);
			}
}
