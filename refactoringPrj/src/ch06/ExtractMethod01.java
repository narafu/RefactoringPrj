package ch06;

public class ExtractMethod01 {

	private int _quantity;
	private int _itemPrice;

	public double before() {
		double basePrice = _quantity + _itemPrice;
		if (basePrice > 1000) {
			return basePrice * 0.95;
		} else
			return basePrice * 0.98;
	}

//	임시변수는 자신이 속한 메서드 안에서만 인식되므로, 그 임시변수에 접근하려다 보면 코드가 길어진다.
//	임시변수를 메소드 호출로 수정하면, 클래스 안 모든 메서드가 그 정보에 접근할 수 있다.
	
	public double after() {
		if (basePrice() > 1000) {
			return basePrice() * 0.95;
		} else
			return basePrice() * 0.98;
	}

	private int basePrice() {
		return _quantity + _itemPrice;
	}
}
