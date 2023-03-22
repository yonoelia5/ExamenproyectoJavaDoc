package Calculos;
/**
 * La clase realiza diferentes c�lculos dados dos n�meros
 * @author noeli
 * @version 1.2
 * @since 22/03/2023
 *
 */

public class Calculo {

	/**
	 * numero1 es el n�mero con el cual vamos a realizar las operaciones aritm�ticas y siempre es obligatorio informarlo
	 * sino se informa su valor por defecto siempre ser� 0.
	 */
    private final int numero1;
    /**
     * numero2 segundo atributo para la realizaci�n de las operaciones aritm�ticas
     */
    private int numero2;

    /**
     * Constructor que crea una instancia de la clase y establece el valor del atributo n�mero1 a cero.
     */
    public Calculo() {
		super();
		this.numero1 = 0;
	}
    /**
     * Constructor que crea una instancia de la clase y establece el valor del atributo n�mero1 a valor pasado por par�metro.
     *  @param numero1
     *  				Par�metro para establecer el valor del atributo n�mero1.
     */
    
	public Calculo(int numero1) {
		super();
		this.numero1 = numero1;
	}

	/**
	 * Constructor que crea una instancia de la clase y establece el valor de los atributos a los valores 
	 * pasados por par�metros.
	 * 
	 * @param numero1
	 * 			Par�metro para establecer el valor del atributo n�mero1.
	 * @param numero2
	 *         Par�metro para establecer el valor del atributo n�mero2.
	 */
	public Calculo(int numero1, int numero2) {
		super();
		this.numero1 = numero1;
		this.numero2 = numero2;
	}
/**
 * Establece el valor del atributo numero2.
 * @param numero2
 *        Par�metro para establecer el valor del atributo n�mero2.
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
	 * 		Devuelve la suma del numero1 m�s numero2.
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
	 * Realiza la divisi�n de los atributos devolviendo el resultado.
	 * @return
	 * 		Devuelve la divisi�n del numero1 con el numero2.
	 * @throws Exception
	 * 		La excepci�n se dar� cuando el valor del atributo numero2 sea igual a 0, ya que no se puede dividir por cero.
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
