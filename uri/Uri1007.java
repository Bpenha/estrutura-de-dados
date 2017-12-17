import java.util.Scanner;
class Uri1007{
	public static void main(String[]args){

	Scanner leitor = new Scanner(System.in);

	int a, b, c, d, disf;

	a=leitor.nextInt();
	b=leitor.nextInt();
	c=leitor.nextInt();
	d=leitor.nextInt();

	disf=((a*b)-(c*d));

	System.out.println("DIFERENCA = " +disf);
	}
}
