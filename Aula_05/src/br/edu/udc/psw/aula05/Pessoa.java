package br.edu.udc.psw.aula05;

public class Pessoa {
	private String nome;
	private int rg;
	private int cpf;
	
	public Pessoa() {
		this.nome = "";
		this.rg = 0;
		this.cpf = 0;
	}
	public Pessoa(String nome, int rg, int cpf) {
		this.nome = nome;
		this.rg = rg;
		if(validaCpf(cpf))
			this.cpf = cpf;
	}
	private boolean validaCpf(int cpf) {
		if(cpf > 0)
			return true;
		return false;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getRg() {
		return rg;
	}
	public void setRg(int rg) {
		this.rg = rg;
	}
	public int getCpf() {
		return cpf;
	}
	public void setCpf(int cpf) {
		if(validaCpf(cpf))
			this.cpf = cpf;
	}
	@Override
	public String toString() {
		return nome + ", rg=" + rg + ", cpf=" + cpf;
	}
	
}
