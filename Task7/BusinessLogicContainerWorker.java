package by.epam.preTraining.FilatovNI.tasks.task7.controller;

import by.epam.preTraining.FilatovNI.tasks.task7.entities.RailwayTransport;

import java.util.Random;

import by.epam.preTraining.FilatovNI.tasks.task7.entities.ContainerOfRailwayTransport;
import by.epam.preTraining.FilatovNI.tasks.task7.entities.FreightTrain;
import by.epam.preTraining.FilatovNI.tasks.task7.entities.PassengerTrain;;

public class BusinessLogicContainerWorker {
	public static void addElement(ContainerOfRailwayTransport container, RailwayTransport element) {
		RailwayTransport[] buf = new RailwayTransport[container.getContainerOfTrains().length + 1];
		for(int i = 0; i < container.getContainerOfTrains().length; i++) {
			buf[i] = container.getContainerOfTrains()[i];
		}
		buf[container.getContainerOfTrains().length] = element;
		container.setContainerOfTrains(buf);
	}
	
	public static void addNumberOfElements(ContainerOfRailwayTransport container, RailwayTransport[] elements) {
		RailwayTransport[] buf = new RailwayTransport[container.getContainerOfTrains().length + elements.length];
		for(int i = 0; i < container.getContainerOfTrains().length; i++) {
			buf[i] = container.getContainerOfTrains()[i];
		}
		for(int i = container.getContainerOfTrains().length; i < buf.length; i++) {
			buf[i] = elements[i];
		}
		container.setContainerOfTrains(buf);
	}
	
	public static int countNumberOfElements(ContainerOfRailwayTransport container, RailwayTransport[] elements) {
		if(!isEmpty(container)){
			int count = 0;
			for(int i = 0; i < container.getContainerOfTrains().length; i++) {
				if(container.getContainerOfTrains()[i] == null) {
					break;
				}
				count++;
			}
			
			return count;
		}
		
		return 0;
	}
	
	public static boolean isEmpty(ContainerOfRailwayTransport container) {
		return container.getContainerOfTrains().length == 0;
	}
	
	public static RailwayTransport findElementByIndex(ContainerOfRailwayTransport container, int index) {
		if(isEmpty(container)) {
			return null;
		}
		return container.getContainerOfTrains()[index];
	}
	
	public static void deleteElementByIndex(ContainerOfRailwayTransport container, int index) {
		if(!isEmpty(container)) {
			RailwayTransport[] buf = new RailwayTransport[container.getContainerOfTrains().length - 1];
			for(int i = 0; i < container.getContainerOfTrains().length; i++) {
				if(i == index)
				{
					i++;
				}
				if(i < container.getContainerOfTrains().length) {
					buf[i] = container.getContainerOfTrains()[i];
				}
			}
			container.setContainerOfTrains(buf);
		}
	}
	
	public static void clearContainer(ContainerOfRailwayTransport container) {
		container.setContainerOfTrains( new RailwayTransport[0]);
	}
	
	public static boolean hasThisElement(ContainerOfRailwayTransport container, RailwayTransport element) {
		if(!isEmpty(container)) {
			for(int i = 0; i < container.getContainerOfTrains().length; i++) {
				if(container.getContainerOfTrains()[i].equals(element)) {
					return true;
				}
			}
		}
		return false;
	}
	
	public static boolean hasTheseElements(ContainerOfRailwayTransport container, RailwayTransport[] elements) {
		boolean flag = false;
		if(!isEmpty(container)) {
			for(int i = 0; i < elements.length; i++) {
				for(int j = 0; j < container.getContainerOfTrains().length; j++) {
					if(container.getContainerOfTrains()[j].equals(elements[i])) {
						flag = true;
					}
					if(!flag) {
						return false;
					}
					flag = false;
				}
			}
		}
		return true;
	}
	public static int countLengthOfTrains(ContainerOfRailwayTransport container) {
		if(!isEmpty(container)) {
			int lengthOfTrains = 0;
			for(int i = 0; i < container.getContainerOfTrains().length; i++) {
				lengthOfTrains += container.getContainerOfTrains()[i].lengthOfTrain();
			}
			
			return lengthOfTrains;
		}
		
		return -1;
	}
	
	public static int countWeightOfTrains(ContainerOfRailwayTransport container) {
		if(!isEmpty(container)) {
			int weightOfTrains = 0;
			for(int i = 0; i < container.getContainerOfTrains().length; i++) {
				weightOfTrains += container.getContainerOfTrains()[i].weightOfTrain();
			}
			
			return weightOfTrains;
		}
		
		return -1;
	}

	public static PassengerTrain createPassengerTrain() {
		Random rand = new Random();
		return new PassengerTrain(rand.nextInt(100), rand.nextInt(1000));
	}

	public static FreightTrain createFreightTrain() {
		Random rand = new Random();
		return new FreightTrain(rand.nextInt(100), rand.nextInt(1000));
	}

	static public ContainerOfRailwayTransport createContainer(int quantityOfTrains) {
		ContainerOfRailwayTransport container = new ContainerOfRailwayTransport();
		Random rand = new Random();
		for (int i = 0; i < quantityOfTrains; i++) {
			if (rand.nextBoolean()) {
				addElement(container, createPassengerTrain());
			} else {
				addElement(container, createFreightTrain());
			}
		}
		return container;
	}
}
