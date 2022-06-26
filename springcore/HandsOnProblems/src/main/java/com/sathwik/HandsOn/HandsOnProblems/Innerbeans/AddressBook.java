package com.sathwik.HandsOn.HandsOnProblems.Innerbeans;

public class AddressBook {
	private String phoneNumber;
	private Address address;

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "AddressBook [phoneNumber=" + phoneNumber + ", address=" + address + "]";
	}
}
