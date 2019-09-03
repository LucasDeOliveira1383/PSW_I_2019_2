package edu.udc.psw.geometria;

public class Retangulo extends FormaGeometrica {
	private Ponto2D a;
	private Ponto2D b;
	
	public Retangulo(Ponto2D a, Ponto2D b) {
		super();
		this.a = new Ponto2D(a.getX(), a.getY());
		this.b = new Ponto2D(b.getX(), b.getY());
	}
	
	public Retangulo() {
		this.a = new Ponto2D();
		this.b = new Ponto2D();
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
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Retangulo other = (Retangulo) obj;
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

	@Override
	public String toString() {
		return "{" + a + "; " + b + "}";
	}

	@Override
	public float perimetro() {
		return 2 * altura() + 2 * largura();
	}

	@Override
	public float area() {
		return altura() * largura();
	}

	@Override
	public float largura() {
		return Math.abs(a.getX() - b.getX());
	}

	@Override
	public float altura() {
		return Math.abs(a.getY() - b.getY());
	}
	
}
