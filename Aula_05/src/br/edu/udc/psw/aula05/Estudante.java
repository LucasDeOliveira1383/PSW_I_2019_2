package br.edu.udc.psw.aula05;

public class Estudante extends Pessoa {
	private int ra;

	public Estudante() {
		ra = 0;
	}
	
	public Estudante(String nome, int rg, int cpf, int ra) {
		super(nome, rg, cpf);
		this.ra = ra;
	}
	
	@Override
	public String toString() {
		return super.toString() + ", ra=" + ra;
	}

	public void setRa(int ra) {
		this.ra = ra;
	}
	
	public int getRa() {
		return ra;
	}
	
}
