package br.com.controller;

import br.com.bean.Projeto;
import br.com.DAO.InterfaceDAO;
import br.com.DAO.ProjetoDAO;

//classe controladora JSF
public class ProjetoController {
	private Projeto projeto;

	public ProjetoController() {
		projeto = new Projeto();
	}

	public Projeto getVisitante() {
		return projeto;
	}

	public void setProjeto(Projeto projeto) {
		this.projeto = projeto;
	}

	public String salvar() {
		InterfaceDAO projetoDAO = new ProjetoDAO();
		visitantedao.salvar(visitante);
		return "salvar";
	}
}