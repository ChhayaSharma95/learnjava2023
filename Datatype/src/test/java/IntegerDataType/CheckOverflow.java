package IntegerDataType;

public class CheckOverflow {
	public static int addAndCheck(int x, int y) {
	      long s = (long)x + (long)y;
	      if (s < Integer.MIN_VALUE || s > Integer.MAX_VALUE) {
	          throw new ArithmeticException("overflow: add");
	      }
	      return (int)s;
	  }
}
