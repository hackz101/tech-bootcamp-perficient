package com.perficient.techbootcampHaydenBaca;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "owners")
public class OwnerEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "personid", nullable = false)
	private int personID;
	
	@Column(name = "firstname", length = 255)
	private String firstName;
	
	@Column(name = "lastname", length = 255)
	private String lastName;
	
	@Column(name = "Address", length = 255)
	private String address;
	
	@Column(name = "City", length = 255)
	private String city;
	
	@Column(name = "State", length = 255)
	private String state;
	
	//getters and setters
	public int getPersonID() {
			return personID;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getCity() {
		return city;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	public String getState() {
		return state;
	}
	
	public void setState(String state) {
		this.state = state;
	}
	
}
