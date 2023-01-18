package Operators;

import java.util.BitSet;

public class BiteArrayLength {
	 public static void main(String[] argv) throws Exception {
		 BitSet bit=new BitSet();
		 bit.set(1);
		 System.out.println(toByteArray(bit));
	 }
	 public static byte[] toByteArray(BitSet bits) {
		    byte[] bytes = new byte[bits.length() / 8 + 1];
		    for (int i = 0; i < bits.length(); i++) {
		      if (bits.get(i)) {
		        bytes[bytes.length - i / 8 - 1] |= 1 << (i % 8);
		      }
		    }
		    return bytes;
		  }
		}

