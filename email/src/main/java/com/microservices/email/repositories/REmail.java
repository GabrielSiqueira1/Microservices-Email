package com.microservices.email.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.microservices.email.models.MEmail;

public interface REmail extends JpaRepository<MEmail, Long>{
    
}
