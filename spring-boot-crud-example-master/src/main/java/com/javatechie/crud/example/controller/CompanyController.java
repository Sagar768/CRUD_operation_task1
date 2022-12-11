package com.javatechie.crud.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.javatechie.crud.example.entity.Company;
import com.javatechie.crud.example.service.CompanyService;

@RestController
public class CompanyController {

	@Autowired
	private CompanyService service;
	
	//Add Company
	@PostMapping("/addCompany")
	public Company addCompany(@RequestBody Company Company) {
		return service.saveCompany(Company);
	}
	
	
	//Add Multiple Companies
	@PostMapping("/addCompanies")
	public List<Company> addCompanys(@RequestBody List<Company> companies) {
		return service.saveCompanys(companies);
	}
	
	
	//Get All Company
	@GetMapping("/getCompanies")
	public List<Company> findAllCompanys() {
		return service.getCompanys();
	}
	
	//Get Company By Id
	@GetMapping("/getCompanyById/{id}")
	public Company findCompanyById(@PathVariable int id) {
		return service.getCompanyById(id);
	}
	
	
	//Get Company By Name
	@GetMapping("/getCompanyByName/{name}")
	public Company findCompanyByName(@PathVariable String name) {
		return service.getCompanyByName(name);
	}
	
	
	//Update Company
	@PutMapping("/updateCompany")
	public Company updateCompany(@RequestBody Company Company) {
		return service.updateCompany(Company);
	}
	
	//Remove Company By Id
	@DeleteMapping("/deleteCompany/{id}")
	public String deleteCompany(@PathVariable int id) {
		return service.deleteCompany(id);
	}
}
