import java.util.Scanner;
class Uri1019{
	public static void main(String[]args){

		Scanner leitor = new Scanner(System.in);

		int seg, min, hor,rest;

		seg=leitor.nextInt();

		hor=seg/3600;

		rest=seg%3600;

		min=rest/60;

		seg=rest%60;

		System.out.println(hor+":"+min+":"+seg);


	}
}