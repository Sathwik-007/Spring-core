package com.sathwik.HandsOn.HandsOnProblems.eezeeTransport;

import java.util.Map;

public class Vehicle {
	private String source;
	private Map<String, Double> destinationMap;
	
	Vehicle(String source){
		this.source = source;
	}

	@Override
	public String toString() {
		return "Vehicle [source=" + source + ", destinationMap=" + destinationMap + "]";
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public Map<String, Double> getDestinationMap() {
		return destinationMap;
	}

	public void setDestinationMap(Map<String, Double> destinationMap) {
		this.destinationMap = destinationMap;
	}
}
