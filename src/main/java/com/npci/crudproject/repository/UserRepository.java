package com.npci.crudproject.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.npci.crudproject.entity.Users;

@Repository
public interface UserRepository extends CrudRepository<Users, Integer> {

}
