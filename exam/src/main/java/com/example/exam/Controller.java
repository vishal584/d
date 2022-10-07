package com.example.exam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;






@RestController
public class Controller {
	
	@Autowired
	ModelService modelService;
	
	@GetMapping("/model/{id}")
	public Model getModel(@PathVariable String  id){
		return modelService.getModel(id);
	}
	@PostMapping("/model")
	public void addModel(@RequestBody Model model) {
		modelService.addModel(model);
	}
	@PutMapping("/model/{id}")
	public void updateModel(@RequestBody Model model,@PathVariable String  id) {
		 modelService.updateModel(model,id);
	}
	
	@DeleteMapping("/model/{id}")
	public void deleteModel(@PathVariable String  id) {
		 modelService.deleteModel(id);
	}
	
	
	

}
