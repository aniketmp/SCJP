package org.collection;
import static java.lang.System.out;
import java.util.LinkedList;

public class LinkListDemo {
	
/*
 * 	Due to nature of LinkedList's internal structure, its easy to add or remove the elements from  
 *  beginning or end of the list by only manipulating its reference.
 *  LinkList gives you additional methods for inserting or deleting the elements from beginning or end (in case of doubly linked list)
 *  Which makes it easy choice of implement of stack or queue. 
 */
public static void main(String[] args) 
{
	
	LinkedList <String>l=new LinkedList<String>();
	l.add("a");
	l.add("b");
	l.add("c");
	l.add(null);//allowed
	l.add("d");
	l.add("e");
	l.addLast("z");
	l.addFirst("a");
	l.add(1,"a2");
	out.println("Original contents of l  "+l);
	l.remove("f");
	l.remove(2);
	out.println("Contents after deletion  "+l);
	l.removeFirst();
	l.removeLast();
	out.println("contents after deleting first and last "+l);
	Object val=l.get(2);
	out.println("var 'l' after change is "+l);
	}
}
