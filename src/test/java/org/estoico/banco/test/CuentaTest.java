package org.estoico.banco.test;

import org.estoico.banco.Cuenta;

import org.junit.Test;
import org.junit.Assert;

public class CuentaTest {
	
	
	@Test
	public void testDepositar() {
		Cuenta cuentaJuanito = new Cuenta();
		cuentaJuanito.usuario = "Juan";
		cuentaJuanito.numeroCuenta = 19675437;
		cuentaJuanito.saldo = 100_000;	
		cuentaJuanito.depositar(200_000);
		Assert.assertEquals(300_000, cuentaJuanito.consultarSaldo());	
	}
	
	
	@Test
	public void testRetirar() {
		Cuenta cuentaPepito = new Cuenta();
		cuentaPepito.usuario = "Pepe";
		cuentaPepito.numeroCuenta = 54353443;
		cuentaPepito.saldo = 200_000;
		cuentaPepito.retirar(150_000);
		Assert.assertEquals(50_000, cuentaPepito.consultarSaldo());
		
	}

}
