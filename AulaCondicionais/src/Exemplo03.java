import java.util.Scanner;

public class Exemplo03 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite um valor: ");
		int x = leitor.nextInt();
		
		if (x >= 0 && x < 10) {
			System.out.println(x + " est� entre o a 10!");
		} else {
			System.out.println(x + " est� fora do escopo!");
		}

		System.out.println("FIM DO PROGRAMA:");		
	}

}
