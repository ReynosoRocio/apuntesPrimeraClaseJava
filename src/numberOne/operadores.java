/**
 * Create By Rocio RR
	*13 feb. 2022
 */
package numberOne;

/**
 * @author Rocio
 *
 */
public class operadores {

	/**
	 * Operadores Aritm�ticos
	 * Operador 	Uso 		equivalencia 		Descripci�n
	 * += 			Op1+=Op2	Op1=Op1 + Op2			Operador de Suma. Concatena cadenas(string) 	
	 *-=			Op1-=Op2	Op1=Op1 - Op2			Operador de Resta
	 **=			Op1*=Op2	Op1=Op1 * Op2			Operador de multiplicaci�n
	 *(/)=			Op1/=Op2 	Op1=Op1 / Op2			Operador de Divisi�n
	 *%=			Op1%=Op2	Op1=Op1 % Op2			Operador de Residuo	
	 *++			Op1++		Op1=Op1 % Op2			Operador de incremento. Incrementa el valor en 1		
	 *				++Op1	
	 *--			Op1--		Op1= Op1 - 1			Operador de decremento. Decrementa el valor en 1	
	 *				--Op1
	 */
	
	public float sumaNew(float sum1, float sum2){
		  //suma de dos numeros
		  return sum1+sum2;
		}
	
	/***
	 * Operadores l�gicos
	 * 
	 * Operador						Descripci�n
	 * ==							igual a
	 * !=							no igual a 
	 * >							mayor que 
	 * >=							mayor o igual que 
	 * <							menor que
	 * <=							menor o igual que
	 * !							Operador de complemento l�gico
	 * &&							Operador condicional y (AND)
	 * ||							Operador condicional o (OR)
	 * ?:							Operador ternario
	 * instanceof					Operador instanceof
	 */
	public boolean mayorQue(double op1, double op2) {
		return op1>op2?true:false;
	}
	
	
	/***
	 * Operadores de Bit
	 * Operador						descripcion
	 * &							Operador bits AND
	 * ^							Operador bits OR exclusivo (XOR)
	 * |							Operador bits OR inclusivo
	 * ~							Operador Negaci�n bits(NOT)
	 * <<							Operador desplazamiento izquierda
	 * >>							Operador desplazamiento derecha
	 * >>>							Operador desplazamiento derecha sin signo
	 */
	
	/***
	 * Precedencia o jerarqu�a de operadores
	 * operadores posfijos				[] . (parametros) op++ op--
	 * operadores unarios				++op --op +op -op ~ !
	 * Creaci�n o cast					new(tipo) Op1
	 * multiplicaci�n y divisi�n		* / %
	 * suma y resta						+ -
	 * desplazamiento					<< >> >>>
	 * operadores relacionales			< > <= =>
	 * equivalencia						== !=
	 * operador AND						&
	 * operador XOR						^
	 * operador OR						|
	 * AND booleano						&&
	 * OR booleano						||
	 * condicional						?:
	 * operadores de asignaci�n			= += -= *= /= %= &= ^= |= <<= >>= >>>=
	 */
}
