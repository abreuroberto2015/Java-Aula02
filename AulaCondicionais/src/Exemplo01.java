import java.util.Scanner;

public class Exemplo01 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Digite um numero: ");
		numero = leitor.nextInt();
		
		if (numero > 10)
		{
			System.out.println("Numero � maior que 10");
		} else {
			System.out.println("O numero digitado � menor que 10");
		}
		
		System.out.println("FIM DO PROGRAMA");
			
	}

}
