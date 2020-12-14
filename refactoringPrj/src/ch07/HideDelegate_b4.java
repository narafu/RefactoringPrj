package ch07;

public class HideDelegate_b4 {

	// 대리객체 은폐
	// 클라이언트가 서버 객체의 필드 중 하나에 정의된 메소드를 호출할 때 그 클라이언트는 이 대리 객체에 대해 알아야 한다.
	// 대리 객체가 변경될 때 클라이언트도 변경해야할 가능성이 있기 때문이다.
	// 이런 의존성을 없애려면,
	// 대리 객체를 감추는 간단한 위임 메서드를 서버에 두면 된다.
	// 그렇게 하면, 변경은 서버에만 이뤄지고 클라이언트에는 영향을 주지 않는다.

	public static void main(String[] args) { // 클라이언트

		Person john = null;

		john.get_department(); // 'john'의 '부서'
		john.get_department().get_manager(); // 'john'의 '부서'의 '팀장'

	}

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
