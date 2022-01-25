package com.perficient.techbootcampHaydenBaca.services;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.perficient.techbootcampHaydenBaca.entities.DogEntity;
import com.perficient.techbootcampHaydenBaca.repositories.DogRepository;
import com.perficient.techbootcampHaydenBaca.repositories.OwnerRepository;

@Service
public class DogService {
	@Autowired
	DogRepository dogRepository;
	
	@Autowired
	OwnerRepository ownerRepository;
	
	public Collection<DogEntity> getAllDogs() {
		List<DogEntity> dogList = new ArrayList<>();
		dogRepository.findAll().forEach(dogList::add);
		return dogList;
	}
	
	
}
