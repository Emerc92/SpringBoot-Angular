package it.wibs.eplastic.utils;

public class DataUtils {

	public static final String nvlTrim(String s) {
		if (s == null) {
			return "";
		}
		return s.trim();
	}

	public static boolean isEmpty(String s) {
		return s == null || s.trim().equals("");
	}

	public static final String nvlTrimUpper(String s) {
		return nvlTrim(s).toUpperCase();
	}

	public static final String nvlTrimLower(String s) {
		return nvlTrim(s).toLowerCase();
	}

	public static long getLongFromString(String s) {
		if (isEmpty(s)) {
			return 0;
		}
		return Long.valueOf(s.trim());
	}
}
