package ch11_generalization;

public class Ex01_ExtractSubclass {

	// 일부 인스턴스에만 사용되는 기능이 든 클래스가 있을 땐 그 기능 부분을 전담하는 하위클래스를 작성하자.

	class JobItem {

		private int unitPrice;
		private int quanitty;

		public JobItem() {
			// TODO Auto-generated constructor stub
		}

		public JobItem(int unitPrice, int quanitty) {
			this.unitPrice = unitPrice;
			this.quanitty = quanitty;
		}

		public int getUnitPrice() {
			return unitPrice;
		}

		public int getQuanitty() {
			return quanitty;
		}

	}

	class Employee {

		private int rate;

		public Employee(int rate) {
			this.rate = rate;
		}

		public int getRate() {
			return rate;
		}

	}

	class LaborItem extends JobItem {

		private Employee employee;

		public LaborItem(int quanitty, Employee employee) {
			this.employee = employee;
		}

		public Employee getEmployee() {
			return employee;
		}

		public int getUnitPrice() {
			return employee.getRate();
		}
	}

}
