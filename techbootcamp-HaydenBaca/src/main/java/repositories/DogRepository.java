package repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.perficient.techbootcampHaydenBaca.entities.DogEntity;

@Repository
public interface DogRepository extends CrudRepository<DogEntity, Integer> {

	DogEntity findByDogID(int dogID);
	List<DogEntity> findByDogName(String dogName);
	//List<DogEntity> findByDogOwner()
}
