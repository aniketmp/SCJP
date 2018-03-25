package org.arithmatics;

public class arith1 {
	public static void main(String[] args) {
			System.out.println(4+3/2*5-1);
			System.out.println("Result:"+4+3*5);
			System.out.println(4+3+5+" :Result");
			System.out.println(4+3*5+" :Result");
			System.out.println("Result:"+4+5/2*10);
			System.out.println("Result:"+4+5%2*10);
			System.out.println("Result:"+(4+5)/2*10);
	}
	//Note: IF EITHER OPERATOR IS STRING THEN THE '+' OPERATOR BECOMES A STRING CONCATINATION
	//OPERATOR. IF BOTH OPERAND ARE NUMBERS, THE '+' OPERATOR IS ADDITION OPERATOR.
	//EXCEPT *,/,%.() OPERATORS .SINCE THEY HAVE HIGH PRECEDENCE THAN STRING CONCATINATION.
	//'()' HAS MAXIMUM PRECEDENCE AMONG ALL.
}
