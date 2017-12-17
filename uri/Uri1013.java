import java.util.Scanner;
class Uri1013{
	public static void main(String[]args){

		Scanner leitor = new Scanner(System.in);

		int a, b, c, r, maior;

		a=leitor.nextInt();
		b=leitor.nextInt();
		c=leitor.nextInt();

		r=(((a+b)+Math.abs(a-b))/2);

		maior=(((r+c)+Math.abs(r-c))/2);

		System.out.println(maior+ " eh o maior");

	}
}