package ch09_Decompose;

public class Ex07IntoduceNullObject {

	// null 값을 검사하는 코드가 계속 나올 땐 null 값을 널 객체로 만들자.

	class Site {

		private Customer customer;

		Customer getCustomer() {
			return customer;
		}
	}

	class Customer {

		private String name;
		private BillingPlan plan;
		private PaymentHistory history;

		public String getName() {
			return name;
		}

		public BillingPlan getPlan() {
			return plan;
		}

		public PaymentHistory getHistory() {
			return history;
		}
	}

	class PaymentHistory {

		int getWeeksDelinquentInLastYesr() {
			return 0;
		}
	}

	class BillingPlan {

		private BillingPlan plan;

		public BillingPlan basic() {
			return plan;
		}

	}

}
