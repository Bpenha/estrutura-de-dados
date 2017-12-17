import java.util.Scanner;
class Uri1009{
	public static void main(String[]args){

		Scanner leitor = new Scanner(System.in);

		String nome;
		double salario;
        double vendas;
        double salfinal;

		nome=leitor.next();
		salario=leitor.nextDouble();
		vendas=leitor.nextDouble();

		salfinal=((vendas*0.15)+salario);

		System.out.printf("TOTAL = R$ %.2f\n", salfinal);

	}
}