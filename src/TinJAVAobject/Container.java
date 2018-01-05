/*
 * Page 50
 * Container
 * 
 */
package TinJAVAobject;
import java.util.*;
import java.util.ArrayList;
import java.util.Collections;

//数组的所有功能通过ArrayList容器都可以实现，只是实现的方式不同
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
           System.out.println("直接显示arrayList");
           System.out.println(arrayList);
           //==================================================
           System.out.println("通过迭代器遍历ArratList");
           Iterator<Integer> iterator = arrayList.iterator();//获取容器的迭代器
           while(iterator.hasNext())
           {
               Integer value = iterator.next();//获取当前游标右边的元素，同时游标右移-->
               System.out.println(value);
           }
           //==================================================
           System.out.println("通过ArrayList容器获取一个数组arr：");
           Object[] arr = arrayList.toArray();
           for(int i=0;i<arr.length;i++)
           {
               System.out.println(arr[i]);
           }
           //==================================================
           //归根结底Collections就是调用Arrays的sort方法。
           System.out.println("Arrays的sort方法");
           Arrays.sort(arr);
           ListIterator i = arrayList.listIterator();
           for (int j=0; j<arr.length; j++) {
               i.next();
               i.set(arr[j]);
           }
           System.out.println(arrayList);
           //==================================================
           System.out.println("Collections的sort方法");
           Collections.sort(arrayList);
           System.out.println(arrayList);
           
     }
}
    

