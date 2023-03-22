package Calculos;
/**
 * La clase realiza diferentes cálculos dados dos números
 * @author noeli
 * @version 1.2
 * @since 22/03/2023
 *
 */

public class Calculo {

	/**
	 * numero1 es el número con el cual vamos a realizar las operaciones aritméticas y siempre es obligatorio informarlo
	 * sino se informa su valor por defecto siempre será 0.
	 */
    private final int numero1;
    /**
     * numero2 segundo atributo para la realización de las operaciones aritméticas
     */
    private int numero2;

    /**
     * Constructor que crea una instancia de la clase y establece el valor del atributo número1 a cero.
     */
    public Calculo() {
		super();
		this.numero1 = 0;
	}
    /**
     * Constructor que crea una instancia de la clase y establece el valor del atributo número1 a valor pasado por parámetro.
     *  @param numero1
     *  				Parámetro para establecer el valor del atributo número1.
     */
    
	public Calculo(int numero1) {
		super();
		this.numero1 = numero1;
	}

	/**
	 * Constructor que crea una instancia de la clase y establece el valor de los atributos a los valores 
	 * pasados por parámetros.
	 * 
	 * @param numero1
	 * 			Parámetro para establecer el valor del atributo número1.
	 * @param numero2
	 *         Parámetro para establecer el valor del atributo número2.
	 */
	public Calculo(int numero1, int numero2) {
		super();
		this.numero1 = numero1;
		this.numero2 = numero2;
	}
/**
 * Establece el valor del atributo numero2.
 * @param numero2
 *        Parámetro para establecer el valor del atributo número2.
 */
	
	public void setNumero2(int numero2) {
		this.numero2 = numero2;
	}
/**
 * Devuelve el valor del atributo numero2.
 * @return
 *       Valor del atributo numero2.
 * 
 */
	public int getNumero2() {
		return numero2;
	}
	/**
	 * Devuelve el valor del atributo numero1.
	 * @return
	 * 		Valor del atributo numero1.
	 */

	public int getNumero1() {
		return numero1;
	}
	/**
	 * Realiza la suma de los atributos devolviendo el resultado.
	 * @return
	 * 		Devuelve la suma del numero1 más numero2.
	 */
	public int sumaNumeros() {
		return numero1 + numero2;
	}
	/**
	 *  * Realiza la recta de los atributos devolviendo el resultado.
	 * @return
	 * 		Devuelve la recta del numero1 menos numero2.
	 */
	
	public int restaNumeros() {
		return numero1 - numero2;
	}
	/**
	 * Realiza la división de los atributos devolviendo el resultado.
	 * @return
	 * 		Devuelve la división del numero1 con el numero2.
	 * @throws Exception
	 * 		La excepción se dará cuando el valor del atributo numero2 sea igual a 0, ya que no se puede dividir por cero.
	 */
	public int divideNumeros() throws Exception {
		if(numero2 == 0) {
			throw new Exception("No se puede dividir por 0");
		}
		return numero1 / numero2;
	}
	/**
	 * Muestra por pantalla la tabla de multiplicar del atributo numero1.
	 */
	public void muestraTablaMultiplicar() {
		for(int i = 0; i<=10; i++) {
			int resultado = numero1 * i;
			System.out.println(String.format("%1$d x %2$d = %3$d ",numero1, i, resultado));
		}
	}


}
