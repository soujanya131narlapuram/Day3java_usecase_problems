package com.bridgelabz;
public class UC1_problem1 {
public static void main(String[] args){
    double num=Math.random();
    System.out.println(num);
    //System.out.println((0.5%2));
    int randomCheck=((int) (num *10))%2;
    System.out.println("Random check value:"+randomCheck);
    if(randomCheck==1) {
        System.out.println("employee is present");
    }else if(randomCheck==0) {
        System.out.println("employee is absent");
    }
}}
