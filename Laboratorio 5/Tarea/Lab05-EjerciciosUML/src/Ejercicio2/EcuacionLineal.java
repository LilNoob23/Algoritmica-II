package Ejercicio2;

public class EcuacionLineal {

  private double a;

  private double b;

  private double c;

  private double d;

  private double e;

  private double f;
  
  public EcuacionLineal(double a, double b, double c, double d, double e, double f) {
	this.a = a;
	this.b = b;
	this.c = c;
	this.d = d;
	this.e = e;
	this.f = f;
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



public double getD() {
	return d;
}



public double getE() {
	return e;
}



public double getF() {
	return f;
}



public boolean esResoluble() {
  
	  if(a*d-b*c != 0 ) {
		  
		  return true;
		  
	  }else {
		  
		  return false;
		  
	  }
	  
  }

  public double getX() {
	  
  return (e*d-b*f)/(a*d-b*c);
  
  }

  public double getY() {
	  
  return (a*f-e*c)/(a*d-b*c);
  
  }

}