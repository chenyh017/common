package com.cyh.util;

public class StringUtils {

	public static boolean isBlank(String value) {
		return value == null || value.trim().length() == 0;
	}

	public static String null2Empty(String value) {
		if (value == null) {
			return "";
		}
		return value;
	}
}
