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
          
        Girl g1=new MMGirl(); //����ת��  
        g1.smile();  
          
        MMGirl mmg=(MMGirl)g1; //����ת��,��������нԲ������  
        mmg.smile();  
        mmg.c();  
        Girl g2=new Girl();  
//       MMGirl mmg1=(MMGirl)g2; //����ȫ������ת��,�����޴������л����  
//      mmg1.smile();  
//      mmg1.c();  
/*output: 
* CGirl smile sounds sweet... 
* CGirl smile sounds sweet... 
* CGirl c()... 
* Exception in thread "main" java.lang.ClassCastException: com.wensefu.other1.Girl 
* at com.wensefu.other1.Main.main(Girl.java:36) 
*/  
        if(g2 instanceof MMGirl){  //ͨ��instanceof��ֹ�쳣
            MMGirl mmg1=(MMGirl)g2;   
            mmg1.smile();  
            mmg1.c();  
        }  
          
    }  
}  

/* ��Ҫ��ת��Ȼ������ת��
 * 
 * ������ת���෴�����ǰѸ������תΪ�������
 * 
 * ��ָ���������ĸ������ø����������ý�����ת��(downcasting)��Ҫǿ��ת����
   �磺f1 ����һ��ָ���������ĸ������á���f1������������s1�� Son s1 = (Son)f1��
   ����f1ǰ���(Son)������ϣ�����ǿ��ת����
 * 
 * Ҳ����˵���֮ǰ����ת����ʱʧȥһ��method�һ���������һ��ʧȥdecoupling����Ҫ����specific class �� method ʱ��
 * 
 * 
 * ԭ������������ת��������ת��ֻǣ���������������͵�ת��������Ķ����ڴ�û�з���һ��仯��
 * ���������͵�ת����˲�ͬ��������ȷʵ�����˱仯�����ǻ������Ͳ����Ƕ�������ǻ������ͺ����װ����໥ת����ʵ���ϵ�����Integer.parseInt()��Integer.valueOf()����ɡ�
 * �������������ǿ��ת��������ɹ��������κ����ݶ�ʧ��������������࣬��ô�ᱨ��
 * 
 * 
 * Father f1 = new Son();  //��������ָ���������
 * Son s1 = (Son)f1;	   //��������ָ���������
 * Father f2 = new Father();
   Son s2 = (Son)f2;       // �����������ò���ָ������� ������Щ���ܸ������û��s2.callfather()���ְִ�绰
 */
