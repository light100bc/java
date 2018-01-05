/*
 * Page 50
 * Up/Down Casting
 * 屌爆了上下转型
 * 
 */


package thinkinjava;

import java.util.ArrayList;
import java.util.List;

//新建一个电子产品接口
interface Electronics{

}

//新建电子产品类，实现接口
class Thinkpad implements Electronics{

    //Thinkpad引导方法
    public void boot(){
        System.out.println("welcome,I am Thinkpad");        
    }

    //使用Thinkpad编程  
    public void program(){
        System.out.println("using Thinkpad program");
    }

}

class Mouse implements Electronics{

    //鼠标移动
    public void move(){
        System.out.println("move the mouse");       
    }

    //鼠标点击  
    public void onClick(){
        System.out.println("a click of the mouse");
    }

}

class Keyboard implements Electronics{

    //使用键盘输入    
    public void input(){
        System.out.println("using Keyboard input");
    }

}


//购物车类


class ShopCar{

	//泛型
	//Electronics接口在这里用到！！！降耦合！
    private List<Electronics> mlist = new ArrayList<Electronics>();

    //向上转型
    public void add(Electronics electronics){

        mlist.add(electronics);

    }

    public int getSize(){

        return mlist.size();
    }


    public Electronics getListItem(int position){

        return mlist.get(position);

    }


}

//测试类

	public class UpDownCasting{

	    public static final int THINKPAD = 0;
	    public static final int MOUSE = 1;
	    public static final int KEYBOARD = 2;

	    public static void main(String[] args){

	        //添加进购物车
	        ShopCar shopcar = new ShopCar();
	        shopcar.add(new Thinkpad());
	        shopcar.add(new Mouse());
	        shopcar.add(new Keyboard());

	        //获取大小
	        System.out.println("购物车存放的电子产品数量为 ——> "+shopcar.getSize());


	        //开始测试thinkpad电脑	 
	        Thinkpad thinkpad;
	        Mouse mouse;
	        Keyboard keyboard;
	        int i;
	        int itemCount;
	        itemCount=shopcar.getSize();
	        for (i=0;i<=itemCount-1;i=i+1){
	        	if (shopcar.getListItem(i) instanceof Thinkpad) {
	        		thinkpad = (Thinkpad)shopcar.getListItem(i);
	    	        thinkpad.boot();
	    	        thinkpad.program();
	    	    }
	    	    else if (shopcar.getListItem(i) instanceof Mouse) {
	    	    	mouse = (Mouse)shopcar.getListItem(i);
	    	        mouse.move();
	    	        mouse.onClick();
	    	    }
	    	    else if (shopcar.getListItem(i) instanceof Keyboard) {
	    	    	keyboard = (Keyboard)shopcar.getListItem(i);
	    	        keyboard.input();
	    	    }
	        	System.out.println("-------------------");
	    	 }
	 
//	        Thinkpad thinkpad = (Thinkpad)shopcar.getListItem(THINKPAD);
//	        thinkpad.boot();
//	        thinkpad.program();
//	        
//	        System.out.println("-------------------");
//
//	        //开始测试Mouse鼠标
//	        Mouse mouse = (Mouse)shopcar.getListItem(MOUSE);
//	        mouse.move();
//	        mouse.onClick();
//
//	        System.out.println("-------------------");
//
//	        //开始测试Keyboard键盘
//	        Keyboard keyboard = (Keyboard)shopcar.getListItem(KEYBOARD);
//	        keyboard.input();
	    }

	}

/*先要上转型然后再下转型，体验上上下下的享受
 * 
 * 也就是说会把之前向上转型暂时失去一定method找回来，但又一次失去decoupling，主要调用specific class 里 method 时用
 * 
 * 
 */