package br.com.uniamerica.estacinamento.entity;

import jakarta.persistence.MappedSuperclass;

import jakarta.persistence.*;
import lombok.Setter;
import lombok.Getter;

import java.time.LocalDateTime;

@MappedSuperclass
public abstract class AbstractEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Getter
    @Column(name = "id")
    private Long id;
    @Getter @Setter
    @Column(name = "cadastro")
    private LocalDateTime cadastro;
    @Getter
    @Column(name = "atualizacao")
    private LocalDateTime atualizacao;
    @Getter @Setter
    @Column(name = "ativo")
    private Boolean ativo;


    @PrePersist
    private void prePresit(){
        this.cadastro = LocalDateTime.now();
        this.ativo = true;
    }
    @PreUpdate
    private void preUpdate(){
        this.atualizacao = LocalDateTime.now();
    }
}