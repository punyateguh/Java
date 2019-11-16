package com.tutorial;

import java.util.Scanner;

public class tutorial {

	public static void main(String[] args) {
		
		Scanner userInput = new Scanner(System.in);
		
		System.out.print("panjang = ");
		int panjang = userInput.nextInt();
		System.out.print("Lebar = ");
		int lebar = userInput.nextInt();
		
		int hasil = panjang * lebar ;
		System.out.print("Hasil = " + hasil);
	}

}
