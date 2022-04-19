package br.com.jokenpo.controller;

import java.util.Scanner;

public class jokenpoController {

	public static void main(String[] args) throws InterruptedException {
		int jogador1, jogador2;
		Scanner teclado = new Scanner(System.in);

		System.out.println("-----Jokenpo-----");
		System.out.println("Pedra");
		System.out.println("Papel");
		System.out.println("Tesoura");
		
        Thread.sleep(2000);

		jogador1 = (int) (Math.random() * 3 + 1);
		System.out.println("");
		switch (jogador1) {
		case 1:
			System.out.println("Jogador 1 escolheu Pedra");
			break;
		case 2:
			System.out.println("Jogador 1 escolheu Papel");
			break;
		case 3:
			System.out.println("Jogador 1 escolheu Tesoura");
			break;

		}
		jogador2 = (int) (Math.random() * 3 + 1);
		teclado.close();
		switch (jogador2) {
		case 1:
			System.out.println("Jogador 2 escolheu Pedra");
			break;
		case 2:
			System.out.println("Jogador 2 escolheu Papel");
			break;
		case 3:
			System.out.println("Jogador 2 escolheu Tesoura");
			break;
		}

		System.out.println("");
		if (jogador1 == jogador2) {
			System.out.println("EMPATE");
		} else {
			if ((jogador1 == 1 && jogador2 == 3) || (jogador1 == 2 && jogador2 == 1)
					|| (jogador1 == 3 && jogador2 == 2)) {
				System.out.println("JOGADOR 1 VENCEU");
			} else {
				System.out.println("JOGADOR 2 VENCEU");
			}
		}

	}
}
