package com.GL.noteCount.service;

public class MergeSortImplementation {

	 public static void sort(int[] arr, int left, int right) {
	        if (left < right) {
	       
	            int middle = (left + right) / 2;
	           
	            sort(arr, left, middle);
	            sort(arr, middle + 1, right);
	            
	          
	            merge(arr, left, middle, right);
	        }
	    }

	    // Merging function
	    public static void merge(int[] arr, int left, int middle, int right) {
	        int size1 = middle - left + 1;
	        int size2 = right - middle;
	        
	        int[] leftArray = new int[size1];
	        int[] rightArray = new int[size2];
	        
	        // Copy data to temporary arrays
	        for (int i = 0; i < size1; i++)
	            leftArray[i] = arr[left + i];
	        for (int j = 0; j < size2; j++)
	            rightArray[j] = arr[middle + 1 + j];
	        
	     
	        int i = 0, j = 0;
	        
	       
	        int k = left;
	        while (i < size1 && j < size2) {
	           
	            if (leftArray[i] >= rightArray[j]) {
	                arr[k] = leftArray[i];
	                i++;
	            } else {
	                arr[k] = rightArray[j];
	                j++;
	            }
	            k++;
	        }
	        
	        
	        while (i < size1) {
	            arr[k] = leftArray[i];
	            i++;
	            k++;
	        }
	        
	      
	        while (j < size2) {
	            arr[k] = rightArray[j];
	            j++;
	            k++;
	        }
	    }
	  
	}

	
		
		
	


