package Operators;

import java.util.BitSet;

public class ByteArray {
	public static void main(String[] argv) throws Exception {
	     System.out.println(fromByteArray(new byte[]{1,2,3}));
	  }

	  // Returns a bitset containing the values in bytes.
	  public static BitSet fromByteArray(byte[] bytes) {
	    BitSet bits = new BitSet();
	    for (int i = 0; i < bytes.length * 8; i++) {
	      if ((bytes[bytes.length - i / 8 - 1] & (1 << (i % 8))) > 0) {
	        bits.set(i);
	      }
	    }
	    return bits;
	  }
	}

