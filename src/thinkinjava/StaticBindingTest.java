/*
 * page 43
 * Run Time VS Compile Time
 * 
 */
package thinkinjava;
import java.util.*;

public class StaticBindingTest {

public static void main(String args[])  {
   Collection c = new HashSet();
   StaticBindingTest et = new StaticBindingTest();
   et.sort(c);

}

//overloaded method takes Collection argument
public Collection sort(Collection c){
    System.out.println("Inside Collection sort method");
    return c;
}   

//another overloaded method which takes HashSet argument which is sub class
public Collection sort(HashSet hs){
    System.out.println("Inside HashSet sort method");
    return hs;
}      
 }

/*overloading
 * With early binding, or static binding, the compilation phase fixes all types of variables and expressions.
 * 
 * 
 */