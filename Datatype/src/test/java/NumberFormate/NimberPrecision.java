package NumberFormate;

import java.util.Formatter;

public class NimberPrecision {
	public static void main(String args[]) {
	    Formatter fmt;

	    fmt = new Formatter();

	    fmt.format("%1.4f", 1234567890.123456789);
	    System.out.println(fmt);
	  }
	}

