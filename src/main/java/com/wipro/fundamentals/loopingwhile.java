package com.wipro.fundamentals;
import java.util.Scanner;

public class loopingwhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Difference bw for/while 
		int i=1;
		while(i<=10) {
			System.out.println(i);
			i++;
		}
		//factorial 
		// 1*2*3*4*5=120
		//multiplication 1-100
		Scanner scan=new Scanner(System.in);
		System.out.println("enter num");
		int num=scan.nextInt();
		int mul=1;
		while(num>0) {
			mul=mul*num;
			num--;
		}
		System.out.println("Factoial " +mul);
		
		//for loop 
		
		//sum of digits 
		//sum of numbers 
		int val=456;
		int sumOfDigits=0;
		while(val>0) { //456>0  true
			int rem=val%10; //r=6 
			sumOfDigits=sumOfDigits+rem; //sum=0+6 
			val=val/10; //45
		}
		System.out.println("Sum of Digits " + sumOfDigits);
		
		//reverse 
		
		int number=456;
		int rev=0;
		while(number>0) {
			int rem=number%10;
			rev=rev*10+rem;
			number=number/10;
		}
		System.out.println("reverse the digits " + rev);

		
	}
	
	
	

}
