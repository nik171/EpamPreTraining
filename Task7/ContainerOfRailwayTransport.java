package by.epam.preTraining.FilatovNI.tasks.task7.entities;

import java.util.Arrays;

public class ContainerOfRailwayTransport {
	private RailwayTransport[] containerOfTrains;
	
	public ContainerOfRailwayTransport() {
		this.containerOfTrains = new RailwayTransport[0];
	}
	
	public ContainerOfRailwayTransport(RailwayTransport[] containerOfTrains) {
		this.containerOfTrains = containerOfTrains;
	}
	
	public ContainerOfRailwayTransport(ContainerOfRailwayTransport copy) {
		this.containerOfTrains = copy.containerOfTrains;
	}

	public RailwayTransport[] getContainerOfTrains() {
		return containerOfTrains;
	}

	public void setContainerOfTrains(RailwayTransport[] containerOfTrains) {
		this.containerOfTrains = containerOfTrains;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(containerOfTrains);
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
		ContainerOfRailwayTransport other = (ContainerOfRailwayTransport) obj;
		if (!Arrays.equals(containerOfTrains, other.containerOfTrains))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ContainerOFRailwayTransport [containerOfTrains=" + Arrays.toString(containerOfTrains) + "]";
	}
}
