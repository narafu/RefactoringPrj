package ch10_MethodCallSimplification;

public class Ex02_ReplaceParameterWithMethod {

	// 객체가 A 메서드를 호출해서 그 결과를 B 메서드에 매개변수로 전달하는데,
	// 결과를 매개변수로 받는 B 메서드도 직접 A 메서드를 호출할 수 있다면,
	// 매개변수를 없애고 A 메서드를 B 메서드로 호출하게 하자.

	public int quantity;
	public int itemPrice;

	class Before {

		public double getPrice() {

			int basePrice = quantity * itemPrice;
			int discountLevel;
			if (quantity > 100)
				discountLevel = 2;
			else
				discountLevel = 1;
			double finalPrice = discountPrice(basePrice, discountLevel);
			return finalPrice;
		}

		private double discountPrice(int basePrice, int discountLevel) {

			if (discountLevel == 2)
				return basePrice * 0.1;
			else
				return basePrice * 0.5;
		}
	}

	class After01 {

		public double getPrice() {
			return discountPrice();
		}

		private double discountPrice() {

			if (getDiscountLevel() == 2)
				return getBasePrice() * 0.1;
			else
				return getBasePrice() * 0.5;
		}

		private int getDiscountLevel() {
			if (quantity > 100)
				return 2;
			else
				return 1;
		}

		private int getBasePrice() {
			return quantity * itemPrice;
		}

	}

	class After02 {

		public double getPrice() {

			if (quantity > 100)
				return quantity * itemPrice * 0.1;
			else
				return quantity * itemPrice * 0.5;
		}

	}

}
