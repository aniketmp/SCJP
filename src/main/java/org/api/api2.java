package org.api;

public class api2 {
	public static void main(String[] args) {
		int[] scores1 = { 1, 2, 3, 4, 5, 6};
		int[] scores2 = { 0, 0, 0, 0, 0, 0};
		System.arraycopy(scores2, 2, scores1, 3, 2); //src and dest positions are 0 based
		for(int i : scores2) System.out.print(i);
	}
}

/*
java.lang.System.arraycopy(Object src, int srcPos, Object dest, int destPos, int length)

Copies an array from the specified source array, beginning at the specified position, 
to the specified position of the destination array.

A subsequence of array components are copied from the source array referenced by src to the
destination array referenced by dest. The number of components copied is equal to the length
 argument. The components at positions srcPos through srcPos+length-1 in the source array 
are copied into positions destPos through destPos+length-1, respectively, of the destination 
array. 
If the src and dest arguments refer to the same array object, then the copying is performed as if the components at positions srcPos through srcPos+length-1 were first copied to a temporary array with length components and then the contents of the temporary array were copied into positions destPos through destPos+length-1 of the destination array. 
*/