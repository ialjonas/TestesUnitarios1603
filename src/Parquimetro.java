public class Parquimetro {
	private int saldo;

	public Parquimetro() {
		saldo = 0;
	}

	public void insereMoeda(int valor) {
		switch (valor) {
		case 1:
			saldo += valor;

		case 5:
			saldo += valor;

		case 10:
			saldo += valor;

		case 25:
			saldo += valor;

		case 50:
			saldo += valor;

		case 100:
			saldo += valor;
			break;
		default:
			throw new IllegalArgumentException();
		}
	}

	public int getSaldo() {
		return (saldo);
	}

	public boolean emiteTicket() {
		if (getSaldo() < 200) {
			return (false);
		}
		saldo -= 200;
		return (true);
	}

	public int devolve() {
		int tmp = saldo;
		saldo = 0;
		return (tmp);
	}
}
