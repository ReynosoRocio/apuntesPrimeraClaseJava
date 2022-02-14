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
 * Conversión automática o ampliación
 * Los dos tipos de datos son compatibles
 * byte-> short -> int -> long -> float -> double
 * 
 *Converion explícita de tipo o casting
 *-Esto es útil para tipos de datos incompatibles donde la converisón automática no se puede realizar.
 *
 *Tipo de promoción de expresiones
 *-Java automáticamente promueve cada operando byte, short, o char al evaluar una expresión.
 *
 *--Casting de tipo explícito en Expresiones
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
		//conversion de types de manera automática
		return returnFloat(returnLong(returnInt(returnShort(op))));
	}	
	
	
	public double retunrDouble2(byte op) {
		//converion de types con (cast)
		return (double)op;
	}
	
}
