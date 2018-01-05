package TinJAVAobject;


	import java.util.ArrayList;
	import java.util.Collections;

	public class container3 {
	
	     public static void main(String[] args)
	     {
	         ArrayList<Student> arr = new ArrayList<Student>();
	         arr.add(new Student("zhangsan",89.8));
	         arr.add(new Student("lisi",90));
	         arr.add(new Student("wangwu",60.6));
	         arr.add(new Student("wangting",85.6));

	         Collections.sort(arr);//������Collections���ǵ���Arrays��sort����

	         for (Student student : arr)
	        {
	            System.out.println(student);
	        }
	        System.out.println(new Integer(2).toString());//����Java���Դ����������Ͷ��Ѿ���д����toString()������

	     }
	}
	class Student implements  Comparable<Student>
	{
	     public String name;
	     public double score;
	     public Student(String name,double score)
	     {
	         this.name = name;
	         this.score = score;
	     }
	     //toString()������ʹ�ã����ǰ������ŵ������У���Ӧ���඼Ӧ��ʵ��Object���е�toString()����������Java���Դ����������ͣ����Ѿ���д����toString()���� 
	     public String toString()//��дtostring
	     {
	         return this.name+"\t"+this.score;
	     }
	     //Comparable�ӿ��е�compareTo()����:������Ҫ���бȽ�������඼Ӧ��ʵ��Comparable�ӿ��е�compareTo()���������ǰ������ŵ�����Ϊ�ڲ��ṹ�������ж�Ӧ��ʵ��Comparable�ӿ��е�compareTo()���� 
	    public int compareTo(Student obj)
	    {
	          return (int) (this.score - obj.score) ;//�Ƚϵı�׼Ϊscore��������
	    }
	}

