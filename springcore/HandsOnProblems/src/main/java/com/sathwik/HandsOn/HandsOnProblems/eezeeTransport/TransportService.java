package com.sathwik.HandsOn.HandsOnProblems.eezeeTransport;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

// import com.sathwik.HandsOn.HandsOnProblems.eezeeTransport.Vehicle;

public class TransportService {
	private Vehicle vehicle;

	private SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	@Override
	public String toString() {
		return "TransportService [vehicle=" + vehicle + "]";
	}

	public void registerBooking(Booking booking) throws ParseException {
		booking.setCustomerName("aaaa");
		booking.setMobileNumber(1234567890);
		booking.setDestination("Bangalore");
		booking.setDateOfJourney(sdf.parse("27-04-2020"));

	}

	public void calculateTravelCost(String source, String Destination, Date doj) {
		if(checkAvailabilityDateForTravel(doj))
			System.out.println("Total Travel Cost is Rs " + getCost(Destination));
		else System.out.println("Invalid Travel Date");
	}

	public boolean checkAvailabilityDateForTravel(Date doj) {
		String currDate = sdf.format(new Date());
		String newDoj = sdf.format(doj);
		if (currDate.equals(newDoj))
			return true;
		return false;
	}

	public double getCost(String destination) {
		Map<String, Double> destinationMap = vehicle.getDestinationMap();
		if (destinationMap.containsKey(destination))
			return destinationMap.get(destination);
		return 0.0;
	}

}
