/*
Java program to convert integer into binary number system
Input : 42
Output : 101010
                    PROBLEM NUMBER - 06
-------------------------------------------------------------
*/

public class Demo {
   public static void main( String args[] ) {
      int num = 42;
      String bag = Integer.toBinaryString(num);
      System.out.println(bag);
   }
}
