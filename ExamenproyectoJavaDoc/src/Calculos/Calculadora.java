package Calculos;

import java.util.Scanner;
/**
 * La clase Calculadora realiza los c�lculos de sumar, restar, dividir y calcula la tabla de multiplicar.
 * @author noeli
 * @version 1.2
 * @since 22/03/2023
 *
 */
public class Calculadora {
/**
 * M�todo principal de ejecuci�n
 * @param args
 * 		Los argumentos de ejecuci�n del programa Java.
 */
	public static void main(String[] args) {
		obtenerCalculo();
	}
	/**
	 * M�todo que te pide por pantalla la operaci�n que desea realizar e invoca al m�todo que realiza la operaci�n.
	 */
	public static void obtenerCalculo() {
		Scanner lectura = new Scanner (System.in);
		System.out.println("Ingrese el n�mero de una de las operaciones: ");
		System.out.println("1 - Suma ");
		System.out.println("1 - Resta ");
		System.out.println("3 - Divide");
		System.out.println("4 - Tabla de multiplicar ");
		String calculoS = lectura.next();
		solicitaDatosyRealizaCalculos(calculoS);
		
	}
	/**
	 * M�todo que solicita los atributos para realizar el c�lculo.
	 *
	 * @param operacion
	 *       Par�metro que contiene la operaci�n a realizar.
	 *       Si su valor es 1 realiza la suma.
	 *       Si su valor es 2 realiza la recta.
	 *       Si su valor es 3 realiza la divisi�n.
	 *       Si su valor es 4 obtiene la tabla de multiplicar del par�metro solicitado.
	 *       Si no es ninguna de estos valores no realiza ninguna operaci�n.
	 */
	public static void solicitaDatosyRealizaCalculos(final String operacion) {
		String numero1 ="";
		String numero2 ="";
		Scanner lectura =null;
		Calculo calculo =null;
		switch (operacion) {
        case "1": 
        	System.out.println ("Ha seleccionado sumar"); 
        	lectura = new Scanner (System.in);
    		System.out.println("Ingrese los n�meros a sumar: ");
    		System.out.println("Numero 1: ");
    		numero1 = lectura.next();
    		System.out.println("Numero 2: ");
    		numero2 = lectura.next();
    		calculo = new Calculo(Integer.parseInt(numero1));
    		calculo.setNumero2(Integer.parseInt(numero2));
    		System.out.println("El resultado es: "+ calculo.sumaNumeros());
        break;
        
        case "2":
        	System.out.println ("Ha seleccionado restar"); 
        	lectura = new Scanner (System.in);
    		System.out.println("Ingrese los n�meros a restar: ");
    		System.out.println("Numero 1: ");
    		numero1 = lectura.next();
    		System.out.println("Numero 2: ");
    		numero2 = lectura.next();
    		calculo = new Calculo(Integer.parseInt(numero1));
    		calculo.setNumero2(Integer.parseInt(numero2));
    		System.out.println("El resultado es: "+ calculo.restaNumeros());
        break;

        case "3": 
        	System.out.println ("Ha seleccionado dividir "); 
        	lectura = new Scanner (System.in);
    		System.out.println("Ingrese los n�meros a dividir: ");
    		System.out.println("Numero 1: ");
    		numero1 = lectura.next();
    		System.out.println("Numero 2: ");
    		numero2 = lectura.next();
    		calculo = new Calculo(Integer.parseInt(numero1));
    		calculo.setNumero2(Integer.parseInt(numero2));
    		try {
    			System.out.println("El resultado es: "+ calculo.divideNumeros());
    		} catch (Exception e) {
    			System.out.println("Ha dado error "+e.getMessage());
    		}
        break;
        case "4":
        	System.out.println ("Ha seleccionado obtener la tabla de multiplicar "); 
        	lectura = new Scanner (System.in);
    		System.out.println("Ingrese el n�mero a obtener su tabla: ");
    		System.out.println("Numero 1: ");
    		numero1 = lectura.next();
    		calculo = new Calculo(Integer.parseInt(numero1));
    		calculo.muestraTablaMultiplicar();
	        break;
        default: System.out.println ("No existe el calculo solicitado");
        
        break;
	} 
	System.out.println("Finalizaci�n del c�lculo");
	}

}
