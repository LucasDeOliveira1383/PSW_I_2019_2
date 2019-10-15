package edu.udc.psw.colecao;

public interface IteradorAbstrato<T> {
	public boolean proximo();
	public boolean anterior();
	public T dadoAtual();
}
