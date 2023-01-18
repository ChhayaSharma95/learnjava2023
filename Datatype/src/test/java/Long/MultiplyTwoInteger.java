package Long;

public class MultiplyTwoInteger {
	public static long mulAndCheck(long a, long b) {
	      long ret;
	      String msg = "overflow: multiply";
	      if (a > b) {
	          // use symmetry to reduce boundry cases
	          ret = mulAndCheck(b, a);
	      } else {
	          if (a < 0) {
	              if (b < 0) {
	                  // check for positive overflow with negative a, negative b
	                  if (a >= Long.MAX_VALUE / b) {
	                      ret = a * b;
	                  } else {
	                      throw new ArithmeticException(msg);
	                  }
	              } else if (b > 0) {
	                  // check for negative overflow with negative a, positive b
	                  if (Long.MIN_VALUE / b <= a) {
	                      ret = a * b;
	                  } else {
	                      throw new ArithmeticException(msg);
	                      
	                  }
	              } else {
	                  // assert b == 0
	                  ret = 0;
	              }
	          } else if (a > 0) {
	              // assert a > 0
	              // assert b > 0
	              
	              // check for positive overflow with positive a, positive b
	              if (a <= Long.MAX_VALUE / b) {
	                  ret = a * b;
	              } else {
	                  throw new ArithmeticException(msg);
	              }
	          } else {
	              // assert a == 0
	              ret = 0;
	          }
	      }
	      return ret;
	}
}
