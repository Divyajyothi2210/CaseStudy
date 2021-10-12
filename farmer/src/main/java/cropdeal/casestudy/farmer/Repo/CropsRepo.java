package cropdeal.casestudy.farmer.Repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import cropdeal.farmer.casestudy.Models.Crops;

public interface CropsRepo extends MongoRepository<Crops, Integer>{
	
}


