package JavaProgram.Datatype;

public class returnPrimitiveWrapper {
		  /**
		   * @param wrapper
		   *          a primitive wrapper type
		   * @return primitive type the passed in wrapper type corresponds to
		   */
		  public static Class getPrimitive(Class wrapper) {
		    Class primitive;
		    if (Integer.class == wrapper) {
		      primitive = int.class;
		    } else if (Long.class == wrapper) {
		      primitive = long.class;
		    } else if (Double.class == wrapper) {
		      primitive = double.class;
		    } else if (Boolean.class == wrapper) {
		      primitive = boolean.class;
		    } else if (Short.class == wrapper) {
		      primitive = short.class;
		    } else if (Float.class == wrapper) {
		      primitive = float.class;
		    } else if (Byte.class == wrapper) {
		      primitive = byte.class;
		    } else if (Character.class == wrapper) {
		      primitive = char.class;
		    } else {
		      throw new IllegalArgumentException("The class is not a primitive wrapper type: " + wrapper);
		    }
		    return primitive;
		  }
		
}
