package edu.udc.psw.colecao;

public class ListaEncadeada {
	private class NoLista {
		NoLista proximo;
		NoLista anterior;
		Object dado;
		
		NoLista() {
			this.proximo = null;
			this.anterior = null;
			this.dado = null;
		}
		
		NoLista(Object obj) {
			this.proximo = null;
			this.anterior = null;
			this.dado = obj;
		}
		
		NoLista(NoLista proximo, NoLista anterior, Object obj) {
			this.proximo = proximo;
			this.anterior = anterior;
			this.dado = obj;
		}
	}

	private class Iterador implements IteradorAbstrato {
		private NoLista noAtual;
		
		Iterador(NoLista no) {
			noAtual = no;
		}

		@Override
		public boolean proximo() {
			if(noAtual == null)
				return false;
			noAtual = noAtual.proximo;
			return true;
		}

		@Override
		public boolean anterior() {
			if(noAtual == null)
				return false;
			noAtual = noAtual.anterior;
			return true;
		}

		@Override
		public Object dadoAtual() {
			if(noAtual == null)
				return null;
			return noAtual.dado;
		}

	}

	
	private NoLista inicio;
	private NoLista fim;

	private int tamanho;

	public ListaEncadeada() {
		inicio = null;
		fim = null;

		tamanho = 0;
	}

	public int getTamanho() {
		return tamanho;
	}

	public boolean isVazia() {
		if (tamanho == 0)
			return true;
		return false;
	}
	
	public IteradorAbstrato getIteradorInicio() {
		Iterador it = new Iterador(inicio);
		return it;
	}
	
	public IteradorAbstrato getIteradorFim() {
		return new Iterador(fim);
	}

	public boolean inserir(Object obj, int pos) {
		NoLista novo = new NoLista(obj);

		if (isVazia() && pos == 0) { // lista vazia
			inicio = novo;
			fim = novo;
			tamanho++;
			return true;
		}
		if (pos == 0) { // inserir inicio
			novo.proximo = inicio;
			inicio.anterior = novo;
			inicio = novo;
			tamanho++;
			return true;
		}
		if (pos == tamanho) { // inserir fim
			novo.anterior = fim;
			fim.proximo = novo;
			fim = novo;
			tamanho++;
			return true;
		}
		if (pos < tamanho && pos > 0) { // insere no meio da lista
			NoLista iterador = inicio;
			while (pos > 0) {
				iterador = iterador.proximo;
				pos--;
			}
			novo.proximo = iterador;
			novo.anterior = iterador.anterior;
			iterador.anterior.proximo = novo;
			iterador.anterior = novo;
			tamanho++;
			return true;
		}
		return false;
	}

	public boolean remover(int pos) {
		if (isVazia()) // lista vazia
			return false;
		if (tamanho == 1 && pos == 0) { // remover o unico elemento da lista
			inicio.dado = null;
			inicio = null;
			fim = null;
			tamanho--;
			return true;
		}
		if (pos == 0) { // remover o inicio
			inicio.dado = null;
			inicio = inicio.proximo;
			inicio.anterior = null;
			tamanho--;
			return true;
		}
		if (pos == tamanho - 1) { // remover o �ltimo elemento
			fim.dado = null;
			fim = fim.anterior;
			fim.proximo = null;
			tamanho--;
			return true;
		}
		if (pos > 0 && pos < tamanho - 1) { // remover do meio da lista
			NoLista iterador = inicio;
			while (pos > 0) {
				iterador = iterador.proximo;
				pos--;
			}
			iterador.dado = null;
			iterador.anterior.proximo = iterador.proximo;
			iterador.proximo.anterior = iterador.anterior;
			tamanho--;
			return true;
		}
		return false;
	}

	public boolean remover(Object obj) {
		NoLista iterador = inicio;
		boolean removido = false;
		while (iterador != null) {
			if (iterador.dado.equals(obj)) {
				if (tamanho == 1) { // unico elemento
					iterador.dado = null;
					inicio = null;
					fim = null;
					tamanho--;
					return true;
				}
				else if (iterador == inicio) { // primeiro elemento
					iterador.dado = null;
					iterador = iterador.proximo;
					inicio = inicio.proximo;
					inicio.anterior = null;
					removido = true;
					tamanho--;
					continue;
				}
				else if (iterador == fim) { // ultimo elemento
					iterador.dado = null;
					fim = fim.anterior;
					fim.proximo = null;
					tamanho--;
					return true;
				}
				else {
					NoLista aux = iterador.proximo;
					iterador.anterior.proximo = iterador.proximo;
					iterador.proximo.anterior = iterador.anterior;
					iterador.dado = null;
					iterador = aux;
					removido = true;
					tamanho--;
					continue;
				}
			}
		}
		return removido;
	}

	public Object pesquisar(int pos) {
		if(pos < 0 || pos >= tamanho)
			return null;
		
		NoLista iterador = inicio;

		while (pos > 0) {
			iterador = iterador.proximo;
			pos--;
		}
		return iterador.dado;
	}
}
