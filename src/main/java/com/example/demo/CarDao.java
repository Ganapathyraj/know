package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

@Service
public class CarDao {
	@Autowired
    CarRepo cr;
	public String addInfo(CarEntity ce) {
		// TODO Auto-generated method stub
		cr.save(ce);
		return "data added successfully";
	}
	public String addInfo1(@PathVariable int id) {
		// TODO Auto-generated method stub
		cr.deleteById(id);
		return "data deleted successfully";
	}
	public List<CarEntity> getAll() {
		// TODO Auto-generated method stub
		return cr.findAll();
	}


}
