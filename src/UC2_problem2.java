package com.bridgelabz;
public class UC2_problem2 {
public static void main(String[] args){
   int Wage_per_Hour=20;
   int Full_Day_Hour=8;
   double num=Math.random();
   System.out.println(num);
   //System.out.println((0.5%2));
   int randomCheck=((int) (num *10))%2;
   System.out.println("Random check value:"+randomCheck);
   if(randomCheck==1) {
      System.out.println("employee is present");
      int employee_wage=Wage_per_Hour*Full_Day_Hour;
      System.out.println("employee wage is:" +employee_wage);
   }else if(randomCheck==0) {
      System.out.println("employee is absent");
   }

}
}
