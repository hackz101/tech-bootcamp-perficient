package com.perficient.techbootcampHaydenBaca;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.perficient.techbootcampHaydenBaca.entities.DogEntity;
import com.perficient.techbootcampHaydenBaca.entities.OwnerEntity;

@Component
public class DogAndOwner {
	
	@Autowired
	private DogEntity dog;
	
	@Autowired
	private OwnerEntity owner;
	
	public DogAndOwner(DogEntity dog, OwnerEntity owner) {
		super();
		this.dog = dog;
		this.owner = owner;
	}

	public DogEntity getDog() {
		return dog;
	}

	public void setDog(DogEntity dog) {
		this.dog = dog;
	}

	public OwnerEntity getOwner() {
		return owner;
	}

	public void setOwner(OwnerEntity owner) {
		this.owner = owner;
	}
	
	public String toString() {
		return "[" + dog + ", " + owner + "]";
	}
	
	
}
