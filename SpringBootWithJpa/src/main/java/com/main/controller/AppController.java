package com.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.main.model.Country;
import com.main.repository.CountryRepository;

@RestController
public class AppController {
	
	/*@Autowired
	CountryRepository countryRepository;
	
	@RequestMapping("/save")
	public String saveCountry(Country c)
	{
		c.setId(5);
		c.setCode("Raam");
		c.setName("Madurai");
		countryRepository.save(c);
		return "Added Successfully";
	}
	
	@RequestMapping("/findall")
	public List<Country> listCountry()
	{
		List<Country> list = (List<Country>) countryRepository.findAll();
		return list;
	}
	
	@RequestMapping("/findbyid/{id}")
	public List<Country> findById(@PathVariable int id)
	{
		List<Country> list=countryRepository.findById(id);
		return list;
	}
	
	@RequestMapping("/findbyidgt/{id}")
	public List<Country> findByIdGreaterThan(@PathVariable int id)
	{
		List<Country> list=countryRepository.findByIdGreaterThan(id);
		return list;
	}
	
	@RequestMapping("/findbyname/{name}")
	public List<Country> findByIdName(@PathVariable String name)
	{
		List<Country> list=countryRepository.findByName(name);
		return list;
	}
	
	@RequestMapping("/findbycodeandname/{code}/{name}")
	public List<Country> findByCodeAndName(@PathVariable String code,@PathVariable String name)
	{
		List<Country> list=countryRepository.findByCodeAndName(code,name);
		return list;
	}
	
	@RequestMapping("/findbycodeandname/{code}/{name}")
	public List<Country> findByCodeAndName(@PathVariable String code,@PathVariable String name)
	{
		List<Country> list=countryRepository.findByCodeAndName(code,name);
		return list;
	}
	
	@RequestMapping("/findbynameandcode")
	public List<Country> findByNameAndCode(@RequestParam String name,@RequestParam String code)
	{
		List<Country> list=countryRepository.findByNameAndCode(name,code);
		return list;
	}*/
	
}
