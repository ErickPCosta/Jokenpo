package br.com.jokenpo.controller;

import java.util.Scanner;

public class jokenpoController {

	public static void main(String[] args) {
		int jogador, computador;
		Scanner teclado = new Scanner(System.in);

		System.out.println("-----Jokenpo-----");
		System.out.println("(1) Pedra");
		System.out.println("(2) Papel");
		System.out.println("(3) Tesoura");
		System.out.println("Selecione a opção desejada: ");

		jogador = teclado.nextInt();
		System.out.println("");
		switch (jogador) {
		case 1:
			System.out.println("Jogador escolheu Pedra");
			break;
		case 2:
			System.out.println("Jogador escolheu Papel");
			break;
		case 3:
			System.out.println("Jogador escolheu Tesoura");
			break;
		default:
			System.out.println("*Opção invalida*");
			break;
		}
		computador = (int) (Math.random() * 3 + 1);
		teclado.close();
		switch (computador) {
		case 1:
			System.out.println("Computador escolheu Pedra");
			break;
		case 2:
			System.out.println("Computador escolheu Papel");
			break;
		case 3:
			System.out.println("Computador escolheu Tesoura");
			break;
		}

		System.out.println("");
		if (jogador == computador) {
			System.out.println("EMPATE");
		} else {
			if ((jogador == 1 && computador == 3) || (jogador == 2 && computador == 1)
					|| (jogador == 3 && computador == 2)) {
				System.out.println("VOCÊ VENCEU");
			} else {
				System.out.println("COMPUTADOR VENCEU");
			}
		}

	}
}
