/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tareamodulo2;


public class TareaModulo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        resourse res=new resourse();///instancia clsse resourse
        res.Mensaje();/// llama el metodo Mensaje
        res.Nota(89);/// llama el metodo Notas
        res.Division(30,10);///llama el metodo Division
        res.ListaNumeros(25);/// llama el metodo ListaNumeros
        
    }
 public static class resourse{///Clase resourse
   
        public void Mensaje(){///Metodo 1 Muestra un mensaje
        System.out.println("Estoy aprendiendo, pero seré el mejor programador");
         }
        public void Nota(int nota){//Metodo2 Muestra el resultado de una nocha , recibe un parametro
        if(nota>=70){// se hace la comparacion del valor de la nota 
            System.out.println("Aprobado");
        }else{
            System.out.println("Reprobado");
        }
        }
        public void Division(int numero1, int numero2){//Metodo 3 recibe 2 parametros para indicar el resultado de la division
            int division=0;

            if(numero2!=0){/// Se valida que no sea cero 
            division=numero1/numero2;// se realiza la division
            }
             System.out.println("El resultado de la division es : "+division);
        }
        public void ListaNumeros(int x){
        
             int desde =1;
 
    
    ///se realizan los ciclos para mostrar los numeros  
    while(desde<=x){
    //if(desde%2==0){
        
        /// se muestran los numeros
    System.out.println(desde);
   // }
    desde++;
    }
    }
        
    
    }
}
