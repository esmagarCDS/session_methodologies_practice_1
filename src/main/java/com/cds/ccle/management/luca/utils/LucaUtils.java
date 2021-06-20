package com.cds.ccle.management.luca.utils;

import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;

/**
 * Utils class for validations.
 *
 */
public class LucaUtils {

	/**
	 * Check if the string is null or empty.
	 * 
	 * @param validateString String to check
	 * @return true or false depending if the string is null/empty or not.
	 */
	public static boolean isNullOrEmpty(String validateString) {
		if (validateString == null || validateString.trim().isEmpty()) {
			return true;
		}
		return false;
	}

	public static boolean isValidEmailAddress(String email) {
		boolean result = true;
		try {
			InternetAddress emailAddr = new InternetAddress(email);
			emailAddr.validate();
		} catch (AddressException ex) {
			result = false;
		}
		return result;
	}

}
