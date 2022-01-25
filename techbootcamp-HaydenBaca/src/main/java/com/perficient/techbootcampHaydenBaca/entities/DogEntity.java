package com.perficient.techbootcampHaydenBaca.entities;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "dogs")
public class DogEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "dogid", nullable = false)
	private int dogID;
	
	@Column(name = "dogname", length = 255)
	private String dogName;
	
	@Column(name = "dogbreed", length = 255)
	private String dogBreed;
	
	@Column(name = "dogowner")
	@JoinColumn(name = "dogowner", referencedColumnName = "personid", nullable = false)
	private int dogOwner;
	
	//@ManyToOne(fetch = FetchType.LAZY, optional = false)
	//@JoinColumn(name = "dogowner", referencedColumnName = "personid", nullable = false)
	//private OwnerEntity owner;
	
	
	public DogEntity() {
		super();
	}
	
	public DogEntity(String dogName, String dogBreed, int dogOwner) {//, OwnerEntity owner) {
		super();
		this.dogName = dogName;
		this.dogBreed = dogBreed;
		this.dogOwner = dogOwner;
		//this.owner = owner;
	}
	
	//getters and setters
	public int getDogID() {
		return dogID;
	}

	public void setDogID(int dogID) {
		this.dogID = dogID;
	}

	public String getDogName() {
		return dogName;
	}

	public void setDogName(String dogName) {
		this.dogName = dogName;
	}

	public String getDogBreed() {
		return dogBreed;
	}

	public void setDogBreed(String dogBreed) {
		this.dogBreed = dogBreed;
	}

	public int getDogOwner() {
		return dogOwner;
	}

	public void setDogOwner(int dogOwner) {
		this.dogOwner = dogOwner;
	}

	/*public OwnerEntity getOwner() {
		return owner;
	}

	public void setOwner(OwnerEntity owner) {
		this.owner = owner;
	}*/
	
	
	
	
	
	
}
