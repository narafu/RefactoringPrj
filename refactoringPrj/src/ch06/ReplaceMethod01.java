package ch06;

public class ReplaceMethod01 {

//	 before

	class order {
		double price() {
			double primaryBasePrice;
			double secondaryBasePrice;
			double testiaryBasePrice;

			return 0;
		}
	}

	class Account1 {
		int gamma1(int inputVal, int quantity, int yearToDate) {
			int importantValue1 = inputVal + quantity + delta();
			int importantValue2 = inputVal + quantity + 100;
			if ((yearToDate - importantValue1) > 100) {
				importantValue2 -= 20;
			}
			int importantValue3 = importantValue2 * 7;
			return importantValue3 - 2 * importantValue1;
		}

		int delta() {
			// TODO Auto-generated method stub
			return 0;
		}
	}

//	after

	class Account2 {
		int gamma2(int inputVal, int quantity, int yearToDate) {
			return new Gamma(this, inputVal, quantity, yearToDate).compute();
		}

		int delta() {
			// TODO Auto-generated method stub
			return 0;
		}
	}

	class Gamma {
		private final Account2 _account;
		private int inputVal;
		private int quantity;
		private int yearToDate;
		private int importantValue1;
		private int importantValue2;
		private int importantValue3;

		public Gamma(Account2 source, int inputValArg, int quantityArg, int yearToDateArg) {
			_account = source;
			inputVal = inputValArg;
			quantity = quantityArg;
			yearToDate = yearToDateArg;
		}

		int compute() {
			importantValue1 = inputVal + quantity + _account.delta();
			importantValue2 = inputVal + quantity + 100;
			importantThing();
			int importantValue3 = importantValue2 * 7;
			return importantValue3 - 2 * importantValue1;
		}

		void importantThing() {
			if ((yearToDate - importantValue1) > 100) {
				importantValue2 -= 20;
			}
		}

	}

}
