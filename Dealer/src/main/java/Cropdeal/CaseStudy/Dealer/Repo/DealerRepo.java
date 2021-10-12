package Cropdeal.CaseStudy.Dealer.Repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import Cropdeal.CaseStudy.Dealer.Models.Dealer;

public interface DealerRepo extends MongoRepository<Dealer, Integer>{

}
