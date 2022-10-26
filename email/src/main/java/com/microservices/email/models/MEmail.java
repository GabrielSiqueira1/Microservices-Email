package com.microservices.email.models;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.microservices.email.enums.StatusEmail;

import lombok.Data;

@Data // Criação de construtores automatizada
@Entity // É uma entidade por compor uma banco de dados
@Table(name = "TB_EMAIL") // Nome da tabela
public class MEmail implements Serializable{

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    // Geração de e-mails automatica
    private Long emailId;
    private String ownerRef; // O proprietário da mensagem
    private String emailFrom; // De quem vem
    private String emailTo; // Para quem envia
    private String subject; // Assunto
    @Column(columnDefinition = "TEXT") // Retira a limitação de 256 caracteres
    private String text;
    private LocalDateTime sendDateEmail;
    private StatusEmail statusEmail;
}
