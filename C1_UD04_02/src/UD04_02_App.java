
public class UD04_02_App {

	public static void main(String[] args) {
		
//		2- Escribe un programa Java que realice lo siguiente: declarar una variable N de tipo int,
//		una variable A de tipo double y una variable C de tipo char y asigna a cada una un valor.
//		
//		A continuación muestra por pantalla:
//		   · El valor de cada variable.
//		   · La suma de N + A
//		   · La diferencia de A - N
//		   · El valor numérico correspondiente al carácter que contiene la variable C.
		
//		Variables
		int N = 5;
		double A = 4.56;
		char C = 'a';
		int c_asciiValue = C;
		
//		Programa
		System.out.println("Variable N = " + N);
		System.out.println("Variable A = " + A);
		System.out.println("Variable C = " + c_asciiValue);
		System.out.println(N + " + " + A + " = " + (N+A));
		System.out.println(A + " - " + N + " = " + (A-N));
		System.out.println("Valor numerico del caracter " + C + " = " + c_asciiValue);

	}

}
