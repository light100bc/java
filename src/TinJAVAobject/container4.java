/*
 * 
 * 凡是把类对象放到以哈希表为内部存储结构的容器中，相应的类必须要实现equals方法和hashCode方法，这样才符合哈希表真实的逻辑功能. 
 * 重要的一个逻辑:逻辑上来讲，只要两个对象的内容相同，其地址(hashCode()返回值)以及这两个对象就应该相同(equals())，
 * 
 */
package TinJAVAobject;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class container4 
{
     public static void main(String[] args)
     {
           //Java中自带的数据类型
          System.out.println("先测试Java中自带的数据类型:");
          HashMap<String, Double> hashMap1 = new HashMap<String,Double>();
          hashMap1.put("zhangsan", 96.0);
          hashMap1.put("lisi", 88.6);
          hashMap1.put("wangwu", 98.6);
          hashMap1.put("wangting",  87.5);
          hashMap1.put("zhangsan", 96.0);
          hashMap1.put("lisi", 88.6);
          hashMap1.put("wangwu", 98.6);
          hashMap1.put("wangting",  87.5);

          Set<String> keySet = hashMap1.keySet();
          Iterator<String> iterator = keySet.iterator();
          while(iterator.hasNext())
          {
              String key = iterator.next();
              System.out.println(key+"\t"+hashMap1.get(key));
          }
          System.out.println("Java中自带的数据类型:相同的对象会覆盖！");
          System.out.println("\n");
//===================================================================
          //用户自定义的数据类型：为重写之前
          System.out.println("测试用户自定义的数据类型--未重写两个方法之前:");
          HashMap<HashStudent1, String> hashMap2 = new HashMap<HashStudent1,String>();
          hashMap2.put(new HashStudent1("zhangsan",88.8), "beijing");
          hashMap2.put(new HashStudent1("lisi",88.8), "beijing");
          hashMap2.put(new HashStudent1("wangwu",66.9), "beijing");
          hashMap2.put(new HashStudent1("zhangsan",88.8), "beijing");
          hashMap2.put(new HashStudent1("lisi",88.8), "beijing");
          hashMap2.put(new HashStudent1("wangwu",66.9), "beijing");
          Set<HashStudent1> keySet2 = hashMap2.keySet();
          Iterator<HashStudent1> iterator2 = keySet2.iterator();
          while(iterator2.hasNext())
          {
              HashStudent1 key = iterator2.next();
              System.out.println(key+"\t"+hashMap2.get(key));
          }
          System.out.println("如果没有重写:导致相同的对象不会被覆盖!");
          System.out.println("\n");
//==================================================================
          //用户自定义的数据类型：为重写之后
          System.out.println("测试用户自定义的数据类型--重写两个方法之后:");
          HashMap<HashStudent2, String> hashMap3 = new HashMap<HashStudent2,String>();
          hashMap3.put(new HashStudent2("zhangsan",88.8), "beijing");
          hashMap3.put(new HashStudent2("lisi",88.8), "beijing");
          hashMap3.put(new HashStudent2("wangwu",66.9), "beijing");
          hashMap3.put(new HashStudent2("zhangsan",88.8), "beijing");
          hashMap3.put(new HashStudent2("lisi",88.8), "beijing");
          hashMap3.put(new HashStudent2("wangwu",66.9), "aeijing");
          //keyset放入set，然后iterator在找到对应key，取值
          Set<HashStudent2> keySet3 = hashMap3.keySet();
          Iterator<HashStudent2> iterator3 = keySet3.iterator();
          while(iterator3.hasNext())
          {
              HashStudent2 key = iterator3.next();
              System.out.println(key+"\t"+hashMap3.get(key));
          } 
          System.out.println("重写过后:相同的对象会被覆盖!");
          System.out.println("\n");
          //=====================================================
          System.out.println("查看两个相同值的hashcode(hashCode()返回值)以及这两个对象是否相等equals()");
          System.out.println("普通值");
          System.out.println(new Integer(1).equals(new Integer(1)));
          System.out.println(new Integer(1).hashCode()==new Integer(1).hashCode());
          System.out.println(new String("zhang").equals(new String("zhang")));
          System.out.println(new String("zhang").hashCode()==new String("zhang").hashCode());
          System.out.println("未重写Hash值");
          System.out.println(new HashStudent1("batman",98.8).equals(new Student("batman",98.8)));
          System.out.println(new HashStudent1("batman",98.8).hashCode());
          System.out.println(new HashStudent1("batman",98.8).hashCode());
          System.out.println("重写后Hash值");
          System.out.println(new HashStudent2("batman",98.8).equals(new HashStudent2("batman",98.8)));
          System.out.println(new HashStudent2("batman",98.8).hashCode());
          System.out.println(new HashStudent2("batman",98.8).hashCode());
          
          Set<HashStudent2> us2 = new HashSet<HashStudent2>();
	        us2.add(new HashStudent2("f5", 12));
	        us2.add(new HashStudent2("f2", 22));
	        us2.add(new HashStudent2("f3", 2));
	        us2.add(new HashStudent2("f4", 14));
	        us2.add(new HashStudent2("f5", 32));
	        us2.add(new  HashStudent2("f4", 12));
	        us2.add(new  HashStudent2("f7", 17));
	        us2.add(new  HashStudent2("f8", 52));
	        System.out.println(new HashStudent2("f8", 52).hashCode());
	          System.out.println(new HashStudent2("f8", 52).hashCode());
	        System.out.println(us2);
     }
}

class HashStudent1 implements  Comparable<HashStudent1>
{
     public String name;
     public double score;
     public HashStudent1(String name,double score)
     {
         this.name = name;
         this.score = score;
     }
     public String toString()
     {
         return this.name+"\t"+this.score;
     }
    public int compareTo(HashStudent1 obj)
    {
          if(this.score > obj.score)
              return 1;
          else
              return -1;
    }
}

class HashStudent2 implements  Comparable<Student>
{
     public String name;
     public double score;
     public HashStudent2(String name,double score)
     {
         this.name = name;
         this.score = score;
     }
     public String toString()
     {
         return this.name+"\t"+this.score;
     }
    public int compareTo(Student obj)
    {
          if(this.score > obj.score)
              return 1;
          else
              return -1;
    }
    @Override
    public int hashCode()
    {
        return (int) (this.name.hashCode()*score);//保证相同对象映射到同一个索引位置
    }
    @Override
    public boolean equals(Object obj)
    {
    	HashStudent2 cc = (HashStudent2)obj;
        return this.name==cc.name&&this.score==cc.score;
    }
}

/*
 * 1、凡是把类对象放到容器中，相应的类都应该实现Object类中的toString()方法； 
2、凡是需要进行比较排序的类都应该实现Comparable接口中的compareTo()方法；凡是把类对象放到以树为内部结构的容器中都应该实现Comparable接口中的compareTo()方法 
3、凡是把类对象放到以哈希表为内部存储结构的容器中，相应的类必须要实现equals方法和hashCode方法，这样才符合哈希表真实的逻辑功能. 
4、逻辑上来讲，只要两个对象的内容相同，其地址(hashCode()返回值)以及这两个对象就应该相同(equals())。 
 * 
 * 
 * 数组的长度是5。这时有一个数据是6。那么如何把这个6存放到长度只有5的数组中呢。按照取模法，计算6％5，结果是1，那么就把6放到数组下标是1的位置。那么，7 
就应该放到2这个位置。到此位置，哈斯冲突还没有出现。这时，有个数据是11，按照取模法，11％5＝1，也等于1。那么原来数组下标是1的地方已经有数了，是6。这时又计算出1这个位置，那么数组1这个位置，就必须储存两个数了。这时，就叫哈希冲突。冲突之后就要按照顺序来存放了。 
如果数据的分布比较广泛，而且储存数据的数组长度比较大。 
那么哈希冲突就比较少。否则冲突是很高的。
 * 
 * 
 * 
 * 
 * /
 */