package org.collection;
import java.util.*;
import static java.lang.System.*;
public class HashTableDemo
{
	public static void main(String args[])
	{
		Hashtable<String,Float> ht=new Hashtable<String,Float>();
		ht.put("first",45.8f);
		ht.put("second",67.3f);
		//ht.put("second",17.5f); //original value is replaced by this 
		//ht.put(null,55.5f); //No compile time error but runtime. Doen't support null key.
		//ht.put("ninth",null); //Neighter supports null value.
		ht.put("third",87.33f);
		ht.put("forth",47.83f);
		out.println(ht);
		Enumeration <String>e=ht.keys();
		while(e.hasMoreElements())
		{
			String s=e.nextElement();
			out.println(s+"\t"+ht.get(s));
		}

		Enumeration<Float> e1=ht.elements();
		while(e1.hasMoreElements())
		{
			out.printf("%f\n",e1.nextElement());
		}
		
		out.println("Displaying keys");
		Set<String> s=ht.keySet();
		Iterator <String>itr=s.iterator();
		while(itr.hasNext())
		{
			out.printf("%s\n",itr.next());
		}

		out.println("Modifying");
		float f=ht.get("second");
		out.println("second's old value is\t"+f);
		ht.put("second",f+30);
		out.println("second's new value is\t"+ht.get("second"));
	}
}
//No guarantee of its order of element
//Its a synchronized Map. Its all the methods are synchronized.