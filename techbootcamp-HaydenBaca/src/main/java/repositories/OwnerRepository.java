package repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.perficient.techbootcampHaydenBaca.entities.OwnerEntity;

import java.util.List;

@Repository
public interface OwnerRepository extends CrudRepository<OwnerEntity, Integer> {
	
	OwnerEntity findByPersonID(int personID);
	List<OwnerEntity> findByFirstName(String firstName);
	List<OwnerEntity> findByLastName(String lastName);
	List<OwnerEntity> findByAddress(String address);
	List<OwnerEntity> findByCity(String city);
	List<OwnerEntity> findByState(String state);
}
