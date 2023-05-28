package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Mod;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Mod acount;

		System.out.printf("Entre com o numero da conta: ");
		int conta = sc.nextInt();
		System.out.printf("Entre com o nome do usuario: ");
		sc.nextLine();
		String usuario = sc.nextLine();
		System.out.print("Havera deposito inicial (y/n):");
		char resposta = sc.next().charAt(0);

		if (resposta == 'y') {
			System.out.print("Qual o valor do deposito?");
			double depositoInicial = sc.nextDouble();
			acount = new Mod(conta, usuario, depositoInicial);
		} else {
			acount = new Mod(conta, usuario);

		}
		
		System.out.println();
		System.out.print("Extrato da conta: " + acount);

		System.out.println();
		System.out.print("Deposito no valor de ");
		double depositoValor = sc.nextDouble();
		acount.amount(depositoValor);
		System.out.println();
		System.out.print("Extrato da conta: " + acount);
		
		System.out.println();
		System.out.print("Saque no valor de ");
		double saqueValor = sc.nextDouble();
		acount.saque(saqueValor);
		System.out.println();
		System.out.print("Extrato da conta: " + acount);
		
		sc.close();
	}

}
