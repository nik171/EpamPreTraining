package by.epam.preTraining.FilatovNI.tasks.task7.controller;

import by.epam.preTraining.FilatovNI.tasks.task7.entities.ContainerOfRailwayTransport;
import by.epam.preTraining.FilatovNI.tasks.task7.view.AnswerPrinter;

public class Main {
	public static void main(String[] args) {
		ContainerOfRailwayTransport container = BusinessLogicContainerWorker.createContainer(5);
		
		AnswerPrinter.printAnswer(container);
		AnswerPrinter.printAnswer(BusinessLogicContainerWorker.countLengthOfTrains(container));
		AnswerPrinter.printAnswer(BusinessLogicContainerWorker.countWeightOfTrains(container));
	}
}
