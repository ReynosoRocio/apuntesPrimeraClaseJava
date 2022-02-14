/**
 * Create By Rocio RR
	*13 feb. 2022
 */
package numberOne;

/**
 * @author Rocio
 *
 */
public class conversionDatos {
/**
 * Conversi�n autom�tica o ampliaci�n
 * Los dos tipos de datos son compatibles
 * byte-> short -> int -> long -> float -> double
 * 
 *Converion expl�cita de tipo o casting
 *-Esto es �til para tipos de datos incompatibles donde la converis�n autom�tica no se puede realizar.
 *
 *Tipo de promoci�n de expresiones
 *-Java autom�ticamente promueve cada operando byte, short, o char al evaluar una expresi�n.
 *
 *--Casting de tipo expl�cito en Expresiones
 */
	
	public short returnShort(byte op) {
		return op;
	}	
	public int returnInt(short op) {
		return op;
	}	
	public long returnLong(int op) {
		return op;
	}	
	public float returnFloat(long op) {
		return op;
	}	
	public double returnDouble(byte op) {
		//conversion de types de manera autom�tica
		return returnFloat(returnLong(returnInt(returnShort(op))));
	}	
	
	
	public double retunrDouble2(byte op) {
		//converion de types con (cast)
		return (double)op;
	}
	
}
