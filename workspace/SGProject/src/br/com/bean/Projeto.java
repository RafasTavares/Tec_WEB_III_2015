package br.com.bean;

import java.util.Date;

public class Projeto {

	private String nmProjeto;
	private int idProjeto;
	private Date dtProjeto;
	private double vlProjeto;

	public String getNmProjeto() {
		return nmProjeto;
	}

	public void setNmProjeto(String nmProjeto) {
		this.nmProjeto = nmProjeto;
	}

	public int getIdProjeto() {
		return idProjeto;
	}

	public void setIdProjeto(int idProjeto) {
		this.idProjeto = idProjeto;
	}

	public Date getDtProjeto() {
		return dtProjeto;
	}

	public void setDtProjeto(Date dtProjeto) {
		this.dtProjeto = dtProjeto;
	}

	public double getVlProjeto() {
		return vlProjeto;
	}

	public void setVlProjeto(double vlProjeto) {
		this.vlProjeto = vlProjeto;
	}
}
