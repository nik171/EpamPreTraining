package by.epam.preTraining.FilatovNI.tasks.task7.entities;

public class RailwayTransport {
	protected static int lengthOfVagon = 7;
	protected static int weightOfVagon = 700;
	private int numberOfVagons;
	
	protected RailwayTransport() {}
	
	protected RailwayTransport(int numberOfVagons) {
		this.numberOfVagons = numberOfVagons;
	}

	public int getNumberOfVagons() {
		return numberOfVagons;
	}

	public void setNumberOfVagons(int numberOfVagons) {
		this.numberOfVagons = numberOfVagons;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + numberOfVagons;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RailwayTransport other = (RailwayTransport) obj;
		if (numberOfVagons != other.numberOfVagons)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Railwaytransport [numberOfVagons=" + numberOfVagons + "]";
	}
	
	
	public int lengthOfTrain() {
		return this.numberOfVagons * lengthOfVagon;
	}
	
	public int weightOfTrain() {
		return this.numberOfVagons * weightOfVagon;
	};
}
