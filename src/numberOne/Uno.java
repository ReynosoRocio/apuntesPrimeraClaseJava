/**
 * Create By Rocio RR
	*13 feb. 2022
 */
package numberOne;

/**
 * @author Rocio
 *
 */
public class Uno {

	/**
	 * @param args
	 */
	
	//Sintaxis:
	//Modificadores TipoDeVariable NombreDeLaVariable= Valor; 
	
	//Valores por defecto, se dan cuando las variables se encuentran fuera de los métodos y no se encuentran asignadas
	byte defaultBytex;
	/*
	 * Valores por defecto en los distintos tipos de datos primitivos
	 * byte=0
	 * short=0
	 * int=0
	 * long=0L
	 * float=0.0f
	 * double=0.0d
	 * boolean=false
	 * char='u0000'
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World, girls!");
		//tipos de datos primitivos
		byte fisrtByte= 1;//Entero de un 1 byte de -128 a 127
		
		short firstShort=2;//Entero 2 bytes de -32768 a 32767 
		
		int firstInt=3;//Entero 4 bytes de 2*10^9
		
		//Para hacer uso del dato primitivo long al final de el valor asignado agregamos una L en mayúscula.
		long fLong=4L;//Entero 8 bytes de Muy grande
		
		//con la f se identifica como un float, ya que sino daría error por asignar un double a un float
		float fFloat=1.0f;//decimal simple 4 byte Muy grande
		
		double fDouble=5.0;//decimal simple 8 bytes Muy grande
		
		boolean fBoolean=true;//valor booleano 1 byte true/false
		
		//caracter simple se declara con comillas simples
		char fChar='v';//Carácter simple 2 byte --
		
		
	}

}
