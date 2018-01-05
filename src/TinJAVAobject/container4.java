/*
 * 
 * ���ǰ������ŵ��Թ�ϣ��Ϊ�ڲ��洢�ṹ�������У���Ӧ�������Ҫʵ��equals������hashCode�����������ŷ��Ϲ�ϣ����ʵ���߼�����. 
 * ��Ҫ��һ���߼�:�߼���������ֻҪ���������������ͬ�����ַ(hashCode()����ֵ)�Լ������������Ӧ����ͬ(equals())��
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
           //Java���Դ�����������
          System.out.println("�Ȳ���Java���Դ�����������:");
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
          System.out.println("Java���Դ�����������:��ͬ�Ķ���Ḳ�ǣ�");
          System.out.println("\n");
//===================================================================
          //�û��Զ�����������ͣ�Ϊ��д֮ǰ
          System.out.println("�����û��Զ������������--δ��д��������֮ǰ:");
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
          System.out.println("���û����д:������ͬ�Ķ��󲻻ᱻ����!");
          System.out.println("\n");
//==================================================================
          //�û��Զ�����������ͣ�Ϊ��д֮��
          System.out.println("�����û��Զ������������--��д��������֮��:");
          HashMap<HashStudent2, String> hashMap3 = new HashMap<HashStudent2,String>();
          hashMap3.put(new HashStudent2("zhangsan",88.8), "beijing");
          hashMap3.put(new HashStudent2("lisi",88.8), "beijing");
          hashMap3.put(new HashStudent2("wangwu",66.9), "beijing");
          hashMap3.put(new HashStudent2("zhangsan",88.8), "beijing");
          hashMap3.put(new HashStudent2("lisi",88.8), "beijing");
          hashMap3.put(new HashStudent2("wangwu",66.9), "aeijing");
          //keyset����set��Ȼ��iterator���ҵ���Ӧkey��ȡֵ
          Set<HashStudent2> keySet3 = hashMap3.keySet();
          Iterator<HashStudent2> iterator3 = keySet3.iterator();
          while(iterator3.hasNext())
          {
              HashStudent2 key = iterator3.next();
              System.out.println(key+"\t"+hashMap3.get(key));
          } 
          System.out.println("��д����:��ͬ�Ķ���ᱻ����!");
          System.out.println("\n");
          //=====================================================
          System.out.println("�鿴������ֵͬ��hashcode(hashCode()����ֵ)�Լ������������Ƿ����equals()");
          System.out.println("��ֵͨ");
          System.out.println(new Integer(1).equals(new Integer(1)));
          System.out.println(new Integer(1).hashCode()==new Integer(1).hashCode());
          System.out.println(new String("zhang").equals(new String("zhang")));
          System.out.println(new String("zhang").hashCode()==new String("zhang").hashCode());
          System.out.println("δ��дHashֵ");
          System.out.println(new HashStudent1("batman",98.8).equals(new Student("batman",98.8)));
          System.out.println(new HashStudent1("batman",98.8).hashCode());
          System.out.println(new HashStudent1("batman",98.8).hashCode());
          System.out.println("��д��Hashֵ");
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
        return (int) (this.name.hashCode()*score);//��֤��ͬ����ӳ�䵽ͬһ������λ��
    }
    @Override
    public boolean equals(Object obj)
    {
    	HashStudent2 cc = (HashStudent2)obj;
        return this.name==cc.name&&this.score==cc.score;
    }
}

/*
 * 1�����ǰ������ŵ������У���Ӧ���඼Ӧ��ʵ��Object���е�toString()������ 
2��������Ҫ���бȽ�������඼Ӧ��ʵ��Comparable�ӿ��е�compareTo()���������ǰ������ŵ�����Ϊ�ڲ��ṹ�������ж�Ӧ��ʵ��Comparable�ӿ��е�compareTo()���� 
3�����ǰ������ŵ��Թ�ϣ��Ϊ�ڲ��洢�ṹ�������У���Ӧ�������Ҫʵ��equals������hashCode�����������ŷ��Ϲ�ϣ����ʵ���߼�����. 
4���߼���������ֻҪ���������������ͬ�����ַ(hashCode()����ֵ)�Լ������������Ӧ����ͬ(equals())�� 
 * 
 * 
 * ����ĳ�����5����ʱ��һ��������6����ô��ΰ����6��ŵ�����ֻ��5���������ء�����ȡģ��������6��5�������1����ô�Ͱ�6�ŵ������±���1��λ�á���ô��7 
��Ӧ�÷ŵ�2���λ�á�����λ�ã���˹��ͻ��û�г��֡���ʱ���и�������11������ȡģ����11��5��1��Ҳ����1����ôԭ�������±���1�ĵط��Ѿ������ˣ���6����ʱ�ּ����1���λ�ã���ô����1���λ�ã��ͱ��봢���������ˡ���ʱ���ͽй�ϣ��ͻ����ͻ֮���Ҫ����˳��������ˡ� 
������ݵķֲ��ȽϹ㷺�����Ҵ������ݵ����鳤�ȱȽϴ� 
��ô��ϣ��ͻ�ͱȽ��١������ͻ�Ǻܸߵġ�
 * 
 * 
 * 
 * 
 * /
 */