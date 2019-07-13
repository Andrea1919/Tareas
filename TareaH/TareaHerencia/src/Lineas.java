
public class Lineas extends Formas{
    
private int  largo;

  public Lineas(String dibujar,String color,int largo)
{
    super(dibujar,color);
    this.largo=largo;
}
   
public int  getLargo() {
return largo;
}

public void setLargo(int largo) {
this.largo = largo;
}


}
