import java.util.Scanner;

public class Exemplo05 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		String caracter;
		
		System.out.println("Digite um caracter:");
		caracter = leitor.nextLine();
		
		switch (caracter) {
		case "." : System.out.println("Voc� digitou '.' "); break;
		case "," : System.out.println("Voc� digitou ',' "); break;
		case ":" : System.out.println("Voc� digitou ':' "); break;
		case ";" : System.out.println("Voc� digitou ';' "); break;
		default : System.out.println("Voc� digitou outra coisa");		
	}
	System.out.println("Fim do programa");

}
}