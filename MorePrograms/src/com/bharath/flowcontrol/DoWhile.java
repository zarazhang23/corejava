package com.bharath.flowcontrol;

public class DoWhile {

	public static void main(String[] args) {
		int x = 1;
		do {
			if (x % 2 == 1) {
				System.out.println(x);
			}
			x++;
		} while (x < 35);
	}

}
