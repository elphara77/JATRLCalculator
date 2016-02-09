package com.htrl.core;

import com.htrl.utils.Utils;

public class Engine {

	private static Double a = null;
	private static String aStr = null;
	private static Double b = null;
	private static String bStr = null;
	private static String op = null;
	
	public static Double minus() {
		if (a == null || b == null) {
			throw new RuntimeException("ERREUR CALCUL");
		}
		return a - b;
	}

	public static Double plus() {
		if (a == null || b == null) {
			throw new RuntimeException("ERREUR CALCUL");
		}
		return a + b;
	}

	public static Double getA() {
		return a;
	}

	public static void setA(String a) {
		Engine.aStr = a;
		Engine.a = Utils.parseString(a);
	}

	public static Double getB() {
		return b;
	}

	public static void setB(String b) {
		Engine.bStr = b;
		Engine.b = Utils.parseString(b);
	}

	public static String getaStr() {
		return aStr;
	}

	public static String getbStr() {
		return bStr;
	}

	public static String getOp() {
		return op;
	}

	public static void setOp(String op) {
		Engine.op = op;
	}

}
