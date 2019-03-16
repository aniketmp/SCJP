package org.collection;
import static java.lang.System.*;
import java.util.HashSet;

public class HashSetDemo {
	public static void main(String[] args) {
		HashSet <String>hs=new HashSet<String>();
		hs.add("b");
		hs.add("c");
		hs.add("d");
		hs.add("e");
		hs.add("f");
		hs.add(null);//allowed
		hs.add("g");
		boolean res=hs.add("c");
		out.println("res:"+res);
		hs.add("h");
		out.println("contents of hs  "+hs);
		res=hs.add("z");
		out.println("contents of hs After adding "+hs+"  res:"+res);
		hs.add("y");
		res=hs.add(null);
		out.println("contents of hs After another adding "+hs+"  res:"+res);
	}
}
/*Note:

1)HashSet doesnt give you guarantee of its  order of element. Its unordered, unsorted set.
2)To maintain uniqueness, Hashset will not add new value.
3)It allows null	
4)It stores the information by using a 'hashing' mechanism.It uses hashcode of the object being inserted. So the more efficient your
   hashcode() implementation the better access performance you will get. 
5)Big advantage is it allows execution time of add(),contains(),remove() to remain constant even for large sets.
*/