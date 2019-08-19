package br.edu.udc.psw.aula05;

public class Aplicacao {

	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa("Jose", 123, 654);
		System.out.println(pessoa);
		
		Estudante estudante = new Estudante();
		estudante.setNome("Charlinston");
		System.out.println(estudante);
		
		Estudante gustavo = new Estudante("Gustavo", 258, 654, 159);
		System.out.println(gustavo);
	}

}
