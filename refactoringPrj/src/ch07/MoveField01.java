package ch07;

public class MoveField01 {

	class Account {
		
		private AccountType _type;

		double interestForAmount_days(double amount, int days) {
			return _type._interestRate * amount * days / 365;
		}
	}

	class AccountType {
		
		private double _interestRate;
		
		double interestForAmount_days(double amount, int days) {
			return _interestRate * amount * days / 365;
		}

		void setInterestRate(double arg) {
			_interestRate = arg;
		}

		public double getInterestRate() {
			return _interestRate;
		}

	}
}
