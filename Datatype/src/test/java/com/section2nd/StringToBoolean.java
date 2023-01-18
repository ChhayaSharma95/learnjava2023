package com.section2nd;

public class StringToBoolean {
	public static void main(String[] args) {
        String strBoolean = "true";
        
        //String to boolean conversion
        boolean theValue = Boolean.parseBoolean(strBoolean);
        
        System.out.println(theValue);
}
}