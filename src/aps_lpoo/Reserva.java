package aps_lpoo;

public class Reserva {
	String nomePessoa;
	double rendimentoPessoa, valor;
	static double saldo;
		
	public String getNomePessoa() {
		return nomePessoa;
	}
	public void setNomePessoa(String nomePessoa) {
		this.nomePessoa = nomePessoa;
	}
	public double getRendimentoPessoa() {
		return rendimentoPessoa;
	}
	public void setRendimentoPessoa(double rendimentoPessoa) {
		this.rendimentoPessoa = rendimentoPessoa;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public static void gerarReserva(double reserva) {
		saldo += reserva;
	}

	public static void saldoReserva() {
		System.out.println("Reserva Atual: R$" + saldo);
	}
	
	
}
