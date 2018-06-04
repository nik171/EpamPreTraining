package by.epam.preTraining.FilatovNI.tasks.task9.controller;

import by.epam.preTraining.FilatovNI.tasks.task9.model.RandomArray;
import by.epam.preTraining.FilatovNI.tasks.task9.view.AnswerPrinter;

public class Main {
	public static void main(String[] args) {
		double[] array = RandomArray.buildRandomArray(10, -100, 100);
		AnswerPrinter.printAnswer(java.util.Arrays.toString(array));
		//AnswerPrinter.printAnswer(java.util.Arrays.toString(Sorter.makeBubbleSort(array)));
		//AnswerPrinter.printAnswer(java.util.Arrays.toString(Sorter.makeInsertionSort(array)));
		//AnswerPrinter.printAnswer(java.util.Arrays.toString(Sorter.makeSelectionSort(array)));
		//AnswerPrinter.printAnswer(java.util.Arrays.toString(Sorter.makeMergeSortWithRecursion(array, 0, array.length - 1)));
		//AnswerPrinter.printAnswer(java.util.Arrays.toString(Sorter.makeQuickSortWithRecursion(array, 0, array.length - 1)));
		//AnswerPrinter.printAnswer(java.util.Arrays.toString(Sorter.makeQuickSortWithoutRecursion(array)));
		//AnswerPrinter.printAnswer((Searcher.makeLinearSearch(array, array[7])));
		//AnswerPrinter.printAnswer((Searcher.makeBinarySearch(array, 0, array.length - 1, array[7])));
	}
}
