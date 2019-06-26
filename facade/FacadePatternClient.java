package com.bridgeit.designPattern.facade;

import java.io.IOException;

import com.bridgeit.utility.Utility;

public class FacadePatternClient {
	private static int choice;

	public static void main(String args[]) throws NumberFormatException, IOException {
		do {
			System.out.print(" _______________________\n");
			System.out.print("|______Mobile Shop______| \n");
			System.out.print("|                       |  \n");
			System.out.print("|  1. IPHONE.           |  \n");
			System.out.print("|  2. SAMSUNG.          |  \n");
			System.out.print("|  3. BLACKBERRY.       |  \n");
			System.out.print("|  4. Exit.             |    \n");
			System.out.print("|_______________________| \n");
			System.out.println();
			System.out.print("Enter your choice: ");

			choice = Utility.getInteger();
			ShopKeeper sk = new ShopKeeper();
			System.out.println();
			switch (choice) {
			case 1: {
				sk.iphoneSale();
			}
				break;
			case 2: {
				sk.samsungSale();
			}
				break;
			case 3: {
				sk.blackberrySale();
			}
				break;
			default: {
				System.out.println("Nothing You purchased");
			}
				return;
			}

		} while (choice != 4);
	}
}
