package JavaProgram.Datatype;

public final class Primitives {
	public static Boolean valueOf(boolean value) {
	    if (value)
	      return Boolean.TRUE;
	    else
	      return Boolean.FALSE;
	  }
	 public static boolean equals(final double a, final double b) {
		    return Double.doubleToLongBits(a) == Double.doubleToLongBits(b);
		  }
	 public static boolean equals(final float a, final float b) {
		    return Float.floatToIntBits(a) == Float.floatToIntBits(b);
		  }
	 public static boolean equals(final byte a[], final int abegin, final byte b[], final int bbegin,
		      final int length) {
		    try {
		      int i = length;
		      while (--i >= 0) {
		        if (a[abegin + i] != b[bbegin + i]) {
		          return false;
		        }
		      }
		    } catch (ArrayIndexOutOfBoundsException e) {
		      return false;
		    }

		    return true;
		  }
	 public static boolean equals(final byte a[], final byte b[]) {
		    if (a == b)
		      return true;
		    if (a == null || b == null)
		      return false;
		    if (a.length != b.length)
		      return false;

		    try {
		      for (int i = 0; i < a.length; i++) {
		        if (a[i] != b[i]) {
		          return false;
		        }
		      }
		    } catch (ArrayIndexOutOfBoundsException e) {
		      return false;
		    }

		    return true;
		  }

		}

