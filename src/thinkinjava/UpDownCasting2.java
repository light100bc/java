/*
 * Page 50
 * Up/Down Casting2
 * ��ը������ת��2
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
	        // B t = (B) new A(); // ����ת�Ͳ�����������ʱ���׳�����  

	        /** 
	         * ����ת�� 
	         */  
	        // ��ʽת��  
		 	E e1 = new E();
	        D d1 = e1;  
	        
	        // ǿ��ת��  ?
	        D d2 = new E();  
	        C c = (C) d2; 
	        
	        // ǿ��ת��?  
	        //Class<> clazz = Class.forName("p.E");  
	        //D d3 = (D) clazz.newInstance();  
	 }
}



/*
 *   1 ��ʽ���Զ�����ת��,ǿ������ת����implement����
     2 ��ʽ��ǿ����ת��
     3 instanceof   ? 
     ����ķ�ʽ
     4 ���� ?
 * 
 * 
 * �ܽ᣺��̬�Ĵ���Ҫ��������Ҫ����

��1��Ҫ�м̳�

��2��Ҫ����д

��3����������ָ���������

��������ס�Ĺ���

��1���������Ǹ��������������ж���Щ�������Ե��ã������Ǹ��ݶ����ȷʵ�����͡�

��2���ڵ��÷���ʱ����ѭ��ͽ�ԭ�򡣼��ڼ̳����У�java����������ײ㿪ʼѰ�ҵ��õķ�����ֱ���ҵ�Ϊֹ��
 * 
 * 
 * 
 * 
 * 
 * 
*/
