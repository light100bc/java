/*
 * page 47
 * Run Time VS Compile Time
 * 
 */
package thinkinjava;

class A  {
	 void f1() {  //this holds address of object of B     
	   System.out.println("A f1");
	 }
	 void f2() {
	   System.out.println("A f2");
	 }
	}//A


	class B extends A {

	 void f3() {   //new method     
	   System.out.println("B f3");
	 }

	 void f2() { //this holds address of object of B     
	   System.out.println("B f2 starts");
	   f3(); //this.f3()
	   System.out.println("B f2 ends ");

	 } }  //B


	public class runtimeVscompiletime {
	   public static void main(String args[]) {
	      A ref; //reference of A
	      A ref2;
	      ref = new B();//Object of B
	      ref2= new A();
	      //ref.inherited()  allowed
	      ref.f1();
	      
	      //ref.overridden() allowed
	      ref.f2();

	     //ref.newMembersOfChild() not allowed
	    //ref.f3();
	      
	      ref2.f1();
	      ref2.f2();
	  }//main
	}
	
	/*Inheritance creates type compatibility. It allows a super class reference to refer to the object of sub class. (Reverse is not true).

A super class reference, that refers to object of sub class, can only be used to access the inherited and overridden methods of sub class. The members newly defined in sub class are not accessible using reference of super class.
	 * 
	 * 
	 * 
	 * 
	 * Here, we see that even though both the object references ref and ref2 are of type 'A' only, but at run time they refer to the objects of types 'A' and 'B' respectively.
	 * hence, at compile time the compiler can't be sure which method to choose
	 * Thus, we see that dynamic binding in Java simply binds the method calls based on the actual object type and not on the declared type of the object reference.
	 * 
	 * Thus, we see that dynamic binding in Java simply binds the method calls (inherited methods only as they can be overriden in a sub class and hence compiler may not be sure of which version of the method to call) based on the actual object type and not on the declared type of the object reference.
	 * 
	 * 
	 * https://docs.oracle.com/javase/specs/jls/se7/html/jls-15.html#jls-15.12
	 * 
	 * 
	 * 
	 * 
	 * 
	 */



