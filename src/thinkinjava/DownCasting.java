/*
 * Page 50
 * Down Casting
 * 
 */

package thinkinjava;


class Girl {  
    public void smile(){  
        System.out.println("girl smile()...");  
    }  
}  
class MMGirl extends Girl{  
      
    @Override  
    public void smile() {  
          
        System.out.println("MMirl smile sounds sweet...");  
    }  
    public void c(){  
        System.out.println("MMirl c()...");  
    }  
}  

public class DownCasting {
      
    public static void main(String[] args) {  
          
        Girl g1=new MMGirl(); //向上转型  
        g1.smile();  
          
        MMGirl mmg=(MMGirl)g1; //向下转型,编译和运行皆不会出错  
        mmg.smile();  
        mmg.c();  
        Girl g2=new Girl();  
//       MMGirl mmg1=(MMGirl)g2; //不安全的向下转型,编译无错但会运行会出错  
//      mmg1.smile();  
//      mmg1.c();  
/*output: 
* CGirl smile sounds sweet... 
* CGirl smile sounds sweet... 
* CGirl c()... 
* Exception in thread "main" java.lang.ClassCastException: com.wensefu.other1.Girl 
* at com.wensefu.other1.Main.main(Girl.java:36) 
*/  
        if(g2 instanceof MMGirl){  //通过instanceof防止异常
            MMGirl mmg1=(MMGirl)g2;   
            mmg1.smile();  
            mmg1.c();  
        }  
          
    }  
}  

/* 先要上转型然后再下转型
 * 
 * 与向上转型相反，即是把父类对象转为子类对象。
 * 
 * 把指向子类对象的父类引用赋给子类引用叫向下转型(downcasting)，要强制转换。
   如：f1 就是一个指向子类对象的父类引用。把f1赋给子类引用s1即 Son s1 = (Son)f1；
   其中f1前面的(Son)必须加上，进行强制转换。
 * 
 * 也就是说会把之前向上转型暂时失去一定method找回来，但又一次失去decoupling，主要调用specific class 里 method 时用
 * 
 * 
 * 原理：父类向子类转换，这种转换只牵扯到引用名义类型的转换，具体的对象内存没有发生一点变化。
 * 而基本类型的转换与此不同，其数据确实发生了变化，但是基本类型并不是对象。如果是基本类型和其包装类的相互转化，实际上调用是Integer.parseInt()和Integer.valueOf()来完成。
 * 父类向子类进行强制转换，如果成功不会有任何数据丢失，如果不是其子类，那么会报错。
 * 
 * 
 * Father f1 = new Son();  //父类引用指向子类对象
 * Son s1 = (Son)f1;	   //子类引用指向子类对象
 * Father f2 = new Father();
   Son s2 = (Son)f2;       // 出错，子类引用不能指向父类对象 比如有些功能父类可能没有s2.callfather()给爸爸打电话
 */
