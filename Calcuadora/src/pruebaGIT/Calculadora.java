package pruebaGIT;

public class Calculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero1 = 4,numero2 = 7; 
		System.out.println("CALCULADORA BÁSICA");
		int suma = SUMAR (numero1,numero2);
		System.out.println("Suma = "+suma);
	}
	public static int SUMAR(int n1, int n2) {
		return n1+n2;
	}
}
