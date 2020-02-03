package FigGeo;

public class Circulo extends Figura{

	private double radio;

	public Circulo(double radio) {
		super(1);
		this.radio = radio;
	}

	public double getRadio() {
		return radio;
	}

	@Override
	public String toString() {
		return "Circulo: \n"+super.toString()+"\nradio = " + radio;
	}
	
	public double calcularArea() {
		return radio*radio*Math.PI;
	}
	
}
