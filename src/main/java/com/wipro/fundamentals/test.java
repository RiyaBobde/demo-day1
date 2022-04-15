package com.wipro.fundamentals;
import java.util.Scanner;
public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=scan.nextInt();
		 //% modulo operator -remainder 
		
		if(num%2==0) {
			System.out.println(num + " is Even");
		}
		else {
			System.out.println(num + " is odd");
		}
		System.out.println("----------------");
		System.out.println("Enter num 2");
		int numTwo=scan.nextInt();
		if(num>numTwo) {
			System.out.println("num is greater");
		}
		else {
			System.out.println(numTwo + " is greater than " + num);
			
		}
		
		System.out.println("-----------");
		
		char str='A'; //ASCII VAlues (decimal ) -> binary numbers 
		
		//logical operators 
		if(str>='A' && str<='Z') { //65>=65 && 65<=90
			System.out.println("upper case");
		}
		else if(str>='a' && str<='z') { 
			System.out.println("lower case");
		}
		else {
			System.out.println("not a character");
		}

	}

}
