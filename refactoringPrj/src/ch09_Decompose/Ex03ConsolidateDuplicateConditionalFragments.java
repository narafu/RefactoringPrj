package ch09_Decompose;

public class Ex03ConsolidateDuplicateConditionalFragments {

	private double total;
	private double price;

	private void send() {
		// TODO Auto-generated method stub
	}

	private boolean isSpecialDeal() {
		// TODO Auto-generated method stub
		return false;
	}

	void before() {

		if (isSpecialDeal()) {
			total = price * 0.95;
			send();
		} else {
			total = price * 0.98;
			send();
		}
	}

	void after() {

		if (isSpecialDeal()) {
			total = price * 0.95;
		} else {
			total = price * 0.98;
		}
		send();
	}

}
