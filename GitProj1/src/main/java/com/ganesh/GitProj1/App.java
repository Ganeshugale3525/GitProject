package com.ganesh.GitProj1;

import java.util.Scanner;

public class App {
	public int sum(int a,int b)
	{
		return a+b;
	}
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter First No1:");
        int num1=sc.nextInt();
        System.out.println("Enter Second No:");
        int num2=sc.nextInt();
        App app=new App();
        int sum = app.sum(num1, num2);
        System.out.println("Sum Is:"+sum);
        sc.close();
    }
}
