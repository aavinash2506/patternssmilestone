package com.Vasprngbt.DMS.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.Vasprngbt.DMS.Models.Dog;

public interface DogRepository extends CrudRepository<Dog, Integer> {

	List<Dog> findByName(String name);

}
