package com.perficient.techbootcampHaydenBaca.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.perficient.techbootcampHaydenBaca.entities.DogEntity;

@Repository
public interface DogRepository extends CrudRepository<DogEntity, Integer> {

	DogEntity findByDogID(int dogID);
	List<DogEntity> findByDogName(String dogName);
	List<DogEntity> findByDogBreed(String dogBreed);
	List<DogEntity> findByDogOwner(int dogOwner);
	
	//update
	@Modifying
	@Query("UPDATE OwnerEntity SET FirstName = :fname WHERE PersonID = :id")
	boolean updateByFirstName(@Param("id") int personID, @Param("fname") String firstName);
}
