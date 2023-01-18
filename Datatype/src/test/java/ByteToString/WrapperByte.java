package ByteToString;

public class WrapperByte {
	public static void main(String[] args) {
	    String s = "65";

	    byte b = Byte.valueOf(s);

	    System.out.println(b);

	    // Causes a NumberFormatException since the value is out of range
	    System.out.println(Byte.valueOf("129"));
	  }
	}

