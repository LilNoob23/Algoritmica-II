package FigGeo;

public abstract class Figura {

	//Definimos como atributo la cantidad de valores que se deben de ingresar para calcular el área según figura
	protected int cantIngr;

	public Figura(int cantIngr) {
		this.cantIngr = cantIngr;
	}

	public int getCantIngr() {
		return cantIngr;
	}

	@Override
	public String toString() {
		return "Cantidad de valores ingresados = " + cantIngr;
	}
	
	public abstract double calcularArea();
	
}
