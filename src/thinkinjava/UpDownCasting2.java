/*
 * Page 50
 * Up/Down Casting2
 * 屌炸了上下转型2
 * 
 */
package thinkinjava;

class D {  

}  

interface C {  

}  

class E extends D implements C {  

   
    }  

public class UpDownCasting2 {
	 public static void main(String[] args) throws Exception {  
	        // B t = (B) new A(); // 向下转型不成立，运行时会抛出错误  

	        /** 
	         * 向上转型 
	         */  
	        // 隐式转换  
		 	E e1 = new E();
	        D d1 = e1;  
	        
	        // 强制转换  ?
	        D d2 = new E();  
	        C c = (C) d2; 
	        
	        // 强制转换?  
	        //Class<> clazz = Class.forName("p.E");  
	        //D d3 = (D) clazz.newInstance();  
	 }
}



/*
 *   1 隐式的自动的上转型,强制向上转换（implement）？
     2 显式的强制下转型
     3 instanceof   ? 
     额外的方式
     4 反射 ?
 * 
 * 
 * 总结：多态的存在要有三个必要条件

（1）要有继承

（2）要有重写

（3）父类引用指向子类对象

另外必须记住的规则：

（1）编译器是根据引用类型来判断哪些方法可以调用，而不是根据对象的确实的类型。

（2）在调用方法时，遵循最低阶原则。即在继承树中，java虚拟机会从最底层开始寻找调用的方法，直到找到为止。
 * 
 * 
 * 
 * 
 * 
 * 
*/
