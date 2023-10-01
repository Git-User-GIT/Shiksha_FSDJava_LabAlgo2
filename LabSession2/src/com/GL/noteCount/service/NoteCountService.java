package com.GL.noteCount.service;

public class NoteCountService {

	public void noteCountImplementation(int[] notes, int amount) {
		
		
		int[] noteCounter =new int[notes.length];
		try {
			for(int i=0; i<notes.length; i++) {
				if(amount>=notes[i]) {
					noteCounter[i]=amount/notes[i];
					amount=amount-noteCounter[i]*notes[i];
				
					if(amount==0)
						break;
					}
				}
			
			if(amount>0) {
				System.out.println("Exact amount cannot be given the highest denomination");
				}
			
				else
					System.out.println("Payement approach in order to give min number of notes will be");
				for(int i=0; i<notes.length; i++) {
					if(noteCounter[i] != 0) {
						System.out.println(notes[i] + ":" + noteCounter[i]);
					           }	
					        }
		            			
		}catch(ArithmeticException a) {
			System.out.println(a+ " Notes of denomination 0 is invalid");
			
		
		
	}
	

	}}
