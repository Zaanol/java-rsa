package com.zanol.rsa;

import com.zanol.rsa.model.PrivateKey;
import com.zanol.rsa.model.PublicKey;
import java.math.BigInteger;
import java.security.SecureRandom;

public class RSA
{
	private PublicKey publicKey;
	private PrivateKey privateKey;
	private int BITLEN = 2048;

	public String encode(String message) {
		return new BigInteger(message.getBytes())
			.modPow(this.publicKey.getE(), this.publicKey.getN())
			.toString();
	}

	public String decode(String codedMessage) {
		return new String(new BigInteger(codedMessage)
			.modPow(this.privateKey.getD(), this.privateKey.getN())
			.toByteArray());
	}

	public void generateKeys() {
		BigInteger p, q, n, d, e, m;
		SecureRandom r = new SecureRandom();
		p = new BigInteger(BITLEN / 2, 100, r);
		q = new BigInteger(BITLEN / 2, 100, r);

		n = p.multiply(q);

		m = (p.subtract(BigInteger.ONE)).multiply(q.subtract(BigInteger.ONE));

		e = new BigInteger(12, 100, r);
		while (m.gcd(e).intValue() > 1) e = e.add(new BigInteger("1"));

		d = e.modInverse(m);

		this.publicKey = new PublicKey(e, n);
		this.privateKey = new PrivateKey(d, n);
	}

	public PublicKey getPublicKey()
	{
		return publicKey;
	}

	public void setPublicKey(PublicKey publicKey)
	{
		this.publicKey = publicKey;
	}

	public PrivateKey getPrivateKey()
	{
		return privateKey;
	}

	public void setPrivateKey(PrivateKey privateKey)
	{
		this.privateKey = privateKey;
	}
}