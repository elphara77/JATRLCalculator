package com.htrl.utils;

import com.htrl.core.Engine;

public class Utils {

	public static Double parseString(String str) {
		return Double.parseDouble(str);
	}

	public static String getString(Double d) {
		return d.toString();
	}

	public static void main(String[] args) {
		String bStr = "123+456";
		System.out.println(bStr);
		Engine.setA("123");
		bStr = bStr.substring(Engine.getaStr().length() + 1, bStr.length());
		System.out.println(bStr);
	}
}
