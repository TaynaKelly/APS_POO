package aps_lpoo;

import java.util.ArrayList;
import java.util.Scanner;

public class Cadastro extends Exception {

	static ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
	static ArrayList<Reserva> reservas = new ArrayList<Reserva>();

	static Scanner scan = new Scanner(System.in);

	public static void cadastrarPessoa() throws Exception {
		try {

			Pessoa p = new Pessoa();

			System.out.print("Nome: ");
			p.nome = scan.nextLine();
			System.out.print("Email: ");
			p.email = scan.nextLine();
			System.out.print("Rendimento mensal: ");
			p.rendimentos = Double.parseDouble(scan.nextLine());

			pessoas.add(p);
			System.out.println(p);

		} catch (Exception e) {
			System.out.println("Dados inválidos, por favor, refaça o cadastro! ");
		}

	}

	public static void verPessoas() {
		for (Pessoa i : pessoas) {
			System.out.println(i);
		}
	}

	public static void cadastrarDespesa() {
		try {

			Despesa d = new Despesa();

			System.out.print("Nome da despesa: ");
			d.nome = scan.nextLine();

			System.out.print("Descrição: ");
			d.descricao = scan.nextLine();

			System.out.print("Valor da Despesa: ");
			d.valor = Double.parseDouble(scan.nextLine());

			System.out.print("Informe o tipo da despesa: 1 para FIXA | 2 para VARIAVEL  ");
			int categoria = Integer.parseInt(scan.nextLine());
			switch (categoria) {
			case 1: {
				d.tipo = "FIXA";
				break;
			}
			case 2: {
				d.tipo = "VARIAVEL";
				break;
			}
			default:
				throw new Exception("Dados inválidos, tente novamente!");
			}

			if (d.tipo == "VARIAVEL") {
				System.out.println(
						"Informe o grau de classificação, onde 5 seja prioridade máxima e 1 prioridade mínima");
				d.grauClassificacao = Integer.parseInt(scan.nextLine());
			}

			d.informacoesDepesa();
			
			if(d.tipo == "FIXA" || d.grauClassificacao >= 4){
				d.somaDespesas(d.valor);
			}

		} catch (Exception e) {
			System.out.println("Dados inválidos, por favor, refaça o cadastro! ");
		}

	}
	
	public static void divisaoDespesas() throws Exception {
		try {
			double despesas = Despesa.getTotalDespesa();
			int qtdPessoas = pessoas.size();
			
			double proporcional = despesas / qtdPessoas;
			
			System.out.println("O valor TOTAL das despesas é de R$" + despesas);
			System.out.println("\nO valor PROPORCIONAL das despesas é de R$ " + proporcional);
		} catch (Exception e) {
			System.out.println("Não foi possivel calcular a divisão!");
		}
		
	}

	public static void cadastrarReserva() throws Exception {
		try {

			System.out.print("Digite seu nome: ");
			String nomeDigitado = scan.nextLine();
			for (int i = 0; i < pessoas.size(); i++) {
				if (nomeDigitado.equalsIgnoreCase(pessoas.get(i).getNome())) {
					double valorReserva = pessoas.get(i).getRendimentos() * 0.05;
					System.out.print("O valor proporcional da reserva a ser guardada é de R$ " + valorReserva
							+ " Deseja confirmar? Digite 1 para SIM, 2 para NÃO ");
					int confirmacao = Integer.parseInt(scan.nextLine());
					switch (confirmacao) {
					case 1: {

						Reserva r = new Reserva();

						r.nomePessoa = pessoas.get(i).getNome();
						r.valor = valorReserva;
						r.rendimentoPessoa = pessoas.get(i).getRendimentos();

						Reserva.gerarReserva(valorReserva);
						reservas.add(r);

						System.out.println("Reserva registrada com SUCESSO!.");
						break;
					}
					case 2: {
						System.out.println("Nao foi registrada nenhuma reserva.");
						break;
					}
					default:
						throw new Exception("Dados inválidos, tente novamente!");
					}

				}
			}
		} catch (Exception e) {
			System.out.println("Erro ao guardar reserva");
		}
	}

	public static void relatorioPendencia() {
		if (reservas.size() == 0) {
			System.out.println("Nenhuma reserva foi guardada esse mês");
		} else {
			for (int i = 0; i < pessoas.size(); i++) {
				System.out.println(reservas.get(i));
				if (reservas.get(i).valor == 0) {
					System.out.println("\nNome: " + reservas.get(i).nomePessoa + "\nReserva: " + reservas.get(i).valor);
				}
			}
		}
	}

}
