
public class UD04_05_App {

	public static void main(String[] args) {
		
//		5- Programa java que declare cuatro variables enteras A, B, C y D y
//		asígnale un valor a cada una. A continuación realiza las instrucciones
//		necesarias para que:
//		  · B tome el valor de C
//		  · C tome el valor de A
//		  · A tome el valor de D
//		  · D tome el valor de B
		
//		Variables
		int A = 1;
		int B = 2;
		int C = 3;
		int D = 4;
		
//		Programa
		System.out.println(
				"B tome el valor de C: (B=C) B = " + (B = C)
				+ "\nC tome el valor de A: (C=A) C = " + (C = A)
				+ "\nA tome el valor de D: (A=D) A = " + (A = D)
				+ "\nD tome el valor de B: (D=B) D = " + (D = B)
				);

	}

}
