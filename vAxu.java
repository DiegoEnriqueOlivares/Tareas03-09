package Practicas;

public class vAxu {

	public static void main(String[] args) {
		int a=10, b=20, aux;
		
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		
		// Resultado tiene que ser a=20, b=10
		aux=a;
		a=b;
		b=aux;

		System.out.println("Despues del intercambio quedaron asi: ");
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		
	}

}
