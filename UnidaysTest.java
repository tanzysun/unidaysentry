package unidays;

public class UnidaysTest {

	public static void main(String[] args) {
		
		// pricing for items in itemList
		int pricing[] = { 8, 12, 4, 7, 5 };
		
		// no delivery charge
		UnidaysDiscountChallenge example1 = new UnidaysDiscountChallenge(pricing);
		example1.AddToBasket('E');
		example1.AddToBasket('D');
		example1.AddToBasket('C');
		example1.AddToBasket('B');
		example1.AddToBasket('A');
		example1.AddToBasket('E');
		example1.AddToBasket('D');
		example1.AddToBasket('C');
		example1.AddToBasket('B');
		example1.AddToBasket('C');
		example1.CalculateTotalPrice();
		System.out.println(example1);

		// borderline delivery charge
		UnidaysDiscountChallenge example2 = new UnidaysDiscountChallenge(pricing);
		example2.AddToBasket('B');
		example2.AddToBasket('B');
		example2.AddToBasket('B');
		example2.AddToBasket('B');
		example2.AddToBasket('C');
		example2.AddToBasket('C');
		example2.AddToBasket('C');
		example2.CalculateTotalPrice();
		System.out.println(example2);

		// with delivery charge
		UnidaysDiscountChallenge example3 = new UnidaysDiscountChallenge(pricing);
		for (int i = 0; i < 13; i++) {
			example3.AddToBasket('D');
		}
		example3.CalculateTotalPrice();
		System.out.println(example3);
		
		int totalPrice = example3.getTotal();
		int deliveryCharge = example3.getDeliveryCharge();
		int overallTotal = totalPrice + deliveryCharge;
		System.out.println(overallTotal);

	}

}
