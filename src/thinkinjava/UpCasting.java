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
        //����ת�͵ı���
        Animal b=new Bird(); //����ת�� ,����Animal����bָ��һ������Bird���� 
        b.eat();   //bʵ��ָ������
        //! error: b.fly(); b��ָ��������󣬵���ʱ��ʧfly()����  
        
        //����ת�͵�Ӧ��
        dosleep(new Male());  //��������Human h = new Male()�Ĺ���
        dosleep(new Female());  
        
    }  
      
    //��������ֻ����Human��Ϊ����
    public static void dosleep(Human h) {  
        h.sleep();  
    }  
}  

/* Ӧ�� �磺��̬
 * 
 * ����ת�� ,��������ָ��������� ���������ֵ�����ࣿ����ָ�򣿣�
 * 
 * ͨ�׵ؽ����ǽ��������תΪ������󡣴˴������������ǽӿڡ�
 * 
 * ��Ҫע���������ת��ʱ����ʧ���븸������е������������籾���е�fly��������Ϊb���С�
 * 
 * Ҳ����˵����ʱʧȥһ��method����decoupling������ͨ������ת���ٴ��һ�
 * 
 * 
 */
