/*
 * ����
 * 
 * 
 */
package TinJAVAobject;

import java.util.*;

public class container5 {
	 
	 public static void main(String[] args)
     {
		 //===========================================
		 //list����
		 System.out.println("list����");
	        List<User> us = new LinkedList<User>();
	        us.add(new User("f5", 12));
	        us.add(new User("f2", 22));
	        us.add(new User("f3", 2));
	        us.add(new User("f4", 14));
	        us.add(new User("f5", 32));
	        us.add(new User("f4", 12));
	        us.add(new User("f7", 17));
	        us.add(new User("f8", 22));
	        System.out.println("ԭʼlist");
	        System.out.println(us);
	        long bt = System.nanoTime();//����ʱ��
	        System.out.println("�Զ�������ȽϹ�������list");
	        Collections.sort(us);
	        System.out.println(us);
	        System.out.println("�Զ���Ƚ����ȽϹ�������list���Ż���");
	        System.out.println("����ͬ������˸����û�������String������");
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
	        System.out.print( "���ʱ�䣺" + ( et - bt) );
	        System.out.println("\n");
	        //Arrays��������õ��ǲ�������͹鲢���򣬵����鳤�Ƚ�Сʱֱ�Ӳ�������
	        
	        //=================================================================
	        //set����
	        System.out.println("Hashset����");
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
	        System.out.println("set�����б��ʲ�û�ı䣬ֻ����ʾ����set����������");
	        System.out.println(us2);        

	        System.out.println("Treeset����,�Զ�");
	        System.out.println("�˴�comparator��age�Աȣ�������ͬage������");
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
	        
	        //set����HashSet��TreeSet��HashSet�ǻ���HashMap�ģ�TreeSet�ǻ���TreeMap�ġ�
	        //TreeMap���ú����ʵ�֣���Ȼ�;��������ܣ�����Ȼ�;��������ܡ���ָ��ӵ�����򡢽���ĵ�������
	        //��ôHashSet��ô�����أ����ǿ��Խ�HashSetת��List��Ȼ����List��������
	        
	        //======================================================
	        //Map
	        System.out.println("Map����,�Զ�");
	        Map<User, Integer> us4 = new HashMap<User, Integer>();
        // Map<String, Integer> us = new TreeMap<String, Integer>();
	        System.out.println("�˴�comparator��age�Աȣ�������ͬage������");
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
        //��HashMap������һ��TreeMap��
       
        //��value����
	    //��map��Entry�����set�ṹ��Ȼ��setת��list�������list��������?
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
        return (int) (this.name.hashCode()*age);//��֤��ͬ����ӳ�䵽ͬһ������λ��
    }
    @Override
    public boolean equals(Object obj)
    {
    	User cc = (User)obj;
        return this.name==cc.name&&this.age==cc.age;
    }
 
}


/*
 * ������Զ��������Ҫʵ��Comparable�ӿ�ʹ�ö���������С��Ƚϡ��Ĺ��ܣ���Ȼ����Ҳ�������ⲿʹ��Comparator���涨������
 * 
 * 
 * 
 * 
 * 
 */

