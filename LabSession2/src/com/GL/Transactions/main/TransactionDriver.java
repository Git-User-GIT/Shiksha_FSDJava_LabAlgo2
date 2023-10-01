package com.GL.Transactions.main;

import java.util.Scanner;

import com.GL.Transactions.Services.TransactionService;

public class TransactionDriver {
	
	public static void main(String[] args) {
		System.out.println("Enter the size of transaction array");
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int arr[] =new int[size];
		System.out.println("Enter the values of array");
		for(int i=0;i<size;i++) 
			arr[i]=sc.nextInt();	
				
		System.out.println("Enter the total number of target needs to be achieved");
		int targetNo =sc.nextInt();
		
				
		TransactionService ts = new TransactionService();
		ts.checkTransaction(arr,targetNo);
		sc.close();		
		
	}

}
