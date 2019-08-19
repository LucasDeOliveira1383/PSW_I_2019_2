package br.edu.udc.psw;

import java.util.Scanner;

public class Aplicacao {

	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa();
		
		pessoa.setNome("Fulano de Tal");
		pessoa.setRg(1234);
		pessoa.setCpf(56789);
		System.out.println(pessoa);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o nome da pessoa:");
		String nome = sc.nextLine();
		System.out.println("Digite o RG da pessoa:");
		int rg = sc.nextInt();
		System.out.println("Digite o CPF da pessoa:");
		int cpf = sc.nextInt();
		
		Pessoa pessoa2 = new Pessoa(nome, rg, cpf);
		System.out.println(pessoa2);
	}

}
