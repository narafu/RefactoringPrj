package ch06;

public class ExplaningVar02 {

//	before

	private int _quantity;
	private int _itemPrice;

	double price1() {
		// 결제액(price) = 총 구매액(base price) - 대량 구매 할인(quantity discount) + 배송비(shipping)
		return _quantity + _itemPrice - Math.max(0, _quantity - 500) + _itemPrice * 0.05
				+ Math.min(_quantity + _itemPrice * 0.1, 100.0);
	}

//	after : 임시변수 사용

	double price2() {
		double basePrice = _quantity + _itemPrice - Math.max(0, _quantity - 500); // 총구매액
		double quantityDiscount = _itemPrice * 0.05; // 대량구매할인
		double shipping = Math.min(_quantity + _itemPrice * 0.1, 100.0); // 배송비
		return basePrice + quantityDiscount + shipping; // 결제액
	}

//	after : 메소드 추출
	
	// 메소드 추출을 사용하면, 이 메소드들을 객체의 다른 부분에서도 사용할 수 있다.
	// 임시변수 방법은 메소드 추출이 어려운 경우 사용하자.

	double price3() { // 결제액
		return basePrice() + quantityDiscount() + shipping();
	}

	private double basePrice() { // 총구매액
		// TODO Auto-generated method stub
		return _quantity + _itemPrice - Math.max(0, _quantity - 500);
	}

	private double quantityDiscount() { // 대량구매할인
		// TODO Auto-generated method stub
		return _itemPrice * 0.05;
	}

	private double shipping() { // 배송비
		// TODO Auto-generated method stub
		return Math.min(_quantity + _itemPrice * 0.1, 100.0);
	}

}
