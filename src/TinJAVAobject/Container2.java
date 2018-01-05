package TinJAVAobject;
import java.util.*;
import java.util.Map.Entry;

public class Container2 {
	public static void main(String[] args)
    {
			//²»ÅÅÐòmap
	        Map<String, String> map = new HashMap<>();
	        //map,set
	        map.put("a", "1");
	        map.put("d", "2");
	        map.put("g", "3");
	        map.put("e", "4");
	        map.put("f", "5");
	        map.put("f", "6");
	        for (Entry<String, String> s : map.entrySet()) {
	            System.out.println("¼üÖµ¶Ô:" + s);
	        }
	        for (String s : map.values()) {
	            System.out.println("values:" + s);
	        }
	        for (String s : map.keySet()) {
	            System.out.println("key:" + s);
	            System.out.println("values:" + map.get(s));
	        }
	 
	        System.out.println(map.getOrDefault("g", "28342849284923"));
	        //==========================================================
	        

    }  
}
