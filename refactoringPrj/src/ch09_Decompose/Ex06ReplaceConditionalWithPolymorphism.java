package ch09_Decompose;

public class Ex06ReplaceConditionalWithPolymorphism {

	// 객체 타입에 따라 다른 기능을 실행하는 조건문이 있을 땐,
	// 조건문의 각 절을 하위클래스의 재정의 메서드 안으로 옮기고, 원본 메서드는 abstract 타입으로 수정하자.

	class Employee {

		private EmployeeType type;

		private int monthlySalary;
		private int commission;
		private int bonus;

		int payAmount() {
			return type.payAmount(this);
		}

//		private int getType() {
//			return type.getTypeCode();
//		}

		public int getMonthlySalary() {
			return monthlySalary;
		}

		public void setMonthlySalary(int monthlySalary) {
			this.monthlySalary = monthlySalary;
		}

		public int getCommission() {
			return commission;
		}

		public void setCommission(int commission) {
			this.commission = commission;
		}

		public int getBonus() {
			return bonus;
		}

		public void setBonus(int bonus) {
			this.bonus = bonus;
		}

	}

	abstract class EmployeeType {

//		public static final int MANAGER = 1;
//		public static final int SALESMAN = 2;
//		public static final int ENGINEER = 3;

		abstract int payAmount(Employee emp);
//		{
//			switch (getTypeCode()) {
//			case ENGINEER:
//				return emp.getMonthlySalary();
//			case SALESMAN:
//				return emp.getMonthlySalary() + emp.getCommission();
//			case MANAGER:
//				return emp.getMonthlySalary() + emp.getBonus();
//			default:
//				throw new RuntimeException("없는 사원입니다");
//			}
//		}

//		abstract int getTypeCode();
	}

	class Engineer extends EmployeeType {

		@Override
		int payAmount(Employee emp) {
			// TODO Auto-generated method stub
			return emp.getMonthlySalary();
		}
	}

	class Salesman extends EmployeeType {

		@Override
		int payAmount(Employee emp) {
			// TODO Auto-generated method stub
			return emp.getMonthlySalary() + emp.getCommission();
		}
	}

	class Manager extends EmployeeType {

		@Override
		int payAmount(Employee emp) {
			// TODO Auto-generated method stub
			return emp.getMonthlySalary() + emp.getBonus();
		}
	}

}
