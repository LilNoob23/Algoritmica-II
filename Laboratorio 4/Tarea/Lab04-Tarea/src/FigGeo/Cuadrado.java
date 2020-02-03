package FigGeo;

public class Cuadrado extends Figura{	

	private double lado;

	public Cuadrado( double lado) {
		super(1);
		this.lado = lado;
	}

	public double getLado() {
		return lado;
	}

	@Override
	public String toString() {
		return "Cuadrado: \n" + super.toString()+"\nlado = " + lado;
	}
	
	public double calcularArea() {
		return lado*lado;
	}
	
}
