package com.edubridge.structural.faced;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Welcome to Registration Service");
		
		Scanner sc=new Scanner(System.in);
		int choice;
		do{
			System.out.println("1.KFC");
			System.out.println("2.Dominos");
			System.out.println("3.McD");
			System.out.println("4.Exit");
			System.out.println("Enter Choice:");
			choice=sc.nextInt();
			FranchiseRegistration f=new FranchiseRegistration();
			switch(choice) {
			
			case 1:
				f.BuyKFC();
			break;
			case 2:
				f.BuyDominos();
			break;
			case 3:
				f.BuyMcD();
			break;
			case 4:
				System.out.println("Exitting...");
			break;
			default:
				System.out.println("Wrong choice");
			}
		}while(choice!=4);

	}

}
