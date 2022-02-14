/**
 * Create By Rocio RR
	*13 feb. 2022
 */
package numberOne;

import numberOne.operadores;
import numberOne.conversionDatos;

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
		
		
		//funciones de operadores
		operadores ope= new operadores();
		System.out.println("Métodos escritos en la clase operadores:");
		System.out.println(ope.sumaNew(.15f, 2.3f));
		
		//conversión de tipos
		conversionDatos conver= new conversionDatos();
		byte algo= 1;
		System.out.println("Métodos escritos en la conversionDatos:");
		System.out.println(conver.returnDouble(algo));
		System.out.println(conver.retunrDouble2(algo));
		
		//Ejercicios de la mentoría
		System.out.println(" ");
		System.out.println("Ejercicios de la mentoría");
		
		int t=0;
		int f=9;
		if(t==f)
			System.out.println("Son iguales");
		else
			System.out.println("No son iguales");
		
		System.out.println(" ");
		System.out.println("Operador ternario:");
		System.out.println((t==f)?"son iguales":"no son iguales");

		System.out.println(" ");
		String resultado=(t==f)?"son iguales":"no son iguales";
		System.out.println("Operador ternariox2:");
		System.out.println(resultado);

		System.out.println(" ");
		System.out.println("If anidados");
		if(t>f)
			System.out.println("t es mayor que f");
		else if(t<f)
			System.out.println("t es menor que f");
		else
			System.out.println("Son iguales");
		
		System.out.println(" ");
		System.out.println("Switch");
		
		switch(t)
		{
		case 0:
			System.out.println("Es 0 ");
			break;
		case 1:
			System.out.println("Es 1");
			break;
		case 2:
			System.out.println("Es 2");
			break;
		default:
			System.out.println("Esta fuera de rango");
			break;
		}
		
	}

}
