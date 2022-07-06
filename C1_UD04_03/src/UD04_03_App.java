
public class UD04_03_App {

	public static void main(String[] args) {
		
//		3- Escribe un programa Java que realice lo siguiente: declarar dos variables X e Y de tipo int,
//		dos variables N y M de tipo double y asigna a cada una un valor. A continuación muestra por
//		pantalla:
//		   · El valor de cada variable.
//		   · La suma X + Y
//		   · La diferencia X - Y
//		   · El producto X * Y
//		   · El cociente X / Y
//		   · El resto X % Y
//		   · La suma N + M
//		   · La diferencia N - M
//		   · El producto N * M
//		   · El cociente N / M
//		   · El resto N % M
//		   · La suma X + N
//		   · El cociente Y / M
//		   · El resto Y % M
//		   · El doble de cada variable
//		   · La suma de todas las variables
//		   · El producto de todas las variables
		
//		Variables
		int X = 10;
		int Y = 5;
		double N = 4.56;
		double M = 7.89;
		
//		Programa
		System.out.println(
				"Variable X = " + X + "\nVariable Y = " + Y + "\nVariable N = " + N + "\nVariable M = " + M
				+ "\n\nLa suma " + X + " + " + Y + " = " + (X+Y)
				+ "\nLa diferencia " + X + " - " + Y + " = " + (X-Y)
				+ "\nEl producto " + X + " * " + Y + " = " + (X*Y)
				+ "\nEl cociente " + X + " / " + Y + " = " + (X/Y)
				+ "\nEl resto " + X + " % " + Y + " = " + (X%Y)
				+ "\n\nLa suma " + N + " + " + M + " = " + (N+M)
				+ "\nLa diferencia " + N + " - " + M + " = " + (N-M)
				+ "\nEl producto " + N + " * " + M + " = " + (N*M)
				+ "\nEl cociente " + N + " / " + M + " = " + (N/M)
				+ "\nEl resto " + N + " % " + M + " = " + (N%M)
				+ "\n\nDoble de cada variable: \nVariable X * 2 = " + X + "\nVariable Y * 2 = " + Y + "\nVariable N * 2 = " + N + "\nVariable M * 2 = " + M
				+ "\n\nSuma de todas las variables: " + (X+Y+N+M)
				+ "\nProducto de todas las variables: " + (X*Y*N*M)
				);

	}

}
