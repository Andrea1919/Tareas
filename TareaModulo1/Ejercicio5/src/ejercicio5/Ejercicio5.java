/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5;

/**
 *
 * @author Solis
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /// se delcaran e inicializan las variables 
     String[] nombre={  "Mario ",
                        "Juan  ",
                        "David ",
                        "Ana   ",
                        "Dany  ",
                        
     };
     String[] apellido={"Santos    ",
                        "Rodriguez ",
                        "Mejia     ",
                        "Chavez    ",
                        "Cruz      ",
                        
     };
     String[] carrera={ "Ingenieria en Produccion Industrial ",
                        "Ingenieria en Produccion Industrial ",
                        "Ingenieria Electronica              ",
                        "Ingenieria en Produccion Industrial ",
                        "Ingenieria Computacion              ",
                        
     };
     String[] trabajo={ "Ninguno",
                        "Ninguno",
                        "Ninguno",
                        "Ninguno",
                        "Si",
                        
     };
     
  //// se crea un ciclo for para recorrer los arreglos
    for(int x=0;x<5;x++){
   /// se imprime la informacion de los arreglos
     System.out.println (nombre[x] +" "+apellido[x]+" "+carrera[x]+" "+ trabajo[x]);

    }
   }
}
