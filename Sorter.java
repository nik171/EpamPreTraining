package by.epam.preTraining.FilatovNI.tasks.task9.controller;

import by.epam.preTraining.FilatovNI.tasks.task9.view.AnswerPrinter;

public class Sorter {
	public static double[] makeBubbleSort(double[] array) {
		for(int i = 0; i < array.length - 1; i++) {
			for(int j = 0; j < array.length - 1; j++) {
				if(array[j] > array[j + 1]) {
					array[j] = (array[j] + array[j + 1]) - (array[j + 1] = array[j]);
				}
			}
		}
		
		return array;
	}
	
	public static double[] makeInsertionSort(double[] array) {
		for(int i = 1; i < array.length; i++) {
			int j = i - 1;
			while(j >= 0 && array[j] > array[j + 1]) {
				array[j] = (array[j] + array[j + 1]) - (array[j + 1] = array[j]);
				j--;
			}
		}
		
		return array;
	}
	
	public static double[] makeSelectionSort(double[] array) {
		for(int i = 1; i < array.length - 1; i++) {
			for(int j = i + 1; j < array.length; j ++) {
				if(array[i] > array[j]) {
					array[j] = (array[j] + array[i]) - (array[i] = array[j]);
				}
			}
		}
		
		return array;
	}
	
	public static void makeMerge(double[] array, int left, int right){
		int middle, start, split, j;
		double[] buf = new double[array.length];
		middle = (left + right) / 2;
		start = left; 
		split = middle + 1; 
		for(j = left; j <= right; j++) {
			if ((start <= middle) && ((split > right) || (array[start] < array[split]))){
				buf[j] = array[start];
				start++;
				}
			else{
				buf[j] = array[split];
				split++;
				}
			}
		for (j=left; j<=right; j++) {
			array[j]=buf[j];
		}
	}
	
	public static double[] makeMergeSortWithRecursion(double[] array, int left, int right) {
		if(left < right) {
			int mid = (right + left) / 2;
			makeMergeSortWithRecursion(array, left, (left + right) / 2);
			makeMergeSortWithRecursion(array, (left + right) / 2 + 1, right);
			makeMerge(array, left, right);
			}
		
		return array;
		}
	
	public static double[] makeQuickSortWithRecursion(double[] array, int left, int right) {
		double mid, count;
		int f = left, l = right;
		mid = array[(f + l) / 2];
		do
		{
			while (array[f]<mid) {
				f++;
			}
			while (array[l]>mid) {
				l--;
			}
			if (f<=l){
				count=array[f];
				array[f]=array[l];
				array[l]=count;
				f++;
				l--;
				}
		} while (f<l);
		if (left<l) {
			makeQuickSortWithRecursion(array, left, l);
		}
		if (f<right) {
			makeQuickSortWithRecursion(array, f, right);
		}
		
		return array;
	}
	
	public static double[] makeQuickSortWithoutRecursion(double[] array) {
		int i, j;  
		int lb, ub;
		
		int[] lbstack = new int[array.length];
		int[] ubstack = new int[array.length];
		int stackpos = 1; 
		int ppos;
		double pivot;             
		double temp; 
		
		lbstack[1] = 0;
		ubstack[1] = array.length - 1;
		
		do {
			  lb = lbstack[stackpos];
			  ub = ubstack[stackpos];
			  stackpos--;
			  
			  do {
				 ppos = ( lb + ub ) >> 1;
				i = lb;
				j = ub;
				pivot = array[ppos];
				do {
					while ( array[i] < pivot ) i++;
					while ( pivot < array[j] ) j--;
					
					if ( i <= j ) {
						temp = array[i]; 
						array[i] = array[j]; 
						array[j] = temp;
						i++; 
						j--;
					}
				}while ( i <= j );

		      if ( i < ppos ) {   
		    	  if ( i < ub ) {     
		          stackpos++;      
		          lbstack[ stackpos ] = i;
		          ubstack[ stackpos ] = ub;
		    	  }
		        ub = j;             

		      } else {       	 
		    	  if ( j > lb ) { 
		          stackpos++;
		          lbstack[ stackpos ] = lb;
		          ubstack[ stackpos ] = j;
		        }
		        lb = i;
		      }

		    } while ( lb < ub );     

		  } while ( stackpos != 0 ); 
		  
		  return array;
	}
	}
