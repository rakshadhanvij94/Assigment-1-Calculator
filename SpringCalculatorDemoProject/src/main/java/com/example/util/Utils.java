package com.example.util;

public class Utils {

	/**
	   * Checks if is empty or NULL.
	   *
	   * @param s the s
	   * @return true, if is empty or NULL
	   */
	  public static boolean isEmptyOrNULL(Object s) {
	      boolean result = false;
	    if (s == null) {
	        result= true;
	    }
	    if ((s instanceof String) && ((String) s).trim().isEmpty()) {
	        result = true;
	    }
	    return result;
	  }
}
