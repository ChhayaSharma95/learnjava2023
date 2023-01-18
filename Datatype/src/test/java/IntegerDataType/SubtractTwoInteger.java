package IntegerDataType;

public class SubtractTwoInteger {
	public static int subAndCheck(int x, int y) {
	      long s = (long)x - (long)y;
	      if (s < Integer.MIN_VALUE || s > Integer.MAX_VALUE) {
	          throw new ArithmeticException("overflow: subtract");
	      }
	      return (int)s;
	  }
	}
