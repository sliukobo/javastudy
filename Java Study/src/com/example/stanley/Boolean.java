package com.example.stanley;

public class Boolean {
	public static void main(String[] args) {
		byte zero = 0;
		int number = 100;
		float f = (float) 6.8;
		// Create a string with a constructor
		String s1 = new String("Who let the dogs out?");
		// Just using "" creates a string, so no need to write it the previous way.
		String s2 = "Who who who who!";
		// Java defined the operator + on strings
		String s3 = s1 + s2;
		String output = "W" + zero + "W" + f;
		System.out.println(output);
		System.out.append(s3);
		int num = 5;
		String s = "I have " + num + " cookies";
		System.out.println(s);
		
		boolean b = false;
		b = true;

		boolean toBe = false;
		b = toBe || !toBe;
		System.out.println(b);
		if (b==false) {
		    System.out.println(toBe);
		}

	
	}

}
