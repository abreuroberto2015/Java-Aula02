import java.util.Scanner;

public class Exemplo02 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		int a, b;
		
		System.out.println("Valor de A:");
		a = leitor.nextInt();
		
		System.out.println("Valor de  B:");
		b = leitor.nextInt();
		
		if (a > b) {
		    System.out.println("A � maior que B:");
		
		} else if (a < b ) {
			System.out.println("A � menor que B:");
		} else {
			System.out.println("A � igual a B:");
		}
				
	}

}
