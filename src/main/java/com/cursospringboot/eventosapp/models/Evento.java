package com.cursospringboot.eventosapp.models;

public class Evento {
	
	private String nome;
	private String local;
	private String data;
	private String horario;
	private String descricao;
	
	public Evento() {
		super();
	}
	
	public Evento(String nome, String local, String data, String horario) {
		super();
		this.nome = nome;
		this.local = local;
		this.data = data;
		this.horario = horario;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getLocal() {
		return local;
	}
	public void setLocal(String local) {
		this.local = local;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public String getHorario() {
		return horario;
	}
	public void setHorario(String horario) {
		this.horario = horario;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
}
