package edu.etec.poo2.code;

public class ClassePrincipal {

	public static void main(String[] args) {
		
		System.out.println("Hello, world!");
		
		ClasseConta objeto_c1 = new ClasseConta();
		
		objeto_c1.atributoNumeroConta = 123;
		objeto_c1.atributoSaldoConta = 20_000;
		objeto_c1.atributoTipoConta = "Salário";
		
		System.out.println(objeto_c1.atributoNumeroConta);
		System.out.println(objeto_c1.atributoSaldoConta);
		System.out.println(objeto_c1.atributoTipoConta);
	
		objeto_c1.cli = new ClasseCliente();
		
		objeto_c1.cli.clienteNomeConta = "José";
		objeto_c1.cli.clienteCPFConta = 222;
		objeto_c1.cli.clienteRenda = 4_000;
		
		System.out.println(objeto_c1.cli.clienteNomeConta);
		System.out.println(objeto_c1.cli.clienteCPFConta);
		System.out.println(objeto_c1.cli.clienteRenda);

	}

}
