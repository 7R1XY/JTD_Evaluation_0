/*
Write a java program to print Below pattern
Input : [[*_*_*],[_*_*].[*_*_*]]
               PROBLEM NUMBER - 08
---------------------------------------------------

*/


class Main {
public static void main(String[] args) {
   int  n=2;
   for(int i=0;i<=n;i++){
   String bag="";
   for(int j=0;j<=n;j++){
   if(i==0||i==n){
   bag=bag+"*"+" ";
    }else if(j==0||j==n){
    bag=bag+"*"+" ";
    }else {
    bag=bag+"  ";
    }
    }
    System.out.println(bag);
        
}
}
}
