package Statment_Brancch_coverage.Statment_Brancch_coverage;

public class WeakClass {
	public static int weakMethod1(int x, int y) {
		if (y == 0)
			throw new ArithmeticException("Attempting to devide by 0");
		double devisionResult = (double) x / y;
		if (devisionResult > 0)
			return 1;
		else
			return -1;
	}
}
