package Application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite quantos quartos serão alugados?: ");
		int n = sc.nextInt();
		int soma = 0;

		Product[] vect = new Product[n];

		for (int i = 0; i < vect.length; i++) {
			sc.nextLine();
			soma++;
			System.out.println("Rent #" + soma);
			System.out.print("Digite o nome do cliente: ");
			String name = sc.nextLine();
			System.out.print("Digite o email do ciente: ");
			String email = sc.nextLine();
			System.out.print("Digite o numero do quarto do cliente: ");
			int room = sc.nextInt();
			vect[i] = new Product(name, email, room);
		}
		
		for (int i = 0; i < vect.length; i++) {
			if (vect[i] != null){
				System.out.println("O quarto alugados foram:");
					System.out.println(vect[i].getRoom() + ": " + vect[i].getName() + ", " + vect[i].getEmail());
			}
			sc.close();
		}
	}
}
