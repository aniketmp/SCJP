package org.collection;

import java.io.Serializable;

/*
 * Here in order to check the equality of object ,we have overridden equals and hashcode method. Although this is legally  correct, the
 * result will be incorrect. Since we have included transient variable in the equals and hascode logic, under some circumstances, 
 * an object you put in a collection won't be found. As you might know, serialization saves an object so that 
 * it can be reanimated later by deserializing it back to full objectness. But danger..transient variable are not saved when object is serialized.
 * Hence th object transient variable will come back with default value rather than the value the variable had at the time it was 
 * saved(or put into the HashMap).  
 */
public class ContractTest implements Serializable{
	transient int x;
	int y;
	
	@Override
	public int hashCode() {		// Legal but not correct
		return x*y;
	}
	
	@Override
	public boolean equals(Object obj) {
		ContractTest c=(ContractTest)obj;
		if(c.x==x && c.y==y) 			//Legal but not correct
			return true;
		return false;

	}
}
