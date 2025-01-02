package org.dhruv;

public class EmptyNullString {
	String s = null;
	String s1;								//null
	String s2 = new String("");				//empty
	String s3 = new String();				//empty
	String s4 = new String("\0");			//non empty one character...length 1
	String s5 = "\0";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmptyNullString e = new EmptyNullString();
		
		System.out.println(e.s4.length());
		System.out.println(e.s4.equals(""));	//first way : using equals. compare with "" string. first of all check if string is not null...otherwise nullpointerexception comes .
		System.out.println(e.s4.isEmpty());		//second way : using isempty method ...first check if string is not null...
		System.out.println(e.s == e.s1);
		System.out.println(e.s5.equals(e.s));
		System.out.println(e.s == e.s1);
	}

}
