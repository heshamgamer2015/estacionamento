package br.com.uniamerica.estacinamento.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.envers.AuditTable;
import org.hibernate.envers.Audited;

@Entity
@Table(name = "marcas", schema = "public")
@Audited
@AuditTable(value = "marcas_audit", schema = "audit")
public class Marca extends AbstractEntity{
    @Getter @Setter
    @Column(name = "nome", length = 50, nullable = false, unique = true)
    private String nome;
}