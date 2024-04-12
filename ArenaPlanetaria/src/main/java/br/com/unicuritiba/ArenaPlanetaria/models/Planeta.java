package br.com.unicuritiba.ArenaPlanetaria.models;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Planeta {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	private long id;
	private float Gravidade;
	private float Massa;
	private float Tamanho;
	private String Nome;
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public float getGravidade() {
		return Gravidade;
	}
	public void setGravidade (float Gravidade) {
		this.Gravidade = Gravidade;
	}
	public float getMassa() {
		return Massa;
	}
	public void setMassa(float Massa) {
		this.Massa = Massa;
	}
	public float getTamanho() {
		return Tamanho;
	}
	
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		this.Nome = nome;
	}
	
}
	