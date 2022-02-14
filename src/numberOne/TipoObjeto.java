/**
 * Create By Rocio RR
 *13 feb. 2022
 */
package numberOne;

/**
 * @author Rocio
 *
 */
public class TipoObjeto {
	/****
	 * Tipo											Descripción													Valor por defecto
	 * 
	 * Tipos de la biblioteca						String(cadenas de texto)
	 * estándar de Java 							Otros ejemplos Scanner, TreeSet,ArrayList						NULL
	 * 
	 * Tipos definidos por el usuario/programador	Cualquiera que sea necesario									NULL
	 * 
	 * arrays										Serie de elemntos o formación tipo vector o matriz.
	 * 												Lo consideramos un objeto especial que carece de métodos		NULL
	 * 
	 * Tipos envoltorio o wrapper					Byte
	 * (Equivalentes a los tipos primitivos pero	Short
	 * como objetos)								Integer
	 * 												Long
	 * 												Float
	 * 												Double
	 * 												Character
	 * 
	 */
	//Declaración de wrappers antes de Java 9
	//Byte fByte= new Byte(1);
	
	//Declaración de Wrappers después de Java 9
	Byte fByte0= 2;
	Short fShort0;
	Integer fInteger0;
	Long fLong0;
	Float fFloat0;
	Double fDouble0;	
	Boolean fBoolean;
	
	//Declaración de arreglos
	//Se pueden hacer arreglos tanto de objetos como de primitivas
	//una forma de hacer arreglos dinámicos es con los Collections

	/****
	 * Sintaxis:
	 * Modificadores TipoDeLaVariable[] NombreDelarreglo = new TipoDeVariable[dimension];
	 * 
	 * Modificadores TipodeLaVariable[] NombreDelArreglo ={Elemento,...];
	 * 
	 * Modificadores TipoDeLaVariable[] NombreDelArreglo;
	 * NombreDelArreglo = new TipoDeLaVariable[dimensión];
	 */
	
	//arreglo de variables de tipo primitivo
	long [] arreglo= new long[5];
	
	//arreglo de variables de tipo Objeto Wrapper
	Long [] array0 = new Long[5];
	
	//Un array contiene métodos los cuales 
	//pueden ser accesados al escribir un punto después del nombre del arreglo
	/*****
	 * Todos los objetos heredan de la clase Object
	 * algunos de los metodos mas utilizados son:
	 * length
	 * toString
	 * hashCode
	 * equals
	 */
	Integer [] arrayIntegers = {1,2,3,4,5};
	
	
}
