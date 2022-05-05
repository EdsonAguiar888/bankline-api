package com.dio.santander.banklineapi.model;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity 	 
@Table(name = "tab_correntista")
public class Correntista { 
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	private Integer id
	
	@Column(length = 20)
	private String cpf;
	
	@Column (length=60)
	private String Nome;
	
	@Embedded
	private Conta conta;
	
	public Conta getConta() {
		return conta;
	}
	public void setConta(Conta conta) {
		this.conta = conta;
	}
	public Intiger getId() {
		return id;
	}
	public void setId(Intiger id) {
		this.id = id;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	
	
	
}
