package ch07;

public class InlineClass {

	// 클래스 내용 직접 삽입
	// 클래스에 기능이 너무 적을 땐, 그 클래스의 모든 기능을 다른 클래스로 합쳐 넣고 원래의 클래스는 삭제하자.

	class Person {

		private String _name;
		private String _number;
		private String _areaCode;

		public String get_name() {
			return _name;
		}

		public String getTelephoneNumber() {
			return ("(" + _areaCode + ")" + _number);

		}

		public String get_number() {
			return _number;
		}

		public void set_number(String _number) {
			this._number = _number;
		}

		public String get_areaCode() {
			return _areaCode;
		}

		public void set_areaCode(String _areaCode) {
			this._areaCode = _areaCode;
		}
	}

}
