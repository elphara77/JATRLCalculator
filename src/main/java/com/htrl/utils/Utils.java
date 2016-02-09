package com.htrl.utils;

import java.text.NumberFormat;

public class Utils {

	public static Double parseString(String str) {
		String doubleStr = str.replace(",", ".");
		return Double.parseDouble(doubleStr);
	}

	public static String getString(Double d) {
		NumberFormat nf = NumberFormat.getInstance();
		nf.setGroupingUsed(false);
		return nf.format(d);
	}

	public static void main(String[] args) {
		Double[] a = new Double[] { 1., 1.1, 10.5, 10.0, 1000., 1000.5 };
		for (Double d : a) {
			String str = getString(d);
			System.out.println(d + " --> " + str + " >>> " + parseString(str));
			System.out.println("=====");
		}
	}
}
