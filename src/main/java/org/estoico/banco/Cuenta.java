package org.estoico.banco;

public class Cuenta {

	public String usuario;
	public int numeroCuenta;
	public long saldo;

	public void depositar(long deposito) {
		saldo = saldo + deposito;
	}

	public void retirar(long retiro) {
		saldo = saldo - retiro;
	}

	public long consultarSaldo() {
		return saldo;
	}

}
