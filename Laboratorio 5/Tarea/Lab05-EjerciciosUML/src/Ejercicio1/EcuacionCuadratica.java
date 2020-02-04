package Ejercicio1;

public class EcuacionCuadratica {

  private double a;

  private double b;

  private double c;
  
  public EcuacionCuadratica(double a, double b, double c) {
	this.a = a;
	this.b = b;
	this.c = c;
  }
  
  public double getA() {
	return a;
  }

  public double getB() {
	return b;
  }

  public double getC() {
	return c;
  }

  public double getDiscriminante() {
  return Math.pow(b, 2)-4*a*c;
  }

  public double getRaiz1() {
  return (-b+Math.sqrt(getDiscriminante()))/(2*a);
  }

  public double getRaiz2() {
  return (-b-Math.sqrt(getDiscriminante()))/(2*a);
  }

}