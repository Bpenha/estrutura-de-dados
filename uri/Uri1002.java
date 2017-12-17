import java.util.Scanner;
class Uri1002{
	
	public static void main (String[]args){

		double a, raio;
		Scanner leitor = new Scanner (System.in);

		raio=leitor.nextDouble();
		a=3.14159*raio*raio;

		System.out.printf("A=%.4f\n", a);

	}
}