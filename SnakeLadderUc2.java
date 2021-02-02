package com.JavaParactice;

import java.util.Scanner;

public class SnakeLadderUc2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int pos=0;
		System.out.println("lets have a game play");
		//System.out.println("please roll the die");
		String s="START";
		System.out.println("please roll the die");
		String st=sc.next();
		if(s.toLowerCase().toUpperCase().equals(st.toLowerCase().toUpperCase()))
		{
		int roll=(int) (Math.floor(Math.random()*(6-1+1)+1));
		System.out.println("result  "+roll);
		}

	}

}
//