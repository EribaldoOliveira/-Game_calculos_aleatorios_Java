package view;

import java.util.Scanner;

import model.Calcular;

public class Game {

	static Scanner teclado = new Scanner(System.in);
	static int pontos = 0;
	static Calcular calc;

	public static void main(String[] args) {
		Game.jogar();

	}

	public static void jogar() {
		System.out.println("Informe o nível de dificuldade desejado [ 1, 2, 3 ou 4]: ");
		int dificuldade = Game.teclado.nextInt();
		System.out.println();

		Game.calc = new Calcular(dificuldade);
		System.out.println("Informe o resultado para a seguinte operação: ");

		// Somar
		if (calc.getOperacao() == 0) {
			System.out.println(calc.getValor1() + " + " + calc.getValor2());
			int resposta = Game.teclado.nextInt();

			if (calc.somar(resposta)) {
				// ganha 1 ponto
				Game.pontos += 1;
				System.out.println("Você tem " + Game.pontos + " ponto(s).");
			}

		}

		// Diminuir
		else if (calc.getOperacao() == 1) {
			System.out.println(calc.getValor1() + " - " + calc.getValor2());
			int resposta = Game.teclado.nextInt();

			if (calc.diminuir(resposta)) {
				// ganha 1 ponto
				Game.pontos += 1;
				System.out.println("Você tem " + Game.pontos + " ponto(s).");
			}

		}
		
		// Multiplicar
				else if (calc.getOperacao() == 2) {
					System.out.println(calc.getValor1() + " x " + calc.getValor2());
					int resposta = Game.teclado.nextInt();

					if (calc.multiplicar(resposta)) {
						// ganha 1 ponto
						Game.pontos += 1;
						System.out.println("Você tem " + Game.pontos + " ponto(s).");
				}
					
			}
		
		// Dividir
				else if (calc.getOperacao() == 3) {
					System.out.println(calc.getValor1() + " ÷ " + calc.getValor2());
					int resposta = Game.teclado.nextInt();

					if (calc.dividir(resposta)) {
						// ganha 1 ponto
						Game.pontos += 1;
						System.out.println("Você tem " + Game.pontos + " ponto(s), PARABÉNS!!!.");
				}
					
			}else {
				System.out.println("A operação " + calc.getOperacao() + " não é reconhecida");
			}
		
		System.out.println("\nDeseja continuar? [1 - Sim, 0 - Não]");
		int continuar = Game.teclado.nextInt();
		System.out.println();
		
		if(continuar == 1) {
			Game.jogar();
		}else {
			System.out.println("====================================");
			System.out.println("[OK, game encerrado! até a próxima.]");
			System.out.println("====================================");
			System.exit(0);
		}
	}

}
