package com.example.stanley;

public class Conditional {
	public static void main(String[] args) {
	int a = 4;
	boolean b = a == 4;
	if (b) {
	    System.out.println("It's true!");
	}
	
	int aa = 4;
	int bb = 5;
	boolean result;
	result = aa < bb; // true
	result = aa > bb; // false
	result = aa <= 4; // a smaller or equal to 4 - true
	result = bb >= 6;// b bigger or equal to 6 - false
	result = aa == bb; // a equal to b - false
	result = aa != bb; // a is not equal to b - true
	result = aa > bb || aa < bb; // Logical or - true
	result = 3 < aa && aa < 6; // Logical and - true
	result = !result; // Logical not - false
	
	System.out.println(result);
	
	if (a == bb -1) System.out.println("Yeah!");
	else System.out.println("Ohhh...");
	
	
	int aaa = 4;
	int result1 = aaa == 4 ? 1 : 8;
	// result will be 1
	// This is equivalent to

	if (aaa == 4) {
	    result1 = 1;
	} else {
	    result1 = 8;
	}
	System.out.println(result1);
	
	String a1 = new String("Wow");
	String b1 = new String("Wow");
	String sameA = a1;

	boolean r1 = a1 == b1;      // This is false, since a and b are not the same object
	boolean r2 = a1.equals(b1); // This is true, since a and b are logically equals
	boolean r3 = a1 == sameA;  // This is true, since a and sameA are really the same object
	
	if (r3) 
	{
		System.out.println(r3);
	}
	
	
	 int[] numbers = {1, 2, 3};
     int length = numbers[2];
     char[] chars = {'a', 'b', 'c', 'd'};
     //chars[numbers.length + 3] = 'x';
     //chars[numbers.length + 4] = 'y';
     //chars[numbers.length + 2] = 'z';
     System.out.println(chars);
          
     int[] arr = new int[10];
     System.out.println(arr.length);
}
}
