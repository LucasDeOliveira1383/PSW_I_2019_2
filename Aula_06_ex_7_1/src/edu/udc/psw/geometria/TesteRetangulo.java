package edu.udc.psw.geometria;

public class TesteRetangulo {

	public static void main(String[] args) {
		Retangulo r1 = new Retangulo();
		Retangulo r2 = new Retangulo(new Ponto2D(1, 1), new Ponto2D(3,5));

		System.out.println(r1);
		System.out.println("O centro de r1 é :" + r1.centro());
		System.out.println(r2);
		System.out.println("O centro de r2 é :" + r2.centro());
		
		System.out.printf("A distancia entre r1 e r2 é %f\n", 
				r1.distancia(r2));
		
		Retangulo r3 = new Retangulo();
		Ponto2D p1 = new Ponto2D(-1,5);
		Ponto2D p2 = new Ponto2D(4,7);
		System.out.println(r3);
		r3.setA(p1);
		System.out.println(r3);
		r3.setB(p2);
		System.out.println(r3);
		
		p1.setX(1);
		Retangulo r4 = new Retangulo(p1, p2);
		System.out.println(r4);
		System.out.println(r3);
	}

}
