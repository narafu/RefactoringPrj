package ch07;

public class RemoveMiddleMan {

	// 과잉 중개 메서드 제거
	// 대리 객체 사용을 캡슐화할 때의 단점은,
	// 대리 객체의 새 기능을 사용할 때마다, 서버에 위임 메서드를 추가해야 한다.
	// 서버 클래스는 중개자에 불과하므로,
	// 이때는 클라이언트가 대리 객체를 직접 호출하게 해야 한다.

	class Person { // 서버 객체
		Department _department;

		public Department get_department() {
			return _department;
		}

		public void set_department(Department _department) {
			this._department = _department;
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
