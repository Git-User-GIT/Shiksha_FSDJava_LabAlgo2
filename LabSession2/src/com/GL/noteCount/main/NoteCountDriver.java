package com.GL.noteCount.main;

import java.util.Scanner;

import com.GL.noteCount.service.MergeSortImplementation;
import com.GL.noteCount.service.NoteCountService;


public class NoteCountDriver {
	public static void main(String[] args) {
	
	System.out.println("Enter the size of currency denominations");
	Scanner sc=new Scanner(System.in);
	int size=sc.nextInt();
	int notes[] =new int[size];
	System.out.println("Enter the currency denomination values");
	for(int i=0;i<size;i++) 
		notes[i]=sc.nextInt();	
			
	System.out.println("Enter the amount you want to pay");
	int amount =sc.nextInt();
	
			
	MergeSortImplementation mergesortimplementation = new MergeSortImplementation();
	NoteCountService notecount=new NoteCountService();
	mergesortimplementation.sort(notes,0,notes.length-1);
	notecount.noteCountImplementation(notes,amount);
	sc.close();		
	}

}
