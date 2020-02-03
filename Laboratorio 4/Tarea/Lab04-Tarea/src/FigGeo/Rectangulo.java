package FigGeo;

public class Rectangulo extends Figura{
	
	private double base;
	private double altura;
	
	
	
	public Rectangulo( double base, double altura) {
		super(2);
		this.base = base;
		this.altura = altura;
	}

	public double getBase() {
		return base;
	}

	public double getAltura() {
		return altura;
	}
	
	@Override
	public String toString() {
		return "Rectangulo: \n"+ super.toString() + "\nbase = " + base + ", altura=" + altura;
	}

	public double calcularArea() {
		return base*altura;
	}
	
}
