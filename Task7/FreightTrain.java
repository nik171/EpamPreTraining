package by.epam.preTraining.FilatovNI.tasks.task7.entities;

public class FreightTrain extends RailwayTransport {
	private int weightOfFreight;

	public FreightTrain() {}

	public FreightTrain(int numberOfVagons, int weightOfTrain) {
		super(numberOfVagons);
		this.weightOfFreight = weightOfTrain;
	}

	public int getWeightOfFreight() {
		return weightOfFreight;
	}

	public void setWeightOfFreight(int weightOfFreight) {
		this.weightOfFreight = weightOfFreight;
	}
	
	public FreightTrain(FreightTrain copy) {
		super(copy.getNumberOfVagons());
		this.weightOfFreight = copy.weightOfFreight;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + weightOfFreight;
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
		FreightTrain other = (FreightTrain) obj;
		if (weightOfFreight != other.weightOfFreight)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "FreightTrain [weightOfFreight=" + weightOfFreight + "]";
	}

	@Override
	public int weightOfTrain() {
		return super.weightOfTrain() + this.weightOfFreight;
	}
}
