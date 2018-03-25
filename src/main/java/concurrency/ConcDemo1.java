package concurrency;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class ConcDemo1 {
	public static void main(String[] args) 
	{
		ConcurrentMap<String, Integer> map=new ConcurrentHashMap<>();
		map.put("John",23);
		map.putIfAbsent("Mery", 24); //If the specified key is not already associated with a value, associate it with the given value. This is equivalent to
/*
		 if (!map.containsKey(key))
		   return map.put(key, value);
		 else
		   return map.get(key);
*/


		map.remove("John", 23);//Removes the entry for a key only if currently mapped to a given value. This is equivalent to
		
/*		 if (map.containsKey(key) && Objects.equals(map.get(key), value)) {
			   map.remove(key);
			   return true;
			 } else
			   return false;
*/
			 

		
		
	}
}
