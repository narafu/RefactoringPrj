package ch07;

public class HideDelegate {

	public static void main(String[] args) { // 클라이언트

		Person john = null;

		john.get_department(); // 'john'의 부서
		john.get_manager(); // 'john'의 '팀장'

	}

	class Person { // 서버 객체
		Department _department;

		public Department get_department() {
			return _department;
		}

		public void set_department(Department _department) {
			this._department = _department;
		}

		public Person get_manager() {
			return _department.get_manager();
		}

	}

	class Department { // 대리 객체
		private String _chageCode;
		private Person _manager;

		public Department(Person manager) {
			this._manager = _manager;
		}

		public Person get_manager() {
			return _manager;
		}

	}
}
