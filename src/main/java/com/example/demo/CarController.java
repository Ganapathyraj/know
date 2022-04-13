package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CarController {
	@Autowired
     CarService cs;
	@PostMapping(value="/add")
	
	public String addInfo(@RequestBody CarEntity ce) {
		return cs.addInfo(ce);
	

	}
	@DeleteMapping(value="/delete/{id}") 
	public String addInfo1(@PathVariable int id) {
		return cs.addInfo1(id);
	

	}
	@GetMapping("/getall")
	public List<CarEntity> getAll() {
		return cs.getAll();
	}
	
}
