package test;

import java.util.HashMap;

public class RoyaltiesHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap <String,String> h1=new HashMap<String,String>();
		HashMap <String,String> h2=new HashMap<String,String>();
		h1.put("a", "123");
		h1.put("b", "456");
		h1.put("c", "789");
		
		h2.put("d", "400");
		h2.put("e", "500");
		h2.put("x", "999");
		
		for (String key: h1.keySet()) {
		   if(h2.get(key) != null)
		   {
			   //below statement will give you value of h2
			 System.out.println("Value found "+h2.get(key));  
		   }
		}

	}

}
