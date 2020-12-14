package ch08_DataSystematization;

import java.util.Collection;
import java.util.Iterator;

public class Ex02ReplaceDataValueWithObject {

	// 데이터 항목에 데이터나 기능을 더 추가해야할 때는 데이터 항목을 객체로 만들자

	@SuppressWarnings("unused")
	private static class Before {

		private class Order {

			private String customer;

			public Order(String customer) {
				this.customer = customer;
			}

			public String getCustomer() {
				return customer;
			}

			public void setCustomer(String customer) {
				this.customer = customer;
			}

		}

		private static int numberOfOrdersFor(Collection<Order> orders, String customer) {

			int result = 0;
			Iterator<Order> iter = orders.iterator();
			while (iter.hasNext()) {
				Order each = iter.next();
				if (each.getCustomer().equals(customer)) {
					result++;
				}
			}

			return result;
		}

	}

	static class After {

		class Customer {

			private String name;

			public Customer(String name) {
				this.name = name;
			}

			public String getName() {
				return name;
			}

		}

		class Order {

			private Customer customer;

			public Order(String name) {
				this.customer = new Customer(name);
			}

			public String getCustomer() {
				return customer.getName();
			}

			public void setCustomer(String name) {
				this.customer = new Customer(name);
			}

		}

		@SuppressWarnings("unused")
		private static int numberOfOrdersFor(Collection<Order> orders, String customer) {

			int result = 0;
			Iterator<Order> iter = orders.iterator();
			while (iter.hasNext()) {
				Order each = iter.next();
				if (each.getCustomer().equals(customer)) {
					result++;
				}
			}

			return result;
		}

	}

}
