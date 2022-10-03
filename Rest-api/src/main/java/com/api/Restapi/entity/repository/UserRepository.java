package com.api.Restapi.entity.repository;

import org.hibernate.metamodel.model.convert.spi.JpaAttributeConverter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.Restapi.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	
	
	User findByName(String name);

	 

}
