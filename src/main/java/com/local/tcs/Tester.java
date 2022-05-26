package com.local.tcs;

import java.util.*;

public class Tester
{
	Tester()
	{
		System.out.println("check");
	}
	public int multilier(int d) {
		return d*5;
	}
}

class c extends Tester{
	
	private static int data;
	
	public c()
	{
		data=25;
	}
	 int mul(int d) {
		return d*5;
	}
	
	public static void main(String args [])
	{
		Tester t=new c();
		
		System.out.println();
	}
}
