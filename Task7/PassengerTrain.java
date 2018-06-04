package by.epam.preTraining.FilatovNI.tasks.task7.entities;

public class PassengerTrain extends RailwayTransport{
	private static int weightOfPassenger = 70;
	private int numberOfPassengers;
	
	public PassengerTrain() {}
	
	public PassengerTrain(int numberOfVagons, int numberOfPassengers) {
		super(numberOfVagons);
		this.numberOfPassengers = numberOfPassengers;
	}
	
	public PassengerTrain(PassengerTrain copy) {
		super(copy.getNumberOfVagons());
		this.numberOfPassengers = copy.numberOfPassengers;
	}

	public int getNumberOfPassengers() {
		return numberOfPassengers;
	}

	public void setNumberOfPassengers(int numberOfPassengers) {
		this.numberOfPassengers = numberOfPassengers;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + numberOfPassengers;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		PassengerTrain other = (PassengerTrain) obj;
		if (numberOfPassengers != other.numberOfPassengers)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "PassengerTrain [numberOfPassengers=" + numberOfPassengers + "]";
	}

	@Override
	public int weightOfTrain() {
		return super.weightOfTrain() + this.numberOfPassengers * weightOfPassenger;
	}	
}
