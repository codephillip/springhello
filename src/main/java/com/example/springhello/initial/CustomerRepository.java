package com.example.springhello.initial;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "people", path = "people")
public interface CustomerRepository extends PagingAndSortingRepository<Customer, Long>, CrudRepository<Customer,Long> {

    List<Customer> findByLastName(@Param("name") String name);

    Customer findById(long id);

}
