/*
 * Page 50
 * Container
 * 
 */
package TinJAVAobject;
import java.util.*;
import java.util.ArrayList;
import java.util.Collections;

//��������й���ͨ��ArrayList����������ʵ�֣�ֻ��ʵ�ֵķ�ʽ��ͬ
public class Container
{
     public static void main(String[] args)
     {
           List<Integer> arrayList = new ArrayList<Integer>();
           arrayList.add(12);
           arrayList.add(10);
           arrayList.add(35);
           arrayList.add(100);

           arrayList.set(1, 1);
           arrayList.add(0, 0);
           arrayList.remove(4);
           System.out.println("ֱ����ʾarrayList");
           System.out.println(arrayList);
           //==================================================
           System.out.println("ͨ������������ArratList");
           Iterator<Integer> iterator = arrayList.iterator();//��ȡ�����ĵ�����
           while(iterator.hasNext())
           {
               Integer value = iterator.next();//��ȡ��ǰ�α��ұߵ�Ԫ�أ�ͬʱ�α�����-->
               System.out.println(value);
           }
           //==================================================
           System.out.println("ͨ��ArrayList������ȡһ������arr��");
           Object[] arr = arrayList.toArray();
           for(int i=0;i<arr.length;i++)
           {
               System.out.println(arr[i]);
           }
           //==================================================
           //������Collections���ǵ���Arrays��sort������
           System.out.println("Arrays��sort����");
           Arrays.sort(arr);
           ListIterator i = arrayList.listIterator();
           for (int j=0; j<arr.length; j++) {
               i.next();
               i.set(arr[j]);
           }
           System.out.println(arrayList);
           //==================================================
           System.out.println("Collections��sort����");
           Collections.sort(arrayList);
           System.out.println(arrayList);
           
     }
}
    

