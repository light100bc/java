/*
 * Page 50
 * The Singlely Rooted 
 * 
 * 
 */
package TinJAVAobject;

public class SingleRoot {

		    public static void main(String[] args) throws Exception {  
		        Object o = new SingleRoot();// 向上转型  
		        SingleRoot b = (SingleRoot) o;// 类型还原  

		        //b = (SingleRoot) Class.forName("p.SingleRoot").newInstance();  
		    }  


}


/*
 * all class be inherited from a single base class(Object)
 * 
 */