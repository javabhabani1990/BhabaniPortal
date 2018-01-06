package edu.bsm.prf.util;

public class BusinessValidation {

	/*
	 * If null return true else return false in a String
	 */
	public static boolean isEmpty(String value) {
		if (null != value && value.trim().length() > 0) {
			return false;
		}
		return true;
	}

	/*
	 * This method is checking admin id is true or false, first three character
	 * should contain BSM
	 */
	public static boolean isAdminId(String id) {
		if ((id.trim().length() > 3)
				&& ("BSM").equalsIgnoreCase(id.substring(0, 3))) {
			return true;
		}
		return false;
	}

}
