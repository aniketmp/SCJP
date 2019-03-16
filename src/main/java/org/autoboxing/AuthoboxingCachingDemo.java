package org.autoboxing;

public class AuthoboxingCachingDemo {

	  public static void compare(Integer a, Integer b) {
          if (a == b) {
            System.out.println("a and b are equal");
          } else {
            System.out.println("a and b are not equal");
          }
        }
 
        public static void main(String[] args) {
          int a = 1000;
          int b = 1000;
          compare(a, b);// a and b are not equal
          /*
           * If you execute this program the output will be a and b are not equal. 
           * It is because we are not comparing two int values but two Integer values in the method “compare”. 
           * Both a and b are autoboxed to their wrapper classes when passed to method “compare”. 
           * And in the comparison statement if (a == b) we are not comparing int values but Integer objects; 
           * and comparison of wrapper objects with == operator is not based on their actual values but on their memory references. 
           * So when the statement if (a == b) executes the memory references of both a and b are compared and not actual values a and b holds.
           *  And as a result the program prints a and b are not equal. 
           */
          
          a = 100;
          b = 100;
          compare(a, b);// a and b are equal
          /*
            As we compared objects with == we can assure that in the second program the memory location of a and b are same;
             and so we can conclude that jvm “caches” the memory location when creating wrapper object like Integeror Long for
              some set of values. And the cached value ranges from “-128” to “+127”. You can change the values
               of both a and b and see the output.
			 So as we can see the == operator can result in different output when compares two Integer objects based on their values
 			 and that is the reason it is advised to use the .equals() method when comparing two Integer or Long objects. 
           */
        }
}
