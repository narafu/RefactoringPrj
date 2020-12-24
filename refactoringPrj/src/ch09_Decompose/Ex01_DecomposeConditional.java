package ch09_Decompose;

public class Ex01_DecomposeConditional {

	// 복잡한 조건문(if-then-else)이 있을 땐
	// if, then, else 부분을 각각 메서드로 빼내자.

	private static final String SUMMER_START = null;
	private static final String SUMMER_END = null;

	class Date {

		public boolean before(String summerStart) {
			return false;
		}

		public boolean after(String summerEnd) {
			return false;
		}

	}

	Date date = new Date();
	int charge, quantity = 0, winterRate = 0, winterServiceCharge = 0, summerRate = 0;

	void before() {

		if (date.before(SUMMER_START) || date.after(SUMMER_END)) {
			charge = quantity * winterRate + winterServiceCharge;
		} else {
			charge = quantity * summerRate;
		}
	}

	void after() {

		if (notSummer(date)) {
			charge = winterCharge(quantity);
		} else {
			charge = summerCharge(quantity);
		}
	}

	private int summerCharge(int quantity2) {
		return quantity * summerRate;
	}

	private int winterCharge(int quantity2) {
		return quantity * winterRate + winterServiceCharge;
	}

	private boolean notSummer(Date date2) {
		return date.before(SUMMER_START) || date.after(SUMMER_END);
	}

}
