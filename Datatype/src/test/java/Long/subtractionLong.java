package Long;

public class subtractionLong {
	public static long subAndCheck(long a, long b) {
	      long ret;
	      String msg = "overflow: subtract";
	      if (b == Long.MIN_VALUE) {
	          if (a < 0) {
	              ret = a - b;
	          } else {
	              throw new ArithmeticException(msg);
	          }
	      } else {
	          // use additive inverse
	          ret = addAndCheck(a, -b, msg);
	      }
	      return ret;
	  }
	private static long addAndCheck(long a, long b, String msg) {
	      long ret;
	      if (a > b) {
	          // use symmetry to reduce boundry cases
	          ret = addAndCheck(b, a, msg);
	      } else {
	          // assert a <= b
	          
	          if (a < 0) {
	              if (b < 0) {
	                  // check for negative overflow
	                  if (Long.MIN_VALUE - b <= a) {
	                      ret = a + b;
	                  } else {
	                      throw new ArithmeticException(msg);
	                  }
	              } else {
	                  // oppisite sign addition is always safe
	                  ret = a + b;
	              }
	          } else {
	              // assert a >= 0
	              // assert b >= 0

	              // check for positive overflow
	              if (a <= Long.MAX_VALUE - b) {
	                  ret = a + b;
	              } else {
	                  throw new ArithmeticException(msg);
	              }
	          }
	      }
	      return ret;
	  }
	
}
