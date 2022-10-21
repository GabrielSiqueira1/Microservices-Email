package com.microservices.email.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservices.email.models.MEmail;
import com.microservices.email.repositories.REmail;

@Service
public class SEmail {
    
    @Autowired // Ponto de inserção de dados
    REmail emailRepository;

    public void sendEmail(MEmail emailModel){
  
    }
}
