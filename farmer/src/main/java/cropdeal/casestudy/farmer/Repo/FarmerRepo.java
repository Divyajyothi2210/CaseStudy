package cropdeal.casestudy.farmer.Repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import cropdeal.farmer.casestudy.Models.Farmer;

public interface FarmerRepo extends MongoRepository<Farmer, Integer>{ 

	

}
