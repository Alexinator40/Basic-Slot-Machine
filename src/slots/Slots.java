package slots;

import java.util.Random;
import java.util.Scanner;

public class Slots {
	public static void main(String[] args) {

		Scanner scanIn = new Scanner(System.in);
		System.out.print("Do you want to play Slots? (yes or no): ");
		String play = scanIn.nextLine();

		if (play.equals("yes")) {
			PlaySlots();
		}
	}

	public static void PlaySlots() {

		Random rng = new Random();
		Scanner scanIn2 = new Scanner(System.in);
		Scanner scanIn3 = new Scanner(System.in);
		int quarters = 100;

		System.out.print("Do you want to pull? (y or n): ");
		String pull = scanIn2.nextLine();

		while (quarters > 0 && pull.equals("y")) {
			System.out
					.print("How many quarters do you want to use? (Max is 5): ");
			String Combo = scanIn3.nextLine();
			int combo = Integer.parseInt(Combo);
			while (combo <= 5) {
				quarters = (quarters - combo);
				int s1 = Chances(rng.nextInt(1000) + 1);
				int s2 = Chances(rng.nextInt(1000) + 1);
				int s3 = Chances(rng.nextInt(1000) + 1);
				System.out.print("[" + s1 + "]  ");
				System.out.print("[" + s2 + "]  ");
				System.out.print("[" + s3 + "]  ");
				if ((s1 == s2) && (s2 == s3)) {
					int quarterswon = (s1 * 3 * combo);
					System.out.println("You won " + quarterswon + " quarters!");
					quarters = quarters + quarterswon;
				} else if ((s1 == s2)) {
					int quarterswon = ((s1) * 2 * combo);
					System.out.println("You won " + quarterswon + " quarters!");
					quarters = quarters + quarterswon;
				} else if ((s2 == s3)) {
					int quarterswon = ((s2) * 2 * combo);
					System.out.println("You won " + quarterswon + " quarters!");
					quarters = quarters + quarterswon;
				} else if ((s1 == s3)) {
					int quarterswon = ((s3) * 2 * combo);
					System.out.println("You won " + quarterswon + " quarters!");
					quarters = quarters + quarterswon;
				} else {
					String crazycomboS = "" + s1 + "" + s2 + "" + s3;
					int crazycomboI = (Integer.parseInt(crazycomboS));
					int quarterswon = 0;
					switch (crazycomboI) {
					case 123:
						quarterswon = (s1 + s2 + s3) * 2;

						break;
					case 234:
						quarterswon = (s1 + s2 + s3) * 2;

						break;
					case 345:
						quarterswon = (s1 + s2 + s3) * 2;
						break;
					case 456:
						quarterswon = (s1 + s2 + s3) * 2;
						break;
					case 567:
						quarterswon = (s1 + s2 + s3) * 2;
						break;
					case 678:
						quarterswon = (s1 + s2 + s3) * 2;
						break;
					case 789:
						quarterswon = (s1 + s2 + s3) * 2;
						break;
					case 8910:
						quarterswon = (s1 + s2 + s3) * 2;
						break;

					}
					System.out.println("You won " + quarterswon + " quarters!");
					quarters = quarters + quarterswon;

				}
				System.out.println("       You have " + quarters
						+ " quarters left!");
				System.out.print("Do you want to pull again? (y or n): ");
				pull = scanIn2.nextLine();
			}
			if (combo > 5) {
				System.out.println("Invalid amount entered!");
			}
		}

		double cash = (quarters / 4);
		System.out.print("You have $" + cash + " left");
	}

	public static int Chances(int a) {
		if (a >= 1 && a <= 190) {
			a = 1;
		} else if (a >= 191 && a <= 360) {
			a = 2;
		} else if (a >= 361 && a <= 510) {
			a = 3;
		} else if (a >= 511 && a <= 640) {
			a = 4;
		} else if (a >= 641 && a <= 750) {
			a = 5;
		} else if (a >= 751 && a <= 840) {
			a = 6;
		} else if (a >= 841 && a <= 910) {
			a = 7;
		} else if (a >= 911 && a <= 960) {
			a = 8;
		} else if (a >= 961 && a <= 990) {
			a = 9;
		} else {
			a = 10;
		}

		return a;
	}
}
