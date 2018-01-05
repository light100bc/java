/*
 * Page 50
 * Up/Down Casting
 * �ű�������ת��
 * 
 */


package thinkinjava;

import java.util.ArrayList;
import java.util.List;

//�½�һ�����Ӳ�Ʒ�ӿ�
interface Electronics{

}

//�½����Ӳ�Ʒ�࣬ʵ�ֽӿ�
class Thinkpad implements Electronics{

    //Thinkpad��������
    public void boot(){
        System.out.println("welcome,I am Thinkpad");        
    }

    //ʹ��Thinkpad���  
    public void program(){
        System.out.println("using Thinkpad program");
    }

}

class Mouse implements Electronics{

    //����ƶ�
    public void move(){
        System.out.println("move the mouse");       
    }

    //�����  
    public void onClick(){
        System.out.println("a click of the mouse");
    }

}

class Keyboard implements Electronics{

    //ʹ�ü�������    
    public void input(){
        System.out.println("using Keyboard input");
    }

}


//���ﳵ��


class ShopCar{

	//����
	//Electronics�ӿ��������õ�����������ϣ�
    private List<Electronics> mlist = new ArrayList<Electronics>();

    //����ת��
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

//������

	public class UpDownCasting{

	    public static final int THINKPAD = 0;
	    public static final int MOUSE = 1;
	    public static final int KEYBOARD = 2;

	    public static void main(String[] args){

	        //��ӽ����ﳵ
	        ShopCar shopcar = new ShopCar();
	        shopcar.add(new Thinkpad());
	        shopcar.add(new Mouse());
	        shopcar.add(new Keyboard());

	        //��ȡ��С
	        System.out.println("���ﳵ��ŵĵ��Ӳ�Ʒ����Ϊ ����> "+shopcar.getSize());


	        //��ʼ����thinkpad����	 
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
//	        //��ʼ����Mouse���
//	        Mouse mouse = (Mouse)shopcar.getListItem(MOUSE);
//	        mouse.move();
//	        mouse.onClick();
//
//	        System.out.println("-------------------");
//
//	        //��ʼ����Keyboard����
//	        Keyboard keyboard = (Keyboard)shopcar.getListItem(KEYBOARD);
//	        keyboard.input();
	    }

	}

/*��Ҫ��ת��Ȼ������ת�ͣ������������µ�����
 * 
 * Ҳ����˵���֮ǰ����ת����ʱʧȥһ��method�һ���������һ��ʧȥdecoupling����Ҫ����specific class �� method ʱ��
 * 
 * 
 */