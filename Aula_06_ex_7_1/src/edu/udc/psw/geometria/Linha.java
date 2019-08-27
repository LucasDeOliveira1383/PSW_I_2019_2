package edu.udc.psw.geometria;

public class Linha {
	private Ponto2D a;
	private Ponto2D b;
	
	public Linha() {
		a = new Ponto2D();
		b = new Ponto2D();
	}
	
	public Linha(Ponto2D a, Ponto2D b) {
		this.a = new Ponto2D(a.getX(), a.getY());
		this.b = new Ponto2D(b.getX(), b.getY());
	}

	public Ponto2D getA() {
		return new Ponto2D(a.getX(), a.getY());
	}

	public void setA(Ponto2D a) {
		this.a = new Ponto2D(a.getX(), a.getY());
	}

	public Ponto2D getB() {
		return new Ponto2D(b.getX(), b.getY());
	}

	public void setB(Ponto2D b) {
		this.b = new Ponto2D(b.getX(), b.getY());
	}
	
	public Ponto2D centro() {
		return new Ponto2D((a.getX()+b.getX())/2,
				(a.getY()+b.getY())/2);
	}
	
	public float distancia(Ponto2D pt) {
		return centro().distancia(pt);
	}
	
	public float distancia(Linha l) {
		return centro().distancia(l.centro());
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Linha other = (Linha) obj;
		if (a == null) {
			if (other.a != null)
				return false;
		} else if (!a.equals(other.a))
			return false;
		if (b == null) {
			if (other.b != null)
				return false;
		} else if (!b.equals(other.b))
			return false;
		return true;
	}

	public String ObjectToString() {
		return super.toString();
	}

	@Override
	public String toString() {
		return "[" + a + "; " + b + "]";
	}
	
	
}
