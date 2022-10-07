package com.example.exam;

import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class ModelService {
	
	@Autowired
	Repository repository;
	
	public Model getModel(String modelId) {
		return repository.findById(modelId).get();
	}
	
	
	
	public void updateModel(Model model, String id) {
	      Optional<Model> list = repository.findById(id);
	      list.get().setName(model.getName());
	       repository.save(list.get());
	}
	
	public void addModel(Model model) {
		repository.save(model);
	}
	
	public void deleteModel(String id) {
		repository.deleteById(id);
	}
	

}
