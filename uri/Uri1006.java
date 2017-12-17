import java.util.Scanner;
class Uri1006{
	public static void main(String[]args){

	Scanner leitor = new Scanner(System.in);

	double a, b, c, media;

	a=leitor.nextDouble();
	b=leitor.nextDouble();
	c=leitor.nextDouble();

	media=(((a*2)+(b*3)+(c*5))/10);

	System.out.printf("MEDIA = %.1f\n", media);
	}
}