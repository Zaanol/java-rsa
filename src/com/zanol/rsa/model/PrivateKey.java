package com.zanol.rsa.model;

import java.math.BigInteger;

public class PrivateKey
{
	BigInteger d;
	BigInteger n;

	public PrivateKey()
	{
	}

	public PrivateKey(BigInteger d, BigInteger n)
	{
		this.d = d;
		this.n = n;
	}

	public BigInteger getD()
	{
		return d;
	}

	public void setD(BigInteger d)
	{
		this.d = d;
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
		return "PrivateKey{" + "d=" + d + ", n=" + n + '}';
	}
}