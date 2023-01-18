package IntegerDataType;

public class MaxThreeValue {
	public static int maximum(int a, int b, int c) {
	      if (b > a) {
	          a = b;
	      }
	      if (c > a) {
	          a = c;
	      }
	      return a;
	}
}