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

	         Collections.sort(arr);//归根结底Collections就是调用Arrays的sort方法

	         for (Student student : arr)
	        {
	            System.out.println(student);
	        }
	        System.out.println(new Integer(2).toString());//凡是Java中自带的数据类型都已经重写完了toString()方法！

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
	     //toString()方法的使用：凡是把类对象放到容器中，相应的类都应该实现Object类中的toString()方法；凡是Java中自带的数据类型，都已经重写完了toString()方法 
	     public String toString()//重写tostring
	     {
	         return this.name+"\t"+this.score;
	     }
	     //Comparable接口中的compareTo()方法:凡是需要进行比较排序的类都应该实现Comparable接口中的compareTo()方法；凡是把类对象放到以树为内部结构的容器中都应该实现Comparable接口中的compareTo()方法 
	    public int compareTo(Student obj)
	    {
	          return (int) (this.score - obj.score) ;//比较的标准为score进行升序
	    }
	}

