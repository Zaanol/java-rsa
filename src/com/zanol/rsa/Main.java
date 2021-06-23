package com.zanol.rsa;

public class Main
{
	public static void main(String args[])
	{
		RSA rsa = new RSA();
		rsa.generateKeys();

		String coded = rsa.encode("Teste encode e decode");
		System.out.println(rsa.decode(coded));

		System.out.println();
	}
}