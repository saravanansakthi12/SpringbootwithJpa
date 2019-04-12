package com.main.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.main.model.Country;

public interface CountryRepository extends CrudRepository<Country, Integer>{

	List<Country> findById(int id);

	List<Country> findByIdGreaterThan(int id);

	List<Country> findByName(String name);

	/*List<Country> findByCodeAndName(String code,String name);*/
	
	@Query("Select c From Country c where c.code=:code AND c.name=:name")
	List<Country> findByCodeAndName(@Param("code")String code,@Param("name")String name);

	/*@Query("Select c.id From Country c where c.name=:name AND c.code=:code")
	List<Country> findByNameAndCode(@Param("name")String name,@Param("code") String code);*/
	
	@Query("Select c From Country c where c.name=:name AND c.code=:code")
	List<Country> findByNameAndCode(@Param("name")String name,@Param("code") String code);
	
	/*@Query("Select c From Country c where c.name= ?1 AND c.code= ?2")
	List<Country> findByNameAndCode(String name,String code);*/

}
