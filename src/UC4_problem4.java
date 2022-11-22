package com.bridgelabz;
public class UC4_problem4 {
    public static void main(String[] args) {
        int Wage_per_Hour = 20;
        int Full_Time = 8;
        int Part_Time = 4;
        double num = Math.random();
        System.out.println(num);
        int randomCheck = ((int) (num * 10)) % 3;
        System.out.println("Random check value:" + randomCheck);
        switch (randomCheck) {
            case 0:
                System.out.println("employee is absent");
                break;
            case 1:
                System.out.println("employee is present");
                int employee_wage = Wage_per_Hour * Full_Time;
                System.out.println("employee wage is:" + employee_wage);
                break;
            case 2:
                employee_wage = Wage_per_Hour * Part_Time;
                System.out.println("employee wage is:" + employee_wage);
                break;
            default:
                System.out.println("not  usable");
        }
    }
}
