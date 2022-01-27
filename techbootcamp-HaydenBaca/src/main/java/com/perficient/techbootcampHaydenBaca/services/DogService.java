package com.perficient.techbootcampHaydenBaca.services;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.perficient.techbootcampHaydenBaca.entities.DogEntity;
import com.perficient.techbootcampHaydenBaca.entities.OwnerEntity;
import com.perficient.techbootcampHaydenBaca.repositories.DogRepository;
import com.perficient.techbootcampHaydenBaca.repositories.OwnerRepository;

@Service
public class DogService {
	@Autowired
	DogRepository dogRepository;
	
	@Autowired
	OwnerRepository ownerRepository;
	
	//dog logic
	public Collection<DogEntity> getAllDogs() {
		List<DogEntity> dogList = new ArrayList<>();
		dogRepository.findAll().forEach(dogList::add);
		return dogList;
	}
	
	public void addDog(String name, String breed, int ownerId) {
		
		DogEntity newDog = new DogEntity(name, breed, ownerId);
		
		try {
			dogRepository.save(newDog);
		} catch(Exception e) { 
		}
		
	}
	
	public void removeDog(int id) {
		dogRepository.delete(dogRepository.findByDogID(id));
	}
	
	//owner logic
	public Collection<OwnerEntity> getAllOwners() {
		List<OwnerEntity> ownerList = new ArrayList<>();
		ownerRepository.findAll().forEach(ownerList::add);
		return ownerList;
	}
	
	public OwnerEntity getOwnerByName(String first, String last) {
		try {
			OwnerEntity owner = ownerRepository.findByFirstNameAndLastName(first, last);
			return owner;
		} catch(Exception e) {
			return null;
		}
	}
	
	
}
