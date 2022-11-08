package aps_lpoo;

import java.util.Scanner;

public class Principal {

	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) throws Exception {

		while (true) {
			System.out.println("\n---------- DESPESAS MENSAIS! -------------");
			System.out.println("        0 - Sair");
			System.out.println("        1 - Cadastrar Pessoa");
			System.out.println("        2 - Cadastrar Despesa");
			System.out.println("        3 - Cadastrar Reserva");
			System.out.println("        4 - Consultar Saldo Reserva");
			System.out.println("        5 - Consultar Pessoas cadastradas");
			System.out.println("        6 - Consultar valor a ser pago");
			System.out.println("        7 - Relatorio Pendencia Reserva");
			System.out.println("Digite uma opção: ");
			int opçaoMenu = Integer.parseInt(scan.nextLine());

			switch (opçaoMenu) {
			case 1: {
				System.out.println(" ¨¨¨¨ Cadastro de pessoa ¨¨¨¨ ");
				Cadastro.cadastrarPessoa();
				break;
			}
			case 2: {
				System.out.println(" ¨¨¨¨ Cadastro de despesa ¨¨¨¨ ");
				Cadastro.cadastrarDespesa();
				break;
			}
			case 3: {
				System.out.println(" ¨¨¨¨ Cadastrar reserva ¨¨¨¨ ");
				Cadastro.cadastrarReserva();
				break;
			}
			case 4: {
				System.out.println(" ¨¨¨¨ Consultar Saldo Reserva ¨¨¨¨ ");
				Reserva.saldoReserva();
				break;
			}
			case 5: {
				System.out.println(" ¨¨¨¨ Pessoas cadastradas ¨¨¨¨ ");
				Cadastro.verPessoas();
				break;
			}
			case 6: {
				Cadastro.divisaoDespesas();
				break;
			}
			case 7: {
				System.out.println(" ¨¨¨¨ Relatorio Pendencia Reserva ¨¨¨¨ ");
				Cadastro.relatorioPendencia();
				break;
			}
			case 0: {
				break;
			}
			default:
				System.out.println("Opção invalida, tente novamente! ");
			}
		}

	}

}
