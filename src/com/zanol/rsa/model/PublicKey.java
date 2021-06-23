package com.zanol.rsa.model;

import java.math.BigInteger;

public class PublicKey
{
	BigInteger e;
	BigInteger n;

	public PublicKey()
	{
	}

	public PublicKey(BigInteger e, BigInteger n)
	{
		this.e = e;
		this.n = n;
	}

	public BigInteger getE()
	{
		return e;
	}

	public void setE(BigInteger e)
	{
		this.e = e;
	}

	public BigInteger getN()
	{
		return n;
	}

	public void setN(BigInteger n)
	{
		this.n = n;
	}

	@Override
	public String toString()
	{
		return "PublicKey{" + "e=" + e + ", n=" + n + '}';
	}
}