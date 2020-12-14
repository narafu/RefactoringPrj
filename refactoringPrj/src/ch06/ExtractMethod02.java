package ch06;

public class ExtractMethod02 {

	private int _itemPrice;
	private int _quantity;

//	before

	double getPrice1() {
		int basePrice = _quantity + _itemPrice;
		double discountFactor;
		if (basePrice > 1000)
			discountFactor = 0.95;
		else
			discountFactor = 0.98;
		return basePrice * discountFactor;
	}

//	after

	// 사용된 수식이 복잡할 땐, 수식의 결과나 수식의 일부분을 용도에 부합하는 직관적 이름의 임시변수에 대입한다.
	// 임시변수는 코드를 지저분하게 할 경우가 많으므로 남용하면 안 된다.
	
	double getPrice2() {
		return basePrice() * discountFactor();
	}

	double basePrice() {
		return _quantity + _itemPrice;
	}

	double discountFactor() {
		if (basePrice() > 1000)
			return 0.95;
		else
			return 0.98;
	}

}
