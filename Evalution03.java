/*
Given  3 sides of a triangle, find out if the triangle is a right angled triangle.
Right angled triangle = (side1)^2 + (side2)^2 = (side3)^2
           PROBLEM NUMBER - 12
---------------------------------------------------------------------
*/

class main{
  public static void main(String[] args){
  int x = 8;
  int y = 6;
  int z = 10; 
  if ((x*x)+(y*y)==(z*z)){
      System.out.println("Right angled triangle");
   }
    else{
       System.out.println("Not a right angled traingle");
     }
  }
}
