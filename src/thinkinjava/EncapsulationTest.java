/*
 * page 47
 * Encapsulation
 * 
 */
package thinkinjava;

class EncapsulationClass {
		   private String name;
		   private String idNum;
		   private int age;

		   public int getAge() {
		      return age;
		   }

		   public String getName() {
		      return name;
		   }

		   public String getIdNum() {
		      return idNum;
		   }

		   public void setAge( int newAge) {
		      age = newAge;
		   }

		   public void setName(String newName) {
		      name = newName;
		   }

		   public void setIdNum( String newId) {
		      idNum = newId;
		   }
}

public class EncapsulationTest {

	   public static void main(String args[]) {
		  EncapsulationClass a = new EncapsulationClass();
	      a.setName("James");
	      a.setAge(20);
	      a.setIdNum("12343ms");

	      System.out.print("Name : " + a.getName() + " Age : " + a.getAge());
	   }
}

/*data hiding
 * 
 *implementation code of void setEmpName(String name) and String getEmpName() can be changed at any time  without breaking the classes that uses the code. re-usability
 * The fields can be made read-only (If we don¡¯t define setter methods in the class) or write-only (If we don¡¯t define the getter methods in the class)
 * 
 * 
 * 
 */