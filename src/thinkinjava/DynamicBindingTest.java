/*
 * page 47
 * Run Time VS Compile Time
 * 
 */
package thinkinjava;

public class DynamicBindingTest {
    public static void main(String args[]) {
        Vehicle vehicle = new Car(); //here Type is vehicle but object will be Car
        vehicle.start();//Cars start called because start() is overridden method
       }
     }

 class Vehicle {

  public void start() {
      System.out.println("Inside start method of Vehicle");
      }
    }

 class Car extends Vehicle {

  @Override
  public void start() {
      System.out.println("Inside start method of Car");
  }
}
 
 /*
  *   *Late binding, or dynamic binding, is a computer programming mechanism in which compiler is not able to resolve the call, so the method implementation that is actually called upon an object ( looked up by name )and determined at run-time. 
  * When compiler detects such a statement then it doesn't bind the function call with any definition. It only validates the call.
  * the method that will be run is chosen at run time.
  *
  *
  *
  *
  *
  */
 