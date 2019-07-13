
public class Triangulo extends Formas {
 private double base;
private double altura;
private double angulo;


 public Triangulo(String dibujar,String color,double base, double altura)
{
    super(dibujar,color);
    this.base=base;
    this.altura=altura;
}
   
public double getBase() {
return base;
}

public void setBase(double base) {
this.base = base;
}

public double getAltura() {
return altura;
}

public void setAltura(double altura) {
this.altura = altura;
}


public double calcularArea() {


if (this.base > 0 && this.altura > 0) {
angulo = (this.base * this.altura) / 2;
}
System.out.println("El area es :"+ angulo);
return angulo;

}
}