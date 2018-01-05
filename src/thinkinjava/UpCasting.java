/*
 * Page 50
 * Up Casting
 * 
 */

package thinkinjava;



class Animal {  
    
    public void eat(){  
        System.out.println("animal eatting...");  
    }  
}  
class Bird extends Animal{  

    public void eat(){  
        System.out.println("bird eatting...");  
    }  
      
    public void fly(){  
          
        System.out.println("bird flying...");  
    }  
}  

class Human {  
    public void sleep() {  
        System.out.println("Human sleep..");  
    }  
}  
class Male extends Human {  
    @Override  
    public void sleep() {  
        System.out.println("Male sleep..");  
    }  
}  
class Female extends Human {  
    @Override  
    public void sleep() {  
        System.out.println("Female sleep..");  
    }  
}  

public class UpCasting {
	
	
    public static void main(String[] args) {  
        //向上转型的本质
        Animal b=new Bird(); //向上转型 ,父类Animal引用b指向一个子类Bird对象 
        b.eat();   //b实际指向子类
        //! error: b.fly(); b虽指向子类对象，但此时丢失fly()方法  
        
        //向上转型的应用
        dosleep(new Male());  //本质上是Human h = new Male()的过程
        dosleep(new Female());  
        
    }  
      
    //函数申明只许用Human作为参数
    public static void dosleep(Human h) {  
        h.sleep();  
    }  
}  

/* 应用 如：多态
 * 
 * 向上转型 ,父类引用指向子类对象 （子类对象赋值给父类？还是指向？）
 * 
 * 通俗地讲即是将子类对象转为父类对象。此处父类对象可以是接口。
 * 
 * 需要注意的是向上转型时会遗失除与父类对象共有的其他方法。如本例中的fly方法不再为b所有。
 * 
 * 也就是说会暂时失去一定method换来decoupling但可以通过向下转型再次找回
 * 
 * 
 */
