import java.util.Scanner;
class Uri1011{
	public static void main(String[]args){

	Scanner leitor = new Scanner(System.in);

	double raio, vol;

	raio=leitor.nextDouble();

	vol=(((4.0/3)*3.14159)*(raio*raio*raio));
	
	System.out.printf("VOLUME = %.3f\n", vol);
	}
}