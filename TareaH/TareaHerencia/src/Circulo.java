
public class Circulo extends Formas {
    
private double radio; 
private static final double PI = Math.PI;

private double circunferencia;

public Circulo(String dibujar,String color,double circunferencia)
{
    super(dibujar,color);
    this.circunferencia=circunferencia;
}

   

public double getRadio() {
return radio;
}

public void setRadio(double radio) {
this.radio = radio;
}


public double getCircunferencia() {
return circunferencia;
}

public void setCircunferencia(double circunferencia) {
this.circunferencia = circunferencia;
}



public void calcularRadio()
{
    this.radio=circunferencia/(2*PI);
   System.out.println("El radio es " +radio);
}

    
}
