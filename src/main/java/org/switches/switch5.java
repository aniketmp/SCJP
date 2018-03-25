package org.switches;

public class switch5 {
public static void main(String[] args) {
	byte g = 2;
	switch(g) {
	case 23:
	//case 128: //wont compile!
	}
}

}
/*
 This code won't compile. Although the switch argument is legal—a byte is
implicitly cast to an int—the second case argument (128) is too large for a byte,
and the compiler knows it!
*/
