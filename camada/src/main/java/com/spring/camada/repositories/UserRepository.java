package com.spring.camada.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.spring.camada.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
