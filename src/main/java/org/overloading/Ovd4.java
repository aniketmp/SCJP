package org.overloading;
class Ovd4 {
	static void go(int x, int y) {
		System.out.println("int,int");
	}

	static void go(byte... x) {
		System.out.println("byte... ");
	}

	public static void main(String[] args) {
		byte b = 5;
		go(b, b); // which go() will be invoked?
	}
}
/*note:
 * As you probably guessed, the output is
int,int
Because, once again, even though each invocation will require some sort of
conversion, the compiler will choose the older style before it chooses the newer
style, keeping existing code more robust. So far we've seen that
■ Widening beats boxing
■ Widening beats var-args
 */
