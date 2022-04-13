package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarService {
	@Autowired
	CarDao cd;
	
	
	

	public String addInfo(CarEntity ce) {
		// TODO Auto-generated method stub
		return cd.addInfo(ce);
	}




	public String addInfo1(int id) {
		// TODO Auto-generated method stub
		return cd.addInfo1(id);
	}




	public List<CarEntity> getAll() {
		// TODO Auto-generated method stub
		return cd.getAll();
	}

}
