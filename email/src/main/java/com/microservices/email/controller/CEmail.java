package com.microservices.email.controller;

import javax.validation.Valid;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.microservices.email.dtos.DEmail;
import com.microservices.email.models.MEmail;
import com.microservices.email.services.SEmail;


public class CEmail {
    
    @Autowired
    SEmail emailService;

    @PostMapping(value="/sending-email")
    public ResponseEntity<MEmail> sendingEmail(@RequestBody @Valid DEmail emailDTO) {
        MEmail emailModel = new MEmail();
        BeanUtils.copyProperties(emailDTO, emailModel);
        emailService.sendEmail(emailModel);
        return new ResponseEntity<>(emailModel, HttpStatus.CREATED);
    }
    
}
