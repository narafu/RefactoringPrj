package ch07;

public class MoveField02 {

	class Account {

		private AccountType _type;
//		private double _interestRate;

		double interestForAmountAnddays(double amount, int days) {
			return getInterestRate() * amount * days / 365;
		}

		void setInterestRate(double arg) {
			_type.setInterestRate(arg);
		}

		public double getInterestRate() {
			return _type.getInterestRate();
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
