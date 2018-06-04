package by.epam.preTraining.FilatovNI.tasks.task9.controller;

public class Searcher {
	public static double makeLinearSearch(double[] array, double element) {
		for(int i = 0; i < array.length - 1; i++) {
			if(array[i] == element) {
				return element;
			}
		}
		
		return -1;
	}
	
	public static double makeBinarySearch(double[] array, int left, int right, double element) {
		Sorter.makeMergeSortWithRecursion(array, 0, array.length - 1);
		
		int pos;
		while(true) {
			pos = (left + right) / 2;
			
			if(element < array[pos]) {
				right = pos - 1;
			}
			else if(element > array[pos]) {
				left = pos + 1;
			}
			else {
				return array[pos];
			}
			if(left > right) {
				return -1;
			}
		}
	}
}
