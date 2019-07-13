
public class Main {
    
   public static void main (String [ ] Args) {

      Circulo circulo = new Circulo("Circulo","Rojo",15);
      Lineas lineas=new Lineas("Lineas", "verde ", 5);
      Triangulo triangulo= new Triangulo("Trinagulo","Azul",16,4);
      Cuadrado cuadrado=new Cuadrado("Cuadrado","Blanco",6);
      
       System.out.println(circulo.getDibujar()+"\n"+"Color :"+circulo.getColor());
       circulo.calcularRadio();  
       System.out.println();
       
       System.out.println(lineas.getDibujar()+"\n"+"Largo :"+lineas.getLargo()+"\n"+"Color :"+lineas.getColor());
       System.out.println();
      
       System.out.println(triangulo.getDibujar()+"\n"+"Color :"+triangulo.getColor());
       triangulo.calcularArea(); 
       System.out.println();
       
       System.out.println(cuadrado.getDibujar()+"\n"+"Color :"+cuadrado.getColor());
       cuadrado.CalcularArea(); 
       
        
}   } 

