package com.PengelompokanAritmatika;

import java.util.Scanner;

public class PengelompokanAritmatika {

	public static void main(String[] args) {
		
		Scanner Input = new Scanner(System.in);
		
		int a,b,c;
		
		System.out.print("a = ");
		a= Input.nextInt();
		System.out.print("b = ");
		b= Input.nextInt();
		System.out.print("c = ");
		c= Input.nextInt();
		
		int hasil = a*b*c+a/c;
		System.out.print("Hasil = " + hasil);

	}

}
