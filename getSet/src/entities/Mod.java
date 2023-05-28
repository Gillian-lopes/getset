package entities;

public class Mod {

	private int number;
	private String holder;
	private double balance;

	public Mod(int number, String holder) {
		this.number = number;
		this.holder = holder;
	}

	public Mod(int number, String holder, double deposito) {
		this.number = number;
		this.holder = holder;
		amount(deposito);
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public int getNumber() {
		return number;
	}

	public double getBalance() {
		return balance;
	}

	public void amount(double entrada) {
		balance += entrada;
	}

	public void saque(double retirada) {
		balance -= retirada;
	}

	public String toString() {
		return 	+ number
				+ ", Usuario: "
				+ holder
				+ ", Extrato: $ "
				+ String.format("%.2f", balance);
	}
		

}
