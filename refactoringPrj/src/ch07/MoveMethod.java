package ch07;

public class MoveMethod {

	class Account {
		private AccountType _type;
		private int _daysOverdrawn;

		double bankCharge() {
			double result = 4.5;
			if (_daysOverdrawn > 0)
				result += _type.overdraftCharge(_daysOverdrawn);
			return result;
		}

	}

	class AccountType {

		double overdraftCharge(int daysOverdrawn) {
			if (isPremium()) {
				double result = 10;
				if (daysOverdrawn > 7)
					result += (daysOverdrawn - 7) * 0.85;
				return result;
			} else
				return daysOverdrawn * 1.75;
		}

		private boolean isPremium() {
			// TODO Auto-generated method stub
			return false;

		}
	}

}
