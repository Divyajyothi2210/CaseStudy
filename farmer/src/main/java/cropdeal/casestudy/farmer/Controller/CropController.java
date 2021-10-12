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

import cropdeal.casestudy.farmer.Repo.CropsRepo;
import cropdeal.farmer.casestudy.Models.Crops;

@RestController
@RequestMapping("/crops")
public class CropController {
	   @Autowired
	   CropsRepo repo;
	   
	   @GetMapping("/getCrops/{cropId}")
	   public Optional<Crops> getCropsById(@PathVariable("cropId") int cropId){
		   return repo.findById(cropId);
	   }
	   
	   
	   @PostMapping("/saveCrop")
		   public void saveCrop(@RequestBody Crops Crops) {
			   repo.insert(Crops);
		   }
	   
	   @PutMapping("/updateCrop/{farmerid")
	   public void updateFarmer(@PathVariable("cropId") int cropId,@RequestBody Crops Crops) {
		   repo.save(Crops);
	   }
}
