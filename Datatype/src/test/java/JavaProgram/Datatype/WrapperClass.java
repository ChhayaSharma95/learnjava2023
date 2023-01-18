package JavaProgram.Datatype;

public class WrapperClass {
	
		  public static void main(String[] argv) throws Exception {
		    Boolean refBoolean =Boolean.valueOf(true);
		    boolean bool = refBoolean.booleanValue();
		    
		    
		    Byte refByte =Byte.valueOf((byte) 123);
		    byte b = refByte.byteValue();
		    
		    
		    Character refChar =Character.valueOf('x');
		    char c = refChar.charValue();
		    
		    
		    Short refShort =Short.valueOf((short) 123);
		    short s = refShort.shortValue();
		    
		    
		   // Integer refInt = new Integer(123);
		    Integer integer = Integer.valueOf(123);
		    int i = integer.intValue();
		    
		    
		    Long refLong =Long.valueOf(123L);
		    long l = refLong.longValue();
		    
		    
		    Float refFloat =Float.valueOf(12.3F);
		    float f = refFloat.floatValue();
		    
		    
		    Double refDouble =Double.valueOf(12.3D);
		    double d = refDouble.doubleValue();
		    System.out.println(d);
		  }
		}


