package ch07;

public class MoveField_b4 {

//	어떤 필드가 자신이 속한 클래스보다 다른 클래스에서 더 많이 사용될 때는
//		대상 클래스 안에 새 필드를 선언하고 그 필드 참조 부분을 전부 새 필드 참조로 수정하자.

	class Account {
		
//		private AccountType _type;
		private double _interestRate;

		double interestForAmount_days(double amount, int days) {
			return _interestRate * amount * days / 365;
		}
	}

	class AccountType {

		private double _interestRate;

		void setInterestRate(double arg) {
			_interestRate = arg;
		}

		public double getInterestRate() {
			return _interestRate;
		}

	}
}
