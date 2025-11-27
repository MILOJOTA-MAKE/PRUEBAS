package pruebaGIT;

public class Calculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero1 = 4,numero2 = 7; 
		System.out.println("CALCULADORA BÁSICA");
		int suma = SUMAR (numero1,numero2);
		int resta = RESTAR(numero1,numero2);
		int multiplicacion = MULTIPLICAR(numero1,numero2);
		System.out.println("Suma = "+suma);
		System.out.println("Resta = "+resta);
		System.out.println("Multiplicar = "+multiplicacion);
		System.out.println("Otra vez");
		System.out.println("Cualquiera ");
		//sSystem.out.println();
	}
	public static int SUMAR(int n1, int n2) {
		return n1+n2;
	}
	public static int RESTAR(int n1, int n2) {
		return n2-n1;
	}
	public static int MULTIPLICAR (int n1, int n2) {
		return n2*n1;
	}
	}

