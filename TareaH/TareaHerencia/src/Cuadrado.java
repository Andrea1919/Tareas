
public class Cuadrado extends Formas  {
   private double lado;
   private double area;
   

   public Cuadrado(String dibujar,String color,double lado)
{
    super(dibujar,color);
    this.lado=lado;
}
   
public double getLado() {
return lado;
}

public void setLado(double lado) {
this.lado = lado;
}

public double CalcularArea() {

if (this.lado > 0) {
area = Math.pow(lado, 2);
}
System.out.println("El area es :"+ area);
return area;
} 
}
