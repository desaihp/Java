/*
 * by reference
 * @Aurthor :- Harshil Desai
 * 
 */

package com.ObjectClass.task;

public class ByReference {
	String cwid;
	String name;

	public static void main(String arg[]) {

		ByReference s1 = new ByReference();
		s1.cwid = "802493817";
		s1.name = "Harshil Desai-";
		System.out.println(s1.name + " " + s1.cwid);
	}
}