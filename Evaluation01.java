/*
Write an algorithm to reverse a string
              PROBLEM NUMBER - 01
--------------------------------------------------
*/           
class main{
public static void main(String[] args){
    String a="SUFIYAN";
    String bag="";
   for(int i=0;i<a.length();i++){
   bag=a.charAt(i)+bag;
}
System.out.println(bag);	

}
}
