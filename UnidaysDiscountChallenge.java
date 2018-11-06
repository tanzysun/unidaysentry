package unidays;

import java.util.*;

public class UnidaysDiscountChallenge {

	private List<Character> basket = new ArrayList<Character>();
	// all available items
	private char itemList[] = { 'A', 'B', 'C', 'D', 'E' };

	// pass in items
	public boolean AddToBasket(char item) {
		// loops through item list, if inputed item is found in item list
		// item is added to basket
		for (int i = 0; i < 5; i++) {
			if (item == itemList[i]) {
				basket.add(item);
				return true;
			}
		}
		// returns false if item invalid
		return false;
	}

	private int total = 0, deliveryCharge = 0, overallTotal = 0;
	private int countA = 0, countB = 0, countC = 0, countD = 0, countE = 0;
	private int[] pricing;

	public int CalculateTotalPrice() {
		for (int i = 0; i < (basket.size()); i++) {
			// checks if the basket contains certain items
			// increments item count if it exists in basket
			if (basket.get(i) == itemList[0]) {
				countA++;
			} else if (basket.get(i) == itemList[1]) {
				countB++;
			} else if (basket.get(i) == itemList[2]) {
				countC++;
			} else if (basket.get(i) == itemList[3]) {
				countD++;
			} else if (basket.get(i) == itemList[4]) {
				countE++;
			}
		}

		// DISCOUNT A
		// no discount for A, so just multiply the number of A by £8
		total += countA * pricing[0];

		// DISCOUNT B
		// if number of Bs are odd
		// then decrement by 1 to make it even and add the extra £12 to total
		if (countB % 2 == 1) {
			total += pricing[1];
			countB--;
		}
		// divide B by 2 and times by £20 for correct discount
		total += (countB / 2) * 20;

		// DISCOUNT C
		// if there's a remainder of 1 or 2 after modulo 3
		// find remainder after dividing by 3, deduct remainder from countC
		if (countC % 3 > 0) {
			total += (countC % 3) * pricing[2];
			countC -= countC % 3;
		}
		// divide end countC by 3 multiplied by £10
		total += (countC / 3) * 10;

		// DISCOUNT D
		// if number of Ds are odd
		// decrement by 1 to make it even and add the extra £7 to total
		if (countD % 2 == 1) {
			total += pricing[3];
			countD--;
		}
		// divide D by 2 and times by £7 for the correct discount
		total += (countD / 2) * pricing[3];

		// DISCOUNT E
		// find remainder after dividing by 3, deduct remainder from countE
		if (countE % 3 > 0) {
			total += (countE % 3) * pricing[4];
			countE -= countE % 3;
		}
		// divide end countE by 3 multiplied 2 times the price of E
		total += (countE / 3) * 2 * pricing[4];

		// DELIVERY CHARGE
		// if order is under £50, delivery charge is set to £7
		// if not, delivery charge is 0
		overallTotal = total;
		if (total < 50) {
			deliveryCharge = 7;
			overallTotal += deliveryCharge;
		}

		return overallTotal;
	}

	public UnidaysDiscountChallenge(int[] pricing) {
		this.pricing = pricing;
	}

	public int getTotal() {
		return total;
	}

	public int getDeliveryCharge() {
		return deliveryCharge;
	}

	public String toString() {
		return "[total= £" + total + ", delivery charges= £" + deliveryCharge + ", Overall total= £" + overallTotal
				+ "]";
	}

}
