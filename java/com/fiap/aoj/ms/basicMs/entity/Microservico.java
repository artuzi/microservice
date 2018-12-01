package com.fiap.aoj.ms.basicMs.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="microservico")
public class Microservico implements Serializable {
   
	private static final long serialVersionUID = 1L;
	
	@Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "sq_micro")
    @SequenceGenerator(name = "sq_micro", sequenceName = "SQ_MICRO", allocationSize = 1)
	Long id;	
	
    @Column(name = "nome")
	String nome;
	
    @Column(name = "endPoint")
    String endPoint;
    
    @Column(name = "container")
	String container;
    
    @Column(name = "versao")
	String versao;
    
    @Column(name = "banco")
	String banco;
    
    @Column(name = "ativo")
	String ativo;
	
	
	public Long getId() {
		return id;
	}
	public String getNome() {
		return nome;
	}
	public String getEndPoint() {
		return endPoint;
	}
	public String getContainer() {
		return container;
	}
	public String getVersao() {
		return versao;
	}
	public String getBanco() {
		return banco;
	}
	public String getAtivo() {
		return ativo;
	}
	public void setIdSistema(Long id) {
		this.id = id;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setEndPoint(String endPoint) {
		this.endPoint = endPoint;
	}
	public void setContainer(String container) {
		this.container = container;
	}
	public void setVersao(String versao) {
		this.versao = versao;
	}
	public void setBanco(String banco) {
		this.banco = banco;
	}
	public void setAtivo(String ativo) {
		this.ativo = ativo;
	}
	
	
}
