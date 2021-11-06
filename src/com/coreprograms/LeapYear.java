package com.coreprograms;
import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("enter the year = ");
		
		while(true) {
			int year=scan.nextInt();
			if(year>999&&year<10000) {
				System.out.println("the entered year "+year+" is valid");
				break;
			}
			else {
				System.out.println("the entered year is "+year+" is not valid");
				
			}
		}
		
	}

}
