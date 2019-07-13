/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        	///Declaracion e inicializacion las variables que contiene los numeros 
		double numero1=4;
		double numero2=8;
		double suma, resta , multiplicacion,division=0;
		
                /// se realizan los procesos donde se operan con los dos numeros
		suma=numero1+numero2;
		resta=numero1-numero2;
		multiplicacion=numero1*numero2;
		
		/// Validacin de la division sea igual a 0
		if(numero2!=0){
			division=numero1/numero2;
			
			}
			///Se imprime en consola los resultados de las operaciones
			System.out.println ("La suma es : "+suma);
			System.out.println ("La resta es : "+resta);
			System.out.println ("La multiplicacion es : "+multiplicacion);
			System.out.println ("La divisin es : "+division);
    }
}
