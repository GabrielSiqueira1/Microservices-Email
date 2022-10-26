package com.microservices.email.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.microservices.email.models.MEmail;

public interface REmail extends JpaRepository<MEmail, UUID>{
    
}
