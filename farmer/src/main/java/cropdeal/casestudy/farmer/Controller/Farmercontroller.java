package cropdeal.casestudy.farmer.Controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cropdeal.casestudy.farmer.Repo.FarmerRepo;
import cropdeal.farmer.casestudy.Models.Farmer;

@RestController
@RequestMapping("/crops")
public class Farmercontroller {
   
	@Autowired
   FarmerRepo repo;
   
   @GetMapping("/getFarmer/{farmerid}")
   public Optional<Farmer> getFarmerProfileById(@PathVariable("farmerid") int farmerid){
	   return repo.findById(farmerid);
   }
   
   
   @PostMapping("/saveProfile")
	   public void saveProfile(@RequestBody Farmer farmer) {
		   repo.insert(farmer);
	   }
   
   @PutMapping("/updateProfile/{farmerid}")
   public void updateFarmer(@PathVariable("farmerid") int farmerid,@RequestBody Farmer farmer) {
	   repo.save(farmer);
   }
   
   
}
