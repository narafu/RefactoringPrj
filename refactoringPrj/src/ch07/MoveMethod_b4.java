package ch07;

public class MoveMethod_b4 {

//	메서드가 자신이 속한 클래스보다 다른 클래스의 기능을 더 많이 이용할 땐,
//	그 메서드가 제일 많이 이용하는 클래스로 메서드를 이동시킨다.

	// 클래스에 기능이 너무 많거나 클래스가 다른 클래스에 과하게 연동되어 의존성이 지나칠 때는,
	// 메소드를 분리하여 적절한 클래스로 옮기는 것이 좋다.

	class Account {
		private AccountType _type;
		private int _daysOverdrawn;

		double overdraftCharge() {
			if (_type.isPremium()) {
				double result = 10;
				if (_daysOverdrawn > 7)
					result += (_daysOverdrawn - 7) * 0.85;
				return result;
			} else
				return _daysOverdrawn * 1.75;
		}

		double bankCharge() {
			double result = 4.5;
			if (_daysOverdrawn > 0)
				result += overdraftCharge();
			return result;
		}

	}

	class AccountType {

		private boolean isPremium() {
			// TODO Auto-generated method stub
			return false;

		}
	}

}
