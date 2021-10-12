package Cropdeal.CaseStudy.Dealer.Controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import Cropdeal.CaseStudy.Dealer.Models.Dealer;
import Cropdeal.CaseStudy.Dealer.Repo.DealerRepo;


public class DealerController {
	@Autowired
	   DealerRepo repo;
	   
	   @GetMapping("/getDealer/{dealerid}")
	   public Optional<Dealer> getDealerProfileById(@PathVariable("dealerid") int dealerid){
		   return repo.findById(dealerid);
	   }
	   
	   
	   @PostMapping("/saveProfile")
		   public void saveProfile(@RequestBody Dealer dealer) {
			   repo.insert(dealer);
		   }
	   
	   @PutMapping("/updateProfile/{dealerid}")
	   public void updateDealer(@PathVariable("dealerid") int dealerid,@RequestBody Dealer dealer) {
		   repo.save(dealer);
	   }
}
