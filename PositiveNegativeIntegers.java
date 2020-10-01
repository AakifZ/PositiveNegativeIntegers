package edu.ben.cmsc2200.lab4;

import java.util.Scanner;

/**
 * @author aakif
 *
 */
public class PositiveNegativeIntegers {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int positive = 0;
		int negative = 0;
		int total = 0;
		double count = 0;
		int number;

		// asks user to enter an int value

		System.out.println("Enter an int value, the program exits if the input is '0': ");

		// user input

		do {
			number = input.nextInt();

			total += number;
			count++;

			// Determines if user input is positive or negative

			if (number > 0) {
				positive++;
			} else if (number < 0) {
				negative++;

			}

			// If user inputs '0' then the loop will end

		} while (number != 0);

		// decrements count so the '0' input doesnt count

		count--;

		double average = total / count;

		System.out.println("Number of positive: " + positive);
		System.out.println("Number of negative: " + negative);
		System.out.println("Total: " + total);
		System.out.printf("Average: %.2f", average);
	}
}
