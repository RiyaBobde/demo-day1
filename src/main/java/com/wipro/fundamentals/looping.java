package com.wipro.fundamentals;

public class looping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// print numbers 1-10 
		for(int i=1;i<=10;i++) {
			System.out.println(i);
		}
		//Print sum of numbers from 1-10 
		
		System.out.println("----------");
		int sum=0;
		int mul=1;
		for(int i=1;i<=10;i++) {
			sum=sum+i;
			mul=mul*i;
		}
		System.out.println("sum " + sum + " Mul " +mul);
		// Print only odd/even numbers between 50 and 100
		//sum of odd/even numbers 50-100 
		int evensum=0;
		int oddsum=0;
		
		
		for(int i=50;i<=100;i++) {
			if(i%2==0) {
				evensum=evensum+i;
			}
			else {
				oddsum=oddsum+i;
			}
		}
		System.out.println("Even sum " + evensum + " odd sum " + oddsum);
	}
	
	
	

}
