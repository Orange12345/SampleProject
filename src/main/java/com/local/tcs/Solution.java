package com.local.tcs;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class Solution {
	
	public static void main(String[] args) throws java.lang.Exception
	{
		String str="Pasword@01";
		checkPassword(str);
		checkparenthesis("}{}strp}{}{}");
		
	}
	
	private static void checkparenthesis(String string) {
		Stack<Character>st=new Stack<>();
		int count=0;
		for(int i=0;i<string.length();i++)
		{
			if(string.charAt(i)=='{')
			{
				st.push(string.charAt(i));
			}
			else if(string.charAt(i)=='}' && !st.isEmpty())
			{
				st.pop();
				count++;
			}
		}
		System.out.print("out : " +count);
	}

	private static void checkPassword(String str) {
		// TODO Auto-generated method stub
		 int n = str.length();
		  int errorCode = 0;
		  Stack<Character>st=new Stack<>();
	        boolean hasLength = false, charNumb = false,
	                specialChar = false,duplicateChar=false;
	        Set<Character> set = new HashSet<Character>(
	            Arrays.asList('!', '@', '#', '$', '%', '^', '&',
	                          '*', '(', ')', '-', '+'));
	        for(Character ch : str.toCharArray())
	        {
	        	if(Character.isLetterOrDigit(ch))
	        	{
	        		charNumb=true;
	        	}
	        	else if(set.contains(ch))
	        	{
	        		specialChar=true;
	        	}
	        	if(!st.isEmpty() && st.peek().equals(ch))
	        	{
	        		duplicateChar=true;
	        	}
	        	st.push(ch);
	        }
	        if(n<2 || n>45)
	        {
	        	errorCode=10;
	        }
	        else if(!charNumb)
	        {
	        	errorCode=20;
	        }
	        else if(!specialChar)
	        {
	        	errorCode=30;
	        }
	        else if(duplicateChar)
	        {
	        	errorCode=40;
	        }
	        System.out.print("final out : " + errorCode);
		/*
		 * (?=.*[a-z]) The string must contain at least 1 lowercase alphabetical
		 * character
		 * 
		 * (?=.*[A-Z]) The string must contain at least 1 uppercase alphabetical
		 * character
		 * 
		 * (?=.*[0-9]) The string must contain at least 1 numeric character
		 * 
		 * (?=.[!@#\$%\^&]) The string must contain at least one special character, but
		 * we are escaping reserved RegEx characters to avoid conflict
		 */
		/*
		 * if
		 * (str.matches("(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[^A-Za-z0-9])(?=.*{8,})")
		 * ){ System.out.println("Strong"); } else { System.out.println("weak"); }
		 */
	}

	private static void check() {
		// TODO Auto-generated method stub
		HashMap<Integer,String> map=new HashMap<>();
		map.put(1, "A");
		map.put(2, "B");
		map.put(1, "C");
		
		System.out.println("size" + map.size());
		
		System.out.println("value " + map.get(1));
		
	}
	private static void primeNumber() {
		boolean isPrime=true;
		for(int i=2;i<20;i++)
		{
			isPrime=true;
			for(int j=2;j<=i/2;j++)
			{
				if(i%j==0)
				{
					isPrime=false;
					break;
				}
			}
			if(isPrime)
				System.out.println("prime Numbner : " + i);
			else
				System.out.println("Not prime : " + i);
		}
		
	}

	private static String stringconversion(String str)
	{

		char[]arr=str.toCharArray();

		StringBuilder sb=new StringBuilder();

		for(char ch : arr)
		{
			int val = ch;
				if(val>=65 && val<=90)
				{
					sb.append(String.valueOf(ch).toLowerCase());
				}
				else if(val>=97 && val<=122) {
					sb.append(String.valueOf(ch).toUpperCase());
				}
		}

		System.out.print(sb.toString());
		return str;
	}

}