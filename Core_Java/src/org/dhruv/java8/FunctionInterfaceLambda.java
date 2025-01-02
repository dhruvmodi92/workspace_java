package org.dhruv.java8;


public class FunctionInterfaceLambda
{
	public static void main(String[] args) {
		/*FunctionInterfaceExmpl lambda = (c,d) -> c+d;
		System.out.println(lambda.add(10, 20));*/

		/* 
		 * Syntax : {InterfaceName as DataType} refVariable = {argument List in parenthesis} -> {Method Implementation}
		 * Here do not need to mention data type for arg list as well as return type . 
		 * Automatically type conversion will happen as functional interface has one abstract method.
		 *  No arg method : () -> {Method Implementation}
		 *  One arg method : Not compulsory to use parenthesis : s -> System.out.println(s);
		 *  many arg method : (a,b,c) -> a+b+c;
		 *  
		 *  If method implementation is of one line then it is not compulsory to use parenthesis.
		 *  
		 * 
		 * */
		FunctionInterfaceExmpl lambda = () -> System.out.println("Hello");
		lambda.printHello();
	}

}

@FunctionalInterface
interface FunctionInterfaceExmpl {

	/*
	 Interface with one abstract method implemented using lambda works as Function. 
	 Instead of Function data type they have introduced this concept in which 
	 lambda operation will return  Interface name type and 
	 one more thing : Each class who implements this interface method using lambda have their own functionality.
	 So it is called as Functional interface. 
	 In this actually type conversion has happened automatically. 
	 We do not  need to  provide type while implementing abstract method using lambda expression.
	 Functional Interface must have only one abstract method. 
	 Any number of default method is valid for functional interface but it must contain only one abstract method.
	 If your interface has two abstract method and you try to implement using lambda expression, then it will show an compile time error().
	 
	 If  you have interface with only one abstract method and many class have implemented the method using lambda expression,
	 Now any new developer is not aware about it and for any business need he add another abstarct method in interface. So this will create disaster of our lambda function interface implementation and all implementation of this functional  interface will show compile time error(Invalid '@FunctionalInterface' annotation; FunctionInterfaceExmpl is not a functional interface).
	 Now to avoid this , we can add annotation "@FunctionalInterface". so that any new developer can come to know about our functional interface and do not try to add any new abstract method in the same interface.
	 Still again he try to add any abstract method it will show compile time error.
	 Uncomment print method to see this behaviour.
	 
	Actually We have two abstract methods and still it is not showing any error for functional interface.
	Reason : If an interface declares an abstract method overriding one of the public methods of java.lang.Object,
	that also does not count toward the interface's abstract method count since 
	any implementation of the interface will have an implementation from java.lang.Object or elsewhere.
	Best example of this is Comparator interface.(equals and compare method...
	but equals is of Object class. so it will not consider as abstract method.) 
	 */
	
	//public int add(int a,int b);
	
	@Override
	String toString();
	
	public void printHello();
	
	default public void foo()
	{
		System.out.println("Abe foo hai yaar");
	}
		
}
