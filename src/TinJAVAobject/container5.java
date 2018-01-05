/*
 * 排序
 * 
 * 
 */
package TinJAVAobject;

import java.util.*;

public class container5 {
	 
	 public static void main(String[] args)
     {
		 //===========================================
		 //list排序
		 System.out.println("list排序");
	        List<User> us = new LinkedList<User>();
	        us.add(new User("f5", 12));
	        us.add(new User("f2", 22));
	        us.add(new User("f3", 2));
	        us.add(new User("f4", 14));
	        us.add(new User("f5", 32));
	        us.add(new User("f4", 12));
	        us.add(new User("f7", 17));
	        us.add(new User("f8", 22));
	        System.out.println("原始list");
	        System.out.println(us);
	        long bt = System.nanoTime();//测试时间
	        System.out.println("自定义自身比较功能排序list");
	        Collections.sort(us);
	        System.out.println(us);
	        System.out.println("自定义比较器比较功能排序list（优化）");
	        System.out.println("对相同年龄的人根据用户名排序，String的排序");
	        Collections.sort(us, new Comparator<User>() {
	 
	            @Override
	            public int compare(User o1, User o2) {
	                if (o1.getAge() < o2.getAge())
	                    return -1;
	                else if (o1.getAge() > o2.getAge())
	                    return 1;
	                else
	                    return o1.getName().compareTo(o2.getName());
	            }
	        });     
	        long et = System.nanoTime();
	        System.out.println(us.toString());
	        System.out.print( "相差时间：" + ( et - bt) );
	        System.out.println("\n");
	        //Arrays的排序采用的是插入排序和归并排序，当数组长度较小时直接插入排序。
	        
	        //=================================================================
	        //set排序
	        System.out.println("Hashset排序");
	        Set<User> us2 = new HashSet<User>();
	        us2.add(new User("f5", 12));
	        us2.add(new User("f2", 22));
	        us2.add(new User("f3", 2));
	        us2.add(new User("f4", 14));
	        us2.add(new User("f5", 32));
	        us2.add(new User("f4", 12));
	        us2.add(new User("f7", 17));
	        us2.add(new User("f8", 52));
	        List<User> list = new ArrayList<User>(us2);
	        Collections.sort(list);
	        System.out.println(list);
	        System.out.println("set排序中本质并没改变，只是显示排序。set本来就无序");
	        System.out.println(us2);        

	        System.out.println("Treeset排序,自动");
	        System.out.println("此处comparator用age对比，所以相同age被覆盖");
	        Set<User> us3 = new TreeSet<User>();
	        us3.add(new User("f1", 8));
	        us3.add(new User("f2", 7));
	        us3.add(new User("f3", 6));
	        us3.add(new User("f4", 5));
	        us3.add(new User("f5", 4));
	        us3.add(new User("f6", 3));
	        us3.add(new User("f7", 2));
	        us3.add(new User("f8", 2));
	        System.out.println(us3);	 
	        
	        //set包括HashSet和TreeSet，HashSet是基于HashMap的，TreeSet是基于TreeMap的。
	        //TreeMap是用红黑树实现，天然就具有排序功能，“天然就具有排序功能”是指它拥有升序、降序的迭代器。
	        //那么HashSet怎么排序呢？我们可以将HashSet转成List，然后用List进行排序。
	        
	        //======================================================
	        //Map
	        System.out.println("Map排序,自动");
	        Map<User, Integer> us4 = new HashMap<User, Integer>();
        // Map<String, Integer> us = new TreeMap<String, Integer>();
	        System.out.println("此处comparator用age对比，所以相同age被覆盖");
        us4.put(new User("f1", 13),1);
        us4.put(new User("f2", 13),1);
        us4.put(new User("f5", 22),3);
        us4.put(new User("f4", 42),4);
        us4.put(new User("f3", 15),5);
        us4.put(new User("f8", 21),6);
        us4.put(new User("f6", 123),7);
        us4.put(new User("f7", 1),8);
        us4.put(new User("f9", 19),9);
        System.out.println(us4.toString());
        System.out.println(new TreeMap<User, Integer>(us4));
        //用HashMap来构造一个TreeMap。
       
        //按value排序
	    //将map的Entry提出成set结构，然后将set转成list，最后按照list进行排序。?
     }
}

class User implements Comparable<User> {
	 
    private String name;
    private int age;
 
    public User() {
    }
 
    public User(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }
 
    @Override
    public String toString() {
        return "name:" + name + ",age:" + age;
    }
 
    public String getName() {
        return name;
    }
 
    public void setName(String name) {
        this.name = name;
    }
 
    public int getAge() {
        return age;
    }
 
    public void setAge(int age) {
        this.age = age;
    }
 
    @Override
    public int compareTo(User o) {
        if (o.age < this.age)
            return 1;
        else if (o.age > this.age)
            return -1;
        else
            return 0;
    }
    @Override
    public int hashCode()
    {
        return (int) (this.name.hashCode()*age);//保证相同对象映射到同一个索引位置
    }
    @Override
    public boolean equals(Object obj)
    {
    	User cc = (User)obj;
        return this.name==cc.name&&this.age==cc.age;
    }
 
}


/*
 * 如果是自定义对象，需要实现Comparable接口使得对象自身就有“比较”的功能，当然我们也可以在外部使用Comparator来规定其排序。
 * 
 * 
 * 
 * 
 * 
 */

