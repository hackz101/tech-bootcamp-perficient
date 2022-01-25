package com.perficient.techbootcampHaydenBaca.repositories;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.perficient.techbootcampHaydenBaca.entities.OwnerEntity;

import java.util.List;

@Repository
public interface OwnerRepository extends CrudRepository<OwnerEntity, Integer> {
	
	//get
	OwnerEntity findByPersonID(int personID);
	List<OwnerEntity> findByFirstName(String firstName);
	OwnerEntity findByFirstNameAndLastName(String firstName, String lastName);
	List<OwnerEntity> findByLastName(String lastName);
	List<OwnerEntity> findByAddress(String address);
	List<OwnerEntity> findByCity(String city);
	List<OwnerEntity> findByState(String state);
	
	//update
	@Modifying
	@Query("UPDATE OwnerEntity SET FirstName = :fname WHERE PersonID = :id")
	boolean updateByFirstName(@Param("id") int personID, @Param("fname") String firstName);
	
	
}
