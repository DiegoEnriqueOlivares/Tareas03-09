package Practicas;

public class SinVaAux {

	public static void main(String[] args) {
	int a=10, b=20;
		
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		
		// Resultado tiene que ser a=20, b=10
		a=a+b;
		b=a-b;
		a=a-b;

		System.out.println("Despues del intercambio quedaron asi: ");
		System.out.println("a = "+a);
		System.out.println("b = "+b);
	}

}
