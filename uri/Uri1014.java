import java.util.Scanner;
class Uri1014{
	public static void main(String[]args){

		Scanner leitor = new Scanner(System.in);

		double km, combus, consmedio;

		km=leitor.nextDouble();
		combus=leitor.nextDouble();

		consmedio=(km/combus);

		System.out.printf("%.3f Km/l\n", consmedio);
	}
}