package Long;

public class LongToNumericDataType {
	public static void main(String[] args) {
	    Long lObj = Long.valueOf("10");
	    byte b = lObj.byteValue();
	    System.out.println(b);

	    short s = lObj.shortValue();
	    System.out.println(s);

	    int i = lObj.intValue();
	    System.out.println(i);

	    float f = lObj.floatValue();
	    System.out.println(f);

	    double d = lObj.doubleValue();
	    System.out.println(d);
	  }
	}

