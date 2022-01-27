package com.perficient.techbootcampHaydenBaca.entities;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table(name = "owners")
@Component
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
	
	//@OneToMany(mappedBy = "owner", fetch = FetchType.LAZY)//, cascade = CascadeType.ALL)
	//private List<DogEntity> dogs;
	
	
	public OwnerEntity() {
		super();
	}
	
	public OwnerEntity(String firstName, String lastName, String address, String city, String state) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.city = city;
		this.state = state;
	}
	
	//getters and setters
	public int getPersonID() {
			return personID;
	}
	
	public void setPersonID(int personID) {
		this.personID = personID;
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

	/*public List<DogEntity> getDogs() {
		return dogs;
	}

	public void setDogs(List<DogEntity> dogs) {
		this.dogs = dogs;
	}*/
	
	@Override
	public String toString() {
		return ("{" + firstName + ", " + lastName + ", " + address + ", " + city + ", " + state + "}");
	}			
	
	
	
	
}

