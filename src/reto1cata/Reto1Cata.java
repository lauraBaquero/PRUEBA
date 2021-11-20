/*
 paquete del reto
 */
package reto1cata;

import java.util.Scanner;

/**
 * 
 *
 * @author LauraBaquero
 */
public class Reto1Cata {

    /**
     * @param scanner  reto1
     */
    private final Scanner scanner = new Scanner(System.in);
    
    /**
    * Este método es usado para solicitar datos al usuario
    * @return  Lectura de la siguiente linea del teclado
    */
        

    public String read() {
        return this.scanner.nextLine();
        /**
    * método principal
    */

    }

    public void run() {
        /**
         * logica del codigo
         *
         */
        String input = this.read();
        String[] arrayData = input.split(" ");//  [50,3 1,82 55]
        double peso = Double.parseDouble(arrayData[0]);// definicion variables 
        double altura = Double.parseDouble(arrayData[1]);// definicion variables 
        int edad = Integer.parseInt(arrayData[2]);// definicion variables 
        
        double cuadradoAltura = altura * altura;//defini variable para calcular el cuadrado de la entrada altura
     
        double imc = peso / cuadradoAltura;// variable que contiene el resultado de la operacion Kg/m2 para hallar el imc
        String resultado=null;//variable para sobreescribir el resultado de cada condicional 
        

        if (peso >= 0 && peso <= 105 && altura >= 0.5 && altura <= 2.1 && edad > 1 && edad <= 100){ 
            if  (imc <22 && edad<45){
                resultado="BAJO";
            }else if (imc < 22 && edad >= 45 || imc >= 22 && edad < 45){
                resultado="MEDIO";
                
            }else {
                resultado="ALTO";
            }
            
            System.out.println(String.format("%.3f", imc) + " " + (resultado));
            
        } else {
            System.out.println(" DATOS ERRADOS");
                }
    }
}
